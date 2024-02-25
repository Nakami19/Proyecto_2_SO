/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Natalia
 */
public class Nodo {
    
    private Character element;
    
    private Nodo next;

    public Nodo(Character element) {
        this.element = element;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(Character element) {
        this.element = element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
