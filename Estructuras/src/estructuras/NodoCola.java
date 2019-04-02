
package estructuras;

public class NodoCola {
    private String dato;
    NodoCola siguiente;
    
    public NodoCola(String dato,NodoCola si){
        this.dato=dato;
        this.siguiente=si;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
