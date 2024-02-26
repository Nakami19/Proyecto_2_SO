/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Global;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Natalia
 */
public class IA extends Thread {
    
    private Semaphore mutex1; //creo que cada compañia tiene su propio semaphoro 
    private Semaphore mutex2;
    private Character p1; //idealmente p1 es de cartoon
    private Character p2; //p2 seria de nick
    
//    public IA (Semaphore mutex1, Semaphore mutex2) {
//        this.mutex1=mutex1;
//        this.mutex2=mutex2;
//    }
    
     public IA (Character p1, Character p2) {
        this.p1=p1;
        this.p2=p2;
    }
    
    @Override
    
    public void run(){
  
        try {
//            mutex1.acquire(); //escoge el personaje de nick
//            mutex2.release(); //ya escogio el personaje, estos dos semaforos de adorno no se si se usan ni como se usan
            int resultadonum= (int) (Math.random()*100) ; // se escoge el resultado de la batalla 
            sleep(10000); //duerme 10 segundos en los que "piensa"
            //ahora el resultado
            
            if(resultadonum<40) { //hay un ganador
                
                Character ganador=Ganador();
                Global.getGanadores().insertBegin(ganador);
                
            }
            
            else if(resultadonum>=40 && resultadonum<67){ //hay empate
                Global.getCN().getPrioridad1().encolar(p1);
                Global.getNick().getPrioridad1().encolar(p2);
            }
            else if (resultadonum>=67 && resultadonum<100){//no sucede el combate
                Global.getCN().getRefuerzo().encolar(p1);
                Global.getNick().getRefuerzo().encolar(p2); 
            }
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
                
        if(p1.getFuerza()>p2.getFuerza()){
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
                
        if(p1.getHabilidad()>p2.getHabilidad()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        if(p1.getHp()>p2.getHp()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        
        if(ventaja_p1>ventaja_p2){
            System.out.println(p1.getName()+" es el ganador");
            
            return p1;
        }else{
            System.out.println(p2.getName()+" es el ganador");
           
            return p2;
        }
       
    }
    
    
}
