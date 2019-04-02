
package estructuras;

public class NodoSimple {
    private String dato;
    NodoSimple siguiente;
    public NodoSimple(String dato, NodoSimple si){
        this.dato=dato;
        this.siguiente=si;
        
        
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
