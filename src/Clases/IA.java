/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Nodo;
import Interfaces.Global;
import Interfaces.Interfaz;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Natalia
 */
public class IA extends Thread {
    
    private Semaphore mutex1; //Semaforo de Cn
    private Semaphore mutex2; //Semaforo de Nickelodeon
    private Character p1; //Personaje de Cn
    private Character p2; //Personaje de NK
    
//    public IA (Semaphore mutex1, Semaphore mutex2) {
//        this.mutex1=mutex1;
//        this.mutex2=mutex2;
//    }
    
     public IA () {
        this.mutex1 = new Semaphore(1);
        this.mutex2 = new Semaphore(1);
        this.p1 = null;
        this.p2 = null;
    }

    public Character getP1() {
        return p1;
    }

    public void setP1(Character p1) {
        this.p1 = p1;
    }

    public Character getP2() {
        return p2;
    }

    public void setP2(Character p2) {
        this.p2 = p2;
    }
    
     
     
    @Override
    
    public void run(){                    
        try {
//                mutex1.acquire(); //Wait del semáforo de Cartoon Network para conseguir el personaje
//                if(Global.getCN().getPrioridad1().getSize() > 0){
//                    this.p1 = Global.getCN().getPrioridad1().desencolar().getElement();
//                }else if(Global.getCN().getPrioridad2().getSize() > 0){
//                    this.p1 = Global.getCN().getPrioridad2().desencolar().getElement();
//                }else if(Global.getCN().getPrioridad3().getSize() > 0){
//                    this.p1 = Global.getCN().getPrioridad3().desencolar().getElement();
//                }
//                System.out.println("Se escogio uno de CN");
//                mutex1.release(); //Se cierra la zona crítica de Cartoon Network
//
//                mutex2.acquire(); //Wait del Semáforo de Nickelodeon para conseguir el personaje
//
//                if(Global.getNick().getPrioridad1().getSize() > 0){
//                    this.p2 = Global.getNick().getPrioridad1().desencolar().getElement();
//                }else if(Global.getNick().getPrioridad2().getSize() > 0){
//                    this.p2 = Global.getNick().getPrioridad2().desencolar().getElement();
//                }else if(Global.getNick().getPrioridad3().getSize() > 0){
//                    this.p2 = Global.getNick().getPrioridad3().desencolar().getElement();
//                }
//                System.out.println("Se escogio uno de Nick");
//                mutex2.release(); //Se cierra la zona crítica de Nickelodeon

            int resultadonum= (int) (Math.random()*100) ; // se escoge el resultado de la batalla 
            sleep(3000); //duerme 10 segundos en los que "piensa"
            //ahora el resultado
            System.out.println("decision: "+resultadonum);
            if(resultadonum<40) { //hay un ganador
                System.out.println("Hay un ganador, combatientes: "+p1.getName()+" "+p2.getName());
            System.out.println("personaje 1, id: "+p1.getId()+" nombre "+p1.getName()+" stats:\nAgilidad: "+p1.getAgilidad()+"\nFuerza: "+p1.getFuerza()+"\nHabilidad: "+p1.getHabilidad()+"\nHP: "+p1.getHp());
            System.out.println("personaje 2, id: "+p2.getId()+" nombre "+p2.getName()+" stats:\nAgilidad: "+p2.getAgilidad()+"\nFuerza: "+p2.getFuerza()+"\nHabilidad: "+p2.getHabilidad()+"\nHP: "+p2.getHp());

                Character ganador=Ganador();
                Global.getGanadores().insertBegin(ganador);

            }

            else if(resultadonum>=40 && resultadonum<67){ //hay empate
                System.out.println("Hubo empate");
                Global.getCN().getPrioridad1().encolar(p1);
                Global.getNick().getPrioridad1().encolar(p2);
            }
            else if (resultadonum>=67 && resultadonum<100){//no sucede el combate
                System.out.println("Alquien tuvo una luxación y el combate no se puede hacer");
                Global.getCN().getRefuerzo().encolar(p1);
                Global.getNick().getRefuerzo().encolar(p2); 
            }
            

            sleep(3000); //Duerme 3 segundos para que el resultado se pueda ver reflejado en la interfaz, propenso a cambio
        } catch (InterruptedException ex) {
            Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
   
    public Character Ganador(){ //determinar cual de los dos personajes gano 
        int ventaja_p1=0;
        int ventaja_p2=0;
                
        if(p1.getAgilidad()>p2.getAgilidad()){
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
                
        if(p1.getFuerza()>=p2.getFuerza()){
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
                
        if(p1.getHabilidad()>p2.getHabilidad()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        if(p1.getHp()>=p2.getHp()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        
        
        if(ventaja_p1>ventaja_p2){
            System.out.println(p1.getName()+" es el ganador");
            Interfaz.getListaGanadores().append("C-"+p1.getId()+'\n');
            
            
            return p1;
        }else{
            System.out.println(p2.getName()+" es el ganador");
            Interfaz.getListaGanadores().append("N-"+p2.getId()+'\n');
           
            return p2;
        }
       
    }
    
    
}
