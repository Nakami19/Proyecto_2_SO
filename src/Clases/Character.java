/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Natalia
 */
public class Character {
    
    private String name;
    private String object;
    private int id;
    private int counter=0;
    private int nivel;
    private int numCalidad;
    private int habilidad;
    private int hp;
    private int fuerza;
    private int agilidad;

    public Character(String name, String object, int id) {
        this.name = name;
        this.object = object;
        this.id = id;
    }
    
    public void CalcularStats() {
        int stat= (int) (Math.random()*100);
        
        if(stat>=0 && stat<60){
            this.habilidad=1;
            this.numCalidad++;
        } else {
            this.habilidad=0;
        }
        if(stat>=0 && stat<70) {
            this.hp=1;
            this.numCalidad++;
        } else {
            this.hp=0;
        }
        if(stat>=0 && stat<50){
            this.fuerza=1;
            this.numCalidad++;
        } else {
            this.fuerza=0;
        }
        if(stat>=0 && stat<40){
            this.agilidad=1;
            this.numCalidad++;
        } else {
            this.agilidad=0;
        }
        
        if(this.numCalidad==4) {
            this.nivel=1;
        }
        else if(this.numCalidad<=3 && this.numCalidad>=2) {
            this.nivel=2;
        }
        else if (this.numCalidad<=1 && this.numCalidad>=0) {
            this.nivel=3;
        }
        
       if (this.object.compareTo("El poder")==0) {
           this.habilidad+=2;
           this.hp++;
       }
       else if(this.object.compareTo("Guante Supremo")==0){
           this.fuerza+=3;
           this.habilidad+=2;
       }
       
       else if(this.object.compareTo("Boomerang")==0) {
           this.habilidad+=3;
           this.agilidad+=2;
       }
       
       else if(this.object.compareTo("Planeador")==0){
           this.agilidad+=4;
           this.hp++;
       }
       
       else if(this.object.compareTo("Armadura")==0){
           this.fuerza++;
           this.hp+=2;
       }
       
       else if(this.object.compareTo("Abanicos")==0){
           this.agilidad++;
           this.habilidad+=2;
       }
       
       else if(this.object.compareTo("Gorra de Camionero")==0){
           this.hp++;
           this.fuerza+=4;
       }
       else if(this.object.compareTo("Cafe")==0){
           this.agilidad+=4;
           this.habilidad+=2;
       }
       
       else if(this.object.compareTo("Sandwich de la Muerte")==0){
           this.fuerza+=4;
           this.habilidad++;
       }
       
       else if(this.object.compareTo("Collar de Katara")==0){
           this.hp+=4;
           this.agilidad++;
       }
       
    
    }

    public int getNumCalidad() {
        return numCalidad;
    }

    public void setNumCalidad(int numCalidad) {
        this.numCalidad = numCalidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    
    
    
    
}
