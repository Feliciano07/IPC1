
package proyecto1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Reporte {
    
    
    public Reporte() throws IOException{
        HacerReporte();
        HacerReporte1();
        HacerReporte2();
        
    }
    public void HacerReporte() throws IOException{
        
        
        try{
            FileWriter arch=new FileWriter("ReporteUsuario.html");
            
            PrintWriter es=new PrintWriter(arch);
            
            es.println("<html>");
            
            es.println("<head><title>Reporte Usuario</title></head>");
            es.println("<body>");
            es.println("<br></br>");
            
            for(int j=0;j<Manejo_Arrays.usuarios.length;j++)
                if(Manejo_Arrays.usuarios[j]!=null) 
            es.println(
                    "<center>"+
            "<table border=3 width=60% height=7%>"+
                    
                    "<tr>"+
                    "<td><b>CUI</b></td>"+
                    "<td><b>Nombre</b></td>"+
                    "<td><b>Apellido</b></td>"+
                    "<td><b>Usuario</b></td>"+
                    "</tr>"+
                            "<tr>"+
                    "<td><b>"+Manejo_Arrays.usuarios[j].getId()+"</b></td>"+
                    "<td><b>"+Manejo_Arrays.usuarios[j].getNombre()+"</b></td>"+
                    "<td><b>"+Manejo_Arrays.usuarios[j].getApellido()+"</b></td>"+
                    "<td><b>"+Manejo_Arrays.usuarios[j].getUser()+"</b></td>"+        
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
    public void HacerReporte1() throws IOException{
        
        try{
            FileWriter arch1=new FileWriter("ReportePrestamos.html");
            
            PrintWriter es1=new PrintWriter(arch1);
            
            es1.println("<html>");
            
            es1.println("<head><title>Reporte Usuario</title></head>");
            es1.println("<body>");
            es1.println("<br></br>");
            es1.println("<h1><center>Reporte de Prestamos</center></h1>");
            es1.println("<br><br></br></br>");
            for(int i=0;i<Manejo_Arrays.misprestamos.length;i++)
                if(Manejo_Arrays.misprestamos[i]!=null) 
            es1.println(
                    "<center>"+
            "<table border=3 width=70% height=7%>"+
                    
                    "<tr>"+
                    "<td><b>Autor</b></td>"+
                    "<td><b>Titulo</b></td>"+
                    "<td><b>Fecha de Prestamo</b></td>"+
                    "<td><b>Fecha Limite de Entrega</b></td>"+
                    "<td><b>Usuario</b></td>"+
                    "</tr>"+
                            
                     "<tr>"+
                    "<td><b>"+Manejo_Arrays.misprestamos[i].getAutor()+"</b></td>"+
                    "<td><b>"+Manejo_Arrays.misprestamos[i].getTitulo()+"</b></td>"+
                    "<td><b>"+Manejo_Arrays.misprestamos[i].getFecha1()+"</b></td>"+
                    "<td><b>"+Manejo_Arrays.misprestamos[i].getFecha2()+"</b></td>"+  
                    "<td><b>"+Manejo_Arrays.misprestamos[i].getUsuario()+"</b></td>"+  
                            "</tr>"+
                            "</center>"
            );
             
             es1.println("</body>");
             es1.println("</html>");
            
            arch1.close();
            
        
    }catch(Exception e){
            e.printStackTrace();
        }
    
}
    public void HacerReporte2(){
        try{
            FileWriter arch2=new FileWriter("ReporteLibros.html");
            
            PrintWriter es2=new PrintWriter(arch2);
            
            es2.println("<html>");
            
            es2.println("<head><title>Reporte Usuario</title></head>");
            es2.println("<body>");
            es2.println("<br></br>");
            es2.println("<h1><center>Reporte de Libros</center></h1>");
            es2.println("<br><br></br></br>");
            for(int i=0;i<Manejo_Arrays.libros.length;i++)
                if(Manejo_Arrays.libros[i]!=null)
            es2.println(
                    "<center>"+
            "<table border=3 width=100% height=7%>"+
                    
                    "<tr>"+
                    "<td><b>Autor</b></td>"+
                    "<td><b>Titulo</b></td>"+
                    "<td><b>Edicion</b></td>"+
                    "<td><b>Palabras Claves</b></td>"+
                    "<td><b>Descripcion</b></td>"+
                            "<td><b>Temas</b></td>"+
                            "<td><b>Copias</b></td>"+
                            "<td><b>Disponibles</b></td>"+
                            "<td><b>No. De Prestamos</b></td>"+
                    "</tr>"+
                    
                    
                     "<tr>"+
                    "<td>"+Manejo_Arrays.libros[i].getAutor()+"</td>"+
                    "<td>"+Manejo_Arrays.libros[i].getTitulo()+"</td>"+
                    "<td>"+Manejo_Arrays.libros[i].getEdicion()+"</b></td>"+
                    "<td>"+Manejo_Arrays.libros[i].getClave()+"</td>"+  
                    "<td>"+Manejo_Arrays.libros[i].getDescripcion()+"</td>"+  
                    "<td>"+Manejo_Arrays.libros[i].getTema()+"</td>"+
                    "<td>"+Manejo_Arrays.libros[i].getCopia()+"</b></td>"+
                    "<td>"+Manejo_Arrays.libros[i].getDisponible()+"</b></td>"+
                    "<td>"+Manejo_Arrays.libros[i].getPrestamos()+"</td>"+
                     "</tr>"+       
                     "</center>"     
            );
              
              
             es2.println("</body>");
             es2.println("</html>");
            
            arch2.close();
            
        
    }catch(Exception e){
            e.printStackTrace();
        }
    
}
    }
