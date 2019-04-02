
package album;

public class NodoUsuarios {
    
    private Integer Cui;
    private String Nombre;
    private String Fecha;
    private String Correo;
    private String User;
    private String Password;
    NodoUsuarios siguiente;
    NodoUsuarios anterior;
    
    public ListaEquipo equipos;
    public ListaSobre sobres;
    
    //Un contador para saber cuantas veces a entrado el usuario al sistema
    private Integer Entradas;
    //Para saber cuantos sobres y estampas colocadas tienes el usuario
    private Integer Abiertos;
    private Integer Colocadas;
    
    public NodoUsuarios(Integer cui, String nombre, String fecha,String correo,String user,String password
    ,NodoUsuarios si,NodoUsuarios an){
        
        this.Cui=cui;
        this.Nombre=nombre;
        this.Fecha=fecha;
        this.Correo=correo;
        this.User=user;
        this.Password=password;
        this.siguiente=si;
        this.anterior=an;
        
        this.sobres=new ListaSobre();
        
        this.equipos=new ListaEquipo();
        
        Nodo_Equipo aux=ListasGenerales.listaEquipo.ObtenerPrimero();
        while(aux!=null){
            String nom1=aux.getNombre();
            String cod1=aux.getCodigo();
            Integer mun=aux.getMundiales();
            Integer año=aux.getAño();
            equipos.AgregarEquipo(nom1, cod1, mun, año);
            Nodo_Jugador aux1=aux.jugadores.ObtenerPrimero();
            while(aux1!=null){
                String nombreJ=aux1.getNombre();
                String posicion=aux1.getPosicion();
                String nacimi=aux1.getNacimiento();
                double altura=aux1.getAltura();
                double peso=aux1.getPeso();
                String codigo=aux1.getCodigo();
                int camisola=aux1.getCamisola();
                String tipo=aux1.getTipo();
                equipos.NuevoJugador(nombreJ, posicion, nacimi, altura, peso, codigo, camisola, tipo);
                aux1=aux.jugadores.ObtenerSiguiente(aux1);
            }
            
            aux=ListasGenerales.listaEquipo.ObtenerSiguiente(aux);
        }
        
        
        
        
        this.Entradas=0;
        this.Abiertos=0;
        this.Colocadas=0;
        
        
    }

   

    public Integer getAbiertos() {
        return Abiertos;
    }

    public void setAbiertos(Integer Abiertos) {
        this.Abiertos = Abiertos;
    }

    public Integer getColocadas() {
        return Colocadas;
    }

    public void setColocadas(Integer Colocadas) {
        this.Colocadas = Colocadas;
    }

    public Integer getEntradas() {
        return Entradas;
    }

    public void setEntradas(Integer Entradas) {
        this.Entradas = Entradas;
    }
       
    
    public Integer getCui() {
        return Cui;
    }

    public void setCui(Integer Cui) {
        this.Cui = Cui;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public NodoUsuarios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuarios siguiente) {
        this.siguiente = siguiente;
    }

    public NodoUsuarios getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoUsuarios anterior) {
        this.anterior = anterior;
    }
    
    
    
}
