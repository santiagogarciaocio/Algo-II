//package aed;

public class PilaSobreListaEnlazada implements Pila {
    
    private Node top;

    public PilaSobreListaEnlazada() {
        top = null;
    }

    public void push(int elem) {
        Node nuevo = new Node(elem);
        nuevo.next = this.top;
        top = nuevo;
        
    }

    public int pop() {
        int res = top.data;
        top = top.next;
        return res;

    }

    public int top() {
        return this.top.data;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public boolean isFull() {
        return false;
    }
}
