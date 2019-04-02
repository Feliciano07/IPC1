
package album;

public class ListaUsuarios {
    
    private NodoUsuarios primero;
    private NodoUsuarios ultimo;
    public static Integer ContadorUser;
    public ListaUsuarios(){
        this.primero=null;
        this.ultimo=null;
        ListaUsuarios.ContadorUser=0;
    }
    
    public boolean Vacia(){
        boolean vacia=false;
        
        if(primero==null){
            vacia=true;
        }
        return vacia;
        
    }
    
    
    public void NuevoUsuario(Integer cui, String nombre, String fecha,String correo,String user,String password){
        
        if(Vacia()){
            NodoUsuarios nuevo=new NodoUsuarios(cui,nombre,fecha,correo,user,password,null,null);
            
            ultimo=primero=nuevo;
            ListaUsuarios.ContadorUser++;
            
        }else{
            NodoUsuarios nuevo=new NodoUsuarios(cui,nombre,fecha,correo,user,password,null,ultimo);
            
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
            ListaUsuarios.ContadorUser++;
        }
        
    }
    public void EditarUsuario(Integer cui,Integer cuinuevo, String nombre, String fecha,String correo,
            String user,String password){
        boolean salir=false;
        NodoUsuarios aux=primero;
        
        while(aux!=null && salir==false){
            
            if(aux.getCui().equals(cui)){
                aux.setCui(cuinuevo);
                aux.setNombre(nombre);
                aux.setFecha(fecha);
                aux.setUser(user);
                aux.setPassword(password);
                salir=true;
            }
            aux=aux.siguiente;
        }
        
    }
    public void EliminarUsuario(Integer Cui){
        boolean salir=false;
        NodoUsuarios aux=primero;
        
        while(aux!=null && salir==false){
            
            if(aux.getCui().equals(Cui)){
                
                   if(aux==primero){
                    primero=primero.siguiente;
                    primero.anterior=null;
                   ListaUsuarios.ContadorUser--;
                }else if(aux==ultimo){
                    ultimo=ultimo.anterior;
                    ultimo.siguiente=null;
                    ListaUsuarios.ContadorUser--;
              }
                else{
                NodoUsuarios anterior=aux.anterior;
                NodoUsuarios siguiente=aux.siguiente;
                anterior.setSiguiente(siguiente);
                siguiente.setAnterior(anterior);
                ListaUsuarios.ContadorUser--;
               }
             salir=true;      
                
            }
            aux=aux.siguiente;
        }
        
    }
    
  public NodoUsuarios ObtenerUsuario(Integer cui){
      NodoUsuarios aux=primero;
      NodoUsuarios retornar=null;
      boolean salir=false;
      while(aux!=null && salir==false){
          
          if(aux.getCui().equals(cui)){
              retornar=aux;
              salir=true;
          }
          aux=aux.siguiente;
      }
      return retornar;
  }
    public Integer UsuariosTotales(){
        return ListaUsuarios.ContadorUser;

    } 
    public NodoUsuarios ObtenerPrimero(){
        NodoUsuarios aux=primero;
        return aux;
    }
    public NodoUsuarios ObtenerSiguientes(NodoUsuarios aux){
        NodoUsuarios aux1=aux;
        aux1=aux1.siguiente;
        return aux1;
    }
    
    public NodoUsuarios AbrirUsuario(String user, String contraseña){
        NodoUsuarios aux=primero;
        NodoUsuarios aux2=null;
        boolean salir=false;
        while(aux!=null && salir==false){
            
            if(aux.getUser().equals(user) && aux.getPassword().equals(contraseña)){
                
                aux2=aux;
                salir=true;
            }
            aux=aux.siguiente;
        }
        return aux2;
    }
    public void Ingreso(Integer cui){
        NodoUsuarios aux=primero;
        boolean salir=false;
        while(aux!=null && salir==false){
            if(aux.getCui().equals(cui)){
                Integer entro=aux.getEntradas();
                entro=entro+1;
                aux.setEntradas(entro);
            }
            aux=aux.siguiente;
        }
        
    }
    
   
    
    
}
