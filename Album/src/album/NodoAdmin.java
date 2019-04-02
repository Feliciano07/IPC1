
package album;

public class NodoAdmin {
    private String nombreJu;
    private String Equicodigo;
    private int rareza;
    private String ruta;
    NodoAdmin siguiente;
    NodoAdmin anterior;
    
    //para saber cuantas veces se coloco una estampa
    private Integer colocada;
    
    public NodoAdmin(String nombreJu,String equicodigo,int rareza,String ruta,NodoAdmin sigui,NodoAdmin an){
        this.nombreJu=nombreJu;
        this.Equicodigo=equicodigo;
        this.rareza=rareza;
        this.ruta=ruta;
        this.siguiente=sigui;
        this.anterior=an;
        this.colocada=0;
        
    }

    public Integer getColocada() {
        return colocada;
    }

    public void setColocada(Integer colocada) {
        this.colocada = colocada;
    }

    public String getNombreJu() {
        return nombreJu;
    }

    public void setNombreJu(String nombreJu) {
        this.nombreJu = nombreJu;
    }

    public String getEquicodigo() {
        return Equicodigo;
    }

    public void setEquicodigo(String Equicodigo) {
        this.Equicodigo = Equicodigo;
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

    public NodoAdmin getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAdmin siguiente) {
        this.siguiente = siguiente;
    }

    public NodoAdmin getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoAdmin anterior) {
        this.anterior = anterior;
    }
    
    
    
}
