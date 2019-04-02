
package album;

import java.util.Objects;

public class ListaAdmin {
    
    private NodoAdmin ultimo;
    private NodoAdmin primero;
    public static Integer ContadorSobre;
    public static String pordefecto="";
    
    public ListaAdmin(){
        ListaAdmin.ContadorSobre=0;
        this.primero=null;
        this.ultimo=null;
        ListaAdmin.pordefecto="pordefecto.jpg";
        
    }
    
    public boolean Vacia(){
        boolean vacia=false;
        if(primero==null){
            vacia=true;
        }
        return vacia;
    }
    //Debo agregar una verificacion que el jugador exista
    public void AgregarEstampa(String jugador,String codigo,int rareza,String ruta){
        if(Vacia()){
            if(ruta==null || ruta.equals("")){
                ruta=ListaAdmin.pordefecto;
            }
            NodoAdmin nuevo=new NodoAdmin(jugador,codigo,rareza,ruta,null,null);        
            ultimo=primero=nuevo;
            ultimo.setSiguiente(primero);
            primero.setAnterior(ultimo);
            
        }else{
             if(ruta==null || ruta.equals("")){
                ruta=ListaAdmin.pordefecto;
            }
            NodoAdmin nuevo=new NodoAdmin(jugador,codigo,rareza,ruta,primero,ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
            primero.setAnterior(ultimo);
            
        }
        ListaAdmin.ContadorSobre++;
        
    }
    public NodoAdmin ObtenerEstampa(String nombre, String codigo){
        NodoAdmin aux=primero;
        boolean busqueda=false;
        NodoAdmin temporal=null;
        do{
            if(aux.getNombreJu().equals(nombre) && aux.getEquicodigo().equals(codigo)){
                temporal=aux;
                busqueda=true;
            }
            aux=aux.siguiente;
        }while(aux!=primero && busqueda==false);
     return temporal;        
    }
    
    public void EditarEstampa(String nombreJu,String nuevoNombre,String nuevoCodigo,String equicodigo,int rareza,String ruta){
        NodoAdmin aux=primero;
        boolean busqueda=false;
        do{
            if(aux.getNombreJu().equals(nombreJu) && aux.getEquicodigo().equals(equicodigo)){
                
                aux.setNombreJu(nuevoNombre);
                aux.setEquicodigo(nuevoCodigo);
                aux.setRareza(rareza);
                aux.setRuta(ruta);
                busqueda=true;
            }
             aux=aux.siguiente;
        }while(aux!=primero && busqueda==false);
    }
    public void CambioNombre(String nombre, String nuevo,Integer Codigo){
        NodoAdmin aux=primero;
        boolean busqueda=false;
        do{
            if(aux.getNombreJu().equals(nombre) && aux.getEquicodigo().equals(Codigo)){
                aux.setNombreJu(nuevo);
                busqueda=true;
            }
            aux=aux.siguiente;
        }while(aux!=primero && busqueda==true);
    }
    
    public void EliminarEstampa(String nombreJu,String equicodigo){
        NodoAdmin aux=primero;
        boolean busqueda=false;
        do{
            if(aux.getNombreJu().equals(nombreJu) && aux.getEquicodigo().equals(equicodigo)){
                
                if(aux==primero){
                    primero=primero.siguiente;
                    primero.setAnterior(ultimo);
                    ultimo.setSiguiente(primero);
                    ListaAdmin.ContadorSobre--;
                }else if(aux==ultimo){
                    ultimo=ultimo.anterior;
                    ultimo.setSiguiente(primero);
                    primero.setAnterior(ultimo);
                    ListaAdmin.ContadorSobre--;
                }else{
                    NodoAdmin anterior=aux.anterior;
                    NodoAdmin siguiente=aux.siguiente;
                    anterior.setSiguiente(siguiente);
                    siguiente.setAnterior(anterior);
                    ListaAdmin.ContadorSobre--;
                }
                
            }
            aux=aux.siguiente;
        }while(aux!=primero && busqueda==false);
    }
    public boolean YaExiste(String nombre){
        boolean existe=false;
        NodoAdmin aux=primero;
        while(aux!=null){
            if(aux.getNombreJu().equals(nombre)){
                existe=true;
            }
            aux=aux.siguiente;    
        }
        return existe;
    }
   public NodoAdmin ObtenerPrimero(){
        NodoAdmin aux=primero;
        return aux;
    }
    public NodoAdmin ObtenerSiguientes(NodoAdmin aux1){
        NodoAdmin aux=aux1;
        aux=aux.siguiente;
        return aux;
    }
    public Integer TotalEstampas(){
        return ListaAdmin.ContadorSobre;
    }
    
    
    public NodoAdmin EstampaAzar(){
        NodoAdmin aux=primero;
        Integer random=ListaAdmin.ContadorSobre;
        Integer numero=(int)(Math.random()*random)+1;
        Integer contador=1;
            
        while(numero!=contador){
               aux=aux.siguiente;
               contador++;
        }
        
        return aux;
    }
    public NodoAdmin Dorada(){
        int rara=1;
        NodoAdmin aux=primero;
        NodoAdmin aux1=null;
        while(aux1==null){
        Integer random=ListaAdmin.ContadorSobre;
        Integer numero=(int)(Math.random()*random)+1;
        Integer contador=1;
        
        while(numero!=contador){
            if(aux.getRareza()==rara){
                aux1=aux;   
            }
            aux=aux.siguiente;
            contador++;
        }
        }
        return aux1;
    }
    
    
    public void Colocar(String nombre){
        NodoAdmin aux=primero;
        boolean salir=false;
        do{
            if(aux.getNombreJu().equals(nombre)){
                Integer tamaño=aux.getColocada();
                tamaño=tamaño+1;
                aux.setColocada(tamaño);
                salir=true;
            }
        }while(aux!=primero && salir==false);
    }
    
    
    
    
    
    
    
    public void MostrarEstampas(){
        NodoAdmin aux=ultimo;
        
        do{
            System.out.println(aux.getNombreJu());
            aux=aux.siguiente;
            
            
        }while(aux!=ultimo);
    }
    
    public void MostrarReverso(){
        NodoAdmin aux=ultimo;
        
        do{
            
            System.out.println(aux.getNombreJu());
            aux=aux.anterior;
            
        }while(aux!=ultimo);
    }
    public void MostrarInicio(){
        NodoAdmin aux=primero;
        
        do{
            System.out.println(aux.getNombreJu());
            aux=aux.siguiente;
            
        }while(aux!=primero);
    }
    public void MostrarNumero(){
        System.out.println(ListaAdmin.ContadorSobre+"");
    }
}
