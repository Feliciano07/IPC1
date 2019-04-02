
package album;

public class NodoCambio {
   
    private String nombre;
    private String Equipo;
    private int rara;
    private String user;
    
    NodoCambio siguiente;
    NodoCambio anterior;
    
    public NodoCambio(String nombre, String equipo, int rara,String user,NodoCambio si,NodoCambio an){
        this.nombre=nombre;
        this.Equipo=equipo;
        this.rara=rara;
        this.user=user;
        this.siguiente=si;
        this.anterior=an;
        
    }

    public NodoCambio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCambio siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCambio getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCambio anterior) {
        this.anterior = anterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getRara() {
        return rara;
    }

    public void setRara(int rara) {
        this.rara = rara;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
