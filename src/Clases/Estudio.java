/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Cola;

/**
 *
 * @author Natalia
 */
public class Estudio {
    private String name;
//    private int IdCh=0;
    private Cola prioridad1;
    private Cola prioridad2;
    private Cola prioridad3;
    private Cola refuerzo;
    private int ganados=0;

    public Estudio(String name) {
        this.name = name;
        this.prioridad1=new Cola();
        this.prioridad2=new Cola();
        this.prioridad3=new Cola();
        this.refuerzo=new Cola();
    }
    
    public void CreateCharacter(String name, String Object, int id){
        Character personaje=new Character(name,Object,id);
        personaje.CalcularStats();
        if (personaje.getNivel()==1){
            prioridad1.encolar(personaje);
        }
        else if (personaje.getNivel()==2) {
            prioridad2.encolar(personaje);
        }
        else if (personaje.getNivel()==3) {
            prioridad3.encolar(personaje);
        }
       // System.out.println("personaje creado, id: "+personaje.getId()+" nombre "+personaje.getName());
        //setIdCh(getIdCh()+1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getIdCh() {
//        return IdCh;
//    }
//
//    public void setIdCh(int IdCh) {
//        this.IdCh = IdCh;
//    }

    public Cola getPrioridad1() {
        return prioridad1;
    }

    public void setPrioridad1(Cola prioridad1) {
        this.prioridad1 = prioridad1;
    }

    public Cola getPrioridad2() {
        return prioridad2;
    }

    public void setPrioridad2(Cola prioridad2) {
        this.prioridad2 = prioridad2;
    }

    public Cola getPrioridad3() {
        return prioridad3;
    }

    public void setPrioridad3(Cola prioridad3) {
        this.prioridad3 = prioridad3;
    }

    public Cola getRefuerzo() {
        return refuerzo;
    }

    public void setRefuerzo(Cola refuerzo) {
        this.refuerzo = refuerzo;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }


    
    
    
    
}
