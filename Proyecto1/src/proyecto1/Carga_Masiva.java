
package proyecto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Carga_Masiva extends JDialog implements ActionListener{
    public Boton acepCar;
    public Boton atras;
    JTextArea AreCarga;
    JScrollPane sAreCarga;
    public String obtenerTexto;
    
    String autor;
    String titulo;
    int edicion;
    String palabra;
    String descripcion;
    String temas;
    int copia;
    int disponible;
    String frecuencia;
    int ejemplares;
    String area;
    
    public Carga_Masiva(){
        acepCar=new Boton("Aceptar");
        acepCar.setFont(new java.awt.Font("Perpetua", 1, 15));
        acepCar.setBounds(875,500,90,40);
        getContentPane().add(acepCar);
        
        
        atras=new Boton ("Atras");
        atras.setFont(new java.awt.Font("Perpetua", 1, 15));
        atras.setBounds(50,500,90,40);
        getContentPane().add(atras);
        
        
        AreCarga=new JTextArea();
        AreCarga.setFont(new java.awt.Font("Garamond", 1, 18));
        
        sAreCarga=new JScrollPane(AreCarga);
        sAreCarga.setBounds(50,50,875,375);
        
        getContentPane().add(sAreCarga);
        
        
        getContentPane().setLayout(null);
        setResizable(false);
        setTitle("Carga Masiva");
        setBounds(50,50,1000,600);
        setVisible(true); 
        acepCar.addActionListener(this);
        atras.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==acepCar){
            obtenerTexto=AreCarga.getText();
            String lineas[]=obtenerTexto.split("\n");
           
            for(String lineass:lineas){
                String linea1[]=lineass.split(";");
                String separador=linea1[0];
                if("0".equals(separador)){
                    autor=linea1[1];
                    titulo=linea1[2];
                    edicion=Integer.parseInt(linea1[3]);
                    palabra=linea1[4];
                    descripcion=linea1[5];
                    temas=linea1[6];
                    copia=Integer.parseInt(linea1[7]);
                    disponible=Integer.parseInt(linea1[8]);
                    
                    
                    Manejo_Arrays.libros[Administrador.contadorlibro]=new Libro(0,autor,titulo,edicion,palabra,descripcion,temas,copia,disponible);
                    Manejo_Arrays.libros[Administrador.contadorlibro].setPrestamos(0);
                    Administrador.contadorlibro++;
                }
                if("1".equals(separador)){
                    autor=linea1[1];
                    titulo=linea1[2];
                    edicion=Integer.parseInt(linea1[3]);
                    palabra=linea1[4];
                    descripcion=linea1[5];
                    temas=linea1[6];
                    copia=Integer.parseInt(linea1[7]);
                    disponible=Integer.parseInt(linea1[8]);
                    frecuencia=linea1[9];
                    ejemplares=Integer.parseInt(linea1[10]);
                    Manejo_Arrays.revistas[Administrador.contadorrevis]=new Revista(1,autor,titulo,edicion,palabra,descripcion,temas,copia,disponible,frecuencia,ejemplares);
                    Manejo_Arrays.revistas[Administrador.contadorrevis].setPrestamos(0);
                    Administrador.contadorrevis++;
                }
                if("2".equals(separador)){
                    autor=linea1[1];
                    titulo=linea1[2];
                    edicion=Integer.parseInt(linea1[3]);
                    palabra=linea1[4];
                    descripcion=linea1[5];
                    temas=linea1[6];
                    copia=Integer.parseInt(linea1[7]);
                    disponible=Integer.parseInt(linea1[8]);
                    area=linea1[9];
                    Manejo_Arrays.tesis[Administrador.contadortesi]=new Tesi(2,autor,titulo,edicion,palabra,descripcion,temas,copia,disponible,area);
                    Manejo_Arrays.tesis[Administrador.contadortesi].setPrestamos(0);
                    Administrador.contadortesi++;
                }
            }
           
            JOptionPane.showMessageDialog(null, "La carga se ha realizado con exito");
            setVisible(false);
        }
        if(e.getSource()==atras){
            setVisible(false);
            
            
        }
    }
    
    /*public void ObtenerTexto(String ObtenerTexto){
        
        
    }*/
    
}
