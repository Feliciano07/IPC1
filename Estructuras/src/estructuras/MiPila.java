
package estructuras;

public class MiPila {
    NodoPila primero;
    NodoPila ultimo;
    public static int contador;
    
    public MiPila(){
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
    
    public void Push(String dato){
        if(Vacia()){
            NodoPila nuevo=new NodoPila(dato,null,null);
            ultimo=primero=nuevo;
            MiPila.contador++;
        }else{
            NodoPila nuevo=new NodoPila(dato,null,primero);
            primero.setAnterior(nuevo);
            primero=nuevo;
            MiPila.contador++;
            
        }
        
        
    }
    
    public void MostarPila(){
        NodoPila aux=primero;
        int j=MiPila.contador;
        while(aux!=null){
            
            System.out.println("Posicion "+j+" "+aux.getDato());
            aux=aux.siguiente;
            j--;
        }
    }
    
    public void Pop(){
        NodoPila aux=primero;
        System.out.println(aux.getDato());
        primero=primero.siguiente;
        aux.setAnterior(null);
        
        aux.setSiguiente(null);
        MiPila.contador--;
        
       
    }
    
}
