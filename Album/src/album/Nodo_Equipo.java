
package album;

public class Nodo_Equipo {
    private String nombre;//nombre del equipo
    private String codigo;//codigo del equipo
    private Integer mundiales;// numero de mundiales ganados
    private Integer año;//año de fundacion del equipo; 

  
 
    Nodo_Equipo siguiente;
    Nodo_Equipo anterior;
    ListaJugador jugadores;
    
    public Nodo_Equipo(String nom1,String cod1,Integer mun,Integer año, Nodo_Equipo si,Nodo_Equipo an){
        this.nombre=nom1;
        this.codigo=cod1;
        this.mundiales=mun;
        this.año=año;
        this.siguiente=si;
        this.anterior=an;
        this.jugadores=new ListaJugador();//Inicio al jugador;
    }
    //PENDIENTE HACER LOS GET Y SET DE LOS ABRITUTOS DEL EQUIPO

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getMundiales() {
        return mundiales;
    }

    public void setMundiales(Integer mundiales) {
        this.mundiales = mundiales;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public ListaJugador getJugadores() {
        return jugadores;
    }

    public void setJugadores(ListaJugador jugadores) {
        this.jugadores = jugadores;
    }

    
    

    

    public Nodo_Equipo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Equipo anterior) {
        this.anterior = anterior;
    }
    public Nodo_Equipo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Equipo siguiente) {
        this.siguiente = siguiente;
    }
    
}
