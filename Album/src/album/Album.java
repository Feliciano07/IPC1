
package album;

public class Album {
  static String administrador;
  static String codigo;
 
    
  public Album(){
      
  }
  
    public static void main(String[] args) {
        
       Login_Regis registro=new Login_Regis();
       
      /* ListaAdmin lista=new ListaAdmin();
       lista.AgregarEstampa("Juan", 10, 0, "escritorio");
       lista.AgregarEstampa("Pedro", 11, 0, "documentos");
       lista.AgregarEstampa("Maria", 12, 0, "xxxx");
       lista.AgregarEstampa("Sindy", 3, 0, "Mi corazon <3");
       lista.AgregarEstampa("Yolanda", 13, 0, "internet");
        System.out.println("Mostrar de ultimo a siguiente");
       lista.MostrarEstampas();
       lista.MostrarNumero();
        System.out.println("Mostrar de ultimo a anterioir");
        
        lista.MostrarReverso();
       
        System.out.println("");
        lista.MostrarInicio();
        System.out.println("");
        
        //NodoAdmin tem=lista.ObtenerEstampa("Juan",10);
        //lista.EliminarEstampa("Juan", 10);
        lista.EliminarEstampa("Pedro", 11);
        lista.MostrarReverso();
        lista.MostrarNumero();
        System.out.println("");
        
        
       
       ListaEquipo lis=new ListaEquipo();
       lis.AgregarEquipo("Mexico",1,7,1998);
       lis.AgregarEquipo("Guatema",2,2,1922);
       lis.AgregarEquipo("Argentina",10,2,1922);
       lis.Mostrar();
       System.out.println("");
       
       lis.NuevoJugador("juan","delantero",1998,1.75,189,10,10,"C");
       lis.NuevoJugador("Pedro","delantero",1998,1.75,189,2,10,"C");
       lis.NuevoJugador("Maria","delantero",1998,1.75,189,2,10,"C");
       lis.NuevoJugador("Sebastian","delantero",1998,1.75,189,2,10,"C");
       lis.NuevoJugador("Marta","delantero",1998,1.75,189,3,10,"C");
       
       lis.MostrarJugadores(2);
       System.out.println("");
       
      Nodo_Equipo aux=lis.ObtenerEquipo(2);
      Integer codigo1=aux.getCodigo();
      
      Nodo_Jugador aux1=aux.jugadores.ObtenerJ("juan");
     // aux1.setNombre("CRISTIANO RONADO");
      lis.EditarJugador(2,"juan","Ronaldo Dos Santos","delantero",1998,1.75,189,10,"C");
      
      System.out.println("");
      lis.MostrarJugadores(2);
        System.out.println("");
       lis.MostrarJugadores(10);
       
       
        System.out.println("");
       lis.EliminarJugador(2, "Maria");
      lis.EliminarJugador(2, "Sebastian");
      
      lis.MostrarJugadores(2);
       
       
       /*Nodo_Equipo nuevo=lis.ObtenerEquipo(1);
       
        System.out.println(nuevo.getNombre()+""+nuevo.getAño());
        Integer codigo=nuevo.getCodigo();
        lis.Editar("rusia", codigo, 20, 2000);
        System.out.println("");
        lis.Mostrar();
        System.out.println("");
        
        lis.Eliminar(2);
        System.out.println("");
        lis.Mostrar();
        
        lis.Eliminar(10);
        
        System.out.println("");
        
        lis.Mostrar();*/
        
       
        
        
        
        
       //lis.AgregarEquipo("Usa",1,2,1321);
       //lis.AgregarEquipo("Gahna",1,2,434);
       
       
      
    }
 public static void IniciarAdmi(){
     
     Album.administrador="admin";
     Album.codigo="201701089";
     
}   
}
