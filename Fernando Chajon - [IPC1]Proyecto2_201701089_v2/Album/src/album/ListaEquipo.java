
package album;

public class ListaEquipo {
    private Nodo_Equipo primero;
    private Nodo_Equipo ultimo;
    public Integer ContadorEquipo;
    
    public ListaEquipo(){
        this.primero=null;
        this.ultimo=null;
        this.ContadorEquipo=0;
    }
    
    public boolean Vacia(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
    }
    
    public void AgregarEquipo(String nombre,String codigo,Integer mundiales,Integer fundacion){
        
        if(Vacia()){//cuando esta nula 
             Nodo_Equipo nuevo1=new Nodo_Equipo(nombre,codigo,mundiales,fundacion,null,null);
             ultimo=primero=nuevo1;
        }else{//Cuando no esta vacia
            Nodo_Equipo nuevo=new Nodo_Equipo(nombre,codigo,mundiales,fundacion,null,ultimo);//Enlazo el nuevo con el ultimo
            //anterior enlazado a ultimo y siguiente nulo
            ultimo.setSiguiente(nuevo);//enlazo siguiente del ultimo al nuevo
            ultimo=nuevo;//nuevo va tomar el valor del ultimo
        } 
        ContadorEquipo++;
    }
    
    //CON ESTE METODO OBTENGO PARA EDITAR Y ELIMINAR
    public Nodo_Equipo ObtenerEquipo(String codigo){
        boolean salir=false;
        Nodo_Equipo aux=primero;
        Nodo_Equipo temporal=null;
        while(aux!=null & salir==false ){
            if(aux.getCodigo().equals(codigo)){
              temporal=aux; 
                salir=true;
            }
            aux=aux.siguiente;
        }
        
        return temporal;
    }
    //hacer una validacion si los codigos existen; el campo codigo no lo cambio
    public void Editar(String nombre,String codigo,Integer mundiales,Integer fundacion){
        boolean salir=false;
        Nodo_Equipo aux=primero;
        while(aux!=null && salir==false){
            if(aux.getCodigo().equals(codigo)){
                aux.setNombre(nombre);
                aux.setCodigo(codigo);
                aux.setMundiales(mundiales);
                aux.setAño(fundacion);
                salir=true;
                
                
            }
            aux=aux.siguiente;
        }   
    } 
    public void Eliminar(String codigo){
        boolean salir=false;
        Nodo_Equipo aux=primero;
        while(aux!=null && salir==false){
            if(aux.getCodigo().equals(codigo)){
                //Para cuando es el ultimo
                if(aux==primero){
                    primero=primero.siguiente;
                    primero.anterior=null;
                    ContadorEquipo--;
                }else if(aux==ultimo){
                    ultimo=ultimo.anterior;
                    ultimo.siguiente=null;
                    ContadorEquipo--;
              }
                else{
                Nodo_Equipo anterior=aux.anterior;
                Nodo_Equipo siguiente=aux.siguiente;
                anterior.setSiguiente(siguiente);
                siguiente.setAnterior(anterior);
                ContadorEquipo--;
                }
             salir=true;   
            }
            aux=aux.siguiente;
            
        }
    }
    
    
    public void Mostrar(){
        Nodo_Equipo temporal=primero;
      
        while(temporal!=null){
            System.out.print(temporal.getNombre()+" "+temporal.getCodigo());
            System.out.println("");
            temporal=temporal.siguiente;
            
        }  
    }
    
    
    
    
    
    
    
    
    //****Metodo para agregar jugadores a la lista***
    public void NuevoJugador(String nombre,String posicion,String nacimiento,double altura,
        double peso,String codigo, int camisola,String tipo){
        boolean terminar=false;
        
        Nodo_Equipo temporal=primero;
      
        while(temporal!=null && terminar==false){
            if(temporal.getCodigo().equals(codigo)){
                
                temporal.jugadores.AgregarJugador(nombre, posicion, nacimiento, altura, peso, codigo, camisola, tipo);
                terminar=true;
                
            }
            
            temporal=temporal.siguiente;
            
        }
        if(terminar==false){
            System.out.println("No existe");
        }
    }
    
    public void EditarJugador(String codigo,String nombre,String namenuevo,String posicion,String nacimiento,double altura,
        double peso, int camisola,String tipo){
        boolean salir=false;
        Nodo_Equipo temporal=primero;
        while(temporal!=null && salir==false){
            if(temporal.getCodigo().equals(codigo)){
                temporal.jugadores.EditarJ(nombre, namenuevo, posicion, nacimiento
                        ,altura,peso, codigo, camisola, tipo);
                
                
                salir=true;
            }
            
            temporal=temporal.siguiente;
        }
        
    }
    
    public void EliminarJugador(String codigo,String nombre){
        Nodo_Equipo aux=primero;
        boolean salir=false;
        while(aux!=null && salir==false){
            if(aux.getCodigo().equals(codigo)){
                
                aux.jugadores.EliminarJ(nombre);
                salir=true;
                
            }
            aux=aux.siguiente;
            
            
        }   
    }
    public boolean ExisteJugador(String codigo,String nombre){
        boolean jugador=false;
        Nodo_Equipo aux=primero;
        
        while(aux!=null){
            
            if(aux.getCodigo().equals(codigo)){
                jugador=aux.jugadores.ExisteJ(nombre);
            }
            aux=aux.siguiente;
        }
        return jugador;
    }
    public boolean ExisteEquipo(String codigo){
        Nodo_Equipo aux=primero;
        boolean existe=false;
        while(aux!=null && existe==false){
            if(aux.getCodigo().equals(codigo)){
                existe=true;
            }
            aux=aux.siguiente;
        }
        return existe;
    }
    
    public Integer Tamaño(){
        return ContadorEquipo;
    }
    
    public Nodo_Equipo ObtenerPrimero(){
        Nodo_Equipo aux=primero;
        return aux;
    }
    public Nodo_Equipo ObtenerSiguientes(Nodo_Equipo aux1){
        Nodo_Equipo aux=aux1;
        aux=aux.siguiente;
        if(aux==null){
            aux=primero;
        }
        return aux;
    }
    public Nodo_Equipo ObtenerAnterior(Nodo_Equipo aux1){
        Nodo_Equipo aux=aux1;
        aux=aux.anterior;
        if(aux==null){
            aux=ultimo;
        }
        return aux;
    }
    
    public Nodo_Equipo ObtenerSiguiente(Nodo_Equipo aux1){
        Nodo_Equipo aux=aux1;
        aux=aux.siguiente;
        return aux;
    }
    
    
    
    public void InsertarEstampa(String codigo,String nombre, String ruta){
        Nodo_Equipo aux=primero;
        boolean salir=false;
        while(aux!=null && salir==false){
            if(aux.getCodigo().equals(codigo)){
                aux.jugadores.AgregarImagen(nombre, ruta);
                salir=true;
            }
            aux=aux.siguiente;
            
        }
    }
    
    public boolean ComprobrarExistencia(String codigo,String nombre,String ruta){
        Nodo_Equipo aux=primero;
        boolean existe=false;
        boolean salir=false;
        while(aux!=null && salir==false){
            if(aux.getCodigo().equals(codigo)){
                existe=aux.jugadores.ComprobarEstampa(nombre, ruta);
                
            }
            aux=aux.siguiente;
        }
        return existe;
    }
    
    
    
    
    
    
    public void MostrarJugadores(){
        Nodo_Equipo aux=primero;
        while(aux!=null){
            System.out.println(aux.jugadores.MostrarRuta());
            aux=aux.siguiente;
        }
    }
  
    
    
    

}
