
package album;

public class ListaJugador {
    private Nodo_Jugador primero;
    private Nodo_Jugador ultimo;
    public static Integer ContadorJugadores;
    
    public ListaJugador(){
        this.primero=null;
        this.ultimo=null;
        ListaJugador.ContadorJugadores=0;
    }
    
    //verificar si existen
    
    public boolean Verificar(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
        
    }
    
    
    public void AgregarJugador(String nombre, String posicion,String nacimi,double 
            altura,double peso,String codigo,int camisola,String tipo){
        
        if(Verificar()){
            
            Nodo_Jugador nuevo=new Nodo_Jugador(nombre,posicion,nacimi,altura,peso,codigo,camisola,tipo,null,null);
            ultimo=primero=nuevo;
            
        }else{
            Nodo_Jugador nuevo1=new Nodo_Jugador(nombre,posicion,nacimi,altura,peso,codigo,camisola,tipo,null,ultimo);
            ultimo.setSiguiente(nuevo1);
            ultimo=nuevo1;
        }
        ListaJugador.ContadorJugadores++;
    }
    
    public Nodo_Jugador ObtenerJ(String nombre){
        boolean terminar=false;
        Nodo_Jugador aux=primero;
        Nodo_Jugador temporal=null;
        while(aux!=null && terminar==false){
            
            if(aux.getNombre().equals(nombre)){
                temporal=aux;
                terminar=true;
            }
            aux=aux.siguiente;
        }
        return temporal;
    }
    
    public void EditarJ(String nombre,String nameNuevo, String posicion,String nacimi,double 
            altura,double peso,String codigo,int camisola,String tipo){
       boolean terminar=false;
        Nodo_Jugador aux=primero;
        while(aux!=null && terminar==false){
            if(aux.getNombre().equals(nombre)){
                aux.setNombre(nameNuevo);
                aux.setPosicion(posicion);
                aux.setNacimiento(nacimi);
                aux.setAltura(altura);
                aux.setPeso(peso);
                aux.setCodigo(codigo);
                aux.setCamisola(camisola);
                aux.setTipo(tipo);
                terminar=true;
            }
            aux=aux.siguiente;
        }
        
    }
    
    public void EliminarJ(String nombre){
        Nodo_Jugador aux=primero;
        boolean terminar=false;
        while(aux!=null && terminar==false){
            if(aux.getNombre().equals(nombre)){
                
                if(aux==primero){
                    primero=primero.siguiente;
                    primero.anterior=null;
                    ListaJugador.ContadorJugadores--;
                    
                }else if(aux==ultimo){
                    ultimo=ultimo.anterior;
                    ultimo.siguiente=null;
                    ListaJugador.ContadorJugadores--;
                }else{
                Nodo_Jugador anterior=aux.anterior;
                Nodo_Jugador siguiente=aux.siguiente;
                anterior.setSiguiente(siguiente);
                siguiente.setAnterior(anterior);
                ListaJugador.ContadorJugadores--;
                }
                terminar=true;
            }
            aux=aux.siguiente;
            
        }
        
    }
    
    public boolean ExisteJ(String nombre){
        boolean j=false;
        Nodo_Jugador aux=primero;
        while(aux!=null){
            if(aux.getNombre().equals(nombre)){
                j=true;
            }
            aux=aux.siguiente;
        }
        return j;
    }
    
    
    public String MostrarJ(){
        Nodo_Jugador aux=primero;
        String devolver="";
        String guardar;
        Integer contador=1;
        while(aux!=null){
            
             guardar=contador+"Nombre: "+aux.getNombre()+"|| Posicion: "+aux.getPosicion()
             +"|| Numero de Camisola: "+aux.getCamisola()+"|| Tipo: "+aux.getTipo()+aux.getRuta()+"\n\n";
             devolver=devolver+guardar;
             contador++;
             aux=aux.siguiente;    
        }
        return devolver;
    }
     public Nodo_Jugador ObtenerPrimero(){
        Nodo_Jugador aux=primero;
        if(aux==null){
            System.out.println("Esta nulo");
        }
        return aux;
    }
    public Nodo_Jugador ObtenerSiguientes(Nodo_Jugador aux1){
        Nodo_Jugador aux=aux1;
        
        aux=aux.siguiente;
        if(aux==null){
            aux=primero;
        }
        return aux;
    }
    public Nodo_Jugador ObtenerAnterior(Nodo_Jugador aux1){
        Nodo_Jugador aux=aux1;
        aux=aux.anterior;
        if(aux==null){
            aux=ultimo;
        }
        return aux;
    }
    
    
    public Nodo_Jugador ObtenerSiguiente(Nodo_Jugador aux1){
        Nodo_Jugador aux=aux1;
        
        aux=aux.siguiente;
        
        return aux;
    }
    
    public Integer JugadoresTotal(){
        return ListaJugador.ContadorJugadores;
    }
    
    public void AgregarImagen(String nombre, String ruta){
        Nodo_Jugador aux=primero;
        boolean salir=true;
        while(aux!=null && salir==true){
            
            if(aux.getNombre().equals(nombre)){
                aux.setRuta(ruta);
                salir=true;
            }
            aux=aux.siguiente;
        }
        
    }
    public boolean ComprobarEstampa(String nombre,String ruta){
        Nodo_Jugador aux=primero;
        boolean existe=false;
        boolean salir=false;
        while(aux!=null && salir==false){
            if(aux.getNombre().equals(nombre) && aux.getRuta().equals(ruta)){
                existe=true;
                salir=true;
            }
            aux=aux.siguiente;
        }
        return existe;
    }
    public String MostrarRuta(){
        Nodo_Jugador aux=primero;
        String s1;
        String s2="";
        while(aux!=null){
            s1=aux.getRuta();
            s2+=s1;
            aux=aux.siguiente;
        }
        return s2;
    }
    
}
