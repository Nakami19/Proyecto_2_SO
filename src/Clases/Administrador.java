/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Nodo;
import Interfaces.Global;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Natalia
 */
public class Administrador extends Thread{
    
    private int ciclo; //cada 2 ciclos se revisa la probabilidad de que se cree uno nuevo
    private IA ia; //la IA con el que el Admin va a estar trabajando
    private Semaphore mutex1; //Semaforo de Cn
    private Semaphore mutex2; //Semaforo de Nickelodeon
    
    public Administrador(IA ia){
        this.ciclo = 0;
        this.ia = ia;
        this.mutex1 = new Semaphore(1);
        this.mutex2 = new Semaphore(1);
    }
    
    @Override
    public void run(){
        while(true){
            try{
                mutex1.acquire(); //Wait del semáforo de Cartoon Network para conseguir el personaje
                if(Global.getCN().getPrioridad1().getSize() > 0){
                    this.ia.setP1(Global.getCN().getPrioridad1().desencolar().getElement());
                }else if(Global.getCN().getPrioridad2().getSize() > 0){
                    this.ia.setP1(Global.getCN().getPrioridad2().desencolar().getElement());
                }else if(Global.getCN().getPrioridad3().getSize() > 0){
                    this.ia.setP1(Global.getCN().getPrioridad3().desencolar().getElement());
                }
                System.out.println("Se escogio uno de CN");
                mutex1.release(); //Se cierra la zona crítica de Cartoon Network

                mutex2.acquire(); //Wait del Semáforo de Nickelodeon para conseguir el personaje

                if(Global.getNick().getPrioridad1().getSize() > 0){
                    this.ia.setP2(Global.getNick().getPrioridad1().desencolar().getElement());
                }else if(Global.getNick().getPrioridad2().getSize() > 0){
                    this.ia.setP2(Global.getNick().getPrioridad2().desencolar().getElement());
                }else if(Global.getNick().getPrioridad3().getSize() > 0){
                    this.ia.setP2(Global.getNick().getPrioridad3().desencolar().getElement());
                }
                System.out.println("Se escogio uno de Nick");
                mutex2.release(); //Se cierra la zona crítica de Nickelodeon
                
            this.ia.run();
            
                
            //Se terminó el combate y se actualizaron las colas, entonces, revisamos las listas de refuerzos
            if(Global.getCN().getRefuerzo().getSize()>0){
                int chance= (int) (Math.random()*100);
                mutex1.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de CN salió de la cola de refuerzos");
                    Nodo character = Global.getCN().getRefuerzo().desencolar();
                    Global.getCN().getPrioridad1().encolar(character.getElement());
                }else{
                    System.out.println("Un personaje de CN se mandó al final de la cola de refuerzos");
                    Nodo character = Global.getCN().getRefuerzo().desencolar();
                    Global.getCN().getRefuerzo().encolar(character.getElement());
                }
                mutex1.release();
            }

            if(Global.getNick().getRefuerzo().getSize()>0){
                int chance= (int) (Math.random()*100);
                mutex2.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de Nick salió de la cola de refuerzos");
                    Nodo character = Global.getNick().getRefuerzo().desencolar();
                    Global.getNick().getPrioridad1().encolar(character.getElement());
                }else{
                    System.out.println("Un personaje de Nick se mandó al final de la cola de refuerzos");
                    Nodo character = Global.getNick().getRefuerzo().desencolar();
                    Global.getNick().getRefuerzo().encolar(character.getElement());
                }
                mutex2.release();
            }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //antes de llamar a esta funcion se debe verificar que entro en el 80%
    public void AgregarPersonaje(){        
        //crear un personaje de cartoon network
        int numP=(int) (Math.random()*19);
        int numO=(int) (Math.random()*9);
        Global.getCN().CreateCharacter(Global.getCartoon()[numP], Global.getObjetos()[numO]);
        
        //crear un personaje de nick
        numP=(int) (Math.random()*19);
        numO=(int) (Math.random()*9);
        Global.getNick().CreateCharacter(Global.getNickelodeon()[numP], Global.getObjetos()[numO]);
        
    }
    
}
