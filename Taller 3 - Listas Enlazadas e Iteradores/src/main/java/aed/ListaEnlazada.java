package aed;

public class ListaEnlazada<T> {
    // Completar atributos privados
        private Nodo primero;
        private Nodo ultimo;        


    private class Nodo {
        // Completar
        Nodo anterior;
        Nodo siguiente;
        T valor;

        Nodo(T val){valor = val;}
    }

    public ListaEnlazada() {
        primero = null;
        ultimo = null;
    }

    public int longitud() {
        if(primero == null){return 0;}    
        Nodo actual = primero;
        int res = 1;
        while(actual.siguiente != null){
            res = res +1;
            actual = actual.siguiente;
        }
        return res;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem); 
        if(longitud()==0){
            ultimo=nuevo;
            primero=nuevo;
        }else{
        nuevo.siguiente = primero;        
        primero.anterior = nuevo;
        primero = nuevo;
        primero.anterior = null;
        }
    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        if(longitud()==0){
            ultimo=nuevo;
            primero=nuevo;
        }else{
        nuevo.anterior = ultimo;        
        ultimo.siguiente = nuevo;        
        ultimo = nuevo;
        ultimo.siguiente = null;
        }
    }

    public T obtener(int i) {
        if(longitud() < i || longitud() == 0){return null;}
        Nodo iterador = primero;        
        for(int j = 1; j<=i ;j++){                    
            iterador = iterador.siguiente;            
        }
        return iterador.valor;
    }

    public void eliminar(int i) {
        //caso primer elemento
        if(i==0){
            if(longitud()==1){
                primero = null;
                ultimo = null;
            }
            else{
            primero = primero.siguiente;
            primero.anterior = null;
            }
        }
        //caso ultimo elemento
        else if(i==longitud()-1){
            if(longitud()==1){
                primero = null;
                ultimo = null;
            }else{
            ultimo = ultimo.anterior;
            ultimo.siguiente = null;}
        }
        //caso intermedio
        else {
            Nodo iterador = primero;
            Nodo nodoAnterior= primero;
            Nodo nodoSiguiente= primero;
            for(int j = 0;j<=i+1;j++){
                if(j==i-1){
                    nodoAnterior = iterador;
                    iterador = iterador.siguiente;                    
                    }
                else if(j == i+1){
                    nodoSiguiente = iterador;
                    iterador = iterador.siguiente;
                    }
                else{iterador = iterador.siguiente;}
                }
            nodoAnterior.siguiente = nodoSiguiente;
            nodoSiguiente.anterior = nodoAnterior;
                
            }
        
    }

    public void modificarPosicion(int indice, T elem) {
        Nodo iterador = primero;
        for(int j = 0;j<=indice;j++){
            if(j==indice){
                iterador.valor = elem;
            }
            iterador= iterador.siguiente;
        }
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {        
        primero = new Nodo(lista.primero.valor);        
        primero.anterior = null;
        Nodo nodoAnterior = primero;
        Nodo iterador = lista.primero.siguiente;
        while(iterador != null){      
            Nodo nodoActual = new Nodo(iterador.valor);
            nodoAnterior.siguiente = nodoActual;
            nodoActual.anterior = nodoAnterior;
            nodoAnterior = nodoActual;
            iterador = iterador.siguiente;                        
        }
        nodoAnterior.siguiente = null;
        ultimo = nodoAnterior;

        
    }
    
    @Override
    public String toString() {
        String res = "";
        if(longitud()==0){return "[]";}
        Nodo iterador = primero;
        res = "["+iterador.valor;
        while(iterador.siguiente != null){
            res = res+", "+iterador.siguiente.valor;
            iterador = iterador.siguiente;
        }        
        return res = res+"]";
    }

    public class ListaIterador{
    	// Completar atributos privados
        int puntero;
        
        ListaIterador(){}

        public boolean haySiguiente() {
            null
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public ListaIterador iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
