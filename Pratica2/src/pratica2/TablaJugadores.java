
package pratica2;
import java.awt.Color;
 import javax.swing.*;

public class TablaJugadores extends JFrame{
    
    JTable mitabla;
    JScrollPane scroll;
    public TablaJugadores(){
        
        String titulos[]={"Jugador","Punteo"};
            String[] campos[]=obtenerdatos();
            mitabla=new JTable(campos,titulos);
            mitabla.setEnabled(false);
            mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            mitabla.setFont(new java.awt.Font("Castellar", 3, 15));
            scroll=new JScrollPane(mitabla);
            scroll.setBounds(50,50,300,200);
            scroll.setViewportView(mitabla);
        
        add(scroll);
        
        
        
        
        setResizable(false);
        setLocation(200,50);
        setSize(500,300);
        setLayout(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posiblemente cambiarlo
        setTitle("Punteo");
        getContentPane().setBackground(Color.WHITE);
    }
    private String [][] obtenerdatos(){
        String campos [][]=new String[NewJFrame.jugadores][2];
        for(int y=0;y<campos.length;y++){
            campos[y][0]=Arreglo.jugador[y].getNombre();
            campos[y][1]=Arreglo.jugador[y].getScore()+"";
        }
        return campos;
}
}
