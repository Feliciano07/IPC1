
package estructuras;

public class MiCola {
    NodoCola primero;
    NodoCola ultimo;
    
    public MiCola(){
        this.primero=null;
        this.ultimo=null;
    }
    public boolean Vacia(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
    }
    
    public void Encolar(String dato){
        if(Vacia()){
            NodoCola nuevo=new NodoCola(dato,null);
            ultimo=primero=nuevo;
            
        }else{
            NodoCola nuevo=new NodoCola(dato,null);
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
        
        
    }
    public void Mostar(){
        NodoCola aux=primero;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.siguiente;
        }
    }
    
    public void Desencolar(){
        NodoCola aux=primero;
        System.out.println(aux.getDato());
        primero=primero.siguiente;
        aux.setSiguiente(null);
        
    }
    
}
