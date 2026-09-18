//package aed;

public class ColaSobreListaEnlazada implements Cola {
    private Node head;
    private Node tail;

    public ColaSobreListaEnlazada() {
        head = null;
        tail = null;
    }

    public void enqueue(int elem) {
        Node nuevo = new Node(elem);
        if(tail == null){
            tail = nuevo;
            head = nuevo;
        }
        else{        
            nuevo.next = tail;
            tail = nuevo;
        }
    }

    public int dequeue() {
        if(head == tail){
            int res = tail.data;
            tail = null;
            head = null;
            return res;
        }
        else{
        int res = head.data;
        Node puntero = tail;
        while(!puntero.next.equals(head)){
            puntero = puntero.next;
        }
        puntero.next = null;
        head = puntero;
        return res;}
    }

    public int front() {
        return head.data;
    }

    public int rear() {
        return tail.data;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public boolean isFull() {
        return false;
    }
}
