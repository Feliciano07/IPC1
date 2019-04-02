
package proyecto1;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Tabla extends JFrame{
    JTable mitabla;
    JScrollPane scroll;
    public Tabla(){
            String titulos[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles"};
            String[] campos[]=obtenerdatos();
            mitabla=new JTable(campos,titulos);
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 20));
            scroll=new JScrollPane(mitabla);
            scroll.setBounds(50,50,1200,500);
            scroll.setViewportView(mitabla);
            
            
            add(scroll);
            
            //add(mitabla);
           
           setLayout(null);
           setExtendedState(MAXIMIZED_BOTH);//maxima
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
           setTitle("BIBLIOTECA");
           getContentPane().setBackground(Color.WHITE); 
        
    }
    
    
    
    private String [][] obtenerdatos(){
        String campos [][]=new String[Administrador.contadorlibro][8];
        for(int y=0;y<campos.length;y++){
            campos[y][0]=Manejo_Arrays.libros[y].getAutor();
            campos[y][1]=Manejo_Arrays.libros[y].getTitulo();
            campos[y][2]=Manejo_Arrays.libros[y].getClave();
            campos[y][3]=Integer.toString(Manejo_Arrays.libros[y].getEdicion());
            campos[y][4]=Manejo_Arrays.libros[y].getDescripcion();
            campos[y][5]=Manejo_Arrays.libros[y].getTema();
            campos[y][6]=Manejo_Arrays.libros[y].getCopia()+""; 
            campos[y][7]=Manejo_Arrays.libros[y].getDisponible()+""; 
         
        }
     return campos;   
    }

}

