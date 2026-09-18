//package aed;

public class ColaSobreArregloCircular implements Cola {
    private int head;
    private int tail;
    private int[] lista;

    public ColaSobreArregloCircular(int i) {
        lista = new int[i];
        head = -1;
        tail = -1;
    }

    // Inserta en el final (tail)
    public void enqueue(int elem) {
        if(tail == -1){
            lista[0] = elem;
            head = 0;
            tail = 1;
        }
        else{
            lista[tail] = elem;
            tail = tail+1;
        } 
    }

    // Obtiene el elemento del frente (head)
    public int dequeue() {
        int res = lista[head];
        head = head+1;
        return res;
    }

    // Obtiene el elemento del frente (head)
    public int front() {
        return lista[head];
    }

    // Obtiene el elemento del final (tail)
    public int rear() {
        return lista[tail-1];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        if(! (tail != -1)){return false;}
        else{return tail == lista.length && head == 0;}        
    }
}
