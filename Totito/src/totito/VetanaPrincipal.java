package totito;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author feliciano07
 */
public class VetanaPrincipal extends JFrame implements ActionListener {
    public Botones reiniciar;//boton para reinicar el juego, si puedo xd
    public Botones tablero[][];
    String ganador;
    String j1="X";
    String j2="O";
    int f=0;  
    int c=0;
    public JLabel m1;//para saber los turnos en el qu estan
    public JLabel m2;//cambiar entre jugadores
    boolean turno=true;// false para 1 y true para 2
    public VetanaPrincipal(){
        setSize(600,600);//Dimension de la ventana
        setLocation(200,100);
        setResizable(false);
        setLayout(null);//layout tiene definido metodos y le pongo null para borrarlos
        setTitle("TOTITO");//Colocarle el Nombre a la ventana
        setVisible(true);//Hacer visible la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  /*Definimos la accion que toma la venta 
        al darle en el boton cerrar, esto puede ser directamente terminar el programa u ocultarse
        y abrir otra ventana
        */  
        
        
        reiniciar=new Botones("Reiniciar");
        reiniciar.setBounds(200,500,100,40);//pos izquierda, pos superior,anchura y altura del objeto en si
        add(reiniciar);
        
        //reiniciar.addActionListener(this);
        //tablero=new Botones;
        m1=new JLabel(" Turno: ");
        m1.setBounds(400,20,100,20);//pos izquierda, pos superior,anchura y altura del objeto en si
        m1.setFont(new Font("Cooper Black",Font.PLAIN,14));
        add(m1);//agrego el objeto a la ventana
        
        m2=new JLabel("Jugador 1");
        
        m2.setBounds(300,30,250,40);
        m2.setFont(new Font("Cooper Black",Font.PLAIN,14));
        
        add(m2);
        
        tablero=new Botones[3][3];
        for(f=0;f<3;f++){//crear los botones
            for(c=0;c<3;c++){
                tablero[f][c]=new Botones("");
                
            }
        }
        
         tablero[0][0].setBounds(80,80 ,80,80);
         add(tablero[0][0]);
         
         tablero[0][1].setBounds(160,80 ,80,80);
         add(tablero[0][1]);
         
         tablero[0][2].setBounds(240,80 ,80,80);
         add(tablero[0][2]);
         
         tablero[1][0].setBounds(80,160,80,80);
         add(tablero[1][0]);
         tablero[1][1].setBounds(160,160,80,80);
         add(tablero[1][1]);
         tablero[1][2].setBounds(240,160,80,80);
         add(tablero[1][2]);
         
         tablero[2][0].setBounds(80, 240, 80, 80);
         add(tablero[2][0]);
         tablero[2][1].setBounds(160, 240, 80, 80);
         add(tablero[2][1]);
         tablero[2][2].setBounds(240, 240, 80, 80);
         add(tablero[2][2]);
        /*
         
        AHORA VIENE LO CHIDO :v HACER LA PARTE LOGICA
         */
        
        
        //Asignacion de acciones a los botones
        for(f=0;f<3;f++){//crear los botones
            for(c=0;c<3;c++){
      tablero[f][c].addActionListener(this);
            }
        }
    reiniciar.addActionListener(this);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==reiniciar){
            for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setText("");
                    tablero[f][c].setEnabled(true);
                    turno=true;
                    m2.setText("Jugador1");
                }
            }
        }
        if(turno==true){
            
            if(e.getSource()==tablero[0][0]){
            
            tablero[0][0].setText(j1);
            tablero[0][0].setEnabled(false);
            m2.setText("Jugador 2 ");
            turno=false;
            
            }
        }
        else{
        if(e.getSource()==tablero[0][0]){
            m2.setText("Jugador 1 ");
            tablero[0][0].setText(j2);
            tablero[0][0].setEnabled(false);
            turno=true; 
        }
      }
        Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();
    //
        
      if(turno==true){
            if(e.getSource()==tablero[0][1]){
            m2.setText("Jugador 2 ");
            tablero[0][1].setText(j1);
            tablero[0][1].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[0][1]){
            m2.setText("Jugador 1 ");
            tablero[0][1].setText(j2);
            tablero[0][1].setEnabled(false);
            turno=true; 
        }
      }
      Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();
      //
            if(turno==true){
            if(e.getSource()==tablero[0][2]){
            m2.setText("Jugador 2 ");
            tablero[0][2].setText(j1);
            tablero[0][2].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[0][2]){
            m2.setText("Jugador 1 ");
            tablero[0][2].setText(j2);
            tablero[0][2].setEnabled(false);
            turno=true; 
        }
      }
        Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();    
      
     //
           if(turno==true){
            if(e.getSource()==tablero[1][0]){
            m2.setText("Jugador 2 ");
            tablero[1][0].setText(j1);
            tablero[1][0].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[1][0]){
            m2.setText("Jugador 1 ");
            tablero[1][0].setText(j2);
            tablero[1][0].setEnabled(false);
            turno=true; 
        }
      }
            Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();  
           
           //
       if(turno==true){
            if(e.getSource()==tablero[1][1]){
            m2.setText("Jugador 2 ");
            tablero[1][1].setText(j1);
            tablero[1][1].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[1][1]){
            m2.setText("Jugador 1 ");
            tablero[1][1].setText(j2);
            tablero[1][1].setEnabled(false);
            turno=true; 
        }
      }
        Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();  
       
      //
       if(turno==true){
            if(e.getSource()==tablero[1][2]){
            m2.setText("Jugador 2 ");
            tablero[1][2].setText(j1);
            tablero[1][2].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[1][2]){
            m2.setText("Jugador 1 ");
            tablero[1][2].setText(j2);
            tablero[1][2].setEnabled(false);
            turno=true; 
        }
      }
       Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();  
       //
        if(turno==true){
            if(e.getSource()==tablero[2][0]){
            m2.setText("Jugador 2 ");
            tablero[2][0].setText(j1);
            tablero[2][0].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[2][0]){
            m2.setText("Jugador 1 ");
            tablero[2][0].setText(j2);
            tablero[2][0].setEnabled(false);
            turno=true; 
        }
      }
         Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();  
        
         if(turno==true){
            if(e.getSource()==tablero[2][1]){
            m2.setText("Jugador 2 ");
            tablero[2][1].setText(j1);
            tablero[2][1].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[2][1]){
            m2.setText("Jugador 1 ");
            tablero[2][1].setText(j2);
            tablero[2][1].setEnabled(false);
            turno=true; 
        }
      }
          Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();  
         //
          if(turno==true){
            if(e.getSource()==tablero[2][2]){
            m2.setText("Jugador 2 ");
            tablero[2][2].setText(j1);
            tablero[2][2].setEnabled(false);
            turno=false;
            }
        }
        else{
        if(e.getSource()==tablero[2][2]){
            m2.setText("Jugador 1 ");
            tablero[2][2].setText(j2);
            tablero[2][2].setEnabled(false);
            turno=true; 
        }
      }
           Fila1();
        Fila2();
        Fila3();
        Columna1();
        Columna2();
        Columna3();
        Diago1();
        Diago2();  
}
    public void Fila1(){//verificando 
        if((tablero[0][0].getText()=="X") && (tablero[0][1].getText()=="X") && (tablero[0][2].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[0][0].getText()=="O" && tablero[0][1].getText()=="O" && tablero[0][2].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
        }
    public void Fila2(){
        if((tablero[1][0].getText()=="X") && (tablero[1][1].getText()=="X") && (tablero[1][2].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[1][0].getText()=="O" && tablero[1][1].getText()=="O" && tablero[1][2].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
    
}
    public void Fila3(){
        if((tablero[2][0].getText()=="X") && (tablero[2][1].getText()=="X") && (tablero[2][2].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[2][0].getText()=="O" && tablero[2][1].getText()=="O" && tablero[2][2].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
        
    }
    public void Columna1(){
        if((tablero[0][0].getText()=="X") && (tablero[1][0].getText()=="X") && (tablero[2][0].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[0][0].getText()=="O" && tablero[1][0].getText()=="O" && tablero[2][0].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
        
    }
    public void Columna2(){
        if((tablero[0][1].getText()=="X") && (tablero[1][1].getText()=="X") && (tablero[2][1].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[0][1].getText()=="O" && tablero[1][1].getText()=="O" && tablero[2][1].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
        
    }
    
    public void Columna3(){
        if((tablero[0][2].getText()=="X") && (tablero[1][2].getText()=="X") && (tablero[2][2].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[0][2].getText()=="O" && tablero[1][2].getText()=="O" && tablero[2][2].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
        
    }
    public void Diago1(){
        if((tablero[0][0].getText()=="X") && (tablero[1][1].getText()=="X") && (tablero[2][2].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[0][0].getText()=="O" && tablero[1][1].getText()=="O" && tablero[2][2].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
        
    }
    public void Diago2(){
         if((tablero[0][2].getText()=="X") && (tablero[1][1].getText()=="X") && (tablero[2][0].getText()=="X")){
            ganador=j1;
            if(ganador==j1){
                m2.setText("Felicidades has ganado jugador 1");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
                
            }
        }else{
            if(tablero[0][2].getText()=="O" && tablero[1][1].getText()=="O" && tablero[2][0].getText()=="O"){
            ganador=j2;
            if(ganador==j2){
                m2.setText("Felicidades has ganado jugador 2");
                 for(f=0;f<3;f++){
                for(c=0;c<3;c++){
                    tablero[f][c].setEnabled(false);
                    
                }
            }
            }
            
        }
        }
        
    }
}
    
    
   













    
/*class Boton extends VetanaPrincipal{
    public JButton reiniciar;//boton para reinicar el juego, si puedo xd
    public JButton tablero[][];
    String j1,j2;
    public JLabel m1;//para saber los turnos en el qu estan
    public Boton(){//constructor
        
        m1=new JLabel("Turno");
        m1.setBounds(510,10,50,50);
        
        reiniciar=new JButton();
        reiniciar.setBounds(510,300,50,40);
}
}
}
*/
