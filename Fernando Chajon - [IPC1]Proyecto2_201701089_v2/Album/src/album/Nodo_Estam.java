
package album;

public class Nodo_Estam {
    private String nombre;
    private String codigo;
    private int rareza;
    private String ruta;
    Nodo_Estam siguiente;
    public Integer cantidad;
    
    
    
    public Nodo_Estam(Integer cantidad,String nombre,String codigo,int rareza,String ruta,Nodo_Estam si){
        this.cantidad=cantidad;
        this.nombre=nombre;
        this.codigo=codigo;
        this.rareza=rareza;
        this.ruta=ruta;
        this.siguiente=si;
        
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

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

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Nodo_Estam getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Estam siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
