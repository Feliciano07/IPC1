
package album;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ReportesUsuarios {
    public static NodoUsuarios aux;
    public static Integer Noestam;
    
    
    public ReportesUsuarios() throws IOException{
        ReportesUsuarios.Noestam=0;
        Reporte1();
    }
    
    public void Reporte1() throws IOException{
        ReportesUsuarios.aux=ListasGenerales.listaUser.ObtenerPrimero();
        Integer sobresTo=0;
        
        while(aux!=null){
            Integer sobresaux=aux.getAbiertos();
            sobresTo=sobresTo+sobresaux;
            
            NodoSobre aux1=aux.sobres.ObtenerPrimero();
            while(aux1!=null){
                
                Nodo_Estam aux2=aux1.listaEstampa.ObtenerPrimera();
                
                while(aux2!=null){
                    ReportesUsuarios.Noestam++;
                    
                    aux2=aux1.listaEstampa.ObtenerSiguiente(aux2);
                }
                
                
                aux1=aux.sobres.ObtenerSiguientes(aux1);
            }
            
            
            
            
            aux=ListasGenerales.listaUser.ObtenerSiguientes(ReportesUsuarios.aux);
        }
        
        
        
        try{
            
            FileWriter arch=new FileWriter("SobresUsuarios.html");
            PrintWriter es=new PrintWriter(arch);
            es.println("<html>");
            es.println("<head><title>No. de Sobres Abiertos Y Estampas Colocadas</title></head>");
            es.println("<body>");
            es.println("<h1><center>Estampas y sobres</center></h1>");
            es.println("<br><br></br></br>");
            
                es.println(
                        "<center>"+
            "<table border=3 width=60% height=7%>"+
                    
                    "<tr>"+
                    
                    "<td><b>No. de Sobres</b></td>"+
                    "<td><b>No. de Estampas</b></td>"+
                    "</tr>"+
                            "<tr>"+
                    "<td><b>"+sobresTo+"</b></td>"+
                    "<td><b>"+ReportesUsuarios.Noestam+"</b></td>"+
                            
                    "</tr>"+  
                    
                     "</center>"
                        
                );
                
            
                es.println("</body>");
             es.println("</html>");
             arch.close();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        
    }
          
    }
    
    
}
  
