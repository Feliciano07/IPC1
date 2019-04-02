/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author feliciano07
 */
public class NewJFrame extends javax.swing.JFrame  implements ActionListener{
     public static String tecla1="";
    
    //MI JUGADORES 
    
    public static int jugadores=0;
    public static String nombre;
     
    JLabel botones;
    public static Boton inicio;
    public Boton reanudar;
    public Boton pausa;
    public Boton top;
    public JPanel contenido;
    //MI NAVE Y CHOQUES
    public static MiNave avion;
    public static Colision choque;
    
     //MISILES  
    public static MiMisil [] disparo;
    public static int misiles=0;
    
    public static JLabel [] mimisil;
   
    //LABES PARA LAS NAVES
    public static JLabel [] enemigasA;
    public static JLabel [] enemigasC;
    //PARA LA CAOTICA NO IMPORTA
    public static JLabel [] enemigasCt;
    
    //CRONOMETRO
    JLabel cronometro;
    Border bo1;
    
   public static Contador crono;
    
    
    
    public static boolean pausado;
    public static boolean vivo;
    
    //public Enemigo navesEnemigas;
   public static Enemigo [] Arcaica;
   public static int arcaica=0;
   public static Enemigo [] Cazador;
   public static int cazador=0;
   public static Enemigo [] Caotica;
   public static int caotica=0;
   //PUNTEO
   public static JLabel score;
   public static int punteo=0;
   
  //Explsion
   public static JLabel explosion;
    
    /**
     * Creates new form NewJFrame
     */
    
    public NewJFrame() {
        initComponents();
        //Cronometro
        
        
        NewJFrame.disparo=new MiMisil[1000];
        
           
        inicio=new Boton("Iniciar juego");
        inicio.setBounds(0,0,130,30);
        inicio.setFont(new java.awt.Font("Jokerman", 1, 10));
        
        reanudar=new Boton("Reanudar");
        reanudar.setBounds(130,0,110,30);
        reanudar.setFont(new java.awt.Font("Jokerman", 1, 10));
        
        pausa=new Boton("Pausa");
        pausa.setBounds(240,0,90,30);
        pausa.setFont(new java.awt.Font("Jokerman", 1, 10));
        
        top=new Boton("Puntuaciones");
        top.setBounds(330,0,160,30);
        top.setFont(new java.awt.Font("Jokerman", 1, 10));
        
        
        botones=new JLabel();
        botones.setBounds(0,0,500,30);
        
        botones.add(inicio);
        botones.add(reanudar);
        botones.add(pausa);
        botones.add(top);
        
        
        contenido= new JPanel( );
       
      
        
        setContentPane(contenido);
        
        contenido.setLayout(null);
        contenido.setLocation(0, 30);
        
        
        
        
        
       //Instancio la clase que me permite cargar el fondo 
        try {
            File f=new File("fondo.jpg");
            BufferedImage imagen1=ImageIO.read(f);
            Fondo f11=new Fondo(imagen1);
            contenido.setBorder(f11);
            
        } catch (Exception e) {
        }
        
        contenido.add(botones);
      
        NewJFrame.avion=new MiNave();
        //disparo=new ImageIcon("5.png");
        
      NewJFrame.mimisil=new JLabel[1000];
      NewJFrame.enemigasA=new JLabel[75];
      NewJFrame.enemigasC= new JLabel[75];
      NewJFrame.enemigasCt= new JLabel[75];
      /*for(int j=0;j<NewJFrame.mimisil.length;j++){
          NewJFrame.mimisil[j]=new JLabel();
          contenido.add(NewJFrame.mimisil[j]);
      }
      //INICIANDO LOS LABELS 
      NewJFrame.enemigasA=new JLabel[200];
      for(int j=0;j<NewJFrame.enemigasA.length;j++){
          NewJFrame.enemigasA[j]=new JLabel();
          contenido.add(NewJFrame.enemigasA[j]);
      }
      NewJFrame.enemigasC= new JLabel[200];
      for(int j=0;j<NewJFrame.enemigasC.length;j++){
          NewJFrame.enemigasC[j]=new JLabel();
          contenido.add(NewJFrame.enemigasC[j]);
      }
      
      NewJFrame.enemigasCt= new JLabel[200];
      for(int j=0;j<NewJFrame.enemigasCt.length;j++){
          NewJFrame.enemigasCt[j]=new JLabel();
          contenido.add(NewJFrame.enemigasCt[j]);
      }*/
      bo1=BorderFactory.createLineBorder(Color.CYAN,4);
      
      //TODO PARA EL PUNTAJE
      NewJFrame.score=new JLabel();
       NewJFrame.score.setText(NewJFrame.punteo+"");
      NewJFrame.score.setOpaque(true);
      NewJFrame.score.setFont(new java.awt.Font("Cambria Math", 5, 20));
      NewJFrame.score.setBorder(bo1);
      NewJFrame.score.setBackground(Color.CYAN);
      NewJFrame.score.setBounds(440,55,50,25);
      
      
      //TODO ES PARA EL CRONOMETRO
      
      cronometro=new JLabel();
      cronometro.setText("60");
      cronometro.setOpaque(true);
      cronometro.setFont(new java.awt.Font("Cambria Math", 5, 20));
      cronometro.setBorder(bo1);
      cronometro.setBackground(Color.CYAN);
      cronometro.setBounds(440,30,50,25);
      
      //crono=new Contador("Contador",cronometro);
      //choque=new Colision();
            
      NewJFrame.explosion=new JLabel();
      contenido.add(NewJFrame.explosion);
      
      
      contenido.add(cronometro);
      contenido.add(NewJFrame.score);
             
      inicio.addActionListener(this);
      
      inicio.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                 System.out.print("");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                
                //System.out.println(e.getKeyText(e.getKeyCode()));
                 String tecla=e.getKeyText(e.getKeyCode());
                //tecla1=e.getKeyText(e.getKeyCode());
                 //JOptionPane.showMessageDialog(null,tecla);
                 if(avion.getPosx()<=455){
                  if(tecla.equals("Derecha")){
                     avion.MoverDerecha();
                     
                 }   
                 }
                 if(avion.getPosx()>=0){
                  if(tecla.equals("Izquierda")){
                     avion.MoverIzquierda();
                 }   
                 }
                 if(tecla.equals(NewJFrame.tecla1)){
                     
                    NewJFrame.disparo[misiles]=new MiMisil("Misil",NewJFrame.mimisil[misiles]);
                    NewJFrame.mimisil[misiles].setVisible(true);
                    //contenido.add(NewJFrame.mimisil[misiles]);
                    NewJFrame.disparo[misiles].start();
                    NewJFrame.misiles++;
                    
                     
                 }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                 System.out.print("");
            }
            
        });
    
      
       NewJFrame.Arcaica=new Enemigo[75];
        NewJFrame.Cazador=new Enemigo[75];
        NewJFrame.Caotica=new Enemigo[75];
        //navesEnemigas=new Enemigo("Enemigos",enemigas);
        
        pausa.addActionListener(this);
        
        reanudar.addActionListener(this);
        reanudar.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.print("");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                
                //System.out.println(e.getKeyText(e.getKeyCode()));
                 String tecla=e.getKeyText(e.getKeyCode());
                //tecla1=e.getKeyText(e.getKeyCode());
                 //JOptionPane.showMessageDialog(null,tecla);
                 if(avion.getPosx()<=455){
                  if(tecla.equals("Derecha")){
                     avion.MoverDerecha();
                     
                 }   
                 }
                 if(avion.getPosx()>=0){
                  if(tecla.equals("Izquierda")){
                     avion.MoverIzquierda();
                 }   
                 }
                 if(tecla.equals(NewJFrame.tecla1)){
                     
                   NewJFrame.disparo[misiles]=new MiMisil("Misil",NewJFrame.mimisil[misiles]);
                   NewJFrame.mimisil[misiles].setVisible(true);
                   //contenido.add(NewJFrame.mimisil[misiles]);
                   NewJFrame.disparo[misiles].start();
                   NewJFrame.misiles++;
                    
                     
                 }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.print("");
            }
            
        });
    
        
        //Agrego la nave
        contenido.add(NewJFrame.avion);
        top.addActionListener(this); 
       
        
        
        //add(contenido);  
        setResizable(false);
        setLocation(200,50);
        setSize(500,650);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("Galaga");
        getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==inicio){
            NewJFrame.inicio.setEnabled(false);
            NewJFrame.choque=new Colision();
            NewJFrame.crono=new Contador("Contador",cronometro);
            Restaurar();
            Iniciar();
            Jugador();
            
            //Inicializo todas las variables
            NewJFrame.punteo=0;
            NewJFrame.score.setText(NewJFrame.punteo+"");
            NewJFrame.pausado=true;
            NewJFrame.vivo=true;
            Contador.segundo=60;
            //---------
            
           
            
            NewJFrame.crono.start();
            NewJFrame.choque.start();
            Repetir();
            
            
        }
        if(e.getSource()==pausa){
            NewJFrame.pausado=false;
            crono.suspend();
           choque.suspend();
            for(int j=0;j<NewJFrame.Arcaica.length;j++){
                if(NewJFrame.Arcaica[j]!=null){
                    NewJFrame.Arcaica[j].suspend();
                }
            }
            for(int j=0;j<NewJFrame.Cazador.length;j++){
                if(NewJFrame.Cazador[j]!=null){
                    NewJFrame.Cazador[j].suspend();
                }
            }
            for(int j=0;j<NewJFrame.Caotica.length;j++){
                if(NewJFrame.Caotica[j]!=null){
                    NewJFrame.Caotica[j].suspend();
                }
            }
           
                   
          // navesEnemigas.suspend();
          
           
        }
        if(e.getSource()==reanudar){
            NewJFrame.pausado=true;
            crono.resume();
            choque.resume();
            for(int j=0;j<NewJFrame.Arcaica.length;j++){
                if(NewJFrame.Arcaica[j]!=null){
                    NewJFrame.Arcaica[j].resume();
                }
            }
            for(int j=0;j<NewJFrame.Cazador.length;j++){
                if(NewJFrame.Cazador[j]!=null){
                    NewJFrame.Cazador[j].resume();
                }
            }
            for(int j=0;j<NewJFrame.Caotica.length;j++){
                if(NewJFrame.Caotica[j]!=null){
                    NewJFrame.Caotica[j].resume();
                }
            }
            
            //navesEnemigas.suspend();
        }
        if(e.getSource()==top){
            TablaJugadores t1=new TablaJugadores();
        }
    }
    
    public void IniciarArcaica(){
              NewJFrame.Arcaica[arcaica]=new Enemigo("Enemigos",NewJFrame.enemigasA[arcaica]);
              NewJFrame.enemigasA[arcaica].setVisible(true);
              contenido.add(NewJFrame.enemigasA[arcaica]);
              NewJFrame.Arcaica[arcaica].start();
              arcaica++; 
            
    }
    public void IniciarCazador(){
              NewJFrame.Cazador[cazador]=new Enemigo("Enemigos",NewJFrame.enemigasC[cazador]);
              NewJFrame.enemigasC[cazador].setVisible(true);
              contenido.add(NewJFrame.enemigasC[cazador]);
              NewJFrame.Cazador[cazador].start();
              cazador++; 
            
    }
    public void IniciarCaotica(){
              NewJFrame.Caotica[caotica]=new Enemigo("Enemigos",NewJFrame.enemigasCt[caotica]);
              NewJFrame.enemigasCt[caotica].setVisible(true);
              contenido.add(NewJFrame.enemigasCt[caotica]);
              NewJFrame.Caotica[caotica].start();
              caotica++; 
            
    }
    public void Repetir(){
        Timer timer=new Timer();
        
        TimerTask repetir=new TimerTask() {
            @Override
            public void run() {
                if(NewJFrame.pausado==true && NewJFrame.vivo==true && Contador.segundo>0 ){
                    Enemigo.tipo=(int)(Math.random()*3);
                    if(Enemigo.tipo==0){
                        IniciarArcaica();
                    }
                    if(Enemigo.tipo==1){
                        IniciarCazador();
                    }
                    if(Enemigo.tipo==2){
                        IniciarCaotica();
                    }
                    
                
                
                }
            }
        };
       
        timer.schedule(repetir,3000,2500);  
        //System.out.println(""+1);
    }
    public void Iniciar(){
        //MISILES
           
    
      for(int j=0;j<NewJFrame.mimisil.length;j++){
          NewJFrame.mimisil[j]=new JLabel();
          contenido.add(NewJFrame.mimisil[j]);
      }
      //INICIANDO LOS LABELS PARA LAS NAVES
      NewJFrame.enemigasA=new JLabel[200];
      for(int j=0;j<NewJFrame.enemigasA.length;j++){
          NewJFrame.enemigasA[j]=new JLabel();
         // contenido.add(NewJFrame.enemigasA[j]);
      }
      NewJFrame.enemigasC= new JLabel[200];
      for(int j=0;j<NewJFrame.enemigasC.length;j++){
          NewJFrame.enemigasC[j]=new JLabel();
         // contenido.add(NewJFrame.enemigasC[j]);
      }
      
      NewJFrame.enemigasCt= new JLabel[200];
      for(int j=0;j<NewJFrame.enemigasCt.length;j++){
          NewJFrame.enemigasCt[j]=new JLabel();
          //contenido.add(NewJFrame.enemigasCt[j]);
      }
         
         
    }
    public void Restaurar(){
        for(int j=0;j<NewJFrame.Arcaica.length;j++){
            //if(NewJFrame.Arcaica[j]!=null){
            NewJFrame.Arcaica[j]=null;
            //}
        }
        for(int j=0;j<NewJFrame.Cazador.length;j++){
            //if(NewJFrame.Cazador[j]!=null){
            NewJFrame.Cazador[j]=null;
            //}
        }
        for(int j=0;j<NewJFrame.Caotica.length;j++){
            //if(NewJFrame.Caotica[j]!=null){
            NewJFrame.Caotica[j]=null;
            //}
        }
        for(int j=0;j<NewJFrame.disparo.length;j++){
            if(NewJFrame.disparo[j]!=null){
            NewJFrame.disparo[j]=null;
            }
        }
        for(int j=0;j<NewJFrame.enemigasA.length;j++){
           // if(NewJFrame.enemigasA[j]!=null){
            NewJFrame.enemigasA[j]=null;
            //}
        }
        for(int j=0;j<NewJFrame.enemigasC.length;j++){
           // if(NewJFrame.enemigasC[j]!=null){
            NewJFrame.enemigasC[j]=null;
            //}
        }
        for(int j=0;j<NewJFrame.enemigasCt.length;j++){
           // if(NewJFrame.enemigasCt[j]!=null){
            NewJFrame.enemigasCt[j]=null;
            //}
        }
        for(int j=0;j<NewJFrame.mimisil.length;j++){
            //if(NewJFrame.mimisil[j]!=null){
            NewJFrame.mimisil[j]=null;
            //}
        }
        //LOS CONTADORES EN 0
        NewJFrame.misiles=0;
        NewJFrame.arcaica=0;
        NewJFrame.cazador=0;
        NewJFrame.caotica=0;
    }
    
    public void Jugador(){
        //Para los jugadores
            NewJFrame.nombre=JOptionPane.showInputDialog(null,"Introduzca su nombre");
            
            //NewJFrame.jugador[NewJFrame.jugadores]=new Jugador();
            //NewJFrame.jugador[NewJFrame.jugadores].setNombre(nombre);
            //NewJFrame.jugador[jugadores].setScore(NewJFrame.punteo);
            String inicial=(new StringBuffer().append(nombre.charAt(0)).toString());
            NewJFrame.tecla1=inicial;
            
            //-----------------------
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
class Fondo implements Border{
private BufferedImage miimagen;
    public Fondo(BufferedImage imagen){
        this.miimagen=imagen;
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(miimagen, 0, 0, width, height, null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
       return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
    
}