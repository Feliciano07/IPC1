package proyecto1;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Calendar;

public class Usuario extends JFrame implements ActionListener{  
    public static String Usuarioo;
    public static String Password;
    public Boton buscar;
    public Boton mibiblio;
    public Boton logout;
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
    
    
    //control
    public static int agreLi=0;
    public static int agreRe=0;
    public static int agreTe=0;
    public static int conpres=0;
    
    public  int prestamosLibros;
    public  int prestamosRevi;
    public  int prestamosTesi;
    
    
    
    public Usuario(String usuario,String password){
        this.Usuarioo=usuario;
        this.Password=password;  
        
        
        //LOGO DEL USUc
        logo1=new JLabel();
        logo1.setBounds(150,50,200,200);
        logo1.setVerticalAlignment(SwingConstants.CENTER);
        logo1.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon ima3=new ImageIcon("logou.jpg");
        logo1.setIcon(ima3);
        add(logo1);
        
        usr=new JLabel();
        usr.setBounds(650,250,70,30);
        usr.setVerticalAlignment(SwingConstants.CENTER);
        usr.setHorizontalAlignment(SwingConstants.CENTER);
        usr.setText(Usuarioo);
        usr.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 16));
        add(usr);
        
        //LOGO DE SESION
        ico1=new JLabel();
        ico1.setBounds(600,50,200,200);
        ico1.setVerticalAlignment(SwingConstants.CENTER);
        ico1.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon ima4=new ImageIcon("usuario.jpg");
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

        
        
        
        
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("Usuario");
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
                            ObtenerPos=j;
                            AgregarLibro al=new AgregarLibro(ObtenerPos);
                            
                    }
                }
            }
            
            for(int j=0;j<Manejo_Arrays.revistas.length;j++){
                    if(Manejo_Arrays.revistas[j]!=null){
                        if(obtenerAutor.equals(Manejo_Arrays.revistas[j].getAutor()) || obtenerTitle.equals(Manejo_Arrays.revistas[j].getTitulo())){
                            ObtenerPos=j;
                            AgregarRevista ar=new AgregarRevista(ObtenerPos);
                            
                    }
                }
            }
            
            for(int j=0;j<Manejo_Arrays.tesis.length;j++){
                    if(Manejo_Arrays.tesis[j]!=null){
                        if(obtenerAutor.equals(Manejo_Arrays.tesis[j].getAutor()) || obtenerTitle.equals(Manejo_Arrays.tesis[j].getTitulo())){
                            ObtenerPos=j;
                            AgregarTesi at=new AgregarTesi(ObtenerPos);
                            
                    }
                }
            }
            autor.setText("");
            titulo.setText("");
        }   
            
            
        if(e.getSource()==mibiblio){
            MiBiblioteca mb=new MiBiblioteca();
            setVisible(false);
        }
        if(e.getSource()==logout){
            setVisible(false);
            Principal p1=new Principal();
           
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
    JLabel libro;         
    
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
        
        libro=new JLabel();
        libro.setBounds(30,410,70,50);
        libro.setFont(new java.awt.Font("Castellar", 1, 18));
        libro.setText("Libro");
        getContentPane().add(libro);
        
        
        setLayout(null);
        setBounds(100,100,700,500);
        setResizable(false);
        setVisible(true);
        setTitle("Busquedad");
        
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
                
                Manejo_Arrays.mibibliotecaL[agreLi]=new Libro(0,autL,titleL,edicL,claveL,descripL,temL,copL,dispoL);
                agreLi++;
                setVisible(false);
                autL="";
                titleL="";
                edicL=0;
                claveL="";
                descripL="";
                temL="";
                copL=0;
                dispoL=0;
                
                
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
        int copR;
        int dispoR;
        String frecR;
        int ejemplR;
        
        JLabel revista;
        
        
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
        cop=new JLabel();
        cop.setBounds(30,390,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,410,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.revistas[ObtenerR].getCopia()));
        cop1.setEditable(false);
        getContentPane().add(cop);
        getContentPane().add(cop1);
        
        //Parte de disponibles
        dispo=new JLabel();
        dispo.setBounds(350,390,70,30);
        dispo.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo.setText("Disponibles");
        
        dispo1=new JTextField();
        dispo1.setBounds(350,410,250,30);
        dispo1.setFont(new java.awt.Font("Perpetua", 1, 13));
        dispo1.setText(Integer.toString(Manejo_Arrays.revistas[ObtenerR].getDisponible()));
        dispo1.setEditable(false);
        
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        //parte de frecuencia
        
        revista=new JLabel();
        revista.setBounds(30,450,140,40);
        revista.setFont(new java.awt.Font("Castellar",1,18));
        revista.setText("Revista");
        getContentPane().add(revista);
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Busquedad");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aR.addActionListener(this);
        //presR.addActionListener(this);
    
    
}

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aR){
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
                
                Manejo_Arrays.mibibliotecaR[agreRe]=new Revista(1,autR,titleR,edicR,claveR,descripR,temR,copR,dispoR,frecR,ejemplR);
                agreRe++;
                this.dispose();
            }
            
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
        JLabel tesis;
      
        
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
        
        
        
        //parte de las copias disponibles;
        cop=new JLabel();
        cop.setBounds(30,300,50,30);
        cop.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop.setText("Copias");
        
        cop1=new JTextField();
        cop1.setBounds(30,330,250,30);
        cop1.setFont(new java.awt.Font("Perpetua", 1, 13));
        cop1.setText(Integer.toString(Manejo_Arrays.tesis[ObtenerT].getCopia()));
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
        dispo1.setText(Integer.toString(Manejo_Arrays.tesis[ObtenerT].getDisponible()));
        dispo1.setEditable(false);
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        are=new JLabel();
        are.setBounds(30,390,50,30);
        are.setFont(new java.awt.Font("Perpetua", 1, 13));
        are.setText("Area");
        
        are1=new JTextField();
        are1.setBounds(30,410,250,30);
        are1.setFont(new java.awt.Font("Perpetua", 1, 13));
        are1.setText(Manejo_Arrays.tesis[ObtenerT].getArea());
        are1.setEditable(false);
        getContentPane().add(are);
        getContentPane().add(are1);
        
        tesis=new JLabel();
        tesis.setBounds(30,450,60,40);
        tesis.setFont(new java.awt.Font("Castellar", 1, 18));
        tesis.setText("Tesis");
        getContentPane().add(tesis);
        
        setLayout(null);
        setBounds(100,100,700,600);
        setResizable(false);
        setVisible(true);
        setTitle("Busquedad");
        
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aT.addActionListener(this);
//        
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aT){
                autT=aut1.getText();
                titleT=title1.getText();
                edicT=Integer.parseInt(edic1.getText());
                claveT=clave1.getText();
                descripT=descrip1.getText();
                temT=tem1.getText();
                copT=Integer.parseInt(cop1.getText());
                dispoT=Integer.parseInt(dispo1.getText());
                areT=are1.getText();
                Manejo_Arrays.mibibliotecaT[agreTe]=new Tesi(2,autT,titleT,edicT,claveT,descripT,temT,copT,dispoT,areT);
                agreTe++;
                this.dispose();
            }
            
        }
    }
    
}

class MiBiblioteca extends JFrame implements ActionListener{
    JTable mitabla;
    JTable mitabla1;
    JTable mitabla2;
     JScrollPane scroll;
    JScrollPane scroll1;
    JScrollPane scroll2;
    
    public Boton eliminarBi;
    public Boton prestarBi;
    public Boton misPres;
    public Boton miprincipal;
    
    public MiBiblioteca(){
        
        String titulos[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles"};
               
            String[] campos[]=obtenerdatos();
            mitabla=new JTable(campos,titulos);
            
            
            
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Consolas", 1, 15));
            scroll=new JScrollPane(mitabla);
            scroll.setBounds(50,50,1200,150);
            scroll.setViewportView(mitabla);
            
            add(scroll);
            
           String titulos1[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles","Frecuencia","Ejemplares"};
               
            String[] campos1[]=obtenerdatos1();
            mitabla1=new JTable(campos1,titulos1);
            mitabla1.setEnabled(false);
            mitabla1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla1.setFont(new java.awt.Font("Consolas", 1, 15));
            scroll1=new JScrollPane(mitabla1);
            scroll1.setBounds(50,200,1200,150);
            scroll1.setViewportView(mitabla1);
            add(scroll1);
            
            String titulos2[]={"Autor","Titulo","Clave","Edicion","Descripcion","Tema","Copias","Disponibles","Area"};
               
            String[] campos2[]=obtenerdatos2();
            mitabla2=new JTable(campos2,titulos2);
            mitabla2.setEnabled(false);
            mitabla2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla2.setFont(new java.awt.Font("Consolas", 1, 15));
            scroll2=new JScrollPane(mitabla2);
            scroll2.setBounds(50,350,1200,150);
            scroll2.setViewportView(mitabla2);
            add(scroll2);
            
            eliminarBi=new Boton("Eliminar de mi Biblioteca");
            eliminarBi.setBounds(50,600,200,35);
            eliminarBi.setFont(new java.awt.Font("Perpetua", 1, 15));
            add(eliminarBi);
            
            prestarBi=new Boton("Prestar");
            prestarBi.setBounds(1100,600,100,35);
            prestarBi.setFont(new java.awt.Font("Perpetua", 1, 15));
            add(prestarBi);
            
            misPres=new Boton("Mis Libros Prestados");
            misPres.setBounds(450,600,200,35);
            misPres.setFont(new java.awt.Font("Perpetua", 1, 15));
            add(misPres);
            
            miprincipal=new Boton("Mi Principal");
            miprincipal.setBounds(800,600,130,35);
            miprincipal.setFont(new java.awt.Font("Perpetua", 1, 15));
            add(miprincipal);
            
            //add(mitabla);
           
           setLayout(null);
           setExtendedState(MAXIMIZED_BOTH);//maxima
           setVisible(true);
           setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Posiblemente cambiarlo
           setTitle("MI BIBLIOTECA");
           getContentPane().setBackground(Color.WHITE); 
           eliminarBi.addActionListener(this);
           prestarBi.addActionListener(this);
           misPres.addActionListener(this);
           miprincipal.addActionListener(this);
    }
    private String [][] obtenerdatos(){
        String campos [][]=new String[Usuario.agreLi][8];
        for(int y=0;y<campos.length;y++){setLayout(null);
           setExtendedState(MAXIMIZED_BOTH);//maxima
           setVisible(true);
           setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Posiblemente cambiarlo
           setTitle("MI BIBLIOTECA");
           getContentPane().setBackground(Color.WHITE); 
            campos[y][0]=Manejo_Arrays.mibibliotecaL[y].getAutor();
            campos[y][1]=Manejo_Arrays.mibibliotecaL[y].getTitulo();
            campos[y][2]=Manejo_Arrays.mibibliotecaL[y].getClave();
            campos[y][3]=Integer.toString(Manejo_Arrays.mibibliotecaL[y].getEdicion());
            campos[y][4]=Manejo_Arrays.mibibliotecaL[y].getDescripcion();
            campos[y][5]=Manejo_Arrays.mibibliotecaL[y].getTema();
            campos[y][6]=Manejo_Arrays.mibibliotecaL[y].getCopia()+""; 
            campos[y][7]=Manejo_Arrays.mibibliotecaL[y].getDisponible()+""; 
            
            
         
        }
     return campos;   
    
    }
    private String [][] obtenerdatos1(){
        String campos1 [][]=new String[Usuario.agreRe][10];
        for(int y=0;y<campos1.length;y++){
            campos1[y][0]=Manejo_Arrays.mibibliotecaR[y].getAutor();
            campos1[y][1]=Manejo_Arrays.mibibliotecaR[y].getTitulo();
            campos1[y][2]=Manejo_Arrays.mibibliotecaR[y].getClave();
            campos1[y][3]=Integer.toString(Manejo_Arrays.mibibliotecaR[y].getEdicion());
            campos1[y][4]=Manejo_Arrays.mibibliotecaR[y].getDescripcion();
            campos1[y][5]=Manejo_Arrays.mibibliotecaR[y].getTema();
            campos1[y][6]=Manejo_Arrays.mibibliotecaR[y].getCopia()+""; 
            campos1[y][7]=Manejo_Arrays.mibibliotecaR[y].getDisponible()+""; 
            campos1[y][8]=Manejo_Arrays.mibibliotecaR[y].getFrecuencia();
            campos1[y][9]=Manejo_Arrays.mibibliotecaR[y].getEjemplar()+"";
            
        }
     return campos1;   
    
    }
    private String [][] obtenerdatos2(){
        String campos2 [][]=new String[Usuario.agreTe][9];
        for(int y=0;y<campos2.length;y++){
            campos2[y][0]=Manejo_Arrays.mibibliotecaT[y].getAutor();
            campos2[y][1]=Manejo_Arrays.mibibliotecaT[y].getTitulo();
            campos2[y][2]=Manejo_Arrays.mibibliotecaT[y].getClave();
            campos2[y][3]=Integer.toString(Manejo_Arrays.mibibliotecaT[y].getEdicion());
            campos2[y][4]=Manejo_Arrays.mibibliotecaT[y].getDescripcion();
            campos2[y][5]=Manejo_Arrays.mibibliotecaT[y].getTema();
            campos2[y][6]=Manejo_Arrays.mibibliotecaT[y].getCopia()+""; 
            campos2[y][7]=Manejo_Arrays.mibibliotecaT[y].getDisponible()+"";
            campos2[y][8]=Manejo_Arrays.mibibliotecaT[y].getArea();
            
         
        }
     return campos2;   
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==eliminarBi){
            EliminarBiblioteca eb=new EliminarBiblioteca();
        }
        if(e.getSource()==prestarBi){
            PrestarBiblioteca pb=new PrestarBiblioteca();
        }
        if(e.getSource()==misPres){
            setVisible(false);
            MisPrestamos mp=new MisPrestamos();
        }
        if(e.getSource()==miprincipal){
            setVisible(false);
            Usuario user=new Usuario(Usuario.Usuarioo,Usuario.Password);
        }
    }
    
    
}
class PrestarBiblioteca extends JDialog implements ActionListener{
    JLabel escribirti;
    JLabel escribiraut;
    JTextField titulo;
    JTextField autor;
    public Boton acep;
    public Boton cancPre;
    
    String obtTitulo;
    String obtAutor;
    
    JDialog fecha;
    JLabel fecha1;
    JLabel fecha2;
    JLabel infAut;
    JLabel infTi;
    String ob1;
    String ob2;
    public PrestarBiblioteca(){
        getContentPane().setLayout(null);
        escribirti=new JLabel();
        escribirti.setBounds(20,20,60,30);
        escribirti.setText("Titulo");
        escribirti.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        titulo=new JTextField();
        titulo.setBounds(20,50,250,30);
        titulo.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(escribirti);
        getContentPane().add(titulo);
        
        escribiraut=new JLabel();
        escribiraut.setBounds(20,75,60,30);
        escribiraut.setText("Autor");
        escribiraut.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        
        autor=new JTextField();
        autor.setBounds(20,105,250,30);
        autor.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(escribiraut);
        getContentPane().add(autor);
        
        acep=new Boton("Aceptar");
        acep.setBounds(270,200,90,30);
        acep.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(acep);
        
        cancPre=new Boton("Cancelar");
        cancPre.setBounds(20,200,60,30);
        cancPre.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(cancPre);
        
        
        setLayout(null);
        setBounds(500,200,400,300);
        setResizable(false);
        setVisible(true);
        setTitle("Prestamo");
        acep.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==acep){
            obtTitulo=titulo.getText();
            obtAutor=autor.getText();
            //SI ES LIBRO
            for(int j=0;j<Manejo_Arrays.mibibliotecaL.length;j++){
                if(Manejo_Arrays.mibibliotecaL[j]!=null){
                    if(Manejo_Arrays.mibibliotecaL[j].getAutor().equals(obtAutor) &&  Manejo_Arrays.mibibliotecaL[j].getTitulo().equals(obtTitulo)){
                        if(Manejo_Arrays.mibibliotecaL[j].getDisponible()>0){
                        int cantidad;
                        cantidad=Manejo_Arrays.mibibliotecaL[j].getDisponible();
                        cantidad=cantidad-1;
                        Manejo_Arrays.mibibliotecaL[j].setDisponible(cantidad);
                        for(int i=0;i<Manejo_Arrays.libros.length;i++){
                            if(Manejo_Arrays.libros[i]!=null){
                                if(Manejo_Arrays.libros[i].getAutor().equals(obtAutor)&& Manejo_Arrays.libros[i].getTitulo().equals(obtTitulo)){
                                    int cantidad1;
                                    cantidad1=Manejo_Arrays.libros[i].getDisponible();
                                    cantidad1=cantidad1-1;
                                    Manejo_Arrays.libros[i].setDisponible(cantidad1);
                                    int cantidad2=Manejo_Arrays.libros[i].getPrestamos();
                                    cantidad2++;
                                    Manejo_Arrays.libros[i].setPrestamos(cantidad2);
                                    
                                }
                            }
                            
                        }
                        setVisible(false);
                        Fecha(obtTitulo,obtAutor);
                    }
                        else{
                            JOptionPane.showMessageDialog(null,"El libro no esta disponible");
                        }
                    }
                }
            }
            //SI ES REVISTA
            for(int j=0;j<Manejo_Arrays.mibibliotecaR.length;j++){
                if(Manejo_Arrays.mibibliotecaR[j]!=null){
                    if(Manejo_Arrays.mibibliotecaR[j].getAutor().equals(obtAutor) &&  Manejo_Arrays.mibibliotecaR[j].getTitulo().equals(obtTitulo)){
                        if(Manejo_Arrays.mibibliotecaR[j].getDisponible()>0){
                        int cantidad;
                        cantidad=Manejo_Arrays.mibibliotecaR[j].getDisponible();
                        cantidad=cantidad-1;
                        Manejo_Arrays.mibibliotecaR[j].setDisponible(cantidad);
                        for(int i=0;i<Manejo_Arrays.revistas.length;i++){
                            if(Manejo_Arrays.revistas[i]!=null){
                                if(Manejo_Arrays.revistas[i].getAutor().equals(obtAutor)&& Manejo_Arrays.revistas[i].getTitulo().equals(obtTitulo)){
                                    int cantidad1;
                                    cantidad1=Manejo_Arrays.revistas[i].getDisponible();
                                    cantidad1=cantidad1-1;
                                    Manejo_Arrays.revistas[i].setDisponible(cantidad1);
                                    int cantidad2=Manejo_Arrays.revistas[i].getPrestamos();
                                    cantidad2++;
                                    Manejo_Arrays.revistas[i].setPrestamos(cantidad2);
                                }
                            }
                        }
                        setVisible(false);
                        Fecha(obtTitulo,obtAutor);
                    }
                    }else{
                        JOptionPane.showMessageDialog(null,"La revista no esta disponible");
                    }
                }
            }
            
            
            for(int j=0;j<Manejo_Arrays.mibibliotecaT.length;j++){
                if(Manejo_Arrays.mibibliotecaT[j]!=null){
                    if(Manejo_Arrays.mibibliotecaT[j].getAutor().equals(obtAutor) &&  Manejo_Arrays.mibibliotecaT[j].getTitulo().equals(obtTitulo)){
                        if(Manejo_Arrays.mibibliotecaT[j].getDisponible()>0){
                        int cantidad;
                        cantidad=Manejo_Arrays.mibibliotecaT[j].getDisponible();
                        cantidad=cantidad-1;
                        Manejo_Arrays.mibibliotecaT[j].setDisponible(cantidad);
                        for(int i=0;i<Manejo_Arrays.tesis.length;i++){
                            if(Manejo_Arrays.tesis[i]!=null){
                                if(Manejo_Arrays.tesis[i].getAutor().equals(obtAutor)&& Manejo_Arrays.tesis[i].getTitulo().equals(obtTitulo)){
                                    int cantidad1;
                                    cantidad1=Manejo_Arrays.tesis[i].getDisponible();
                                    cantidad1=cantidad1-1;
                                    Manejo_Arrays.tesis[i].setDisponible(cantidad1);
                                    int cantidad2=Manejo_Arrays.tesis[i].getPrestamos();
                                    cantidad2++;
                                    Manejo_Arrays.tesis[i].setPrestamos(cantidad2);
                                }
                            }
                        }
                        setVisible(false);
                        Fecha(obtTitulo,obtAutor);
                    }
                    }else{
                        JOptionPane.showMessageDialog(null,"La Tesis no esta Disponible");
                    }
                }
            }
              
        }
    }
    
    public void Fecha(String obti,String obaut){
        this.ob1=obti;
        this.ob2=obaut;
        
       
        fecha=new JDialog();
        
        
        
        infTi=new JLabel();
        infTi.setBounds(20,20,250,30);
        infTi.setFont(new java.awt.Font("Times New Roman", 1, 13));
        infTi.setText("Titulo: "+ob1);
        fecha.add(infTi);
        
        
        infAut=new JLabel();
        infAut.setBounds(20,50,250,30);
        infAut.setFont(new java.awt.Font("Times New Roman", 1, 13));
        infAut.setText("Autor: "+ob2);
        
        fecha.add(infAut);
        
        Calendar calen1=Calendar.getInstance();
        String a=Integer.toString(calen1.get(Calendar.YEAR));
        String mes=Integer.toString(calen1.get(Calendar.MONTH));
        String dia=Integer.toString(calen1.get(Calendar.DATE));
        String hora=Integer.toString(calen1.get(Calendar.HOUR));
        String pre="Fecha de Prestamo: "+dia+"/"+mes+"/"+a+" hora: "+hora;
        
        fecha1=new JLabel();
        fecha1.setBounds(20,80,250,30);
        fecha1.setFont(new java.awt.Font("Times New Roman", 1, 13));
        fecha1.setText(pre);
        fecha.add(fecha1);
        
        String a2=Integer.toString(calen1.get(Calendar.YEAR));
        String mes2=Integer.toString(calen1.get(Calendar.MONTH));
        String dia2=Integer.toString(calen1.get(Calendar.DATE)+7);
        String hora2=Integer.toString(calen1.get(Calendar.HOUR));
        String regreso="Fecha de entrega: "+dia2+"/"+mes2+"/"+a2+" hora: "+hora2;
        
        
        fecha2=new JLabel();
        fecha2.setBounds(20,110,250,30);
        fecha2.setFont(new java.awt.Font("Times New Roman", 1, 13));
        fecha2.setText(regreso);
        fecha.add(fecha2);
        
        
        
        fecha.setLayout(null);
        fecha.setBounds(500,200,400,300);
        fecha.setResizable(false);
        fecha.setVisible(true);
        fecha.setTitle("Detalles");
        Manejo_Arrays.misprestamos[Usuario.conpres]=new Prestamos(Usuario.Usuarioo,ob2,ob1,pre,regreso);
        Usuario.conpres++;
    }
    
}
class EliminarBiblioteca extends JDialog implements ActionListener{
    JLabel escribirti;
    JLabel escribiraut;
    JTextField titulo;
    JTextField autor;
    public Boton acepB;
    public Boton cancB;
    
    
    String guardar1;
    String guardar2;
    
    int pos1;
    int pos2;
    int pos3;
    public EliminarBiblioteca(){
        
        getContentPane().setLayout(null);
        escribirti=new JLabel();
        escribirti.setBounds(20,20,60,30);
        escribirti.setText("Titulo");
        escribirti.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        titulo=new JTextField();
        titulo.setBounds(20,50,250,30);
        titulo.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(escribirti);
        getContentPane().add(titulo);
        
        escribiraut=new JLabel();
        escribiraut.setBounds(20,75,60,30);
        escribiraut.setText("Autor");
        escribiraut.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        
        autor=new JTextField();
        autor.setBounds(20,105,250,30);
        autor.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(escribiraut);
        getContentPane().add(autor);
        
        acepB=new Boton("Aceptar");
        acepB.setBounds(270,200,90,30);
        acepB.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(acepB);
        
        cancB=new Boton("Cancelar");
        cancB.setBounds(20,200,60,30);
        cancB.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(cancB);
        
        
        setLayout(null);
        setBounds(500,200,400,300);
        setResizable(false);
        setVisible(true);
        setTitle("Eliminar");
        
        acepB.addActionListener(this);
        cancB.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==acepB){
            guardar1=titulo.getText();
            guardar2=autor.getText();
            
            for(int j=0;j<Manejo_Arrays.mibibliotecaL.length;j++){
                if(Manejo_Arrays.mibibliotecaL[j]!=null){
                if(guardar1.equals(Manejo_Arrays.mibibliotecaL[j].getTitulo())&& guardar2.equals(Manejo_Arrays.mibibliotecaL[j].getAutor())){
                    int obtenerpos=j;
                    //Llamar metodo
                    ElimiLibro(obtenerpos);
                    JOptionPane.showMessageDialog(null,"El registro se ha eliminado");
                    setVisible(false);
                }
                }
            }
            
            for(int j=0;j<Manejo_Arrays.mibibliotecaR.length;j++){
                if(Manejo_Arrays.mibibliotecaR[j]!=null){
                if(guardar1.equals(Manejo_Arrays.mibibliotecaR[j].getTitulo())&& guardar2.equals(Manejo_Arrays.mibibliotecaR[j].getAutor())){
                    int obtenerpos=j;
                    //Llamar metodo
                    ElimiRevi(obtenerpos);
                    JOptionPane.showMessageDialog(null,"El registro se ha eliminado");
                    setVisible(false);
                }
                }
            }
            for(int j=0;j<Manejo_Arrays.mibibliotecaT.length;j++){
                if(Manejo_Arrays.mibibliotecaT[j]!=null){
                if(guardar1.equals(Manejo_Arrays.mibibliotecaT[j].getTitulo())&& guardar2.equals(Manejo_Arrays.mibibliotecaT[j].getAutor())){
                    int obtenerpos=j;
                    //Llamar metodo
                    ElimiTesi(obtenerpos);
                    JOptionPane.showMessageDialog(null,"El registro se ha eliminado");
                    setVisible(false);
                }
                }
            }
            
            
            
            
            
        }
        if(e.getSource()==cancB){
            setVisible(false);
            titulo.setText("");
            autor.setText("");
        }
    }
    
    public void ElimiLibro(int posi1){
        this.pos1=posi1;
        Manejo_Arrays.mibibliotecaL[pos1]=null;
            for(int k=pos1;k<Usuario.agreLi;k++){//Voy a correr espacioes
                 Manejo_Arrays.mibibliotecaL[k]=Manejo_Arrays.mibibliotecaL[k+1]; //asigno los datos de k+1 a una poscion anterior
                 Manejo_Arrays.mibibliotecaL[k+1]=null;//hago nulo los datos k+1 para que no salga 
                 Usuario.agreLi=Usuario.agreLi-(1);
                }
        
        
    }
    public void ElimiRevi(int posi2){
        this.pos2=posi2;
        Manejo_Arrays.mibibliotecaR[pos2]=null;
            for(int k=pos2;k<Usuario.agreRe;k++){//Voy a correr espacioes
                Manejo_Arrays.mibibliotecaR[k]=Manejo_Arrays.mibibliotecaR[k+1]; //asigno los datos de k+1 a una poscion anterior
                Manejo_Arrays.mibibliotecaR[k+1]=null;//hago nulo los datos k+1 para que no salga 
                Usuario.agreRe=Usuario.agreRe-(1);
            }
        
        
    }
    public void ElimiTesi(int posi3){
        this.pos3=posi3;
        Manejo_Arrays.mibibliotecaT[pos3]=null;
            for(int k=pos3;k<Usuario.agreTe;k++){//Voy a correr espacioes
                Manejo_Arrays.mibibliotecaT[k]=Manejo_Arrays.mibibliotecaT[k+1]; //asigno los datos de k+1 a una poscion anterior
                Manejo_Arrays.mibibliotecaT[k+1]=null;//hago nulo los datos k+1 para que no salga 
                Usuario.agreTe=Usuario.agreTe-(1);
            }
        
        
    }
}
class MisPrestamos extends JFrame implements ActionListener{
    JTable mitabla;
    JScrollPane miscroll;
    public Boton devolver;
    public Boton reprincipal;
    public MisPrestamos(){
        String titulos[]={"Autor","Titulo","Fecha De Prestamos","Fecha Limite de Entrega","Usuario"};
               
            String[] campos[]=obtenerdatos();
            mitabla=new JTable(campos,titulos);
            
            
            
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Consolas", 1, 15));
            miscroll=new JScrollPane(mitabla);
            miscroll.setBounds(50,50,1200,300);
            miscroll.setViewportView(mitabla);
            add(miscroll);
            
            devolver=new Boton("Devolver Libro");
            devolver.setBounds(1000,400,150,30);
            devolver.setFont(new java.awt.Font("Perpetua", 1, 13));
            add(devolver);
            reprincipal=new Boton("Regresar a Principal");
            reprincipal.setBounds(50,400,200,30);
            reprincipal.setFont(new java.awt.Font("Perpetua", 1, 13));
            add(reprincipal);
            
            
            
           setLayout(null);
           setExtendedState(MAXIMIZED_BOTH);//maxima
           setVisible(true);
           setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Posiblemente cambiarlo
           setTitle("Mis Prestamos");
           getContentPane().setBackground(Color.WHITE);
           devolver.addActionListener(this);
           reprincipal.addActionListener(this);
        
    }

    
    private String [][] obtenerdatos(){
        String campos [][]=new String[Usuario.conpres][5];
        for(int y=0;y<campos.length;y++){
            campos[y][0]=Manejo_Arrays.misprestamos[y].getAutor();
            campos[y][1]=Manejo_Arrays.misprestamos[y].getTitulo();
            campos[y][2]=Manejo_Arrays.misprestamos[y].getFecha1();
            campos[y][3]=Manejo_Arrays.misprestamos[y].getFecha2();
            campos[y][4]=Manejo_Arrays.misprestamos[y].getUsuario();
        }
         return campos; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==devolver){
            VentanaDevolver vd=new VentanaDevolver();
        }
        if(e.getSource()==reprincipal){
            setVisible(false);
            Usuario user=new Usuario(Usuario.Usuarioo,Usuario.Password);
        }
         
    }
    
    class VentanaDevolver extends JDialog implements ActionListener{
        JLabel escribirti;
        JLabel escribiraut;
        JTextField titulo;
        JTextField autor;
        public Boton acePre;
        public Boton caPre;
        
        String obtener1;
        String obtener2;
        int obtener3;
        int obtener4;
        
        public VentanaDevolver(){
        getContentPane().setLayout(null);
        escribirti=new JLabel();
        escribirti.setBounds(20,20,60,30);
        escribirti.setText("Titulo");
        escribirti.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        titulo=new JTextField();
        titulo.setBounds(20,50,250,30);
        titulo.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(escribirti);
        getContentPane().add(titulo);
        
        escribiraut=new JLabel();
        escribiraut.setBounds(20,75,60,30);
        escribiraut.setText("Autor");
        escribiraut.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        
        autor=new JTextField();
        autor.setBounds(20,105,250,30);
        autor.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(escribiraut);
        getContentPane().add(autor);
        
        acePre=new Boton("Aceptar");
        acePre.setBounds(270,200,90,30);
        acePre.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(acePre);
        
        caPre=new Boton("Cancelar");
        caPre.setBounds(20,200,80,30);
        caPre.setFont(new java.awt.Font("Perpetua", 1, 13));
        getContentPane().add(caPre);
        
        setLayout(null);
        setBounds(500,200,400,300);
        setResizable(false);
        setVisible(true);
        setTitle("Devolver");
        acePre.addActionListener(this);
        caPre.addActionListener(this);
        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==acePre){
                obtener1=titulo.getText();
                obtener2=autor.getText();
                
                for(int j=0;j<Manejo_Arrays.misprestamos.length;j++){
                    if(Manejo_Arrays.misprestamos[j]!=null){
                        if(Manejo_Arrays.misprestamos[j].getAutor().equals(obtener2)&& Manejo_Arrays.misprestamos[j].getTitulo().equals(obtener1)){
                            obtener3=j;
                            Devolver(obtener3); 
                        }
                    }
                }
                
                
                
                
                for(int j=0;j<Manejo_Arrays.mibibliotecaL.length;j++){
                if(Manejo_Arrays.mibibliotecaL[j]!=null){
                    if(Manejo_Arrays.mibibliotecaL[j].getAutor().equals(obtener2) &&  Manejo_Arrays.mibibliotecaL[j].getTitulo().equals(obtener1)){
                        if(Manejo_Arrays.mibibliotecaL[j].getDisponible()>0){
                        int cantidad;
                        cantidad=Manejo_Arrays.mibibliotecaL[j].getDisponible();
                        cantidad=cantidad+1;
                        Manejo_Arrays.mibibliotecaL[j].setDisponible(cantidad);
                        for(int i=0;i<Manejo_Arrays.libros.length;i++){
                            if(Manejo_Arrays.libros[i]!=null){
                                if(Manejo_Arrays.libros[i].getAutor().equals(obtener2)&& Manejo_Arrays.libros[i].getTitulo().equals(obtener1)){
                                    int cantidad1;
                                    cantidad1=Manejo_Arrays.libros[i].getDisponible();
                                    cantidad1=cantidad1+1;
                                    Manejo_Arrays.libros[i].setDisponible(cantidad1);
                                }
                            }
                            
                        }
                        JOptionPane.showMessageDialog(null, "El Libro ha sido regresado");
                        setVisible(false);
                        
                    }
                    }
                }
            }
            //SI ES REVISTA
            for(int j=0;j<Manejo_Arrays.mibibliotecaR.length;j++){
                if(Manejo_Arrays.mibibliotecaR[j]!=null){
                    if(Manejo_Arrays.mibibliotecaR[j].getAutor().equals(obtener2) &&  Manejo_Arrays.mibibliotecaR[j].getTitulo().equals(obtener1)){
                        if(Manejo_Arrays.mibibliotecaR[j].getDisponible()>0){
                        int cantidad;
                        cantidad=Manejo_Arrays.mibibliotecaR[j].getDisponible();
                        cantidad=cantidad+1;
                        Manejo_Arrays.mibibliotecaR[j].setDisponible(cantidad);
                        for(int i=0;i<Manejo_Arrays.revistas.length;i++){
                            if(Manejo_Arrays.revistas[i]!=null){
                                if(Manejo_Arrays.revistas[i].getAutor().equals(obtener2)&& Manejo_Arrays.revistas[i].getTitulo().equals(obtener1)){
                                    int cantidad1;
                                    cantidad1=Manejo_Arrays.revistas[i].getDisponible();
                                    cantidad1=cantidad1+1;
                                    Manejo_Arrays.revistas[i].setDisponible(cantidad1);
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(null, "La Revista ha sido regresada");
                        setVisible(false);
                       
                    }
                    
                }
            }
            }
            
            
            for(int j=0;j<Manejo_Arrays.mibibliotecaT.length;j++){
                if(Manejo_Arrays.mibibliotecaT[j]!=null){
                    if(Manejo_Arrays.mibibliotecaT[j].getAutor().equals(obtener2) &&  Manejo_Arrays.mibibliotecaT[j].getTitulo().equals(obtener1)){
                        if(Manejo_Arrays.mibibliotecaT[j].getDisponible()>0){
                        int cantidad;
                        cantidad=Manejo_Arrays.mibibliotecaT[j].getDisponible();
                        cantidad=cantidad+1;
                        Manejo_Arrays.mibibliotecaT[j].setDisponible(cantidad);
                        for(int i=0;i<Manejo_Arrays.tesis.length;i++){
                            if(Manejo_Arrays.tesis[i]!=null){
                                if(Manejo_Arrays.tesis[i].getAutor().equals(obtener1)&& Manejo_Arrays.tesis[i].getTitulo().equals(obtener2)){
                                    int cantidad1;
                                    cantidad1=Manejo_Arrays.tesis[i].getDisponible();
                                    cantidad1=cantidad1+1;
                                    Manejo_Arrays.tesis[i].setDisponible(cantidad1);
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(null, "La tesis ha sido regresada");
                        setVisible(false);
                        
                        
                    }
                    }
                }
            }
                
                
                
                
            }
            if(e.getSource()==caPre){
                setVisible(false);
                
            }
        }
        
        public void Devolver(int obtener5){
            this.obtener4=obtener5;
            Manejo_Arrays.misprestamos[obtener4]=null;
            for(int k=obtener4;k<Usuario.conpres;k++){//Voy a correr espacioes
                Manejo_Arrays.misprestamos[k]=Manejo_Arrays.misprestamos[k+1]; //asigno los datos de k+1 a una poscion anterior
                Manejo_Arrays.misprestamos[k+1]=null;//hago nulo los datos k+1 para que no salga 
                Usuario.conpres=Usuario.conpres-(1);
            }
            
            
        }
        
    }
}
