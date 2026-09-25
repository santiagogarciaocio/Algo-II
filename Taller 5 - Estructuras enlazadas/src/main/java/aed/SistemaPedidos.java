/*package aed; */
import java.util.ArrayList;

public class SistemaPedidos {
    /*Completar con los atributos privados*/
    private ListaEnlazada<Pedido> pedidoPorLlegada;
    private ArrayList<Handle<Pedido>> pedidoPorId;


    public SistemaPedidos(){
        pedidoPorLlegada = new ListaEnlazada<Pedido>();
        pedidoPorId = new ArrayList<Handle<Pedido>>(1);
    }

    public void agregarPedido(Pedido pedido){
        Handle<Pedido> nuevoElemento = pedidoPorLlegada.agregarAtras(pedido);
        if(pedidoPorId.isEmpty()){
            pedidoPorId.add(nuevoElemento);
        }
        else{agregarOrdenado(nuevoElemento);}
    }

    private void agregarOrdenado(Handle<Pedido> p){
        int i = 0;
        for(Handle<Pedido> e : pedidoPorId){
            if(p.valor().id()>e.valor().id()){                
                break;}
            else{i++;}
        }
        pedidoPorId.add(i,p);
    }

    public Pedido proximoPedidoPorId(){
        Handle<Pedido> proximoHandle = pedidoPorId.remove(pedidoPorId.size()-1);
        proximoHandle.eliminar();
        return proximoHandle.valor();
        

    }

    public Pedido proximoPedidoPorLlegada(){
        Pedido pedido = pedidoPorLlegada.obtenerPrimero();
        pedidoPorLlegada.eliminar(0);        
        for(int i = 0 ; i < pedidoPorId.size();i++){
            if(pedido.compareTo(pedidoPorId.get(i).valor()) == 0){
                pedidoPorId.remove(i);
            }
        }
        return pedido;

    }

    private int busquedaBinariaIndice(ArrayList<Handle<Pedido>> ls, Pedido pedido){
        throw new UnsupportedOperationException("No implementado aún"); 
    }

    public Pedido pedidoMenorId(){
        return pedidoPorId.get(pedidoPorId.size()-1).valor();
    }

    public String obtenerPedidosEnOrdenDeLlegada(){
        String res = "[";
        Iterador<Pedido> actual = pedidoPorLlegada.iterador();
        while(actual.haySiguiente()){
            res = res+actual.siguiente().toString();
            if(actual.haySiguiente()){res=res+", ";}
        }
        return res+"]";
    }

    public String obtenerPedidosOrdenadosPorId(){
        String res = "[";
        for(int i = 0; i<= pedidoPorId.size()-1;i++){
            res = res+pedidoPorId.get(pedidoPorId.size()-1-i).valor().toString();
            if(!(i+1==pedidoPorId.size())){res=res+", ";}
        }
        return res+"]";
    }
}
