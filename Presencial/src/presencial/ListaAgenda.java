
package presencial;

public class ListaAgenda {
    
    Nodo_Agenda primero;
    Nodo_Agenda ultimo;
    
    public ListaAgenda(){
        this.primero=null;
        this.ultimo=null;
        
    }
    
    public boolean Vacia(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
    }
    
    public void Agregar(String nombre,String telefono,String direccion){
        
        if(Vacia()){//Cuando no existen contactos//SIguiente//anteriior
            Nodo_Agenda nuevo=new Nodo_Agenda(nombre,telefono,direccion,null,null);
            ultimo=primero=nuevo;
        }else{
            Nodo_Agenda nuevo=new Nodo_Agenda(nombre,telefono,direccion,null,ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
        
    }
    
    
    public void Listar(){
        Nodo_Agenda aux=primero;
        while(aux!=null){
            System.out.println(aux.getNombre()+aux.getTelefono()+aux.getDireccion());
            aux=aux.siguiente;
        }
        
        
    }
    public Nodo_Agenda ListarPrimero(){
        Nodo_Agenda aux=primero;
        
        return aux;
    }
    
    public Nodo_Agenda  Listar1(Nodo_Agenda aux1){
        Nodo_Agenda aux=aux1;
        aux=aux.siguiente;
        
        
        return aux;
    }
     public Nodo_Agenda  Listar2(Nodo_Agenda aux1){
        Nodo_Agenda aux=aux1;
        aux=aux.anterior;
        
        
        return aux;
    }
    
    
    
    
}
