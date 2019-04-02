
package ejemplo;

public class Nodo {
    private String nombre;
    Nodo siguiente;
    Lista1 lista;

    public Lista1 getLista() {
        return lista;
    }

    public void setLista(Lista1 lista) {
        this.lista = lista;
    }
    
    public Nodo(String nombre,Nodo si){
        this.nombre=nombre;
        this.siguiente=si;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
