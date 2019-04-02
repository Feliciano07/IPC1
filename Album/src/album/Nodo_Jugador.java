
package album;

public class Nodo_Jugador {
    private String nombre;
    private String posicion;
    private String nacimiento;
    private double altura;
    private double peso;
    private String codigo;
    private int camisola;
    private String tipo;//jugador normal o capitan
    private String ruta;//Que me sirve para obtenr la imagen
    
    Nodo_Jugador siguiente;
    Nodo_Jugador anterior;
    
    public Nodo_Jugador(String nombre, String posicion,String nacimi,double 
            altura,double peso,String codigo,int camisola,String tipo,Nodo_Jugador si,Nodo_Jugador a){
        
        this.nombre=nombre;
        this.posicion=posicion;
        this.nacimiento=nacimi;
        this.altura=altura;
        this.peso=peso;
        this.codigo=codigo;
        this.camisola=camisola;
        this.tipo=tipo;
        this.siguiente=si;
        this.anterior=a;
        this.ruta="";
        
    }

    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCamisola() {
        return camisola;
    }

    public void setCamisola(int camisola) {
        this.camisola = camisola;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    

    public Nodo_Jugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Jugador siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo_Jugador getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Jugador anterior) {
        this.anterior = anterior;
    }
    
    
    
}
