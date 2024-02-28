/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Clases.Character;
import Clases.Estudio;
import EDD.Lista;

/**
 *
 * @author Natalia
 */
public class Global {
    private static String[] nickelodeon={"Aang", "Zuko", "Katara", "Sokka", "Toph", "Azula", "Aang estado avatar", "Bumi", "Iroh", "Ozai", "Appa", "Momo", "Roku", "Kyoshi", "Suki", "Mai", "Ty Lee", "Gyatso", "Sozin", "Pakku"} ;
    private static String[] cartoon={"Mordecai", "Rigby", "Benson", "Papaleta", "Skips", "Fantasmano", "Musculoso", "Margarita", "Eileen", "CJ", "Thomas", "Don", "El Martillo", "Muerte", "Mega Patitos", "Dios del basquetbol", "Garret Bobby Ferguson", "Caballero Extrahuevordinario", "Techmo", "Starla"};
    
    private static String[] objetos={"El poder","Guante Supremo","Boomerang","Planeador","Armadura","Abanicos","Gorra de Camionero","Cafe","Sandwich de la Muerte","Collar de Katara"};
  
    private static Estudio Nick;
    private static Estudio CN;
    
    private static Lista ganadores=new Lista(); //lista de ganadores

    public static String[] getNickelodeon() {
        return nickelodeon;
    }

    public static void setNickelodeon(String[] nickelodeon) {
        Global.nickelodeon = nickelodeon;
    }

    public static String[] getCartoon() {
        return cartoon;
    }

    public static void setCartoon(String[] cartoon) {
        Global.cartoon = cartoon;
    }

    public static String[] getObjetos() {
        return objetos;
    }

    public static void setObjetos(String[] objetos) {
        Global.objetos = objetos;
    }

    public static Estudio getNick() {
        return Nick;
    }

    public static void setNick(Estudio Nick) {
        Global.Nick = Nick;
    }

    public static Estudio getCN() {
        return CN;
    }

    public static void setCN(Estudio CN) {
        Global.CN = CN;
    }

    public static Lista getGanadores() {
        return ganadores;
    }

    public static void setGanadores(Lista ganadores) {
        Global.ganadores = ganadores;
    }
    
    
    
    
    
    
}
