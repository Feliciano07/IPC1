
package album;

public class ListaEstampa {
    private Nodo_Estam primero;
    private Nodo_Estam ultimo;
    public Integer contadorEstampas;
    public ListaEstampa(){
        this.primero=null;
        this.ultimo=null;
        this.contadorEstampas=1;
    }
    
    public boolean Verificar(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
    }
    
    
    public void AgregarEstampa(){
            Integer numero=(int)(Math.random()*8+3);
            int contador=0;
      while(numero!=contador){
          
        if(Verificar()){
            NodoAdmin Azar=ListasGenerales.listaEstampas.EstampaAzar();
            String nombre=Azar.getNombreJu();
            String codigo=Azar.getEquicodigo();
            int rareza=Azar.getRareza();
            String ruta=Azar.getRuta();
            Nodo_Estam nuevo=new Nodo_Estam(contadorEstampas,nombre,codigo,rareza,ruta,null);
            ultimo=primero=nuevo;
            contadorEstampas++;
        }else{
            NodoAdmin Azar=ListasGenerales.listaEstampas.EstampaAzar();
            String nombre=Azar.getNombreJu();
            String codigo=Azar.getEquicodigo();
            int rareza=Azar.getRareza();
            String ruta=Azar.getRuta();
            Nodo_Estam nuevo1=new Nodo_Estam(contadorEstampas,nombre,codigo,rareza,ruta,null);
            ultimo.siguiente=nuevo1;
            ultimo=nuevo1;
            contadorEstampas++;
        }
        contador++;
        
       }
    }
    public void AgregarDoradas(){
        Integer numero=(int)(Math.random()*5+2);
        int contador=0;
        while(numero!=contador){
            if(Verificar()){
                 
                
                NodoAdmin  azar=ListasGenerales.listaEstampas.Dorada();
                
                String nombre=azar.getNombreJu();
                String codigo=azar.getEquicodigo();
                int rareza=azar.getRareza();
                String ruta=azar.getRuta();
                Nodo_Estam nuevo=new Nodo_Estam(contadorEstampas,nombre,codigo,rareza,ruta,null);
                ultimo=primero=nuevo;
                contadorEstampas++;
                
            }else{
                
                
                NodoAdmin  azar=ListasGenerales.listaEstampas.Dorada();
                
                String nombre=azar.getNombreJu();
                String codigo=azar.getEquicodigo();
                int rareza=azar.getRareza();
                String ruta=azar.getRuta();
                Nodo_Estam nuevo=new Nodo_Estam(contadorEstampas,nombre,codigo,rareza,ruta,null);
                 ultimo.siguiente=nuevo;
                ultimo=nuevo;
                contadorEstampas++;
                
            }
            contador++;
        }
        
        Integer numero1=(int)(Math.random()*5+10);
        int contador2=0;
        
        while(contador2!=numero1){
            NodoAdmin Azar=ListasGenerales.listaEstampas.EstampaAzar();
            String nombre=Azar.getNombreJu();
            String codigo=Azar.getEquicodigo();
            int rareza=Azar.getRareza();
            String ruta=Azar.getRuta();
            Nodo_Estam nuevo1=new Nodo_Estam(contadorEstampas,nombre,codigo,rareza,ruta,null);
            ultimo.siguiente=nuevo1;
            ultimo=nuevo1;
            contadorEstampas++;
            contador2++;
        }
    }
public void EliminarEstampa(String nombre,Integer no){
    Nodo_Estam aux=primero;
    boolean salir=false;
    
    while(aux!=null && salir==false){
        if(aux.getNombre().equals(nombre) && aux.getCantidad().equals(no)){
            if(aux==primero){
                primero=primero.siguiente;
                salir=true;
            }else if(aux==ultimo){
                Nodo_Estam temporal=primero;
                while(temporal.siguiente!=ultimo){
                    temporal=temporal.siguiente;
                }
                ultimo=temporal;
                ultimo.siguiente=null;
                salir=true;
                
            }else{
                Nodo_Estam inicio=primero;
                Nodo_Estam sigue=primero.siguiente;
                while(sigue!=null && sigue.getNombre()!=nombre && sigue.getCantidad()!=no){
                    inicio=inicio.siguiente;
                    sigue=sigue.siguiente;
                }
                if(sigue!=null){
                inicio.siguiente=sigue.siguiente;
                }
               salir=true; 
            }
            
        }
        aux=aux.siguiente;
        
    }
    
}
    
    
    
    
    
    
    //PARA OBTENER LAS ESTAMPAS
    public Nodo_Estam ObtenerPrimera(){
        Nodo_Estam aux=primero;
        return aux;
    }
    public Nodo_Estam ObtenerSiguiente(Nodo_Estam aux){
        Nodo_Estam aux1=aux;
        
        aux1=aux1.siguiente;
        return aux1;
    }
 
    
    
}
