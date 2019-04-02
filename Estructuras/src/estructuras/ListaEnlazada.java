
package estructuras;

public class ListaEnlazada {
    NodoSimple primero;
    NodoSimple ultimo;
    
    public ListaEnlazada(){
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
    
    public void AgregarFin(String dato){
        if(Vacia()){
            NodoSimple nuevo=new NodoSimple(dato,null);
            ultimo=primero=nuevo;
        }else{
            NodoSimple nuevo=new NodoSimple(dato,null);
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
        
    }
    public void AgregarInicio(String dato){
        if(Vacia()){
            NodoSimple nuevo=new NodoSimple(dato,null);
            primero=ultimo=nuevo;
            
        }else{
            NodoSimple nuevo=new NodoSimple(dato,primero);
            primero=nuevo;
            
        }
    }
    
    public void Mostrar(){
        NodoSimple aux=primero;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.siguiente;
        }
    }
    
    public void Buscar(String dato){
        NodoSimple temporal=null;
        NodoSimple aux=primero;
        
        while(aux!=null){
            if(aux.getDato().equals(dato)){
                temporal=aux;
                System.out.println(temporal.getDato());
            }
             aux=aux.siguiente;
        }
        
    }
     
    
}
