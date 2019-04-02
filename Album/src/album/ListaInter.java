
package album;

public class ListaInter {
    
    private NodoCambio primero;
    private NodoCambio ultimo;
    public Integer contador;
    public ListaInter(){
        this.primero=null;
        this.ultimo=null;
        this.contador=0;
    }
    
    public boolean Vacia(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
    }
    
    
    public void Intercambiar(String nombre,String equipo,int rara,String user){
        
        if(Vacia()){
            NodoCambio nuevo=new NodoCambio(nombre,equipo,rara,user,null,null);
            ultimo=primero=nuevo;
            
        }else{
            NodoCambio nuevo=new NodoCambio(nombre,equipo,rara,user,null,ultimo);
            ultimo.setSiguiente(nuevo);//enlazo siguiente del ultimo al nuevo
            ultimo=nuevo;
            
        }
        contador++;
    }
    
    public NodoCambio ObtenerPrimero(){
        NodoCambio aux=primero;
        return primero;
    }
    public NodoCambio ObtenerSiguiente(NodoCambio aux1){
        NodoCambio aux=aux1;
        aux=aux.siguiente;
        return aux;
    }
    public Integer ObtenerTama(){
        return contador;
    }
    
}
