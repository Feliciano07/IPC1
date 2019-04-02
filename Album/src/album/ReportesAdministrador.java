
package album;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReportesAdministrador {
    public static NodoUsuarios aux;
    public static NodoAdmin aux1;
    public ReportesAdministrador() throws IOException{
        Usuarios1();
        Usuarios2();
        Usuarios3();
        Estampas();
    }
    
    public void Usuarios1() throws IOException{
        
        try{
            
            FileWriter arch=new FileWriter("Entradas.html");
            PrintWriter es=new PrintWriter(arch);
            es.println("<html>");
            es.println("<head><title>Entradas al Sistema</title></head>");
            es.println("<body>");
            es.println("<h1><center>No. de Entradas a la Aplicacion</center></h1>");
            es.println("<br><br></br></br>");
            ReportesAdministrador.aux=ListasGenerales.listaUser.ObtenerPrimero();
            for(int j=0;j<ListasGenerales.listaUser.UsuariosTotales();j++){
                if(ReportesAdministrador.aux!=null){
                es.println(
                        "<center>"+
            "<table border=3 width=60% height=7%>"+
                    
                    "<tr>"+
                    "<td><b>CUI</b></td>"+
                    "<td><b>Nombre</b></td>"+
                    "<td><b>Usuario</b></td>"+
                    "<td><b>Entradas al Sistema</b></td>"+
                    "</tr>"+
                            "<tr>"+
                    "<td><b>"+aux.getCui()+"</b></td>"+
                    "<td><b>"+aux.getNombre()+"</b></td>"+
                    "<td><b>"+aux.getUser()+"</b></td>"+
                    "<td><b>"+aux.getEntradas()+"</b></td>"+        
                    "</tr>"+  
                    
                     "</center>"
                        
                );
                }
                ReportesAdministrador.aux=ListasGenerales.listaUser.ObtenerSiguientes(ReportesAdministrador.aux);
            }
                es.println("</body>");
             es.println("</html>");
             arch.close();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        
    }
        
        
        
    }
    
    public void Usuarios2() throws IOException{
        
     try{
            
            FileWriter arch=new FileWriter("Sobres.html");
            PrintWriter es=new PrintWriter(arch);
            es.println("<html>");
            es.println("<head><title>Sobres abiertos</title></head>");
            es.println("<body>");
            es.println("<h1><center>No. de Sobres abiertos por Usuario</center></h1>");
            es.println("<br><br></br></br>");
            ReportesAdministrador.aux=ListasGenerales.listaUser.ObtenerPrimero();
            for(int j=0;j<ListasGenerales.listaUser.UsuariosTotales();j++){
                if(ReportesAdministrador.aux!=null){
                es.println(
                        "<center>"+
            "<table border=3 width=60% height=7%>"+
                    
                    "<tr>"+
                    "<td><b>CUI</b></td>"+
                    "<td><b>Nombre</b></td>"+
                    "<td><b>Usuario</b></td>"+
                    "<td><b>Sobres Abiertos</b></td>"+
                    "</tr>"+
                            "<tr>"+
                    "<td><b>"+aux.getCui()+"</b></td>"+
                    "<td><b>"+aux.getNombre()+"</b></td>"+
                    "<td><b>"+aux.getUser()+"</b></td>"+
                    "<td><b>"+aux.getAbiertos()+"</b></td>"+        
                    "</tr>"+  
                    
                     "</center>"
                        
                );
                }
                ReportesAdministrador.aux=ListasGenerales.listaUser.ObtenerSiguientes(ReportesAdministrador.aux);
            }
                es.println("</body>");
             es.println("</html>");
             arch.close();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        
    }   
    }
    public void Usuarios3() throws IOException{
        
        try{
            
            FileWriter arch=new FileWriter("Estampas.html");
            PrintWriter es=new PrintWriter(arch);
            es.println("<html>");
            es.println("<head><title>Estampas Colocadas</title></head>");
            es.println("<body>");
            es.println("<h1><center>No. de Estampas Colocadas por Usuario</center></h1>");
            es.println("<br><br></br></br>");
            ReportesAdministrador.aux=ListasGenerales.listaUser.ObtenerPrimero();
            for(int j=0;j<ListasGenerales.listaUser.UsuariosTotales();j++){
                if(ReportesAdministrador.aux!=null){
                es.println(
                        "<center>"+
            "<table border=3 width=60% height=7%>"+
                    
                    "<tr>"+
                    "<td><b>CUI</b></td>"+
                    "<td><b>Nombre</b></td>"+
                    "<td><b>Usuario</b></td>"+
                    "<td><b>Estampas Colocadas</b></td>"+
                    "</tr>"+
                            "<tr>"+
                    "<td><b>"+aux.getCui()+"</b></td>"+
                    "<td><b>"+aux.getNombre()+"</b></td>"+
                    "<td><b>"+aux.getUser()+"</b></td>"+
                    "<td><b>"+aux.getColocadas()+"</b></td>"+        
                    "</tr>"+  
                    
                     "</center>"
                        
                );
                }
                ReportesAdministrador.aux=ListasGenerales.listaUser.ObtenerSiguientes(ReportesAdministrador.aux);
            }
                es.println("</body>");
             es.println("</html>");
             arch.close();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        
    }
        
        
        
        
    }
    public void Estampas() throws IOException{
        
        try{
            
            FileWriter arch=new FileWriter("Estampas1.html");
            PrintWriter es=new PrintWriter(arch);
            es.println("<html>");
            es.println("<head><title>Estampas Colocadas</title></head>");
            es.println("<body>");
            es.println("<h1><center>No. de Estampas Colocadas por Usuario</center></h1>");
            es.println("<br><br></br></br>");
            ReportesAdministrador.aux1=ListasGenerales.listaEstampas.ObtenerPrimero();
            NodoAdmin aux2=ReportesAdministrador.aux1;
            do{
                es.println(
                        "<center>"+
            "<table border=3 width=60% height=7%>"+
                    
                    "<tr>"+
                    "<td><b>Nombre</b></td>"+
                    "<td><b>Rareza</b></td>"+
                    "<td><b>No de Veces Encontrada</b></td>"+
                    
                    "</tr>"+
                            "<tr>"+
                    "<td><b>"+aux1.getNombreJu()+"</b></td>"+
                    "<td><b>"+aux1.getRareza()+"</b></td>"+
                    "<td><b>"+aux1.getColocada()+"</b></td>"+
                            
                    "</tr>"+  
                    
                     "</center>"
                        
                );
                
                ReportesAdministrador.aux1=ListasGenerales.listaEstampas.ObtenerSiguientes(ReportesAdministrador.aux1);
            }while(ReportesAdministrador.aux1!=aux2);
            
                es.println("</body>");
             es.println("</html>");
             arch.close();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        
    }
        
        
        
    }
    
}
