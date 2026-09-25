package aed;
import java.util.ArrayList;

public class SistemaPedidos {
    /*Completar con los atributos privados*/
    private ListaEnlazada<Pedido> pedidoPorLlegada;
    private ArrayList<Handle<Pedido>> pedidoPorId;


    public SistemaPedidos(){
        pedidoPorLlegada = new ListaEnlazada<Pedido>();
        pedidoPorId = null;
    }

    public void agregarPedido(Pedido pedido){
        Handle<Pedido> nuevoElemento = pedidoPorLlegada.agregarAtras(pedido);
        if(pedidoPorId == null){
            pedidoPorId.add(0,nuevoElemento);
        }
        else{agregarOrdenado(nuevoElemento);}
    }

    private void agregarOrdenado(Handle<Pedido> p){
        int i = 0;
        for(Handle<Pedido> e : pedidoPorId){
            if((valor(e) < valor(p)) && (!(ListaEnlazada.haySiguiente(e)) || (valor(e) < valor(p)))){
                pedidoPorId.add(i,p);
            }
            else{i++;}
        }
    }

    public Pedido proximoPedidoPorId(){
        Handle<Pedido> proximoHandle = pedidoPorId.remove(pedidoPorId.size()-1);
        pedidoPorLlegada.eliminar(proximoHandle);
        return proximoHandle;
        

    }

    public Pedido proximoPedidoPorLlegada(){
        Handle<Pedido> pedido = pedidoPorLlegada.obtenerPrimero();
        pedidoPorLlegada.eliminarNodo(pedido);

    }

    private int busquedaBinariaIndice(ArrayList<Handle<Pedido>> ls, Pedido pedido){
        throw new UnsupportedOperationException("No implementado aún"); 
    }

    public Pedido pedidoMenorId(){
        return pedidoPorId.get(pedidoPorId.size()-1);
    }

    public String obtenerPedidosEnOrdenDeLlegada(){
        throw new UnsupportedOperationException("No implementado aún");
    }

    public String obtenerPedidosOrdenadosPorId(){
        throw new UnsupportedOperationException("No implementado aún");
    }
}