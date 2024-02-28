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
           // pointer.setNext(null);
            size --;
            return pointer;
        }
       return null; 
    }
    
    public void subir_contador() {
        //se recorre la cola
        for (Nodo aux=getFirst(); aux!=null; aux=aux.getNext()) {
            if(aux.getElement().getCounter()<8){//si el contador es menor a 8 sube
                aux.getElement().setCounter(aux.getElement().getCounter()+1);//se suma 1 al contador 
               // System.out.println("contado nuevo: "+aux.getElement().getCounter()+" nombre "+aux.getElement().getName()+" id "+aux.getElement().getId() );
            }
            
            
        }
    
    }
    
     public int Buscar(Nodo element) {
        int index=0;
        
        for (Nodo aux=getFirst(); aux!=null; aux=aux.getNext()) {
            if(aux==element) {
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public Nodo borrar(int index) {
        Nodo aux=getFirst();
        Nodo retornar=null;
        int count=0;
        if (index!=0) {
        while(aux.getNext()!=null && count!=(index-1)) {
            aux=aux.getNext();
            count++;
        }
        
        if(aux.getNext()!=null) {
            retornar=aux.getNext();
            aux.setNext(aux.getNext().getNext());
        
        }
        
        } 
        
        return retornar;
    }
    
    public String imprimir() {
        String contenido="id y nombre:\n";
        for (Nodo aux=getFirst(); aux!=null; aux=aux.getNext()) {
            contenido+=aux.getElement().getId()+"\n";
            //System.out.println(aux.getElement().getId()+" "+aux.getElement().getName() +" "+aux.getElement().getObject());
        }
        return contenido;
    }
    
    
    
}
