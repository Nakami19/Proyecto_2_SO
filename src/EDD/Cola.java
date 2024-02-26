/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Character;
/**
 *
 * @author Natalia
 */
public class Cola {
    private Nodo first;
    private Nodo last;
    private int size;

    public Cola() {
        this.first = null;
        this.size = 0;
    }

    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }
    
    
    public boolean empty() {
       return getFirst()==null;
    
    }
    
    
    public Nodo encolar(Character element) {
        Nodo nuevo=new Nodo(element);
        if (empty()) {
            setFirst(nuevo);
            setLast(nuevo);
        
        }
        
        else {
           getLast().setNext(nuevo);
           setLast(nuevo);
        }
        size ++;
        return nuevo;
    }
    
    public Nodo desencolar() {
        if (!empty()) {
            Nodo pointer= getFirst();
            setFirst(pointer.getNext());
            pointer.setNext(null);
            size --;
            return pointer;
        }
       return null; 
    }
    
    
    public void imprimir() {
        for (Nodo aux=getFirst(); aux!=null; aux=aux.getNext()) {
            System.out.println(aux.getElement().getId()+" "+aux.getElement().getName() +" "+aux.getElement().getObject());
        }
    
    }
    
    
    
}
