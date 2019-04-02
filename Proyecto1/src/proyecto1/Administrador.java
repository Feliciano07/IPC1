
package proyecto1;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administrador extends JFrame implements ActionListener{
    boolean ExisteCui=false;
    public static int contadoruser=0;
    public static int contadorlibro=0;
    public static int contadorrevis=0;
    public static int contadortesi=0;
    
    public Boton crear;
    public Boton modificar;
    public Boton eliminar;
    public Boton mostrar;
    
    public Boton logout;
    
    public Boton crearb;
    public Boton modificarb;
    public Boton eliminarb;
    public Boton mostrarb;
    
    public Boton Reportes;
    
    JLabel admi1;
    JLabel admi2;
    JLabel admi3;
    JLabel admi4;
    JLabel titu1;
    JLabel titu2;
    Border bor3;
    Border bor4;
    
    //CREACION USUARIOS Y MODIFICACION
    public int cui;
    public String nombreu;
    public String apell;
    public String ur;
    public String rol;
    public String pass;
    public String pass2;
    
   public Boton aceptar1;
    
    public JTextField id;
    public JTextField nomu;
    public JTextField apelli;
    public JTextField us;
    public JTextField roll;
    public JPasswordField pasw;
    public JPasswordField pasw2;
    
    public JLabel id1;
    public JLabel nom1;
    public JLabel apelli1;
    public JLabel us1;
    public JLabel roll1;
    public JLabel pasw1;
    public JLabel pasww1;
    
    //BOTONES PARA MODIFICAR
    
    //PARA EL USO DE MODIFICAR USUARIO
    
    public Administrador(){
        bor4=BorderFactory.createLineBorder(Color.BLACK,2);
        
        //PARTE DEL LOGO
        admi1=new JLabel();
        bor3=BorderFactory.createLoweredBevelBorder();
        admi1.setBorder(bor3);
        admi1.setBounds(100,50,200,200);
        admi1.setVerticalAlignment(SwingConstants.CENTER);
        admi1.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon ima3=new ImageIcon("logou.jpg");
        admi1.setIcon(ima3);
        
        add(admi1);
        
        //PARTE DE LOGO USUARIO Y CERRAR SECION
        admi2=new JLabel();
        //admi2.setBackground(Color.cyan);
        //admi2.setOpaque(true);
        //bor3=BorderFactory.createLineBorder(Color.BLACK,1);
        //admi2.setBorder(bor3);
        admi2.setBounds(1000,50,350,200);
        ImageIcon ima4=new ImageIcon("usuario.jpg");
        admi2.setIcon(ima4);
        logout=new Boton("Logout");
        logout.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi2.add(logout);
        logout.setBounds(230,20,80,30);
        
        Reportes=new Boton("Reportes");
        Reportes.setBounds(230,70,90,30);
        Reportes.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi2.add(Reportes);
        add(admi2);
        
        
        
        //PARTE DE LAS BOTONES DE USUARIO
        titu1=new JLabel();
        titu1.setBounds(50,350,600,50);
        titu1.setVerticalAlignment(SwingConstants.TOP);
        titu1.setHorizontalAlignment(SwingConstants.CENTER);
        titu1.setFont(new java.awt.Font("Century Schoolbook", 1, 18));
        titu1.setText("Usuario");
        titu1.setBorder(bor4);
        add(titu1);
        
        
        admi3=new JLabel();
        
        admi3.setBorder(bor4);
        admi3.setBounds(50,400,600,250);
        crear=new Boton("Crear");
        crear.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi3.add(crear);
        crear.setBounds(100,50,100,40);
        
        modificar=new Boton("Modificar");
        modificar.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi3.add(modificar);
        modificar.setBounds(400,50,100,40);
        
        eliminar=new Boton("Eliminar");
        eliminar.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi3.add(eliminar);
        eliminar.setBounds(100,170,100,40);
        
        mostrar=new Boton("Mostrar");
        mostrar.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi3.add(mostrar);
        mostrar.setBounds(400,170,100,40);

        add(admi3);
        
        //PARTE DE LOS BOTONES BIBLIOGRAFIAS
        titu2=new JLabel();
        titu2.setBounds(700,350,600,50);
        titu2.setVerticalAlignment(SwingConstants.TOP);
        titu2.setHorizontalAlignment(SwingConstants.CENTER);
        titu2.setFont(new java.awt.Font("Century Schoolbook", 1, 17));
        titu2.setText("Bibliografias");
        titu2.setBorder(bor4);
        add(titu2);
        
        admi4=new JLabel();
        
        admi4.setBorder(bor4);
        admi4.setBounds(700,400,600,250);
        crearb=new Boton("Crear");
        crearb.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi4.add(crearb);
        crearb.setBounds(100,50,100,40);
        
        modificarb=new Boton("Modificar");
        modificarb.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi4.add(modificarb);
        modificarb.setBounds(400,50,100,40);
        
        eliminarb=new Boton("Eliminar");
        eliminarb.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi4.add(eliminarb);
        eliminarb.setBounds(100,170,100,40);
        
        mostrarb=new Boton("Mostrar");
        mostrarb.setFont(new java.awt.Font("Perpetua", 1, 13));
        admi4.add(mostrarb);
        mostrarb.setBounds(400,170,100,40);
        add(admi4);
        
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("Administrador");
        getContentPane().setBackground(Color.WHITE);
        
        //AGREGAR ACCIONES A LOS BOTONES
        crear.addActionListener(this);
        mostrar.addActionListener(this);
        modificar.addActionListener(this);
        eliminar.addActionListener(this);
        
        crearb.addActionListener(this);
        mostrarb.addActionListener(this);
        modificarb.addActionListener(this);
        eliminarb.addActionListener(this);
        logout.addActionListener(this);
        
        Reportes.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==crear){
            Crear cr=new Crear();
            
        }
        if(e.getSource()==mostrar){
            Mostrar m1=new Mostrar();
            
        }
        if(e.getSource()==modificar){
            ModificarUser mf1=new ModificarUser(); 
            
        }
        if(e.getSource()==eliminar){
            EliminarUser eu1=new EliminarUser();
        }
        if(e.getSource()==crearb){
            RegistroBiblios rb1=new RegistroBiblios();
        }
        if(e.getSource()==mostrarb){
            MostrarBiblios mb1=new MostrarBiblios();
        }
        if(e.getSource()==modificarb){
            ModificarBiblios mb2=new ModificarBiblios();
        }
        if(e.getSource()==eliminarb){
            EliminarBiblios eb1=new EliminarBiblios();
        }
        if(e.getSource()==logout){
            setVisible(false);
            Principal pi=new Principal();
        }
        if(e.getSource()==Reportes){
            try {
                Reporte ree=new Reporte();
            } catch (IOException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Los reportes han sido creados en la carpeta");
        }
        
    }
    //Limpiar los JTextField;
    
    //Creacion de usuarios
    
    class Crear extends JDialog implements ActionListener{
        //VARIABLES PARA OBTENER DATOS DE LO TEXTFIEL
    
    public Crear(){
        //INICIALIZANDO LOS ELEMENTOS
        getContentPane().setLayout(null);
        aceptar1=new Boton("Registrar");
        aceptar1.setBounds(550,400,100,30);
        getContentPane().add(aceptar1);
        
        //parte de id
        id1=new JLabel();
        id1.setBounds(30,30,70,40);
        id1.setFont(new java.awt.Font("Perpetua", 1, 12));
        id1.setText("Id");
        
        id=new JTextField();
        id.setBounds(130,30,200,40);
        id.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(id1);
        getContentPane().add(id);
        
        //parte del nombre
        nom1=new JLabel();
        nom1.setBounds(30,80,70,40);
        nom1.setFont(new java.awt.Font("Perpetua", 1, 12));
        nom1.setText("Nombre");
        
        nomu=new JTextField();
        nomu.setBounds(130,80,200,40);
        nomu.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        getContentPane().add(nom1);
        getContentPane().add(nomu);
        
        //parte del apellido
        
        apelli1=new JLabel();
        apelli1.setBounds(30,130,70,40);
        apelli1.setFont(new java.awt.Font("Perpetua", 1, 12));
        apelli1.setText("Apellido");
        
        apelli=new JTextField();
        apelli.setBounds(130,130,200,40);
        apelli.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        getContentPane().add(apelli1);
        getContentPane().add(apelli);
        
        //parte del usuario
        
        us1=new JLabel();
        us1.setBounds(30,180,70,40);
        us1.setFont(new java.awt.Font("Perpetua", 1, 12));
        us1.setText("User");
        
        us=new JTextField();
        us.setBounds(130,180,200,40);
        us.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        getContentPane().add(us1);
        getContentPane().add(us);
        
        //parte del roll
        roll1=new JLabel();
        roll1.setBounds(30,230,70,40);
        roll1.setFont(new java.awt.Font("Perpetua", 1, 12));
        roll1.setText("Roll");
        
        roll=new JTextField();
        roll.setBounds(130,230,200,40);
        roll.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        getContentPane().add(roll1);
        getContentPane().add(roll);
        
        //parte de la contra
        pasw1=new JLabel();
        pasw1.setBounds(30,280,70,40);
        pasw1.setFont(new java.awt.Font("Perpetua", 1, 12));
        pasw1.setText("Password");
        
        pasw=new JPasswordField();
        pasw.setBounds(130,280,200,40);
        pasw.setFont(new java.awt.Font("Perpetua", 1, 13));
        pasw.setEchoChar('*');
        getContentPane().add(pasw1);
        getContentPane().add(pasw);
        
        pasww1=new JLabel();
        pasww1.setBounds(30,330,100,40);
        pasww1.setFont(new java.awt.Font("Perpetua", 1, 12));
        pasww1.setText("Repita Password");
        
        pasw2=new JPasswordField();
        pasw2.setBounds(130,330,200,40);
        pasw2.setFont(new java.awt.Font("Perpetua", 1, 13));
        pasw2.setEchoChar('*');
        getContentPane().add(pasww1);
        getContentPane().add(pasw2);
        
        setResizable(false);
        setTitle("Registro Usuario");
        setBounds(100,100,700,500);
        setVisible(true);
        
        aceptar1.addActionListener(this);
       
        
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aceptar1)
                cui=Integer.parseInt(id.getText());
                nombreu=nomu.getText();
                apell=apelli.getText();
                ur=us.getText();
                rol=roll.getText();
                pass=new String(pasw.getPassword());
                pass2=new String(pasw2.getPassword());
                for(int j=0;j<Manejo_Arrays.usuarios.length;j++){
                    if(Manejo_Arrays.usuarios[j]!=null){
                        if(cui==Manejo_Arrays.usuarios[j].getId()){
                            ExisteCui=true;
                        }else{
                            ExisteCui=false;
                        }
                    }
                }
                
                if(ExisteCui==false){
                        if(pass.equals(pass2)){

                        Manejo_Arrays.usuarios[Administrador.contadoruser]=new Usuarios(cui,nombreu,apell,ur,rol,pass,pass2);
                        //Manejo_Arrays.user[Administrador.contadoruser]=new Usuario(ur,pass);
                        
                        //Manejo_Arrays.user[Administrador.contadoruser]=new Usuario();
                        //Agregar una ventana
                        //Manejo_Arrays.user[Administrador.contadoruser]=new Usuario();
                        Exito();
                        setVisible(false);
                        Administrador.contadoruser++; 
                        }else{
                        No_Exito();
                        id.setText("");
                        nomu.setText("");
                        apelli.setText("");
                        us.setText("");
                        roll.setText("");
                        pasw.setText("");
                        pasw2.setText("");
                        }             
                    }else{
                    IdExisten();
                        id.setText("");
                        nomu.setText("");
                        apelli.setText("");
                        us.setText("");
                        roll.setText("");
                        pasw.setText("");
                        pasw2.setText("");
                }
        }
                
        
                //agregar ventanas de aviso
        }
        public void Exito(){
            JOptionPane.showMessageDialog(this,"El usuario se ha creado con exito","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        public void No_Exito(){
            
            JOptionPane.showMessageDialog(null,"Las contraseñas no coniciden");
        }
        public void IdExisten(){
            JOptionPane.showMessageDialog(null,"El Id Existe Porfavor Ingrese Uno Diferente");
        }
        
    }
    
    
    
    class Mostrar extends JDialog implements ActionListener{//   *******
        JTextArea mostrar;
        JScrollPane sp1;
        public Boton ascendent;
        public Boton descendent;
        
        public Mostrar(){
            getContentPane().setLayout(null);
            
            
           
            ascendent=new Boton("Orden Ascendente");
            ascendent.setBounds(35,20,140,30);
            ascendent.setFont(new java.awt.Font("Perpetua", 1, 13));
            getContentPane().add(ascendent);
            
            descendent=new Boton("Orden Descendente");
            descendent.setBounds(200,20,150,30);
            descendent.setFont(new java.awt.Font("Perpetua", 1, 13));
            getContentPane().add(descendent);
            
       
            setResizable(false);
            setTitle("Mostrar Usuarios");
            setSize(400,150);
            setLocationRelativeTo(null);
            
            setVisible(true);
            ascendent.addActionListener(this);
            descendent.addActionListener(this);
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==ascendent){
                InternaMostrarA z1=new InternaMostrarA();
                setVisible(false);
                
            }
            if(e.getSource()==descendent){
                InternaMostrarD z2=new InternaMostrarD();
                setVisible(false);
            }
            
        }
        
        
            class InternaMostrarA extends JDialog{
                public InternaMostrarA(){
                    getContentPane().setLayout(null);
                    
                    
            
                    mostrar=new JTextArea();
                    //mostrar.setBounds(50,70,700,450);
                    mostrar.setEditable(false);
                    mostrar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
                    sp1=new JScrollPane(mostrar);
                    sp1.setBounds(50,70,700,450);
                    
                    //mostrar.add(sp1);
                    
                    getContentPane().add(sp1);
                   //*Aqui se hace el reccorido 
                    Arrays.sort(Manejo_Arrays.usuarios,1,Administrador.contadoruser,new OrdenAscendente());
                    for(int j=0;j<Manejo_Arrays.usuarios.length;j++){
                        if(Manejo_Arrays.usuarios[j]!=null){
                         mostrar.append(Manejo_Arrays.usuarios[j].getMostrar());   
                        }
                    
                    //*
                    setResizable(false);
                    setTitle("Usuarios Registrados");
                    setBounds(100,100,900,600);
                    setVisible(true);
             
                }        
            }
        }
  
               class InternaMostrarD extends JDialog{
                public InternaMostrarD(){
                    getContentPane().setLayout(null);
            
                    mostrar=new JTextArea();
                    //mostrar.setBounds(50,70,700,450);
                    mostrar.setEditable(false);
                    mostrar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
                    sp1=new JScrollPane(mostrar);
                    sp1.setBounds(50,70,700,450);
                    getContentPane().add(sp1);
                    //* Aqui se hace el recorrido 
                    Arrays.sort(Manejo_Arrays.usuarios,1,Administrador.contadoruser,new OrdenDescendente());
                    for(int j=1;j<Manejo_Arrays.usuarios.length;j++){
                        if(Manejo_Arrays.usuarios[j]!=null){
                            mostrar.append(Manejo_Arrays.usuarios[j].getMostrar());
                   
                        }
                    }
                
                    
                    
                    setResizable(false);
                    setTitle("Usuarios Registrados");
                    setBounds(100,100,900,600);
                     setVisible(true);
             
                }        
            }
        }
    
    
        
    

class ModificarUser extends JDialog implements ActionListener{
    public Boton buscarU;
    public Boton cancelarU;
    JTextField jm;
    JLabel jm1;
    
    public String obcui;
    public int obcui1;
    public int obtenerpos;
    public ModificarUser(){
        getContentPane().setLayout(null);
        
        jm1=new JLabel();
        jm1.setBounds(20,20,200,30);
        jm1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jm1.setText("Ingrese CUI Del Usuario");
        getContentPane().add(jm1);
        
        jm=new JTextField();
        jm.setBounds(20,55,200,30);
        jm.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(jm);
        
        buscarU=new Boton("Buscar");
        buscarU.setBounds(175,210,100,30);
        buscarU.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(buscarU);
        
        cancelarU=new Boton("Cancelar");
        cancelarU.setBounds(20,210,100,30);
        cancelarU.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(cancelarU);
        
        setResizable(false);
        setTitle("Buscar Usuario");
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
        
        buscarU.addActionListener(this);
        cancelarU.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscarU){
            obcui=jm.getText();
            obcui1=Integer.parseInt(obcui);
            for(int j=0;j<Manejo_Arrays.usuarios.length;j++){
            if(Manejo_Arrays.usuarios[j]!=null){
                if(obcui1==Manejo_Arrays.usuarios[j].getId()){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    obtenerpos=j;
                    InternaModificarUser imu=new InternaModificarUser(obtenerpos);
                    setVisible(false);
                    break;
                }/*else{
                    JOptionPane.showMessageDialog(null,"El registro no existe","Error",JOptionPane.WARNING_MESSAGE);
                    break;
                }*/
            }
        }
            //InternaModificarUser imu=new InternaModificarUser(obtenerpos);
            //setVisible(false);
            setVisible(false);
           
            
        }
        if(e.getSource()==cancelarU){
            setVisible(false);
            
        }
        
    }
    
    
    
        class InternaModificarUser extends JDialog implements ActionListener{  
            public int Modifcui;//Contiene el espacio del arreglo
            public long cui1;
            String nombreu1;
            String apell1;
            String ur1;
            String rol12;
            String pass1;
            String pass21;
            
            public long cui1aux;
            String nombreu1aux;
            String apell1aux;
            String ur1aux;
            String rol1aux;
            String pass1aux;
            String pass21aux;

            JTextField idu;
            JTextField nomuu;
            JTextField apelliu;
            JTextField usu;
            JTextField rollu;
            JPasswordField paswu;
            JPasswordField pasw2u;

            JLabel id1;
            JLabel nom1;
            JLabel apelli1;
            JLabel us1;
            JLabel roll1;
            JLabel pasw1;
            JLabel pasww1;
            public Boton guardar;
            public Boton anular;
            public InternaModificarUser(int modifcui1 ){
                
            this.Modifcui=modifcui1;//Toma el valor de la poscion del cui ingresado
            
            //GUARDAR POR SI CANCELA LA OPERACION
            cui1aux=Manejo_Arrays.usuarios[Modifcui].getId();//guardo por si cancela
            nombreu1aux=Manejo_Arrays.usuarios[Modifcui].getNombre();//guardo por si no
            apell1aux=Manejo_Arrays.usuarios[Modifcui].getApellido();
            ur1=Manejo_Arrays.usuarios[Modifcui].getUser();
            rol1aux=Manejo_Arrays.usuarios[Modifcui].getRol();
            pass1aux=Manejo_Arrays.usuarios[Modifcui].getContraseña();
            pass21aux=Manejo_Arrays.usuarios[Modifcui].getContraseña2();
            
            getContentPane().setLayout(null);

            guardar=new Boton("Guardar");
            guardar.setBounds(550,400,100,30);
            guardar.setFont(new java.awt.Font("Perpetua", 1, 13));
            getContentPane().add(guardar);
            
            anular=new Boton("Cancelar");
            anular.setBounds(20,400,100,30);
            anular.setFont(new java.awt.Font("Perpetua", 1, 13));
            getContentPane().add(anular);
            

            //parte de id
            id1=new JLabel();
            id1.setBounds(30,30,70,40);
            id1.setFont(new java.awt.Font("Perpetua", 1, 12));
            id1.setText("Id");

            idu=new JTextField();
            idu.setBounds(130,30,200,40);
            idu.setFont(new java.awt.Font("Perpetua", 1, 13));
            
            idu.setText(Long.toString(Manejo_Arrays.usuarios[Modifcui].getId()));//Muestro para cambiar
            getContentPane().add(id1);
            getContentPane().add(idu);

            //parte del nombre
            nom1=new JLabel();
            nom1.setBounds(30,80,70,40);
            nom1.setFont(new java.awt.Font("Perpetua", 1, 12));
            nom1.setText("Nombre");

            nomuu=new JTextField();
            nomuu.setBounds(130,80,200,40);
            nomuu.setFont(new java.awt.Font("Perpetua", 1, 13));
            
            nomuu.setText(Manejo_Arrays.usuarios[Modifcui].getNombre());//Muestro por si modifica
            

            getContentPane().add(nom1);
            getContentPane().add(nomuu);

            //parte del apellido

            apelli1=new JLabel();
            apelli1.setBounds(30,130,70,40);
            apelli1.setFont(new java.awt.Font("Perpetua", 1, 12));
            apelli1.setText("Apellido");

            apelliu=new JTextField();
            apelliu.setBounds(130,130,200,40);
            apelliu.setFont(new java.awt.Font("Perpetua", 1, 13));
            apelliu.setText(Manejo_Arrays.usuarios[Modifcui].getApellido());
            

            getContentPane().add(apelli1);
            getContentPane().add(apelliu);

            //parte del usuario

            us1=new JLabel();
            us1.setBounds(30,180,70,40);
            us1.setFont(new java.awt.Font("Perpetua", 1, 12));
            us1.setText("User");

            usu=new JTextField();
            usu.setBounds(130,180,200,40);
            usu.setFont(new java.awt.Font("Perpetua", 1, 13));
            usu.setText(Manejo_Arrays.usuarios[Modifcui].getUser());

            getContentPane().add(us1);
            getContentPane().add(usu);

            //parte del roll
            roll1=new JLabel();
            roll1.setBounds(30,230,70,40);
            roll1.setFont(new java.awt.Font("Perpetua", 1, 12));
            roll1.setText("Roll");

            rollu=new JTextField();
            rollu.setBounds(130,230,200,40);
            rollu.setFont(new java.awt.Font("Perpetua", 1, 13));
            rollu.setText(Manejo_Arrays.usuarios[Modifcui].getRol());

            getContentPane().add(roll1);
            getContentPane().add(rollu);

            //parte de la contra
            pasw1=new JLabel();
            pasw1.setBounds(30,280,70,40);
            pasw1.setFont(new java.awt.Font("Perpetua", 1, 12));
            pasw1.setText("Password");

            paswu=new JPasswordField();
            paswu.setBounds(130,280,200,40);
            paswu.setFont(new java.awt.Font("Perpetua", 1, 13));
            paswu.setEchoChar('*');
            paswu.setText(Manejo_Arrays.usuarios[Modifcui].getContraseña());
            getContentPane().add(pasw1);
            getContentPane().add(paswu);

            pasww1=new JLabel();
            pasww1.setBounds(30,330,100,40);
            pasww1.setFont(new java.awt.Font("Perpetua", 1, 12));
            pasww1.setText("Repita Password");

            pasw2u=new JPasswordField();
            pasw2u.setBounds(130,330,200,40);
            pasw2u.setFont(new java.awt.Font("Perpetua", 1, 13));
            pasw2u.setEchoChar('*');
            pasw2u.setText(Manejo_Arrays.usuarios[Modifcui].getContraseña2());
            getContentPane().add(pasww1);
            getContentPane().add(pasw2u);

            setResizable(false);
            setTitle("Modificar Usuario");
            setBounds(100,100,700,500);
            setVisible(true);
            guardar.addActionListener(this);
            anular.addActionListener(this);

        }
    

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==guardar){
                cui1=Long.parseLong(idu.getText());
                nombreu1=nomuu.getText();
                apell1=apelliu.getText();
                ur1=usu.getText();
                rol12=rollu.getText();
                pass1=new String(paswu.getPassword());
                pass21=new String(pasw2u.getPassword());
                
               Manejo_Arrays.usuarios[Modifcui].setId(cui1);
               Manejo_Arrays.usuarios[Modifcui].setNombre(nombreu1);
               Manejo_Arrays.usuarios[Modifcui].setApellido(apell1);
               Manejo_Arrays.usuarios[Modifcui].setUser(ur1);
               Manejo_Arrays.usuarios[Modifcui].setRol(rol12);
               Manejo_Arrays.usuarios[Modifcui].setContraseña(pass1);
               Manejo_Arrays.usuarios[Modifcui].setContraseña2(pass21);
               JOptionPane.showMessageDialog(null,"El Usuario se modificico con exito");
               setVisible(false);
               
                
                
            }
            if(e.getSource()==anular){
                /*Manejo_Arrays.usuarios[Modifcui].setId(cui1aux);
               Manejo_Arrays.usuarios[Modifcui].setNombre(nombreu1aux);
               Manejo_Arrays.usuarios[Modifcui].setApellido(apell1aux);
               Manejo_Arrays.usuarios[Modifcui].setUser(ur1aux);
               Manejo_Arrays.usuarios[Modifcui].setRol(rol1aux);
               Manejo_Arrays.usuarios[Modifcui].setContraseña(pass1aux);
               Manejo_Arrays.usuarios[Modifcui].setContraseña2(pass21aux);*/
               JOptionPane.showMessageDialog(null,"Los cambios no se guardaron");
               setVisible(false);
                
            }
            
            
        }
    }
}
class EliminarUser extends JDialog implements ActionListener{
    JLabel jm12;
    JTextField jm2;
    public Boton buscar1;
    public String obcuiE;
    public int obcui1E;
    public int obtenerposE;
    
    public EliminarUser(){
        getContentPane().setLayout(null);
        jm12=new JLabel();
        jm12.setBounds(20,20,200,30);
        jm12.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jm12.setText("Ingrese el cui del usuario");
        getContentPane().add(jm12);
        
        jm2=new JTextField();
        jm2.setBounds(20,55,200,30);
        jm2.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(jm2);
        
        buscar1=new Boton("Buscar");
        buscar1.setBounds(175,210,100,30);
        buscar1.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(buscar1);
        
        setResizable(false);
        setTitle("Buscar Usuario");
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
        buscar1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscar1){
            obcuiE=jm2.getText();
            obcui1E=Integer.parseInt(obcuiE);
            for(int j=0;j<Manejo_Arrays.usuarios.length;j++){
            if(Manejo_Arrays.usuarios[j]!=null){
                if(obcui1E==Manejo_Arrays.usuarios[j].getId()){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    obtenerposE=j;//Guardo la posicion del elemento a eliminar
                    InternaEliminarUser1 ie1=new InternaEliminarUser1(obtenerposE);
                    setVisible(false);
                    break;
                }
            }
        }
            setVisible(false);
    }
 }
    class InternaEliminarUser1 extends JDialog implements ActionListener{
            public int Modifcui;//Contiene el espacio del arreglo
            long cui1;
            String nombreu1;
            String apell1;
            String ur1;
            String rol12;
            String pass1;
            String pass21;
            
            long cui1aux;
            String nombreu1aux;
            String apell1aux;
            String ur1aux;
            String rol1aux;
            String pass1aux;
            String pass21aux;

            JTextField idu;
            JTextField nomuu;
            JTextField apelliu;
            JTextField usu;
            JTextField rollu;
            JPasswordField paswu;
            JPasswordField pasw2u;

            JLabel id1;
            JLabel nom1;
            JLabel apelli1;
            JLabel us1;
            JLabel roll1;
            JLabel pasw1;
            JLabel pasww1;
            public Boton guardar1;
            public Boton anular1;
            
            public InternaEliminarUser1(int modifcui1){
                this.Modifcui=modifcui1;//Toma el valor de la poscion del cui ingresado
                
            //Guardo las posciones por si cancela la operacion
            cui1aux=Manejo_Arrays.usuarios[Modifcui].getId();//guardo por si cancela
            nombreu1aux=Manejo_Arrays.usuarios[Modifcui].getNombre();//guardo por si no
            apell1aux=Manejo_Arrays.usuarios[Modifcui].getApellido();
            ur1=Manejo_Arrays.usuarios[Modifcui].getUser();
            rol1aux=Manejo_Arrays.usuarios[Modifcui].getRol();
            pass1aux=Manejo_Arrays.usuarios[Modifcui].getContraseña();
            pass21aux=Manejo_Arrays.usuarios[Modifcui].getContraseña2();
            
            getContentPane().setLayout(null);

            guardar1=new Boton("Eliminar");
            guardar1.setBounds(550,400,100,30);
            guardar1.setFont(new java.awt.Font("Perpetua", 1, 13));
            getContentPane().add(guardar1);
            
            anular1=new Boton("Cancelar");
            anular1.setBounds(20,400,100,30);
            anular1.setFont(new java.awt.Font("Perpetua", 1, 13));
            getContentPane().add(anular1);
            

            //parte de id
            id1=new JLabel();
            id1.setBounds(30,30,70,40);
            id1.setFont(new java.awt.Font("Perpetua", 1, 12));
            id1.setText("Id");

            idu=new JTextField();
            idu.setBounds(130,30,200,40);
            idu.setFont(new java.awt.Font("Perpetua", 1, 13));
            
            idu.setText(Long.toString(Manejo_Arrays.usuarios[Modifcui].getId()));//Muestro para cambiar
            idu.setEditable(false);
            getContentPane().add(id1);
            getContentPane().add(idu);

            //parte del nombre
            nom1=new JLabel();
            nom1.setBounds(30,80,70,40);
            nom1.setFont(new java.awt.Font("Perpetua", 1, 12));
            nom1.setText("Nombre");

            nomuu=new JTextField();
            nomuu.setBounds(130,80,200,40);
            nomuu.setFont(new java.awt.Font("Perpetua", 1, 13));
            
            nomuu.setText(Manejo_Arrays.usuarios[Modifcui].getNombre());//Muestro por si modifica
            nomuu.setEditable(false);
            

            getContentPane().add(nom1);
            getContentPane().add(nomuu);

            //parte del apellido

            apelli1=new JLabel();
            apelli1.setBounds(30,130,70,40);
            apelli1.setFont(new java.awt.Font("Perpetua", 1, 12));
            apelli1.setText("Apellido");

            apelliu=new JTextField();
            apelliu.setBounds(130,130,200,40);
            apelliu.setFont(new java.awt.Font("Perpetua", 1, 13));
            apelliu.setText(Manejo_Arrays.usuarios[Modifcui].getApellido());
            apelliu.setEditable(false);
            

            getContentPane().add(apelli1);
            getContentPane().add(apelliu);

            //parte del usuario

            us1=new JLabel();
            us1.setBounds(30,180,70,40);
            us1.setFont(new java.awt.Font("Perpetua", 1, 12));
            us1.setText("User");

            usu=new JTextField();
            usu.setBounds(130,180,200,40);
            usu.setFont(new java.awt.Font("Perpetua", 1, 13));
            usu.setText(Manejo_Arrays.usuarios[Modifcui].getUser());
            usu.setEditable(false);

            getContentPane().add(us1);
            getContentPane().add(usu);

            //parte del roll
            roll1=new JLabel();
            roll1.setBounds(30,230,70,40);
            roll1.setFont(new java.awt.Font("Perpetua", 1, 12));
            roll1.setText("Roll");

            rollu=new JTextField();
            rollu.setBounds(130,230,200,40);
            rollu.setFont(new java.awt.Font("Perpetua", 1, 13));
            rollu.setText(Manejo_Arrays.usuarios[Modifcui].getRol());
            rollu.setEditable(false);

            getContentPane().add(roll1);
            getContentPane().add(rollu);

            //parte de la contra
            pasw1=new JLabel();
            pasw1.setBounds(30,280,70,40);
            pasw1.setFont(new java.awt.Font("Perpetua", 1, 12));
            pasw1.setText("Password");

            paswu=new JPasswordField();
            paswu.setBounds(130,280,200,40);
            paswu.setFont(new java.awt.Font("Perpetua", 1, 13));
            paswu.setEchoChar('*');
            paswu.setText(Manejo_Arrays.usuarios[Modifcui].getContraseña());
            paswu.setEditable(false);
            getContentPane().add(pasw1);
            getContentPane().add(paswu);

            pasww1=new JLabel();
            pasww1.setBounds(30,330,100,40);
            pasww1.setFont(new java.awt.Font("Perpetua", 1, 12));
            pasww1.setText("Repita Password");

            pasw2u=new JPasswordField();
            pasw2u.setBounds(130,330,200,40);
            pasw2u.setFont(new java.awt.Font("Perpetua", 1, 13));
            pasw2u.setEchoChar('*');
            pasw2u.setText(Manejo_Arrays.usuarios[Modifcui].getContraseña2());
            pasw2u.setEditable(false);
            getContentPane().add(pasww1);
            getContentPane().add(pasw2u);

            setResizable(false);
            setTitle("Eliminar Usuario");
            setBounds(100,100,700,500);
            setVisible(true);
            guardar1.addActionListener(this);
            anular1.addActionListener(this);
                
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==guardar1){
                if(Modifcui>=0){//Voy a comprobar que el registro exista
                
                    /*Manejo_Arrays.usuarios[Modifcui].setId(cui1);
                    Manejo_Arrays.usuarios[Modifcui].setNombre(nombreu1);
                    Manejo_Arrays.usuarios[Modifcui].setApellido(apell1);
                    Manejo_Arrays.usuarios[Modifcui].setUser(ur1);
                    Manejo_Arrays.usuarios[Modifcui].setRol(rol12);
                    Manejo_Arrays.usuarios[Modifcui].setContraseña(pass1);
                    Manejo_Arrays.usuarios[Modifcui].setContraseña2(pass21);*/
                    
                    Manejo_Arrays.usuarios[Modifcui]=null;
                    for(int k=Modifcui;k<Administrador.contadoruser;k++){//Voy a correr espacioes
                        Manejo_Arrays.usuarios[k]=Manejo_Arrays.usuarios[k+1]; //asigno los datos de k+1 a una poscion anterior
                        Manejo_Arrays.usuarios[k+1]=null;//hago nulo los datos k+1 para que no salga 
                        Administrador.contadoruser=Administrador.contadoruser-(1);
                                   
                    }
                    
                    /*Manejo_Arrays.user[Modifcui]=null;//EL MISMO PROCESO PARA LOS PANELES
                    for(int k=Modifcui;k<Administrador.contadoruser;k++){
                        Manejo_Arrays.user[k]=Manejo_Arrays.user[k+1];
                        Manejo_Arrays.user[k+1]=null;
                        Administrador.contadoruser=Administrador.contadoruser-(1);
                    }*/
            }
                
                
                JOptionPane.showMessageDialog(null,"El usuario ha sido elimininado");
                setVisible(false);
                
            }
          
            if(e.getSource()==anular1){
            /*Manejo_Arrays.usuarios[Modifcui].setId(cui1aux);
               Manejo_Arrays.usuarios[Modifcui].setNombre(nombreu1aux);
               Manejo_Arrays.usuarios[Modifcui].setApellido(apell1aux);
               Manejo_Arrays.usuarios[Modifcui].setUser(ur1aux);
               Manejo_Arrays.usuarios[Modifcui].setRol(rol1aux);
               Manejo_Arrays.usuarios[Modifcui].setContraseña(pass1aux);
               Manejo_Arrays.usuarios[Modifcui].setContraseña2(pass21aux);*/
               JOptionPane.showMessageDialog(null,"Se ha cancelado");
                setVisible(false);
            }
        }
    }
    
}

class RegistroBiblios implements ActionListener{
    JFrame jf1;
    //public JPanel pri;
    //public JPanel jlibros;
    //public JPanel jrevistas;
    //public JPanel jtesis;
    
    JComboBox<String> opciones;
    JLabel tipo;
   
    public JTextField aut1;
    public JTextField title1;
    public JTextField edic1;
    public JTextField clave1;
    public JTextField descrip1;
    public JTextField tem1;
    public JTextField cop1;
    public JTextField dispo1;
    public JTextField frec1;
    public JTextField ejempl1;
    public JTextField are1;
    
    
    public JLabel aut;
    public JLabel title;
    public JLabel edic;
    public JLabel clave;
    public JLabel descrip;
    public JLabel tem;
    public JLabel cop;
    public JLabel dispo;
    public JLabel frec;
    public JLabel ejempl;
    public JLabel are;

    
    public RegistroBiblios(){
        jf1=new JFrame();
        
        /*pri=new JPanel();//Un panel que contiene los elementos 
        pri.setSize(200,300);
        pri.setVisible(true);//Aparezco y desparezco el Jpanel
        pri.setLayout(null);*/
        
        tipo=new JLabel();
        tipo.setBounds(20,20,50,40);
        tipo.setFont(new java.awt.Font("Castellar", 1, 13));
        tipo.setText("Tipo");
        
        opciones=new JComboBox<String>();
        opciones.setBounds(20,60,200,30);
        opciones.setFont(new java.awt.Font("Castellar", 1, 13));
        opciones.addItem("Seleccione");//0
        opciones.addItem("Libro");//1
        opciones.addItem("Revista");//2
        opciones.addItem("Tesi");//3
        opciones.addItem("Carga Masiva");//4
        opciones.setSelectedIndex(0);
        
        jf1.add(tipo);
        jf1.add(opciones);
        jf1.setLayout(null);
        jf1.setResizable(false);
        jf1.setTitle("Registro Libros");
        jf1.setSize(300,300);
        jf1.setLocationRelativeTo(null);        
        jf1.setVisible(true);
        //jf1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        opciones.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int opciones1=opciones.getSelectedIndex();
        
        if(opciones1==1){
            
            FormularioLibro fl1=new FormularioLibro();
            
        }
        if(opciones1==2){
            
            FormularioRevista fr1=new FormularioRevista();
        }
        if(opciones1==3){
            
            FormularioTesi ft1=new FormularioTesi();
        }
        if(opciones1==4){
            Carga_Masiva cm=new Carga_Masiva();
        }
        
        
    }
    
    class FormularioLibro extends JFrame implements ActionListener{
        public Boton acepLibro;
        public Boton canLibro;
        
        String autL;
        String titleL;
        Integer edicL;
        String claveL;
        String descripL;
        String temL;
        Integer copL;
        Integer dispoL;
        
        public FormularioLibro(){
        acepLibro=new Boton("Registrar");
        acepLibro.setBounds(580,400,90,30);
        acepLibro.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(acepLibro);
            
        canLibro=new Boton("Cancelar");
        canLibro.setBounds(20,400,90,30);
        canLibro.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(canLibro);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(aut);
        add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(title);
        add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(edic);
        add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(clave);
        add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(descrip);
        add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(tem);
        add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(cop);
        add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(dispo);
        add(dispo1);
        setLayout(null);
        setBounds(100,100,700,500);
        setResizable(false);
        setVisible(true);
        setTitle("Registro de Libros");
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        acepLibro.addActionListener(this);
        canLibro.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==acepLibro){
                
                autL=aut1.getText();
                titleL=title1.getText();
                edicL=Integer.parseInt(edic1.getText());
                claveL=clave1.getText();
                
                descripL=descrip1.getText();
                temL=tem1.getText();
                
                
                copL=Integer.parseInt(cop1.getText());
                dispoL=Integer.parseInt(dispo1.getText());
                
                Manejo_Arrays.libros[Administrador.contadorlibro]=new Libro(0,autL,titleL,edicL,claveL,descripL,temL,copL,dispoL);
                Manejo_Arrays.libros[Administrador.contadorlibro].setPrestamos(0);
                ExitoL();
                setVisible(false);
                Administrador.contadorlibro++;
                
                
            }
            if(e.getSource()==canLibro){
                setVisible(false);
                
            }
        }
        public void ExitoL(){
            JOptionPane.showMessageDialog(this,"El Libro se ha creado con exito","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        
}
    class FormularioRevista extends JFrame implements ActionListener{
        public Boton acepRevi;
        public Boton canRevi;
        
        String autR;
        String titleR;
        Integer edicR;
        String claveR;
        String descripR;
        String temR;
        Integer copR;
        Integer dispoR;
        String frecR;
        Integer ejemplR;
        
        public FormularioRevista(){
        //getContentPane().setLayout(null);
        //Parte del autor
        acepRevi=new Boton("Registrar");
        acepRevi.setBounds(580,480,90,30);
        acepRevi.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(acepRevi);
        canRevi=new Boton("Cancelar");
        canRevi.setBounds(20,480,90,30);
        canRevi.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(canRevi);
        
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(aut);
        add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(title);
        add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(edic);
        add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(clave);
        add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(descrip);
        add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(tem);
        add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(cop);
        add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(dispo);
        add(dispo1);
        
        //parte de frecuencia
        frec=new JLabel();
        frec.setBounds(30,380,70,30);
        frec.setFont(new java.awt.Font("Perpetua", 1, 13));
        frec.setText("Frecuencia");
        
        frec1=new JTextField();
        frec1.setBounds(30,410,250,30);
        frec1.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(frec);
        add(frec1);
        
        //Parte de ejemplares
        ejempl=new JLabel();
        ejempl.setBounds(350,380,70,30);
        ejempl.setFont(new java.awt.Font("Perpetua", 1, 13));
        ejempl.setText("Ejemplares");
        
        ejempl1=new JTextField();
        ejempl1.setBounds(350,410,250,30);
        ejempl1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(ejempl);
        add(ejempl1);
        
        
        setLayout(null);
        setBounds(100,100,700,550);
        setResizable(false);
        setVisible(true);
        setTitle("Registro de Revistas");
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        acepRevi.addActionListener(this);
        canRevi.addActionListener(this);
        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==acepRevi){
               autR=aut1.getText();
               titleR=title1.getText();
               edicR=Integer.parseInt(edic1.getText());
               claveR=clave1.getText();
               
               descripR=descrip1.getText();
               temR=tem1.getText();
               
               copR=Integer.parseInt(cop1.getText());
               dispoR=Integer.parseInt(dispo1.getText());
               frecR=frec1.getText();
               ejemplR=Integer.parseInt(ejempl1.getText());
               
               Manejo_Arrays.revistas[Administrador.contadorrevis]=new Revista(1,autR,titleR,edicR,claveR,descripR,temR,copR,dispoR,frecR,ejemplR);
               Manejo_Arrays.revistas[Administrador.contadorrevis].setPrestamos(0);
               ExitoR();
               setVisible(false);
               Administrador.contadorrevis++;
               
               
               
           }
           if(e.getSource()==canRevi){
               setVisible(false);
           }
        }
        public void ExitoR(){
            JOptionPane.showMessageDialog(this,"La revista ha sido creada con exito","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
    class FormularioTesi extends JFrame implements ActionListener{
        public Boton acepTesi;
        public Boton canTesi;
        
        String autT;
        String titleT;
        Integer edicT;
        String claveT;
        String descripT;
        String temT;
        Integer copT;
        Integer dispoT;
        String areT;
        
        public FormularioTesi(){
        //getContentPane().setLayout(null);
        //Parte del autor
        acepTesi=new Boton("Registrar");
        acepTesi.setBounds(580,480,90,30);
        acepTesi.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(acepTesi);
        canTesi=new Boton("Cancelar");
        canTesi.setBounds(20,480,90,30);
        canTesi.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(canTesi);
        
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(aut);
        add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(title);
        add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(edic);
        add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(clave);
        add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(descrip);
        add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
       add(tem);
        add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(cop);
        add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(dispo);
        add(dispo1);
        
        //parte del area
        are=new JLabel();
        are.setBounds(30,380,50,30);
        are.setFont(new java.awt.Font("Perpetua", 1, 13));
        are.setText("Area");
        
        are1=new JTextField();
        are1.setBounds(30,410,250,30);
        are1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(are);
        add(are1);
        
        setLayout(null);
        setBounds(100,100,700,550);
        setResizable(false);
        setVisible(true);
        setTitle("Registro de Tesis");
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);    
        acepTesi.addActionListener(this);
        canTesi.addActionListener(this);
        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==acepTesi){
                autT=aut1.getText();
                titleT=title1.getText();
                edicT=Integer.parseInt(edic1.getText());
                claveT=clave1.getText();
                
                descripT=descrip1.getText();
                temT=tem1.getText();
                
                copT=Integer.parseInt(cop1.getText());
                dispoT=Integer.parseInt(dispo1.getText());
                areT=are1.getText();
                
                Manejo_Arrays.tesis[Administrador.contadortesi]=new Tesi(2,autT,titleT,edicT,claveT,descripT,temT,copT,dispoT,areT);
                Manejo_Arrays.tesis[Administrador.contadortesi].setPrestamos(0);
                ExitoT();
                setVisible(false);
                Administrador.contadortesi++;
                
            }
            if(e.getSource()==canTesi){
                setVisible(false);
                
            }
            
        }
        public void ExitoT(){
            JOptionPane.showMessageDialog(this,"La Tesi ha sido creada con exito","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}

class MostrarBiblios extends JFrame implements ActionListener{
    JLabel mensaje;
    public Boton mLibro;
    public Boton mRevi;
    public Boton mTesi;
    
    public MostrarBiblios(){
        mensaje= new JLabel();
        mensaje.setText("Eliga la opcion");
        mensaje.setBounds(20,20,200,40);
        mensaje.setFont(new java.awt.Font("Perpetua", 1, 15));
        add(mensaje);
     
        mLibro=new Boton("Mostrar Libros");
        mLibro.setBounds(20,100,150,30);
        mLibro.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        mRevi=new Boton("Mostrar Revistas");
        mRevi.setBounds(20,150,150,30);
        mRevi.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        mTesi=new Boton("Mostrar Tesis");
        mTesi.setBounds(20,200,150,30);
        mTesi.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(mLibro);
        add(mRevi);
        add(mTesi);
        setLayout(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("MOSTRAR");
        setBounds(400,200,350,350);
        getContentPane().setBackground(Color.WHITE);
        mLibro.addActionListener(this);
        mRevi.addActionListener(this);
        mTesi.addActionListener(this);
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mLibro){
            TablaLibro tl=new TablaLibro();
        }
        if(e.getSource()==mRevi){
            TablaRevista tr=new TablaRevista();
            
        }
        if(e.getSource()==mTesi){
            TablaTesi tt=new TablaTesi();
        }
    }
    //Mostrar Libro
    class TablaLibro extends JFrame{
    JTable mitabla;
    JScrollPane scroll;
    public TablaLibro(){
            String titulos[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles","Prestamos"};
            String[] campos[]=obtenerdatos();
            mitabla=new JTable(campos,titulos);
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Consolas", 1, 15));
            scroll=new JScrollPane(mitabla);
            scroll.setBounds(50,50,1200,500);
            scroll.setViewportView(mitabla);
            
            
            add(scroll);
            
            //add(mitabla);
           
           setLayout(null);
           setExtendedState(MAXIMIZED_BOTH);//maxima
           setVisible(true);
           setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Posiblemente cambiarlo
           setTitle("BIBLIOTECA");
           getContentPane().setBackground(Color.WHITE); 
        
    }
    
    
    
    private String [][] obtenerdatos(){
        String campos [][]=new String[Administrador.contadorlibro][9];
        for(int y=0;y<campos.length;y++){
            
            campos[y][0]=Manejo_Arrays.libros[y].getAutor();
            campos[y][1]=Manejo_Arrays.libros[y].getTitulo();
            campos[y][2]=Manejo_Arrays.libros[y].getClave();
            campos[y][3]=Integer.toString(Manejo_Arrays.libros[y].getEdicion());
            campos[y][4]=Manejo_Arrays.libros[y].getDescripcion();
            campos[y][5]=Manejo_Arrays.libros[y].getTema();
            campos[y][6]=Manejo_Arrays.libros[y].getCopia()+""; 
            campos[y][7]=Manejo_Arrays.libros[y].getDisponible()+""; 
            campos[y][8]=Manejo_Arrays.libros[y].getPrestamos()+"";
         
        
        }
     return campos;   
    }

}
    
    //Mostrar Libro
    class TablaRevista extends JFrame{
    JTable mitabla;
    JScrollPane scroll;
    public TablaRevista(){
            String titulos[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles","Frecuencia","Ejemplar","Prestamos"};
            String[] campos[]=obtenerdatos();
            mitabla=new JTable(campos,titulos);
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Consolas", 1, 15));
            scroll=new JScrollPane(mitabla);
            scroll.setBounds(50,50,1200,500);
            scroll.setViewportView(mitabla);
            
            
            add(scroll);
            
            //add(mitabla);
           
           setLayout(null);
           setExtendedState(MAXIMIZED_BOTH);//maxima
           setVisible(true);
           setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Posiblemente cambiarlo
           setTitle("BIBLIOTECA");
           getContentPane().setBackground(Color.WHITE); 
        
    }
    
    
    
    private String [][] obtenerdatos(){
        String campos [][]=new String[Administrador.contadorrevis][11];
        for(int y=0;y<campos.length;y++){
            campos[y][0]=Manejo_Arrays.revistas[y].getAutor();
            campos[y][1]=Manejo_Arrays.revistas[y].getTitulo();
            campos[y][2]=Manejo_Arrays.revistas[y].getClave();
            campos[y][3]=Integer.toString(Manejo_Arrays.revistas[y].getEdicion());
            campos[y][4]=Manejo_Arrays.revistas[y].getDescripcion();
            campos[y][5]=Manejo_Arrays.revistas[y].getTema();
            campos[y][6]=Manejo_Arrays.revistas[y].getCopia()+""; 
            campos[y][7]=Manejo_Arrays.revistas[y].getDisponible()+""; 
            campos[y][8]=Manejo_Arrays.revistas[y].getFrecuencia();
            campos[y][9]=Manejo_Arrays.revistas[y].getEjemplar()+""; 
            campos[y][10]=Manejo_Arrays.revistas[y].getPrestamos()+"";
        }
     return campos;   
    }

}
    
    class TablaTesi extends JFrame{
    JTable mitabla;
    JScrollPane scroll;
    public TablaTesi(){
            String titulos[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles","Area","Prestamos"};
            String[] campos[]=obtenerdatos();
            mitabla=new JTable(campos,titulos);
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Consolas", 1, 15));
            scroll=new JScrollPane(mitabla);
            scroll.setBounds(50,50,1200,500);
            scroll.setViewportView(mitabla);
            
            
            add(scroll);
            
            //add(mitabla);
           
           setLayout(null);
           setExtendedState(MAXIMIZED_BOTH);//maxima
           setVisible(true);
           setDefaultCloseOperation(JFrame. HIDE_ON_CLOSE);//Posiblemente cambiarlo
           setTitle("BIBLIOTECA");
           getContentPane().setBackground(Color.WHITE); 
        
    }
    
    
    
    private String [][] obtenerdatos(){
        String campos [][]=new String[Administrador.contadortesi][10];
        for(int y=0;y<campos.length;y++){
            campos[y][0]=Manejo_Arrays.tesis[y].getAutor();
            campos[y][1]=Manejo_Arrays.tesis[y].getTitulo();
            campos[y][2]=Manejo_Arrays.tesis[y].getClave();
            campos[y][3]=Integer.toString(Manejo_Arrays.tesis[y].getEdicion());
            campos[y][4]=Manejo_Arrays.tesis[y].getDescripcion();
            campos[y][5]=Manejo_Arrays.tesis[y].getTema();
            campos[y][6]=Manejo_Arrays.tesis[y].getCopia()+""; 
            campos[y][7]=Manejo_Arrays.tesis[y].getDisponible()+""; 
            campos[y][8]=Manejo_Arrays.tesis[y].getArea();
            campos[y][9]=Manejo_Arrays.tesis[y].getPrestamos()+"";
         
        }
     return campos;   
    }

}
    
}




class ModificarBiblios extends JFrame implements ActionListener{
    JLabel opcion;
    public JTextField aut1;
    public JTextField title1;
    public JTextField edic1;
    public JTextField clave1;
    public JTextField descrip1;
    public JTextField tem1;
    public JTextField cop1;
    public JTextField dispo1;
    public JTextField frec1;
    public JTextField ejempl1;
    public JTextField are1;
    
    
    public JLabel aut;
    public JLabel title;
    public JLabel edic;
    public JLabel clave;
    public JLabel descrip;
    public JLabel tem;
    public JLabel cop;
    public JLabel dispo;
    public JLabel frec;
    public JLabel ejempl;
    public JLabel are;
    
    public Boton mlibro;
    public Boton mrevi;
    public Boton mtesi;
    
    public ModificarBiblios(){
        opcion= new JLabel();
        opcion.setText("Eliga la opcion");
        opcion.setBounds(20,20,200,40);
        opcion.setFont(new java.awt.Font("Perpetua", 1, 15));
        add(opcion);
     
        mlibro=new Boton("Modificar Libros");
        mlibro.setBounds(20,100,150,30);
        mlibro.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        mrevi=new Boton("Modificar Revistas");
        mrevi.setBounds(20,150,150,30);
        mrevi.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        mtesi=new Boton("Modificar Tesis");
        mtesi.setBounds(20,200,150,30);
        mtesi.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(mlibro);
        add(mrevi);
        add(mtesi);
        setLayout(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("MOSTRAR");
        setBounds(400,200,350,350);
        getContentPane().setBackground(Color.WHITE);
        mlibro.addActionListener(this);
        mrevi.addActionListener(this);
        mtesi.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mlibro){
            ModificarLibro ml2=new ModificarLibro();
        }
        if(e.getSource()==mrevi){
            ModificarRevista mr2=new ModificarRevista();
        }
        if(e.getSource()==mtesi){
            ModificarTesi mt2=new ModificarTesi();
        }
        
        
    }
    
    
    class ModificarLibro extends JDialog implements ActionListener{
    public Boton buscarL;
    public Boton canL;
    JTextField busL;
    JLabel menl;
    
    String titleBuscar;
    public int posL;
    public int posl;
    public ModificarLibro(){
        getContentPane().setLayout(null);
        
        menl=new JLabel();
        menl.setBounds(20,20,200,30);
        menl.setFont(new java.awt.Font("Times New Roman", 1, 14));
        menl.setText("Ingrese El Titulo del libro");
        getContentPane().add(menl);
        
        busL=new JTextField();
        busL.setBounds(20,55,300,30);
        busL.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(busL);
        
        buscarL=new Boton("Buscar");
        buscarL.setBounds(275,210,100,30);
        buscarL.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(buscarL);
        
        canL=new Boton("Cancelar");
        canL.setBounds(20,210,100,30);
        canL.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(canL);
        
        setResizable(false);
        setTitle("Buscar Libro");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        buscarL.addActionListener(this);
        canL.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buscarL){
            titleBuscar=busL.getText();
            //obcui1=Integer.parseInt(obcui);
            for(int j=0;j<Manejo_Arrays.libros.length;j++){
            if(Manejo_Arrays.libros[j]!=null){
                if(titleBuscar.equals((Manejo_Arrays.libros[j].getTitulo()))){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    posL=j;
                    setVisible(false);
                    InternaLibro il=new InternaLibro(posL); //CLase 
                    
                    break;
                }/*else{
                    JOptionPane.showMessageDialog(null,"El registro no existe","Error",JOptionPane.WARNING_MESSAGE);
                    break;
                }*/
            }
            }
            //setVisible(false);
            }
            if(e.getSource()==canL){
                setVisible(false);
                
            }
        }
        
       class InternaLibro extends JDialog implements ActionListener{
        public Boton modL;
        public Boton cancL;
        
        String autL;
        String titleL;
        int edicL;
        String claveL;
        String descripL;
        String temL;
        int copL;
        int dispoL;
        
        String autAux;
        String titleAux;
        int ediAux;
        String clavAux;
        String descripAux;
        String temAux;
        int copAux;
        int dispoAux;
        
        int poslAux;
        
        public InternaLibro(int Pos){
        this.poslAux=Pos;
        
        getContentPane().setLayout(null);
                
        autAux=Manejo_Arrays.libros[poslAux].getAutor();
        titleAux=Manejo_Arrays.libros[poslAux].getTitulo();
        ediAux=Manejo_Arrays.libros[poslAux].getEdicion();
        clavAux=Manejo_Arrays.libros[poslAux].getClave();
        descripAux=Manejo_Arrays.libros[poslAux].getDescripcion();
        temAux=Manejo_Arrays.libros[poslAux].getTema();
        copAux=Manejo_Arrays.libros[poslAux].getCopia();
        dispoAux=Manejo_Arrays.libros[poslAux].getDisponible();
        
        modL=new Boton("Guardar");
        modL.setBounds(580,400,90,30);
        modL.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(modL);
            
        cancL=new Boton("Cancelar");
        cancL.setBounds(20,400,90,30);
        cancL.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(cancL);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.libros[poslAux].getAutor());
        
        getContentPane().add(aut);
        getContentPane().add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        title1.setText(Manejo_Arrays.libros[poslAux].getTitulo());
        
        getContentPane().add(title);
        getContentPane().add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic1.setText(Integer.toString(Manejo_Arrays.libros[poslAux].getEdicion()));
        
        getContentPane().add(edic);
        getContentPane().add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave1.setText(Manejo_Arrays.libros[poslAux].getClave());
        
        getContentPane().add(clave);
        getContentPane().add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip1.setText(Manejo_Arrays.libros[poslAux].getDescripcion());
        
        getContentPane().add(descrip);
        getContentPane().add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem1.setText(Manejo_Arrays.libros[poslAux].getTema());
        
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.libros[poslAux].getCopia()));
        
        getContentPane().add(cop);
        getContentPane().add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo1.setText(Integer.toString(Manejo_Arrays.libros[poslAux].getDisponible()));
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        setLayout(null);
        setBounds(100,100,700,500);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Libro");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        modL.addActionListener(this);
        cancL.addActionListener(this);
        
    }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==modL){
                    autL=aut1.getText();
                    titleL=title1.getText();
                    edicL=Integer.parseInt(edic1.getText());
                    claveL=clave1.getText();
                    descripL=descrip1.getText();
                    temL=tem1.getText();
                    copL=Integer.parseInt(cop1.getText());
                    dispoL=Integer.parseInt(dispo1.getText());
                    
                    Manejo_Arrays.libros[poslAux].setAutor(autL);
                    Manejo_Arrays.libros[poslAux].setTitulo(titleL);
                    Manejo_Arrays.libros[poslAux].setEdicion(edicL);
                    Manejo_Arrays.libros[poslAux].setClave(claveL);
                    Manejo_Arrays.libros[poslAux].setDescripcion(descripL);
                    Manejo_Arrays.libros[poslAux].setTema(temL);
                    Manejo_Arrays.libros[poslAux].setCopia(copL);
                    Manejo_Arrays.libros[poslAux].setDisponible(dispoL);
                    JOptionPane.showMessageDialog(null,"El libro ha sido modificado");
                    setVisible(false);
                }
                if(e.getSource()==cancL){
                    setVisible(false);
                    
                }
            }
            
    }
    }
    
    
    
    class ModificarRevista extends JDialog implements ActionListener{
    public Boton buscarR;
    public Boton canR;
    JTextField busR;
    JLabel menr;
    
    public String titleR;
    public int posR;
    public int posr;
    public ModificarRevista(){
        getContentPane().setLayout(null);
        
        menr=new JLabel();
        menr.setBounds(20,20,200,30);
        menr.setFont(new java.awt.Font("Times New Roman", 1, 14));
        menr.setText("Ingrese El Titulo de la Revista");
        getContentPane().add(menr);
        
        busR=new JTextField();
        busR.setBounds(20,55,300,30);
        busR.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(busR);
        
        buscarR=new Boton("Buscar");
        buscarR.setBounds(275,210,100,30);
        buscarR.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(buscarR);
        
        canR=new Boton("Cancelar");
        canR.setBounds(20,210,100,30);
        canR.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(canR);
        
        setResizable(false);
        setTitle("Buscar Usuario");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        buscarR.addActionListener(this);
        canR.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buscarR){
                titleR=busR.getText();
                //obcui1=Integer.parseInt(obcui);
                for(int j=0;j<Manejo_Arrays.revistas.length;j++){
                if(Manejo_Arrays.revistas[j]!=null){
                if(titleR.equals(Manejo_Arrays.revistas[j].getTitulo())){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    posR=j;
                    InternaRevista ir1=new InternaRevista(posR);
                    setVisible(false);
                    break;
                }/*else{
                    JOptionPane.showMessageDialog(null,"El registro no existe","Error",JOptionPane.WARNING_MESSAGE);
                    break;
                }*/
            }
            }
                
            }
            if(e.getSource()==canR){
                setVisible(false);
            }
        }
        
    //clase internas
        
        class InternaRevista extends JDialog implements ActionListener{
        public Boton modR;
        public Boton cancR;
        
        String autR;
        String titleR;
        int edicR;
        String claveR;
        String descripR;
        String temR;
        int copR;
        int dispoR;
        String frecR;
        int ejemplR;
        
        
        String autAux;
        String titleAux;
        int ediAux;
        String clavAux;
        String descripAux;
        String temAux;
        int copAux;
        int dispoAux;
        String frecAux;
        int ejemplAux;
        
        int posrAux;
        
        public InternaRevista(int Pos){
        this.posrAux=Pos;
        
        getContentPane().setLayout(null);
                
        autAux=Manejo_Arrays.revistas[posrAux].getAutor();
        titleAux=Manejo_Arrays.revistas[posrAux].getTitulo();
        ediAux=Manejo_Arrays.revistas[posrAux].getEdicion();
        clavAux=Manejo_Arrays.revistas[posrAux].getClave();
        descripAux=Manejo_Arrays.revistas[posrAux].getDescripcion();
        temAux=Manejo_Arrays.revistas[posrAux].getTema();
        copAux=Manejo_Arrays.revistas[posrAux].getCopia();
        dispoAux=Manejo_Arrays.revistas[posrAux].getDisponible();
        frecAux=Manejo_Arrays.revistas[posrAux].getFrecuencia();
        ejemplAux=Manejo_Arrays.revistas[posrAux].getEjemplar();
        
        modR=new Boton("Guardar");
        modR.setBounds(580,500,90,30);
        modR.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(modR);
            
        cancR=new Boton("Cancelar");
        cancR.setBounds(20,500,90,30);
        cancR.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(cancR);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.revistas[posrAux].getAutor());
        
        getContentPane().add(aut);
        getContentPane().add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        title1.setText(Manejo_Arrays.revistas[posrAux].getTitulo());
        
        getContentPane().add(title);
        getContentPane().add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getEdicion()));
        
        getContentPane().add(edic);
        getContentPane().add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave1.setText(Manejo_Arrays.revistas[posrAux].getClave());
        
        getContentPane().add(clave);
        getContentPane().add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip1.setText(Manejo_Arrays.revistas[posrAux].getDescripcion());
        
        getContentPane().add(descrip);
        getContentPane().add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem1.setText(Manejo_Arrays.revistas[posrAux].getTema());
        
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getCopia()));
        
        getContentPane().add(cop);
        getContentPane().add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getDisponible()));
        
        
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        //parte de frecuencia
        frec=new JLabel();
        frec.setBounds(30,380,70,30);
        frec.setFont(new java.awt.Font("Perpetua", 1, 13));
        frec.setText("Frecuencia");
        
        frec1=new JTextField();
        frec1.setBounds(30,410,250,30);
        frec1.setFont(new java.awt.Font("Perpetua", 1, 13));
        frec1.setText(Manejo_Arrays.revistas[posrAux].getFrecuencia());
        add(frec);
        add(frec1);
        
        //Parte de ejemplares
        ejempl=new JLabel();
        ejempl.setBounds(350,380,70,30);
        ejempl.setFont(new java.awt.Font("Perpetua", 1, 13));
        ejempl.setText("Ejemplares");
        
        ejempl1=new JTextField();
        ejempl1.setBounds(350,410,250,30);
        ejempl1.setFont(new java.awt.Font("Perpetua", 1, 13));
        ejempl1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getEjemplar()));
        getContentPane().add(ejempl);
        getContentPane().add(ejempl1);
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Tesis");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        modR.addActionListener(this);
        cancR.addActionListener(this);
        
    }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==modR){
                    autR=aut1.getText();
                    titleR=title1.getText();
                    edicR=Integer.parseInt(edic1.getText());
                    claveR=clave1.getText();
                    descripR=descrip1.getText();
                    temR=tem1.getText();
                    copR=Integer.parseInt(cop1.getText());
                    dispoR=Integer.parseInt(dispo1.getText());
                    frecR=frec1.getText();
                    
                    Manejo_Arrays.revistas[posrAux].setAutor(autR);
                    Manejo_Arrays.revistas[posrAux].setTitulo(titleR);
                    Manejo_Arrays.revistas[posrAux].setEdicion(edicR);
                    Manejo_Arrays.revistas[posrAux].setClave(claveR);
                    Manejo_Arrays.revistas[posrAux].setDescripcion(descripR);
                    Manejo_Arrays.revistas[posrAux].setTema(temR);
                    Manejo_Arrays.revistas[posrAux].setCopia(copR);
                    Manejo_Arrays.revistas[posrAux].setDisponible(dispoR);
                    Manejo_Arrays.revistas[posrAux].setFrecuencia(frecR);
                    
                    JOptionPane.showMessageDialog(null, "La revista ha sido modificada");
                    setVisible(false);
                }
                if(e.getSource()==cancR){
                    setVisible(false);
                    
                }
                
            }
    }
        
        
    }
    
    class ModificarTesi extends JDialog implements ActionListener{
    public Boton buscarT;
    public Boton canT;
    JTextField busT;
    JLabel ment;
    
    public String titleT;
    public int posT;
    public int post;
    public ModificarTesi(){
        getContentPane().setLayout(null);
        
        ment=new JLabel();
        ment.setBounds(20,20,200,30);
        ment.setFont(new java.awt.Font("Times New Roman", 1, 14));
        ment.setText("Ingrese El Titulo de la Tesi");
        getContentPane().add(ment);
        
        busT=new JTextField();
        busT.setBounds(20,55,300,30);
        busT.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(busT);
        
        buscarT=new Boton("Buscar");
        buscarT.setBounds(275,210,100,30);
        buscarT.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(buscarT);
        
        canT=new Boton("Cancelar");
        canT.setBounds(20,210,100,30);
        canT.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(canT);
        
        setResizable(false);
        setTitle("Buscar Usuario");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        buscarT.addActionListener(this);
        canT.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buscarT){
                titleT=busT.getText();
                //obcui1=Integer.parseInt(obcui);
                for(int j=0;j<Manejo_Arrays.tesis.length;j++){
                if(Manejo_Arrays.tesis[j]!=null){
                if(titleT.equals(Manejo_Arrays.tesis[j].getTitulo())){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    posT=j;
                    InternaTesi it=new InternaTesi(posT);
                    setVisible(false);
                    break;
                }/*else{
                    JOptionPane.showMessageDialog(null,"El registro no existe","Error",JOptionPane.WARNING_MESSAGE);
                    break;
                }*/
            }
            }
                
            }
            if(e.getSource()==canT){
                setVisible(false);
            }
            
        }
        
        //clase interna
        class InternaTesi extends JDialog implements ActionListener{
        public Boton modT;
        public Boton cancT;
        
        String autT;
        String titleT;
        int edicT;
        String claveT;
        String descripT;
        String temT;
        int copT;
        int dispoT;
        String areT;
        
        String autAux;
        String titleAux;
        int ediAux;
        String clavAux;
        String descripAux;
        String temAux;
        int copAux;
        int dispoAux;
        String areAux;
        
        int postAux;
        
        public InternaTesi(int Pos){
        this.postAux=Pos;
        
        getContentPane().setLayout(null);
                
        autAux=Manejo_Arrays.tesis[postAux].getAutor();
        titleAux=Manejo_Arrays.tesis[postAux].getTitulo();
        ediAux=Manejo_Arrays.tesis[postAux].getEdicion();
        clavAux=Manejo_Arrays.tesis[postAux].getClave();
        descripAux=Manejo_Arrays.tesis[postAux].getDescripcion();
        temAux=Manejo_Arrays.tesis[postAux].getTema();
        copAux=Manejo_Arrays.tesis[postAux].getCopia();
        dispoAux=Manejo_Arrays.tesis[postAux].getDisponible();
        areAux=Manejo_Arrays.tesis[postAux].getArea();
        
        modT=new Boton("Guardar");
        modT.setBounds(580,500,90,30);
        modT.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(modT);
            
        cancT=new Boton("Cancelar");
        cancT.setBounds(20,500,90,30);
        cancT.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(cancT);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.tesis[postAux].getAutor());
        
        getContentPane().add(aut);
        getContentPane().add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        title1.setText(Manejo_Arrays.tesis[postAux].getTitulo());
        
        getContentPane().add(title);
        getContentPane().add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic1.setText(Integer.toString(Manejo_Arrays.tesis[postAux].getEdicion()));
        
        getContentPane().add(edic);
        getContentPane().add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave1.setText(Manejo_Arrays.tesis[postAux].getClave());
        
        getContentPane().add(clave);
        getContentPane().add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip1.setText(Manejo_Arrays.tesis[postAux].getDescripcion());
        
        getContentPane().add(descrip);
        getContentPane().add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem1.setText(Manejo_Arrays.tesis[postAux].getTema());
        
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.tesis[postAux].getCopia()));
        
        getContentPane().add(cop);
        getContentPane().add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo1.setText(Integer.toString(Manejo_Arrays.tesis[postAux].getDisponible()));
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        are=new JLabel();
        are.setBounds(30,380,50,30);
        are.setFont(new java.awt.Font("Perpetua", 1, 13));
        are.setText("Area");
        
        are1=new JTextField();
        are1.setBounds(30,410,250,30);
        are1.setFont(new java.awt.Font("Perpetua", 1, 13));
        are1.setText(Manejo_Arrays.tesis[postAux].getArea());
        
        getContentPane().add(are);
        getContentPane().add(are1);
        
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Tesi");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        modT.addActionListener(this);
        cancT.addActionListener(this);
        
    }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==modT){
                    autT=aut1.getText();
                    titleT=title1.getText();
                    edicT=Integer.parseInt(edic1.getText());
                    claveT=clave1.getText();
                    descripT=descrip1.getText();
                    temT=tem1.getText();
                    copT=Integer.parseInt(cop1.getText());
                    areT=are1.getText();
                    
                    Manejo_Arrays.tesis[postAux].setAutor(autT);
                    Manejo_Arrays.tesis[postAux].setTitulo(titleT);
                    Manejo_Arrays.tesis[postAux].setEdicion(edicT);
                    Manejo_Arrays.tesis[postAux].setClave(claveT);
                    Manejo_Arrays.tesis[postAux].setDescripcion(descripT);
                    Manejo_Arrays.tesis[postAux].setTema(temT);
                    Manejo_Arrays.tesis[postAux].setCopia(copT);
                    Manejo_Arrays.tesis[postAux].setArea(areT);
                    JOptionPane.showMessageDialog(null,"La Tesi ha sido modificada");
                    setVisible(false);
                }
                if(e.getSource()==cancT){
                    //FALTA PONERLE LA ACCION AL CANCELAR Y SOBRE ESCRIBIR EN LOS CAMPOS DE LAS BIBLIOS
                    setVisible(false);
                }
            }
            
    }
    }
    
}
class EliminarBiblios extends JFrame implements ActionListener{
    JLabel mensaje;
    public Boton eLibro;
    public Boton eRevi;
    public Boton eTesi;
    public JTextField aut1;
    public JTextField title1;
    public JTextField edic1;
    public JTextField clave1;
    public JTextField descrip1;
    public JTextField tem1;
    public JTextField cop1;
    public JTextField dispo1;
    public JTextField frec1;
    public JTextField ejempl1;
    public JTextField are1;
    
    
    public JLabel aut;
    public JLabel title;
    public JLabel edic;
    public JLabel clave;
    public JLabel descrip;
    public JLabel tem;
    public JLabel cop;
    public JLabel dispo;
    public JLabel frec;
    public JLabel ejempl;
    public JLabel are;
    
    
    
    
    public EliminarBiblios(){
        mensaje= new JLabel();
        mensaje.setText("Eliga la opcion");
        mensaje.setBounds(20,20,200,40);
        mensaje.setFont(new java.awt.Font("Perpetua", 1, 15));
        add(mensaje);
     
        eLibro=new Boton("Eliminar Libros");
        eLibro.setBounds(20,100,150,30);
        eLibro.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        eRevi=new Boton("Eliminar Revistas");
        eRevi.setBounds(20,150,150,30);
        eRevi.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        eTesi=new Boton("Eliminar Tesis");
        eTesi.setBounds(20,200,150,30);
        eTesi.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        add(eLibro);
        add(eRevi);
        add(eTesi);
        setLayout(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("ELIMINAR");
        setBounds(400,200,350,350);
        getContentPane().setBackground(Color.WHITE);
        eLibro.addActionListener(this);
        eRevi.addActionListener(this);
        eTesi.addActionListener(this);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==eLibro){
            EliminarLibro el=new EliminarLibro();
        }
        if(e.getSource()==eRevi){
            EliminarRevista er=new EliminarRevista();
        }
        if(e.getSource()==eTesi){
            EliminarTesi et=new EliminarTesi();
        }
    }
    
    class EliminarLibro extends JDialog implements ActionListener{
    public Boton Buscarl;
    public Boton Canl;
    
    JTextField busL;
    JLabel menl;
    
    String titleBuscar;
    
    public int posL;
    public int posl;
    public EliminarLibro(){
        getContentPane().setLayout(null);
        
        menl=new JLabel();
        menl.setBounds(20,20,200,30);
        menl.setFont(new java.awt.Font("Times New Roman", 1, 14));
        menl.setText("Ingrese El Titulo del libro");
        getContentPane().add(menl);
        
        busL=new JTextField();
        busL.setBounds(20,55,300,30);
        busL.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(busL);
        
        Buscarl=new Boton("Buscar");
        Buscarl.setBounds(275,210,100,30);
        Buscarl.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(Buscarl);
        
        Canl=new Boton("Cancelar");
        Canl.setBounds(20,210,100,30);
        Canl.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(Canl);
        
        setResizable(false);
        setTitle("Buscar Libro");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        Buscarl.addActionListener(this);
        Canl.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Buscarl){
            titleBuscar=busL.getText();
            //obcui1=Integer.parseInt(obcui);
            for(int j=0;j<Manejo_Arrays.libros.length;j++){
            if(Manejo_Arrays.libros[j]!=null){
                if(titleBuscar.equals((Manejo_Arrays.libros[j].getTitulo()))){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    posL=j;
                    setVisible(false);
                    InternaEliminarL il1=new InternaEliminarL(posL); //CLase 
                    
                    break;
                }/*else{
                    JOptionPane.showMessageDialog(null,"El registro no existe","Error",JOptionPane.WARNING_MESSAGE);
                    break;
                }*/
            }
            }
            //setVisible(false);
            }
            if(e.getSource()==Canl){
                setVisible(false);
                
            }
        }
        
       class InternaEliminarL extends JDialog implements ActionListener{
        public Boton eliL;
        public Boton cancl;
        
        String autL;
        String titleL;
        int edicL;
        String claveL;
        String descripL;
        String temL;
        int copL;
        int dispoL;
        
        String autAux;
        String titleAux;
        int ediAux;
        String clavAux;
        String descripAux;
        String temAux;
        int copAux;
        int dispoAux;
        
        int poslAux;
        
        public InternaEliminarL(int Pos){
        this.poslAux=Pos;
        
        getContentPane().setLayout(null);
                
        
        eliL=new Boton("Eliminar");
        eliL.setBounds(580,400,90,30);
        eliL.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(eliL);
            
        cancl=new Boton("Cancelar");
        cancl.setBounds(20,400,90,30);
        cancl.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(cancl);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.libros[poslAux].getAutor());
        aut1.setEditable(false);
        
        getContentPane().add(aut);
        getContentPane().add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        title1.setText(Manejo_Arrays.libros[poslAux].getTitulo());
        title1.setEditable(false);
        
        getContentPane().add(title);
        getContentPane().add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic1.setText(Integer.toString(Manejo_Arrays.libros[poslAux].getEdicion()));
        edic1.setEditable(false);
        
        getContentPane().add(edic);
        getContentPane().add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave1.setText(Manejo_Arrays.libros[poslAux].getClave());
        clave1.setEditable(false);
        
        getContentPane().add(clave);
        getContentPane().add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip1.setText(Manejo_Arrays.libros[poslAux].getDescripcion());
        descrip1.setEditable(false);
        
        getContentPane().add(descrip);
        getContentPane().add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem1.setText(Manejo_Arrays.libros[poslAux].getTema());
        tem1.setEditable(false);
        
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.libros[poslAux].getCopia()));
        cop1.setEditable(false);
        
        getContentPane().add(cop);
        getContentPane().add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo1.setText(Integer.toString(Manejo_Arrays.libros[poslAux].getDisponible()));
        dispo1.setEditable(false);
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        setLayout(null);
        setBounds(100,100,700,500);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Libro");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        eliL.addActionListener(this);
        cancl.addActionListener(this);
    
        }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==eliL){
                    if(poslAux>=0){//Voy a comprobar que el registro exista
                    
                    Manejo_Arrays.libros[poslAux]=null;
                    for(int k=poslAux;k<Administrador.contadorlibro;k++){//Voy a correr espacioes
                        Manejo_Arrays.libros[k]=Manejo_Arrays.libros[k+1]; //asigno los datos de k+1 a una poscion anterior
                        Manejo_Arrays.libros[k+1]=null;//hago nulo los datos k+1 para que no salga 
                        Administrador.contadorlibro=Administrador.contadorlibro-(1);
                                   
                    }
                }
                
                JOptionPane.showMessageDialog(null,"El Registro ha sido elimininado");
                setVisible(false);
            }
                if(e.getSource()==cancl){
                    setVisible(false);
                    JOptionPane.showMessageDialog(null,"La accion ha sido cancelada");
                }
            }
                    
       }
       
    
}
    class EliminarRevista extends JDialog implements ActionListener{
    public Boton Buscarr;
    public Boton Canr;
    
    JTextField busR;
    JLabel menr;
    
    public String titleR;
    
    public int posR;
    public int posr;
    public EliminarRevista(){
        getContentPane().setLayout(null);
        
        menr=new JLabel();
        menr.setBounds(20,20,200,30);
        menr.setFont(new java.awt.Font("Times New Roman", 1, 14));
        menr.setText("Ingrese El Titulo de la Revista");
        getContentPane().add(menr);
        
        busR=new JTextField();
        busR.setBounds(20,55,300,30);
        busR.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(busR);
        
        Buscarr=new Boton("Buscar");
        Buscarr.setBounds(275,210,100,30);
        Buscarr.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(Buscarr);
        
        Canr=new Boton("Cancelar");
        Canr.setBounds(20,210,100,30);
        Canr.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(Canr);
        
        setResizable(false);
        setTitle("Buscar Usuario");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        Buscarr.addActionListener(this);
        Canr.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Buscarr){
                titleR=busR.getText();
                //obcui1=Integer.parseInt(obcui);
                for(int j=0;j<Manejo_Arrays.revistas.length;j++){
                if(Manejo_Arrays.revistas[j]!=null){
                if(titleR.equals(Manejo_Arrays.revistas[j].getTitulo())){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    posR=j;
                    InternaEliminarRevi ir1=new InternaEliminarRevi(posR);
                    setVisible(false);
                    break;
                }/*else{
                    JOptionPane.showMessageDialog(null,"El registro no existe","Error",JOptionPane.WARNING_MESSAGE);
                    break;
                }*/
            }
            }
                
            }
            if(e.getSource()==Canr){
                setVisible(false);
            }
        }
        
    //clase internas
        
        class InternaEliminarRevi extends JDialog implements ActionListener{
        public Boton eliR;
        public Boton cancr;
        
        String autR;
        String titleR;
        int edicR;
        String claveR;
        String descripR;
        String temR;
        int copR;
        int dispoR;
        String frecR;
        int ejemplR;
        
        
        /*String autAux;
        String titleAux;
        int ediAux;
        String clavAux;
        String descripAux;
        String temAux;
        int copAux;
        int dispoAux;
        String frecAux;
        int ejemplAux;*/
        
        int posrAux;
        
        public InternaEliminarRevi(int Pos){
        this.posrAux=Pos;
        
        getContentPane().setLayout(null);
                
        /*autAux=Manejo_Arrays.revistas[posrAux].getAutor();
        titleAux=Manejo_Arrays.revistas[posrAux].getTitulo();
        ediAux=Manejo_Arrays.revistas[posrAux].getEdicion();
        clavAux=Manejo_Arrays.revistas[posrAux].getClave();
        descripAux=Manejo_Arrays.revistas[posrAux].getDescripcion();
        temAux=Manejo_Arrays.revistas[posrAux].getTema();
        copAux=Manejo_Arrays.revistas[posrAux].getCopia();
        dispoAux=Manejo_Arrays.revistas[posrAux].getDisponible();
        frecAux=Manejo_Arrays.revistas[posrAux].getFrecuencia();
        ejemplAux=Manejo_Arrays.revistas[posrAux].getEjemplar();*/
        
        eliR=new Boton("Eliminar");
        eliR.setBounds(580,500,90,30);
        eliR.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(eliR);
            
        cancr=new Boton("Cancelar");
        cancr.setBounds(20,500,90,30);
        cancr.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(cancr);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.revistas[posrAux].getAutor());
        aut1.setEditable(false);
        
        getContentPane().add(aut);
        getContentPane().add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        title1.setText(Manejo_Arrays.revistas[posrAux].getTitulo());
        title1.setEditable(false);
        getContentPane().add(title);
        getContentPane().add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getEdicion()));
        edic1.setEditable(false);
        
        getContentPane().add(edic);
        getContentPane().add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave1.setText(Manejo_Arrays.revistas[posrAux].getClave());
        clave1.setEditable(false);
        
        getContentPane().add(clave);
        getContentPane().add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip1.setText(Manejo_Arrays.revistas[posrAux].getDescripcion());
        descrip1.setEditable(false);
        getContentPane().add(descrip);
        getContentPane().add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem1.setText(Manejo_Arrays.revistas[posrAux].getTema());
        tem1.setEditable(false);
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getCopia()));
        cop1.setEditable(false);
        getContentPane().add(cop);
        getContentPane().add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getDisponible()));
        dispo1.setEditable(false);
        
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        //parte de frecuencia
        frec=new JLabel();
        frec.setBounds(30,380,70,30);
        frec.setFont(new java.awt.Font("Perpetua", 1, 13));
        frec.setText("Frecuencia");
        
        frec1=new JTextField();
        frec1.setBounds(30,410,250,30);
        frec1.setFont(new java.awt.Font("Perpetua", 1, 13));
        frec1.setText(Manejo_Arrays.revistas[posrAux].getFrecuencia());
        frec1.setEditable(false);
        getContentPane().add(frec);
        getContentPane().add(frec1);
        
        //Parte de ejemplares
        ejempl=new JLabel();
        ejempl.setBounds(350,380,70,30);
        ejempl.setFont(new java.awt.Font("Perpetua", 1, 13));
        ejempl.setText("Ejemplares");
        
        ejempl1=new JTextField();
        ejempl1.setBounds(350,410,250,30);
        ejempl1.setFont(new java.awt.Font("Perpetua", 1, 13));
        ejempl1.setText(Integer.toString(Manejo_Arrays.revistas[posrAux].getEjemplar()));
        ejempl1.setEditable(false);
        getContentPane().add(ejempl);
        getContentPane().add(ejempl1);
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Tesis");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        eliR.addActionListener(this);
        cancr.addActionListener(this);
    
    
}

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==eliR){
                       if(posrAux>=0){//Voy a comprobar que el registro exista
                    
                    Manejo_Arrays.revistas[posrAux]=null;
                    for(int k=posrAux;k<Administrador.contadorrevis;k++){//Voy a correr espacioes
                        Manejo_Arrays.revistas[k]=Manejo_Arrays.revistas[k+1]; //asigno los datos de k+1 a una poscion anterior
                        Manejo_Arrays.revistas[k+1]=null;//hago nulo los datos k+1 para que no salga 
                        Administrador.contadorrevis=Administrador.contadorrevis-(1);
                                   
                    }
                }
                       JOptionPane.showMessageDialog(null, "EL registro ha sido eliminado");
                       setVisible(false);
                }
                if(e.getSource()==cancr){
                    setVisible(false);
                }
            }
        }
        
    }
    class EliminarTesi extends JDialog implements ActionListener{
    public Boton buscarT;
    public Boton canT;
    JTextField busT;
    JLabel ment;
    
    public String titleT;
    public int posT;
    public int post;
    public EliminarTesi(){
        getContentPane().setLayout(null);
        
        ment=new JLabel();
        ment.setBounds(20,20,200,30);
        ment.setFont(new java.awt.Font("Times New Roman", 1, 14));
        ment.setText("Ingrese El Titulo de la Tesi");
        getContentPane().add(ment);
        
        busT=new JTextField();
        busT.setBounds(20,55,300,30);
        busT.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(busT);
        
        buscarT=new Boton("Buscar");
        buscarT.setBounds(275,210,100,30);
        buscarT.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(buscarT);
        
        canT=new Boton("Cancelar");
        canT.setBounds(20,210,100,30);
        canT.setFont(new java.awt.Font("Perpetua", 1, 14));
        getContentPane().add(canT);
        
        setResizable(false);
        setTitle("Buscar Usuario");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        buscarT.addActionListener(this);
        canT.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buscarT){
                titleT=busT.getText();
                //obcui1=Integer.parseInt(obcui);
                for(int j=0;j<Manejo_Arrays.tesis.length;j++){
                if(Manejo_Arrays.tesis[j]!=null){
                if(titleT.equals(Manejo_Arrays.tesis[j].getTitulo())){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    posT=j;
                    InternaEliminarTesi it=new InternaEliminarTesi(posT);
                    setVisible(false);
                    break;
                }/*else{
                    JOptionPane.showMessageDialog(null,"El registro no existe","Error",JOptionPane.WARNING_MESSAGE);
                    break;
                }*/
            }
            }
                
            }
            if(e.getSource()==canT){
                setVisible(false);
            }
            
        }
        
        //clase interna
        class InternaEliminarTesi extends JDialog implements ActionListener{
        public Boton eliT;
        public Boton canct;
        
        String autT;
        String titleT;
        int edicT;
        String claveT;
        String descripT;
        String temT;
        int copT;
        int dispoT;
        String areT;
        
        /*String autAux;
        String titleAux;
        int ediAux;
        String clavAux;
        String descripAux;
        String temAux;
        int copAux;
        int dispoAux;
        String areAux;*/
        
        int postAux;
        
        public InternaEliminarTesi(int Pos){
        this.postAux=Pos;
        
        getContentPane().setLayout(null);
                
        /*autAux=Manejo_Arrays.tesis[postAux].getAutor();
        titleAux=Manejo_Arrays.tesis[postAux].getTitulo();
        ediAux=Manejo_Arrays.tesis[postAux].getEdicion();
        clavAux=Manejo_Arrays.tesis[postAux].getClave();
        descripAux=Manejo_Arrays.tesis[postAux].getDescripcion();
        temAux=Manejo_Arrays.tesis[postAux].getTema();
        copAux=Manejo_Arrays.tesis[postAux].getCopia();
        dispoAux=Manejo_Arrays.tesis[postAux].getDisponible();
        areAux=Manejo_Arrays.tesis[postAux].getArea();*/
        
        eliT=new Boton("Eliminar");
        eliT.setBounds(580,500,90,30);
        eliT.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(eliT);
            
        canct=new Boton("Cancelar");
        canct.setBounds(20,500,90,30);
        canct.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(canct);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.tesis[postAux].getAutor());
        aut1.setEditable(false);
        
        getContentPane().add(aut);
        getContentPane().add(aut1);
        
        //Parte del titulo
        title=new JLabel();
        title.setBounds(350,30,50,30);
        title.setFont(new java.awt.Font("Perpetua", 1, 13));
        title.setText("Titulo");
        
        title1=new JTextField();
        title1.setBounds(350,60,250,30);
        title1.setFont(new java.awt.Font("Perpetua", 1, 13));
        title1.setText(Manejo_Arrays.tesis[postAux].getTitulo());
        title1.setEditable(false);
        getContentPane().add(title);
        getContentPane().add(title1);
        
        //Parte de la edicion
        
        edic=new JLabel();
        edic.setBounds(30,140,70,30);
        edic.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic.setText("Edicion");
        
        edic1=new JTextField();
        edic1.setBounds(30,170,250,30);
        edic1.setFont(new java.awt.Font("Perpetua", 1, 13));
        edic1.setText(Integer.toString(Manejo_Arrays.tesis[postAux].getEdicion()));
        edic1.setEditable(false);
        getContentPane().add(edic);
        getContentPane().add(edic1);
        
        //Parte de la palabra clave
        clave=new JLabel();
        clave.setBounds(350,140,100,30);
        clave.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave.setText("Palabras Clave");
        
        clave1=new JTextField();
        clave1.setBounds(350,170,250,30);
        clave1.setFont(new java.awt.Font("Perpetua", 1, 13));
        clave1.setText(Manejo_Arrays.tesis[postAux].getClave());
        clave1.setEditable(false);
        getContentPane().add(clave);
        getContentPane().add(clave1);
        
        //Parte de la descripcion
        descrip=new JLabel();
        descrip.setBounds(30,220,70,30);
        descrip.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip.setText("Descripcion");
        
        descrip1=new JTextField();
        descrip1.setBounds(30,250,250,30);
        descrip1.setFont(new java.awt.Font("Perpetua", 1, 13));
        descrip1.setText(Manejo_Arrays.tesis[postAux].getDescripcion());
        descrip1.setEditable(false);
        getContentPane().add(descrip);
        getContentPane().add(descrip1);
        
        //Parte de tema
        tem=new JLabel();
        tem.setBounds(350,220,50,30);
        tem.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem.setText("Temas");
        
        tem1=new JTextField();
        tem1.setBounds(350,250,250,30);
        tem1.setFont(new java.awt.Font("Perpetua", 1, 13));
        tem1.setText(Manejo_Arrays.tesis[postAux].getTema());
        tem1.setEditable(false);
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.tesis[postAux].getCopia()));
        cop1.setEditable(false);
        getContentPane().add(cop);
        getContentPane().add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,300,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,330,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo1.setText(Integer.toString(Manejo_Arrays.tesis[postAux].getDisponible()));
        dispo1.setEditable(false);
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        are=new JLabel();
        are.setBounds(30,380,50,30);
        are.setFont(new java.awt.Font("Perpetua", 1, 13));
        are.setText("Area");
        
        are1=new JTextField();
        are1.setBounds(30,410,250,30);
        are1.setFont(new java.awt.Font("Perpetua", 1, 13));
        are1.setText(Manejo_Arrays.tesis[postAux].getArea());
        are1.setEditable(false);
        getContentPane().add(are);
        getContentPane().add(are1);
        
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Eliminar Tesi");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        eliT.addActionListener(this);
        canct.addActionListener(this);
        
    }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==eliT){
                          if(postAux>=0){//Voy a comprobar que el registro exista
                    
                    Manejo_Arrays.tesis[postAux]=null;
                    for(int k=postAux;k<Administrador.contadortesi;k++){//Voy a correr espacioes
                        Manejo_Arrays.tesis[k]=Manejo_Arrays.tesis[k+1]; //asigno los datos de k+1 a una poscion anterior
                        Manejo_Arrays.tesis[k+1]=null;//hago nulo los datos k+1 para que no salga 
                        Administrador.contadortesi=Administrador.contadortesi-(1);
                                   
                    }
                }
                          JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
                          setVisible(false);
                }
                if(e.getSource()==canct){
                    setVisible(false);
                }
            }
        
    
}
    }
}



//PARA EL ORDEN
 
class OrdenAscendente implements Comparator<Usuarios>{ //USADO PARA ORDENAR LOS USURIOS DE FORMA ASCENDENTE

        @Override
        public int compare(Usuarios o1, Usuarios o2) {
            if(o1.getId()>o2.getId()){
                return 1;
            }
            if(o1.getId()<o2.getId()){
                return -1;
            }
            return 0;
        }
    }
    class OrdenDescendente implements Comparator<Usuarios>{ //USADO PARA ORDENAR LOS USURIOS DE FORMA DESCENDENTE

        @Override
        public int compare(Usuarios o1, Usuarios o2) {
            if(o2.getId()<o1.getId()){
                return -1;
            }
            if(o2.getId()>o1.getId()){
                return 1;
            }
            return 0;
        }
    }


        /*public void IngresarId(){
        modifcui=JOptionPane.showInputDialog(null, "Ingrese el CUI a Buscar");
        if(modifcui!=null){
        Modifcui=Integer.parseInt(modifcui);
        
        for(int j=0;j<Manejo_Arrays.usuarios.length;j++){
            if(Manejo_Arrays.usuarios[j]!=null){
                if(Modifcui==Manejo_Arrays.usuarios[j].getId()){
                    JOptionPane.showMessageDialog(null," Encontrado ");
                    obtener=j;
                    break;
                    
                    //break;
                }else{
                    JOptionPane.showMessageDialog(null,"El registro no existe,Cierre la siguiente ventana e intentelo nuevamente","Error",JOptionPane.WARNING_MESSAGE);
                    setVisible(false);
                    break;
                }
            }
        }
    }else{
            JOptionPane.showMessageDialog(null,"Presione aceptar y ciere la siguiente ventana ","Informacion",JOptionPane.INFORMATION_MESSAGE);
        }
        
 }*/




       



