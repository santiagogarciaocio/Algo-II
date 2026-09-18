//package aed;

public class PilaSobreArreglo implements Pila {
    private int top;
    private int[] lista;

    public PilaSobreArreglo(int capacity) {
        top = -1;
        lista = new int[capacity];                
    }

    public void push(int elem) {
        top ++;
        lista[top] = elem;
    }

    public int pop() {
        int res = lista[top];
        top --;
        return res;
    }

    public int top() {
        return lista[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == lista.length-1;
    }
}
