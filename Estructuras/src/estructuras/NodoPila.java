
package estructuras;

public class NodoPila {
    
    //Se van a manejar cadenas
    String dato;
    NodoPila anterior;
    NodoPila siguiente;
    
    public NodoPila(String dato,NodoPila an,NodoPila si){
        this.dato=dato;
        this.anterior=an;
        this.siguiente=si;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoPila getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPila anterior) {
        this.anterior= anterior;
    }
    
    
}

