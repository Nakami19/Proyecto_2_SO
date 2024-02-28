/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Nodo;
import Interfaces.Global;
import Interfaces.Interfaz;
import static Interfaces.Interfaz.getPrioridad1CN;
import static Interfaces.Interfaz.getPrioridad1Nick;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Natalia
 */
public class Administrador extends Thread{
    
    private int ciclo; //cada 2 ciclos se revisa la probabilidad de que se cree uno nuevo
    public IA ia; //la IA con el que el Admin va a estar trabajando
    private Semaphore mutex1; //Semaforo de Cn
    private Semaphore mutex2; //Semaforo de Nickelodeon
    private int IdCh=0;
    
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
                checkEmpty();
                mutex1.acquire(); //Wait del semáforo de Cartoon Network para conseguir el personaje
                if(Global.getCN().getPrioridad1().getSize() > 0){
                    this.ia.setP1(Global.getCN().getPrioridad1().desencolar().getElement());
                    Interfaz.getPrioridad1CN().setText(Global.getCN().getPrioridad1().imprimir());
                }else if(Global.getCN().getPrioridad2().getSize() > 0){
                    this.ia.setP1(Global.getCN().getPrioridad2().desencolar().getElement());
                    Interfaz.getPrioridad2CN().setText(Global.getCN().getPrioridad2().imprimir());
                }else if(Global.getCN().getPrioridad3().getSize() > 0){
                    this.ia.setP1(Global.getCN().getPrioridad3().desencolar().getElement());
                    Interfaz.getPrioridad3CN().setText(Global.getCN().getPrioridad3().imprimir());
                }
                System.out.println("Se escogio uno de CN");
                mutex1.release(); //Se cierra la zona crítica de Cartoon Network
                
                changeStatsCn(); //Se cambian las Stats al personaje actual de Cartoon Network

                mutex2.acquire(); //Wait del Semáforo de Nickelodeon para conseguir el personaje

                if(Global.getNick().getPrioridad1().getSize() > 0){
                    this.ia.setP2(Global.getNick().getPrioridad1().desencolar().getElement());
                    Interfaz.getPrioridad1Nick().setText(Global.getNick().getPrioridad1().imprimir());
                }else if(Global.getNick().getPrioridad2().getSize() > 0){
                    this.ia.setP2(Global.getNick().getPrioridad2().desencolar().getElement());
                    Interfaz.getPrioridad2Nick().setText(Global.getNick().getPrioridad2().imprimir());
                }else if(Global.getNick().getPrioridad3().getSize() > 0){
                    this.ia.setP2(Global.getNick().getPrioridad3().desencolar().getElement());
                    Interfaz.getPrioridad3Nick().setText(Global.getNick().getPrioridad3().imprimir());
                }
                System.out.println("Se escogio uno de Nick");
                mutex2.release(); //Se cierra la zona crítica de Nickelodeon
                
                changeStatsNick(); //Se cambian las Stats al personaje actual de Nick
            
            changeIcons();    
                
            this.ia.run();
            
            clearStats();
            this.ciclo++;
            //hora de ver como se actualizan las colas
            //primero hora de subir los contadores de la cola 2 y 3 
               // System.out.println("contador 2 de cn");
            Global.getCN().getPrioridad2().subir_contador();
           // System.out.println("contador 3 de cn");
            Global.getCN().getPrioridad3().subir_contador();
            
           // System.out.println("contador 2 de nick");
            Global.getNick().getPrioridad2().subir_contador();
           // System.out.println("contador 3 de nick");
            Global.getNick().getPrioridad3().subir_contador();
            
            //ahora veo como encolo y desencolo las que tienen 8 como contador
            Nodo borrado;
            //para prioridad 2 de nick
                System.out.println("personajes en cola de prioridad 2 de nick en admin");
            for (Nodo aux=Global.getNick().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getNick().getPrioridad2().Buscar(aux);//indice del nodo a borrar
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        borrado=Global.getNick().getPrioridad2().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        borrado=Global.getNick().getPrioridad2().borrar(indice);//lo quito de la cola
                    //System.out.println("nodo borrado "+borrado.getElement().getId());
                    }
                    Global.getNick().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 1");
//            Global.getNick().getPrioridad1().imprimir();
//            System.out.println("nueva prioridad 2");
//            Global.getNick().getPrioridad2().imprimir();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad1Nick().setText(Global.getNick().getPrioridad1().imprimir());
            Interfaz.getPrioridad2Nick().setText(Global.getNick().getPrioridad2().imprimir());
                    
            
            //para prioridad 3 de nick
            for (Nodo aux=Global.getNick().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getNick().getPrioridad3().Buscar(aux);//indice del nodo a borrar
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        borrado=Global.getNick().getPrioridad3().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        borrado=Global.getNick().getPrioridad3().borrar(indice);//lo quito de la cola
                    //System.out.println("nodo borrado "+borrado.getElement().getId());
                    }
                    Global.getNick().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 2");
//            Global.getNick().getPrioridad2().imprimir();
//            System.out.println("nueva prioridad 3");
//            Global.getNick().getPrioridad3().imprimir();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad2Nick().setText(Global.getNick().getPrioridad2().imprimir());
            Interfaz.getPrioridad3Nick().setText(Global.getNick().getPrioridad3().imprimir());
                        
            //para prioridad 2 de cartoon
                System.out.println("personajes en cola de prioridad 2 de cartoon en admin");
            for (Nodo aux=Global.getCN().getPrioridad2().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getCN().getPrioridad2().Buscar(aux);//indice del nodo a borrar
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        borrado=Global.getCN().getPrioridad2().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        borrado=Global.getCN().getPrioridad2().borrar(indice);//lo quito de la cola
                    //System.out.println("nodo borrado "+borrado.getElement().getId());
                    }
                    Global.getCN().getPrioridad1().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 1");
//            Global.getCN().getPrioridad1().imprimir();
//            System.out.println("nueva prioridad 2");
//            Global.getCN().getPrioridad2().imprimir();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad1CN().setText(Global.getCN().getPrioridad1().imprimir());
            Interfaz.getPrioridad2CN().setText(Global.getCN().getPrioridad2().imprimir());
            
            //para prioridad 3 de cartoon
            for (Nodo aux=Global.getCN().getPrioridad3().getFirst(); aux!=null; aux=aux.getNext()) {
                if(aux.getElement().getCounter()==8) {//si es de 8 debe subir la prioridad
                   // System.out.println("contador: "+aux.getElement().getCounter()+" personaje "+aux.getElement().getName()+" id "+aux.getElement().getId());
                    aux.getElement().setNivel(aux.getElement().getNivel()+1);
                    aux.getElement().setCounter(0);
                    int indice=Global.getCN().getPrioridad3().Buscar(aux);//indice del nodo a borrar
                   // System.out.println("indice: "+indice);
                    if(indice==0) {
                        
                        borrado=Global.getCN().getPrioridad3().desencolar();
                        //System.out.println("pipipi "+borrado.getNext());
                        
                    }
                    else {
                        borrado=Global.getCN().getPrioridad3().borrar(indice);//lo quito de la cola
                    //System.out.println("nodo borrado "+borrado.getElement().getId());
                    }
                    Global.getCN().getPrioridad2().encolar(aux.getElement());//lo meto a la de prioridad 1
//                    System.out.println("nueva prioridad 2");
//            Global.getCN().getPrioridad2().imprimir();
//            System.out.println("nueva prioridad 3");
//            Global.getCN().getPrioridad3().imprimir();
                    //System.out.println("AAAAAAA "+aux.getNext());
                }
        
            }
            
            Interfaz.getPrioridad2CN().setText(Global.getCN().getPrioridad2().imprimir());
            Interfaz.getPrioridad3CN().setText(Global.getCN().getPrioridad3().imprimir());
            
            
            
            //Se terminó el combate y se actualizaron las colas, entonces, revisamos las listas de refuerzos
            if(Global.getCN().getRefuerzo().getSize()>0){
                int chance= (int) (Math.random()*100);
                mutex1.acquire();
                if(chance>= 0 && chance <= 40){
                    System.out.println("Un personaje de CN salió de la cola de refuerzos");
                    Nodo character = Global.getCN().getRefuerzo().desencolar();
                    Global.getCN().getPrioridad1().encolar(character.getElement());
                    Interfaz.getRefuerzoCN().setText(Global.getCN().getRefuerzo().imprimir());
                    Interfaz.getPrioridad1CN().setText(Global.getCN().getPrioridad1().imprimir());
                }else{
                    System.out.println("Un personaje de CN se mandó al final de la cola de refuerzos");
                    Nodo character = Global.getCN().getRefuerzo().desencolar();
                    Global.getCN().getRefuerzo().encolar(character.getElement());
                    Interfaz.getRefuerzoCN().setText(Global.getCN().getRefuerzo().imprimir());
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
                    Interfaz.getRefuerzoNick().setText(Global.getNick().getRefuerzo().imprimir());
                    Interfaz.getPrioridad1Nick().setText(Global.getNick().getPrioridad1().imprimir());
                }else{
                    System.out.println("Un personaje de Nick se mandó al final de la cola de refuerzos");
                    Nodo character = Global.getNick().getRefuerzo().desencolar();
                    Global.getNick().getRefuerzo().encolar(character.getElement());
                    Interfaz.getRefuerzoNick().setText(Global.getNick().getRefuerzo().imprimir());
                }
                mutex2.release();
            }
            //hora de ver si se crea un personaje o no 
            if(this.ciclo==2) {//se revisa si ya pasaron 2 ciclos
                int crear=(int) (Math.random()*100);
                
                if(crear>=0 && crear<80) {//entro en la probabilidad de crear
                    //System.out.println("se crea personaje");
                    AgregarPersonaje();
                }
                //si entra o no al final el contador de ciclo se reinicia a 0
                this.ciclo=0;
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
        Global.getCN().CreateCharacter(Global.getCartoon()[numP], Global.getObjetos()[numO],IdCh);
        IdCh++;
        
        //crear un personaje de nick
        numP=(int) (Math.random()*19);
        numO=(int) (Math.random()*9);
        Global.getNick().CreateCharacter(Global.getNickelodeon()[numP], Global.getObjetos()[numO],IdCh);
        IdCh++;
        
    }

    public int getIdCh() {
        return IdCh;
    }

    public void setIdCh(int IdCh) {
        this.IdCh = IdCh;
    }
    
    public void changeIcons(){
        Interfaz.getCharacter_Icon_Nick().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/"+this.ia.getP2().getName()+".png")));
        Interfaz.getCharacter_Icon_Cn().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/"+this.ia.getP1().getName()+".png")));
    }
    
    public void changeStatsCn(){
        Interfaz.getObject_Cn().setText(this.ia.getP1().getObject());
        Interfaz.getAbility_Cn().setText(Integer.toString(this.ia.getP1().getHabilidad()));
        Interfaz.getStrength_Cn().setText(Integer.toString(this.ia.getP1().getFuerza()));
        Interfaz.getHP_Cn().setText(Integer.toString(this.ia.getP1().getHp()));
        Interfaz.getAgility_Cn().setText(Integer.toString(this.ia.getP1().getAgilidad()));
    }
    
    public void changeStatsNick(){
        Interfaz.getObject_Nick().setText(this.ia.getP2().getObject());
        Interfaz.getAbility_Nick().setText(Integer.toString(this.ia.getP2().getHabilidad()));
        Interfaz.getStrength_Nick().setText(Integer.toString(this.ia.getP2().getFuerza()));
        Interfaz.getHP_Nick().setText(Integer.toString(this.ia.getP2().getHp()));
        Interfaz.getAgility_Nick().setText(Integer.toString(this.ia.getP2().getAgilidad()));
    }
    
    public void clearStats(){
        Interfaz.getObject_Cn().setText("-");
        Interfaz.getAbility_Cn().setText("-");
        Interfaz.getStrength_Cn().setText("-");
        Interfaz.getHP_Cn().setText("-");
        Interfaz.getAgility_Cn().setText("-");
        
        Interfaz.getObject_Nick().setText("-");
        Interfaz.getAbility_Nick().setText("-");
        Interfaz.getStrength_Nick().setText("-");
        Interfaz.getHP_Nick().setText("-");
        Interfaz.getAgility_Nick().setText("-");
    }
    
    public void clearIcons(){
        Interfaz.getCharacter_Icon_Nick().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png")));
        Interfaz.getCharacter_Icon_Cn().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png")));
    }
    
    public void checkEmpty(){
        if(Global.getCN().getPrioridad1().getSize() == 0 && Global.getCN().getPrioridad2().getSize() == 0 && Global.getCN().getPrioridad3().getSize() == 0){
            int numP=(int) (Math.random()*19);
            int numO=(int) (Math.random()*9);
            Global.getCN().CreateCharacter(Global.getCartoon()[numP], Global.getObjetos()[numO],IdCh);
            IdCh++;            
        }
        
        if(Global.getNick().getPrioridad1().getSize() == 0 && Global.getNick().getPrioridad2().getSize() == 0 && Global.getNick().getPrioridad3().getSize() == 0){
            int numP=(int) (Math.random()*19);
            int numO=(int) (Math.random()*9);
            Global.getNick().CreateCharacter(Global.getNickelodeon()[numP], Global.getObjetos()[numO],IdCh);
            IdCh++;
        }
    }
    
}
