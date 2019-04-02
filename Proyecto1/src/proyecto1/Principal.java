package proyecto1;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;

import static proyecto1.Manejo_Arrays.usuarios;

public class Principal extends JFrame implements ActionListener {
    //----COMPONENTES DE LA VENTANA PRINCIPAL----
    public Boton acerca;
    public Boton login;
    public JLabel m1;
    public JLabel m2;
    public JLabel m3;
    String a="<html><body> NOTICIAS:<br><br><br><br>TU Biblioteca brindando un mejor servicio para toda la comunidad estudiantil </body></html>";
    public Border bor1,bor2;
    
   
    
    public Principal(){
        //****VENTANA PRINCIPAL DE LA BIBLIOTECA**** 
        //COMANDOS PARA LA BARRA QUE CONTENDRA LA IMAGEN Y EL BOTON LOGIN
        //PANEL PARA LA PANTALLA PRINCIPAL
        /*venprincipal=new JPanel();
        venprincipal.setSize(1366,768);
        venprincipal.setLayout(null);
        venprincipal.setBackground(Color.WHITE);*/
        
       m1=new JLabel();
        //Fondo del JLabel
        m1.setBackground(Color.CYAN);
        m1.setOpaque(true);
        bor1=BorderFactory.createLineBorder(Color.BLACK,3);
        m1.setBounds(10,15,1348,100);
        m1.setBorder(bor1);

        
        //AGREAGANDO LA IMAGEN
        ImageIcon ima1=new ImageIcon("u1.jpg");
        m1.setIcon(ima1);
        
        
        //AGREGANDO EL BOTON LOGIN
        login=new Boton("Login");
        login.setBounds(1250,35,75,35);
        login.setFont(new java.awt.Font("Perpetua", 1, 16));
        
        
        //AGREGANDO EL BOTON ACERCA
        acerca=new Boton("Acerca");
        acerca.setBounds(50,650,80,40);
        acerca.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        
        //AGREGANDO LA PARTE DEL LOGO 
        m2=new JLabel();
        m2.setBackground(Color.WHITE);
        m2.setOpaque(true);
        bor2=BorderFactory.createLineBorder(Color.BLACK,1);
        m2.setBounds(200,200,400,300);
        m2.setHorizontalAlignment(SwingConstants.CENTER);
        m2.setBorder(bor2);
        
        
       //AGREGANDO EL LOGO
       ImageIcon ima2=new ImageIcon("logo.png");
       
       m2.setIcon(ima2);
        
       //AGREGANDO LA PARTE DE NOTICIAS
        m3=new JLabel();
        //Fondo del JLabel
        m3.setBackground(Color.WHITE);
        m3.setOpaque(true);
       
        m3.setBounds(850,200,500,350);
        //m3.setBorder(bor1);
        m3.setFont(new java.awt.Font("Cooper Black", 1, 20));
        m3.setText(a);
        m3.setVerticalAlignment(SwingConstants.TOP);
        m3.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        add(m1);
        add(login);
        add(acerca);
        add(m2);
        add(m3);
                
        //COMANDOS PARA LA VENTANA PRINCIPAL
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("BIBLIOTECA");
        getContentPane().setBackground(Color.WHITE);  
        
        Admin();//INICIAR AL ADMINISTRADOR
        //UsuariosNulos();
        
        //ASIGNAR ACCIONES A LOS BOTONES
        login.addActionListener(this);
        acerca.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==login){
           setVisible(false);
           Login l1=new Login();
           
           
       }
       if(e.getSource()==acerca){
           try {
               //Usuario userr=new Usuario();
               Reporte r=new Reporte();
           } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }    
       
    }
    public void Admin(){
        Manejo_Arrays.admin[0]=new Uso_Admin("admin","administrador","admin","password");
        
    }
   /*public void UsuariosNulos(){
        Manejo_Arrays.usuarios[0]=new Usuarios(0,"1","2","2","2","2","2");
    }*/
}
