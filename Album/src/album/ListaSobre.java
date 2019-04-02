
package album;

public class ListaSobre {
    
    NodoSobre primero;
    NodoSobre ultimo;
    public Integer ContadorSobre;
    
    public ListaSobre(){
        this.primero=null;
        this.ultimo=null;
        this.ContadorSobre=0;
    }
    
    public boolean Vacia(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
    }
    
    public NodoSobre CrearSobre(){
        NodoSobre aux;
        if(Vacia()){
             NodoSobre nuevo=new NodoSobre(ContadorSobre,null,null);
             nuevo.listaEstampa.AgregarEstampa();
             ultimo=primero=nuevo;
             ContadorSobre++;
             aux=nuevo;
            
        }else{
            NodoSobre nuevo=new NodoSobre(ContadorSobre,null,ultimo);
            nuevo.listaEstampa.AgregarEstampa();
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
            ContadorSobre++;
            aux=nuevo;
        }
     return aux;   
    }
    public NodoSobre CrearSobreDorado(){
        NodoSobre aux;
        if(Vacia()){
             NodoSobre nuevo=new NodoSobre(ContadorSobre,null,null);
             nuevo.listaEstampa.AgregarDoradas();
             ultimo=primero=nuevo;
             ContadorSobre++;
             aux=nuevo;
            
        }else{
            NodoSobre nuevo=new NodoSobre(ContadorSobre,null,ultimo);
            nuevo.listaEstampa.AgregarDoradas();
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
            ContadorSobre++;
            aux=nuevo;
        }
     return aux;   
    }
    
    
    
    
    public NodoSobre ObtenerPrimero(){
        NodoSobre aux=primero;
        return aux;
    }
    public NodoSobre ObtenerSiguiente(NodoSobre aux1){
        NodoSobre aux=aux1;
         aux=aux.siguiente;  
        if(aux==null){
         aux=primero;
        }
        return aux;
    }
    public NodoSobre ObtenerSiguientes(NodoSobre aux1){
        NodoSobre aux=aux1;
         aux=aux.siguiente;  
        
        return aux;
    }
    public NodoSobre ObtenerAnterior(NodoSobre aux1){
        NodoSobre aux=aux1;
        aux=aux.anterior;
        if(aux==null){
            aux=ultimo;
        }
        return aux;
    }
    public Integer NoSobres(){
        return ContadorSobre;
    }
    
}
