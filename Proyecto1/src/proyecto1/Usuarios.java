//CLASE PARA LOS USUARIOS
package proyecto1;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import javax.swing.SwingConstants;
import javax.swing.*;

public class Usuarios{
    
    
   
    
    
    
    private long id;
    private String nombre;
    private String apellido;
    private String user;
    private String rol;
    private String contraseña;
    private String contraseña2;
    
    
    
    //parte de la ventana
    private String Usuario;
    private String Password;
    public Boton buscar;
    public Boton mibiblio;
    public Boton logout;
    
    JFrame VenUser;
    
    JTextField titulo;
    JLabel titulo1;
    JTextField autor;
    JLabel autor1;
    
    JLabel usr;
    
    JLabel logo1;
    JLabel ico1;
    
    private String obtenerAutor;
    private String obtenerTitle;
    private int ObtenerPos;
    static JTable mitabla;
    static JScrollPane scroll;
    
    
  
    
    
    public Usuarios(){
        this.id=0;
        this.nombre="";
        this.apellido="";
        this.user="";
        this.rol="";
        this.contraseña=""; 
        this.contraseña2="";
        
    }
    //SOBRE CARGA DE METODOS
    
    public Usuarios(int id2,String nombre1,
            String apellido1,String user1,String rol1,String contraseña1,String contraseña3){
        id=id2;
        nombre=nombre1;
        apellido=apellido1;
        user=user1;
        rol=rol1;
        contraseña=contraseña1;
        contraseña2=contraseña3;
        
    }
    
     public String getMostrar(){
        return " Id: "+id+";     Nombre: "+nombre+";    "+" Apellido: "+apellido+";    "+"Usuario: "+user+";    "+"Roll: "+rol+"\n\n";
    }
   
    public void SetModificar(int id2,String nombre1,
            String apellido1,String user1,String rol1,String contraseña1){
        this.id=id2;
        this.nombre=nombre1;
        this.apellido=apellido1;
        this.user=user1;
        this.rol=rol1;
        this.contraseña=contraseña1;
        
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
        
    }
    
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user=user;
    }
    
    public String getRol(){
        return rol;
    }
    public void setRol(String rol){
        this.rol=rol;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }
    public void setContraseña2(String contraseña2){
        this.contraseña2=contraseña2;
    }
    public String getContraseña2(){
        return contraseña2;
    }
}

    
  
    /*public void MostrarPantalla(String usuario,String password){
        this.Usuario=usuario;
        this.Password=password;  
        //LOGO DEL USUc
        logo1=new JLabel();
        logo1.setBounds(150,50,200,200);
        logo1.setVerticalAlignment(SwingConstants.CENTER);
        logo1.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon ima3=new ImageIcon("usac.png");
        logo1.setIcon(ima3);
        add(logo1);
        
        usr=new JLabel();
        usr.setBounds(650,250,70,30);
        usr.setVerticalAlignment(SwingConstants.CENTER);
        usr.setHorizontalAlignment(SwingConstants.CENTER);
        usr.setText(Usuario);
        usr.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 16));
        add(usr);
        
        //LOGO DE SESION
        ico1=new JLabel();
        ico1.setBounds(600,50,200,200);
        ico1.setVerticalAlignment(SwingConstants.CENTER);
        ico1.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon ima4=new ImageIcon("logo4.jpg");
        ico1.setIcon(ima4);
        add(ico1);
        
        //BOTON LOGOUT
        logout=new Boton("Logout");
        logout.setBounds(1150,50,100,40);
        logout.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(logout);
        
        //BOTON BUSCAR
        buscar=new Boton("Buscar");
        buscar.setBounds(70,300,100,40);
        buscar.setFont(new java.awt.Font("Perpetua", 1, 13));
        add(buscar);
        
        //LOS CAMPOS DE TEXTO 
        titulo1=new JLabel();
        titulo1.setText("Titulo");
        titulo1.setBounds(250,270,100,30);
        titulo1.setVerticalAlignment(SwingConstants.CENTER);
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setFont(new java.awt.Font("Century Schoolbook", 1, 18));
        add(titulo1);
        
        titulo=new JTextField();
        titulo.setBounds(250,300,350,30);
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 13));
        add(titulo);
        
        
        autor1=new JLabel();
        autor1.setText("Autor");
        autor1.setBounds(700,270,100,30);
        autor1.setVerticalAlignment(SwingConstants.CENTER);
        autor1.setHorizontalAlignment(SwingConstants.CENTER);
        autor1.setFont(new java.awt.Font("Century Schoolbook", 1, 18));
        add(autor1);
        
        autor=new JTextField();
        autor.setBounds(700,300,350,30);
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 13));
        add(autor);
        
        mibiblio=new Boton("Mi Biblioteca");
        mibiblio.setBounds(1200,300,150,40);
        add(mibiblio);
        
        String titulos[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles"};
            
        String[] campos[]=obtenerdatos1();
        
        Usuarios.mitabla=new JTable(campos,titulos);
        Usuarios.mitabla.setEnabled(false);
        Usuarios.mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Usuarios.mitabla.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 13));
        Usuarios.scroll=new JScrollPane(Usuarios.mitabla);
        Usuarios.scroll.setBounds(50,500,1200,200);
        Usuarios.scroll.setViewportView(Usuarios.mitabla);
        
        
        
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("Administrador");
        this.getContentPane().setBackground(Color.WHITE);
        
        //AGREGAR ACCIONES BOTONES
        buscar.addActionListener(this);
        logout.addActionListener(this);
        mibiblio.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscar){
            obtenerAutor=autor.getText();
            obtenerTitle=titulo.getText();
            
            //Verificar si existe el registro en libros, revistas o tesis
            
            
            //verificar para libros
            
            for(int j=0;j<Manejo_Arrays.libros.length;j++){
                    if(Manejo_Arrays.libros[j]!=null){
                        if(obtenerAutor.equals(Manejo_Arrays.libros[j].getAutor()) || obtenerTitle.equals(Manejo_Arrays.libros[j].getTitulo())){
                            //Libro=true;
                            
                        }
                    }
                }
            
        }
        if(e.getSource()==mibiblio){
            //MostrarTodos mt1=new MostrarTodos();
        }
        if(e.getSource()==logout){
            Principal p1=new Principal();
            this.dispose();
        }
    }
    private String [][] obtenerdatos1(){
        String campos [][]=new String[1][8];
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
class TablaUsuario{
    
    
    static JTable mitabla;
    JScrollPane scroll;
    JFrame frame;
    public TablaUsuario(){
        
        frame=new JFrame();
        
        
            String titulos[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles"};
            
             String[] campos[]=obtenerdatos1();
            
            
            
            
            mitabla=new JTable(campos,titulos);
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 13));
            scroll=new JScrollPane(mitabla);
            scroll.setBounds(50,50,1200,250);
            scroll.setViewportView(mitabla);
            
            
            frame.add(scroll);
            
            //add(mitabla);
           
           frame.setLayout(null);
           frame.setExtendedState(MAXIMIZED_BOTH);//maxima
           frame.setVisible(true);
           frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Posiblemente cambiarlo
           frame.setTitle("BIBLIOTECA");
           frame.getContentPane().setBackground(Color.WHITE); 
        
    }
   
    private String [][] obtenerdatos1(){
        String campos [][]=new String[1][8];
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






    
    
/*}
class AgregarLibro extends JDialog implements ActionListener{
    private int ObtenerLi;
    
    public Boton aL;
    //public Boton presL;
    
    String autL;
    String titleL;
    int edicL;
    String claveL;
    String descripL;
    String temL;
    int copL;
    int dispoL;
             
    
    public AgregarLibro(int ObtenerLi1){
        
        this.ObtenerLi=ObtenerLi1;
        
        
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.WHITE);
                
        
        aL=new Boton("Añadir A Mi Biblioteca");
        aL.setBounds(530,400,150,30);
        aL.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(aL);
            
       // presL=new Boton("Hacer Prestamo");
       // presL.setBounds(20,400,150,30);
       // presL.setFont(new java.awt.Font("Perpetua", 1, 13));
       // getContentPane().add(presL);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.libros[ObtenerLi].getAutor());
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
        title1.setText(Manejo_Arrays.libros[ObtenerLi].getTitulo());
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
        edic1.setText(Integer.toString(Manejo_Arrays.libros[ObtenerLi].getEdicion()));
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
        clave1.setText(Manejo_Arrays.libros[ObtenerLi].getClave());
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
        descrip1.setText(Manejo_Arrays.libros[ObtenerLi].getDescripcion());
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
        tem1.setText(Manejo_Arrays.libros[ObtenerLi].getTema());
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
        cop1.setText(Integer.toString(Manejo_Arrays.libros[ObtenerLi].getCopia()));
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
        dispo1.setText(Integer.toString(Manejo_Arrays.libros[ObtenerLi].getDisponible()));
        dispo1.setEditable(false);
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        setLayout(null);
        setBounds(100,100,700,500);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Libro");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aL.addActionListener(this);
       // presL.addActionListener(this);
    
        }
    

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aL){
                autL=aut1.getText();
                titleL=title1.getText();
                edicL=Integer.parseInt(edic1.getText());
                claveL=clave1.getText();
                descripL=descrip1.getText();
                temL=tem1.getText();
                copL=Integer.parseInt(cop1.getText());
                dispoL=Integer.parseInt(dispo1.getText());
                
                Manejo_Arrays.mibibliotecaL[Usuarios.agreLi]=new Libro(autL,titleL,edicL,claveL,descripL,temL,copL,dispoL);
            }
        }
    }*/







/*class MostrarTodos extends JFrame{
    JTextArea jm;
    JScrollPane jsp; 
    
    public MostrarTodos(){
        jm=new JTextArea();
        jm.setEditable(false);
        jm.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jsp=new JScrollPane(jm);
        jsp.setSize(1360,670);
        add(jsp);
        
        for(int j=0;j<Manejo_Arrays.mibibliotecaL.length;j++){
            if(Manejo_Arrays.mibibliotecaL[j]!=null){
                jm.append("Libro:   "+ Manejo_Arrays.mibibliotecaL[j].getUser());
            }
        }
        
        
        
        
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("BIBLIOTECA");
        getContentPane().setBackground(Color.WHITE);
        
    }
}*/
//HASTA AQUI ESTARIA BIEN TODO POR SI NO LOGRO HACERLO CON TABLAS






























   /*class OrdenAscendente implements Comparator<Usuarios>{

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

}*/  
    /*public Usuarios(String usuario,String password){
        
        VenUser=new JFrame();
        this.Usuario=usuario;
        this.Password=password;
        
        //LOGO DEL USUc
        logo1=new JLabel();
        logo1.setBounds(150,50,200,200);
        logo1.setVerticalAlignment(SwingConstants.CENTER);
        logo1.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon ima3=new ImageIcon("usac.png");
        logo1.setIcon(ima3);
        VenUser.add(logo1);
        
        usr=new JLabel();
        usr.setBounds(650,250,70,30);
        usr.setVerticalAlignment(SwingConstants.CENTER);
        usr.setHorizontalAlignment(SwingConstants.CENTER);
        usr.setText(Usuario);
        usr.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 16));
        VenUser.add(usr);
        
        //LOGO DE SESION
        ico1=new JLabel();
        ico1.setBounds(600,50,200,200);
        ico1.setVerticalAlignment(SwingConstants.CENTER);
        ico1.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon ima4=new ImageIcon("logo4.jpg");
        ico1.setIcon(ima4);
        VenUser.add(ico1);
        
        //BOTON LOGOUT
        logout=new Boton("Logout");
        logout.setBounds(1150,50,100,40);
        logout.setFont(new java.awt.Font("Perpetua", 1, 13));
        VenUser.add(logout);
        
        //BOTON BUSCAR
        buscar=new Boton("Buscar");
        buscar.setBounds(70,300,100,40);
        buscar.setFont(new java.awt.Font("Perpetua", 1, 13));
        VenUser.add(buscar);
        
        //LOS CAMPOS DE TEXTO 
        titulo1=new JLabel();
        titulo1.setText("Titulo");
        titulo1.setBounds(250,270,100,30);
        titulo1.setVerticalAlignment(SwingConstants.CENTER);
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setFont(new java.awt.Font("Century Schoolbook", 1, 18));
        VenUser.add(titulo1);
        
        titulo=new JTextField();
        titulo.setBounds(250,300,350,30);
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 13));
        VenUser.add(titulo);
        
        
        autor1=new JLabel();
        autor1.setText("Autor");
        autor1.setBounds(700,270,100,30);
        autor1.setVerticalAlignment(SwingConstants.CENTER);
        autor1.setHorizontalAlignment(SwingConstants.CENTER);
        autor1.setFont(new java.awt.Font("Century Schoolbook", 1, 18));
        VenUser.add(autor1);
        
        autor=new JTextField();
        autor.setBounds(700,300,350,30);
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 13));
        VenUser.add(autor);
        
        mibiblio=new Boton("Mi Biblioteca");
        mibiblio.setBounds(1200,300,150,40);
        VenUser.add(mibiblio);
        
        VenUser.setBackground(Color.WHITE);
        VenUser.setLayout(null);
        VenUser.setExtendedState(MAXIMIZED_BOTH);//maxima
        VenUser.setVisible(true);
        VenUser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Posiblemente cambiarlo
        VenUser.setTitle("Usuario");
        //VenUser.this.getContentPane().setBackground(Color.WHITE);
        
        //AGREGAR ACCIONES BOTONES
        buscar.addActionListener(this);
        logout.addActionListener(this);
        mibiblio.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscar){
            
            obtenerAutor=autor.getText();
            obtenerTitle=titulo.getText();
            
            //Verificar si existe el registro en libros, revistas o tesis
            
            
            //verificar para libros
            
            for(int j=0;j<Manejo_Arrays.libros.length;j++){
                    if(Manejo_Arrays.libros[j]!=null){
                        if(obtenerAutor.equals(Manejo_Arrays.libros[j].getAutor()) && obtenerTitle.equals(Manejo_Arrays.libros[j].getTitulo())){
                            //Libro=true;
                            ObtenerPos=j;
                            AgregarLibro al=new AgregarLibro(ObtenerPos);
                            break;
                        }
                    }
                }
            
            
            
            
            
            
            
            
            for(int i=0;i<Manejo_Arrays.revistas.length;i++){
                    if(Manejo_Arrays.revistas[i]!=null){
                        if(obtenerAutor.equals(Manejo_Arrays.revistas[i].getAutor()) && obtenerTitle.equals(Manejo_Arrays.revistas[i].getTitulo())){
                            //Revi=true;
                            ObtenerPos=i;
                            AgregarRevista ar=new AgregarRevista(ObtenerPos);
                            break;
                        }
                    }
                }
            
            
            
            
            
            for(int a=0;a<Manejo_Arrays.tesis.length;a++){
                    if(Manejo_Arrays.tesis[a]!=null){
                        if(obtenerAutor.equals(Manejo_Arrays.tesis[a].getAutor()) && obtenerTitle.equals(Manejo_Arrays.tesis[a].getTitulo())){
                            //Tesi=true;
                            ObtenerPos=a;
                            AgregarTesi at=new AgregarTesi(ObtenerPos);
                            
                            break;
                        }
                    }
                }
            
            
            
            
            
         
        }
        if(e.getSource()==logout){
            Principal p1=new Principal();
        }
        if(e.getSource()==mibiblio){
            //MostrarTodos mt=new MostrarTodos();
        }
    }
    
    
    class AgregarLibro extends JDialog implements ActionListener{
    private int ObtenerLi;
    
    public Boton aL;
    //public Boton presL;
    
    String autL;
    String titleL;
    int edicL;
    String claveL;
    String descripL;
    String temL;
    int copL;
    int dispoL;
             
    
    public AgregarLibro(int ObtenerLi1){
        
        this.ObtenerLi=ObtenerLi1;
        
        
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.WHITE);
                
        
        aL=new Boton("Añadir A Mi Biblioteca");
        aL.setBounds(530,400,150,30);
        aL.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(aL);
            
       // presL=new Boton("Hacer Prestamo");
       // presL.setBounds(20,400,150,30);
       // presL.setFont(new java.awt.Font("Perpetua", 1, 13));
       // getContentPane().add(presL);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.libros[ObtenerLi].getAutor());
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
        title1.setText(Manejo_Arrays.libros[ObtenerLi].getTitulo());
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
        edic1.setText(Integer.toString(Manejo_Arrays.libros[ObtenerLi].getEdicion()));
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
        clave1.setText(Manejo_Arrays.libros[ObtenerLi].getClave());
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
        descrip1.setText(Manejo_Arrays.libros[ObtenerLi].getDescripcion());
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
        tem1.setText(Manejo_Arrays.libros[ObtenerLi].getTema());
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
        cop1.setText(Integer.toString(Manejo_Arrays.libros[ObtenerLi].getCopia()));
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
        dispo1.setText(Integer.toString(Manejo_Arrays.libros[ObtenerLi].getDisponible()));
        dispo1.setEditable(false);
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        setLayout(null);
        setBounds(100,100,700,500);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Libro");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aL.addActionListener(this);
       // presL.addActionListener(this);
    
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aL){
                autL=aut1.getText();
                titleL=title1.getText();
                edicL=Integer.parseInt(edic1.getText());
                claveL=clave1.getText();
                descripL=descrip1.getText();
                temL=tem1.getText();
                copL=Integer.parseInt(cop1.getText());
                dispoL=Integer.parseInt(dispo1.getText());
                
                //suario.mibibliotecaL[Usuario.agreLi]=new Libro(autL,titleL,edicL,claveL,descripL,temL,copL,dispoL);
                
                
                
            }
            
        }
        
        
    }
    
        class AgregarRevista extends JDialog implements ActionListener{
        public Boton aR;
        //public Boton presR;
        
        String autR;
        String titleR;
        int edicR;
        String claveR;
        String descripR;
        String temR;
        //int copR;
        //int dispoR;
        String frecR;
        int ejemplR;
        
        
        
        
        int ObtenerR;
        
        public AgregarRevista(int ObtenerR1){
        this.ObtenerR=ObtenerR1;
        
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.WHITE);
                
        
        aR=new Boton("Añadir A Mi Biblioteca");
        aR.setBounds(530,500,150,30);
        aR.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(aR);
            
        //presR=new Boton("Hacer Prestamo");
        //presR.setBounds(20,500,150,30);
        //presR.setFont(new java.awt.Font("Perpetua", 1, 13));
        //getContentPane().add(presR);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.revistas[ObtenerR].getAutor());
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
        title1.setText(Manejo_Arrays.revistas[ObtenerR].getTitulo());
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
        edic1.setText(Integer.toString(Manejo_Arrays.revistas[ObtenerR].getEdicion()));
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
        clave1.setText(Manejo_Arrays.revistas[ObtenerR].getClave());
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
        descrip1.setText(Manejo_Arrays.revistas[ObtenerR].getDescripcion());
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
        tem1.setText(Manejo_Arrays.revistas[ObtenerR].getTema());
        tem1.setEditable(false);
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        frec=new JLabel();
        frec.setBounds(30,300,70,30);
        frec.setFont(new java.awt.Font("Perpetua", 1, 13));
        frec.setText("Frecuencia");
        
        frec1=new JTextField();
        frec1.setBounds(30,330,250,30);
        frec1.setFont(new java.awt.Font("Perpetua", 1, 13));
        frec1.setText(Manejo_Arrays.revistas[ObtenerR].getFrecuencia());
        frec1.setEditable(false);
        getContentPane().add(frec);
        getContentPane().add(frec1);
        
        //Parte de ejemplares
        ejempl=new JLabel();
        ejempl.setBounds(350,300,70,30);
        ejempl.setFont(new java.awt.Font("Perpetua", 1, 13));
        ejempl.setText("Ejemplares");
        
        ejempl1=new JTextField();
        ejempl1.setBounds(350,330,250,30);
        ejempl1.setFont(new java.awt.Font("Perpetua", 1, 13));
        ejempl1.setText(Integer.toString(Manejo_Arrays.revistas[ObtenerR].getEjemplar()));
        ejempl1.setEditable(false);
        getContentPane().add(ejempl);
        getContentPane().add(ejempl1);
        
        //parte de las copias disponibles;
        /*cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.revistas[ObtenerR].getCopia()));
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
        dispo1.setText(Integer.toString(Manejo_Arrays.revistas[ObtenerR].getDisponible()));
        dispo1.setEditable(false);
        
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        //parte de frecuencia
        
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Modificar Tesis");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aR.addActionListener(this);
        //presR.addActionListener(this);
    
    
}

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    
}
        class AgregarTesi extends JDialog implements ActionListener{
        public Boton aT;
       // public Boton presT;
        
        String autT;
        String titleT;
        int edicT;
        String claveT;
        String descripT;
        String temT;
        int copT;
        int dispoT;
        String areT;
        
      
        
        int ObtenerT;
        
        public AgregarTesi(int ObtenerT1){
        this.ObtenerT=ObtenerT1;
        
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.WHITE);
                
       
        
        aT=new Boton("Agregar a Mi Biblioteca");
        aT.setBounds(530,500,150,30);
        aT.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(aT);
            
       // presT=new Boton("Hacer Prestamo");
        //presT.setBounds(20,500,150,30);
        //presT.setFont(new java.awt.Font("Perpetua", 1, 13));
        //getContentPane().add(presT);
            
        
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut1.setText(Manejo_Arrays.tesis[ObtenerT].getAutor());
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
        title1.setText(Manejo_Arrays.tesis[ObtenerT].getTitulo());
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
        edic1.setText(Integer.toString(Manejo_Arrays.tesis[ObtenerT].getEdicion()));
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
        clave1.setText(Manejo_Arrays.tesis[ObtenerT].getClave());
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
        descrip1.setText(Manejo_Arrays.tesis[ObtenerT].getDescripcion());
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
        tem1.setText(Manejo_Arrays.tesis[ObtenerT].getTema());
        tem1.setEditable(false);
        getContentPane().add(tem);
        getContentPane().add(tem1);
        
        are=new JLabel();
        are.setBounds(30,300,50,30);
        are.setFont(new java.awt.Font("Perpetua", 1, 13));
        are.setText("Area");
        
        are1=new JTextField();
        are1.setBounds(30,330,250,30);
        are1.setFont(new java.awt.Font("Perpetua", 1, 13));
        are1.setText(Manejo_Arrays.tesis[ObtenerT].getArea());
        are1.setEditable(false);
        getContentPane().add(are);
        getContentPane().add(are1);
        
        //parte de las copias disponibles;
        /*cop=new JLabel();
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
        
        
        
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Eliminar Tesi");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aT.addActionListener(this);
//        presT.addActionListener(this);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }*/


/*class MostrarTodos extends JFrame{
    JTextArea jm;
    JScrollPane jsp; 
    
    public MostrarTodos(){
        jm=new JTextArea();
        jm.setEditable(false);
        jm.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jsp=new JScrollPane(jm);
        jsp.setSize(1360,670);
        add(jsp);
        
        for(int j=0;j<Usuarios.mibibliotecaL.length;j++){
            if(Usuarios.mibibliotecaL[j]!=null){
                jm.append("Libro:   "+ Usuarios.mibibliotecaL[j].getUser());
            }
        }
        
        
        
        
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("BIBLIOTECA");
        getContentPane().setBackground(Color.WHITE);
        
    }
}*/