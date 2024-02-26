/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package EDD;

import Clases.Character;
/**
 *
 * @author Tomas
 */
public class Lista {
    //lista para los ganadores
    private Nodo head;
    private int size;
    
    public Lista(){
        this.head = null;
        this.size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
   public void setSize(int size){
       this.size = size;
   }
   
   public Nodo getHead(){
       return head;
   }
   
   public void setHead(Nodo head){
       this.head = head;
   }
   
   public boolean isEmpty(){
        return getHead() == null;
    }
   

   public Nodo insertBegin(Character winner){
        Nodo node = new Nodo(winner);
        if(isEmpty()){
            setHead(node);
        }else{
            node.setNext(getHead());
            setHead(node);
        }
        size ++;
        return node;
    }
    
    public Nodo deleteBegin(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }
   
}
