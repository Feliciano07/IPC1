
package album;

public class NodoSobre {
    private int numero;
    NodoSobre siguiente;
    NodoSobre anterior;
    
    //Lista De Estampa
    
    ListaEstampa listaEstampa;
    
    public NodoSobre(int numer,NodoSobre siguiente,NodoSobre anterior){
        this.numero=numer;
        this.siguiente=siguiente;
        this.anterior=anterior;
        listaEstampa=new ListaEstampa();
    }
    
    
        public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoSobre getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSobre siguiente) {
        this.siguiente = siguiente;
    }

    public NodoSobre getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoSobre anterior) {
        this.anterior = anterior;
    }
}
