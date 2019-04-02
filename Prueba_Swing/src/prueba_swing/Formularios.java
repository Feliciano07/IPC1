
package prueba_swing;
import java.awt.Color;
import java.awt.Container;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Formularios extends JFrame implements ActionListener {
    public Boton aceplibro;
    public Boton aceprevi;
    public Boton aceptesi;
    public Boton boton1;
    public Boton boton2;
    public Boton boton3;
    
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
    
    
    public Formularios(){
        boton1=new Boton("1");
        boton1.setBounds(30,30,50,50);
        
        boton2=new Boton("2");
        boton2.setBounds(100,30,50,50);
        boton3=new Boton("3");
        boton3.setBounds(170,30,50,50);
        add(boton1);
        add(boton2);
        add(boton3);
        
        
        
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);//maxima
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("BIBLIOTECA");
        getContentPane().setBackground(Color.WHITE);  
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            FormularioLibro fl1=new FormularioLibro();
            
        }
        if(e.getSource()==boton2){
            FormularioRevista fr1=new FormularioRevista();
        }
        if(e.getSource()==boton3){
            FormularioTesi ft1=new FormularioTesi();
        }
    }
    
    
}
class FormularioLibro extends JDialog{
    //Meterlos en una sola clase
    JLabel aut;
    JLabel title;
    JLabel edic;
    JLabel clave;
    JLabel descrip;
    JLabel tem;
    JLabel cop;
    JLabel dispo;
    
    JTextField aut1;
    JTextField title1;
    JTextField edic1;
    JTextField clave1;
    JTextField descrip1;
    JTextField tem1;
    JTextField cop1;
    JTextField dispo1;
    public FormularioLibro(){
        getContentPane().setLayout(null);
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
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
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        setTitle("Libro");
        setBounds(40,40,900,600);
        setResizable(false);
        setVisible(true);
        
        
        
    }
        
        
    }
    class FormularioRevista extends JDialog{
    JLabel aut;
    JLabel title;
    JLabel edic;
    JLabel clave;
    JLabel descrip;
    JLabel tem;
    JLabel cop;
    JLabel dispo;
    JLabel frec;
    JLabel ejempl;
    
    JTextField aut1;
    JTextField title1;
    JTextField edic1;
    JTextField clave1;
    JTextField descrip1;
    JTextField tem1;
    JTextField cop1;
    JTextField dispo1;
    JTextField frec1;
    JTextField ejempl1;
        
        public FormularioRevista(){
        getContentPane().setLayout(null);
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
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
        
        getContentPane().add(ejempl);
        getContentPane().add(ejempl1);
        
        
        
        setTitle("Libro");
        setBounds(40,40,900,600);
        setResizable(false);
        setVisible(true);
        setTitle("Libro");
        setBounds(40,40,900,600);
        setResizable(false);
        
        }
        
    }
    
    class FormularioTesi extends JDialog{
    JLabel aut;
    JLabel title;
    JLabel edic;
    JLabel clave;
    JLabel descrip;
    JLabel tem;
    JLabel cop;
    JLabel dispo;
    JLabel are;
    
    JTextField aut1;
    JTextField title1;
    JTextField edic1;
    JTextField clave1;
    JTextField descrip1;
    JTextField tem1;
    JTextField cop1;
    JTextField dispo1;
    JTextField are1;
        public FormularioTesi(){
        getContentPane().setLayout(null);
        //Parte del autor
        aut=new JLabel();
        aut.setBounds(30,30,50,30);
        aut.setFont(new java.awt.Font("Perpetua", 1, 13));
        aut.setText("Autor");
        
        aut1=new JTextField();
        aut1.setBounds(30,60,250,30);
        aut1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
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
        
        getContentPane().add(dispo);
        getContentPane().add(dispo1);
        
        //parte del area
        are=new JLabel();
        are.setBounds(30,380,50,30);
        are.setFont(new java.awt.Font("Perpetua", 1, 13));
        are.setText("Area");
        
        are1=new JTextField();
        are1.setBounds(30,410,250,30);
        are1.setFont(new java.awt.Font("Perpetua", 1, 13));
        
        getContentPane().add(are);
        getContentPane().add(are1);
        
        setTitle("Libro");
        setBounds(40,40,900,600);
        setResizable(false);
        setVisible(true);
            
        
        }
        
    }
