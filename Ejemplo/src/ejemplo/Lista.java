
package ejemplo;

public class Lista {
    
    private Nodo primero;
    private Nodo ultimo;
    
    public Lista(){
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
    
    public void Agregar(String nombre){
        
        if(Vacia()){
            Nodo nuevo=new Nodo(nombre,null);
            ultimo=primero=nuevo;
        }else{
            Nodo nuevo1=new Nodo(nombre,null);
            ultimo.setSiguiente(nuevo1);
            ultimo=nuevo1;
        }
        
    }
    public void Mostar(){
        Nodo aux;
        aux=primero;
        while(aux!=null){
            System.out.println(aux.getNombre());
            aux=aux.siguiente;
        }
    }
    
}
