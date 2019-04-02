
package proyecto1;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Login extends JFrame implements ActionListener {
    boolean ComprobarUser=false;
    public static int ObtenerPos;
    
    String u2=Manejo_Arrays.admin[0].getUser();
    String pa2=Manejo_Arrays.admin[0].getContraseña();
    
    JLabel usu;
    JLabel pasw;
    JLabel ima;
    JTextField user;
    JPasswordField contra;
    public Boton ingresar;
    public Boton cancelar;
    //GUARDAR LOS CAMPOS DE JTEXFIEL Y JPASSWORD     
    
    String u1;
    String pa1;
    //USUARIO CREADO POR DEFECTO
    public Login(){
        //ETIQUE DE USUARIO
        usu=new JLabel();
        usu.setBounds(192,200,100,50);
        usu.setFont(new java.awt.Font("Perpetua", 1, 18));
        usu.setText("Usuario");
        add(usu);
        
        //PARTE DEL TEXTO
        user=new JTextField();
        user.setBounds(210,250,250,25);
        user.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(user);
        
        
    
        
        //ETIQUETA DE CONTRASEÑA
        pasw=new JLabel();
        pasw.setBounds(192,300,100,50);
        pasw.setFont(new java.awt.Font("Perpetua", 1, 18));
        pasw.setText("Contraseña");
        add(pasw);
        
        contra=new JPasswordField();
        contra.setFont(new java.awt.Font("Perpetua", 1, 13));
        contra.setBounds(210,350,250,25);
        contra.setEchoChar('*');
        add(contra);
        
        pa1=new String(this.contra.getPassword());//obtener contraseña
        
        //AGREGANDO EL ICONO
        ima=new JLabel();
        ima.setBounds(700,200,330,310);
        ima.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon logo2=new ImageIcon("u2.jpg");
        ima.setIcon(logo2);
        add(ima);
        
        //AGREGANDO LOS BOTONES
        ingresar=new Boton("Ingresar");
        ingresar.setBounds(210,450,100,30);
        ingresar.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(ingresar);
        
        cancelar=new Boton("Cancelar");
        cancelar.setBounds(360,450,100,30);
        cancelar.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(cancelar);
        
        
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("LOGIN");
        getContentPane().setBackground(Color.WHITE);
        
        ingresar.addActionListener(this);
        cancelar.addActionListener(this);
  
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ingresar){
            u1=user.getText();
            pa1=new String(this.contra.getPassword());//obtener contraseña
            if(u1.equals(u2)&& pa1.equals(pa2)){
                setVisible(false);
                Administrador admi2=new Administrador();
            }else{
            for(int j=0;j<Manejo_Arrays.usuarios.length;j++){
                    if(Manejo_Arrays.usuarios[j]!=null){
                        if(u1.equals(Manejo_Arrays.usuarios[j].getUser()) && pa1.equals(Manejo_Arrays.usuarios[j].getContraseña())){
                            ComprobarUser=true;
                            ObtenerPos=j;
                        }
                    }
                }
            
            
            if(ComprobarUser==true){
                setVisible(false);
                Usuario userr=new Usuario(u1,pa1);
                
                
                
                
                
            }else{
                JOptionPane.showMessageDialog(null,"El usuario no existe, pongase en contacto el Administrador");
            }
          
        }
        }
        if(e.getSource()==cancelar){
            setVisible(false);
            Principal p1=new Principal();
            
        }
        
    }
  
}

