
package presencial;

public class Nodo_Agenda {
    private String nombre;
    private String telefono;
    private String direccion;
    Nodo_Agenda siguiente;
    Nodo_Agenda anterior;
    
    public Nodo_Agenda(String nombre, String telefono,String direccion,Nodo_Agenda si,Nodo_Agenda an){
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.siguiente=si;
        this.anterior=an;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Nodo_Agenda getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Agenda siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo_Agenda getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Agenda anterior) {
        this.anterior = anterior;
    }
    
    
}
