/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Global;

/**
 *
 * @author Natalia
 */
public class Administrador extends Thread{
    
    private int ciclo=2; //cada 2 ciclos se revisa la probabilidad de que se cree uno nuevo
    
    
    
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
