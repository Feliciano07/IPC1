
package pratica2;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiNave extends JLabel {
    public static int posx;
    int posy;
 
    ImageIcon nave;
    public MiNave(){
        posx=200;
        posy=570;
        
        
        nave=new ImageIcon("1.png");
        this.setIcon(nave);
        this.setBounds(posx,posy,40,40);        
        
        
    }
    
    
    
    
  public void MoverIzquierda(){
      
      nave=new ImageIcon("1.png");
      setIcon(nave);
      posx=posx-15;
      setBounds(posx,posy,40,40);
     // this.mipanel.add(milabel);
      
  }
   public void MoverDerecha(){
      
      nave=new ImageIcon("1.png");
       setIcon(nave);
      posx=posx+15;
      setBounds(posx,posy,40,40);
     // this.mipanel.add(milabel);
      
  }
    
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
}

class MiMisil extends Thread{
    
    
    ImageIcon disparo;
    public JLabel misil2;
    String mensaje;
    MiNave posicion;
    public int Mx;
    public int My;
    public MiMisil(String msg,JLabel misil){
        super(msg);
        this.misil2=misil;
    }
    
    @Override
    public void run(){
        Mx=MiNave.posx;
        //System.out.println("hola");
        //misil2.setLocation(20, 400);
        for(int i=550;i>0;i--){
            My=i;
            try {
                //System.out.println(i+"avanza");
                disparo=new ImageIcon("5.png");
                misil2.setHorizontalAlignment(JLabel.CENTER);
                misil2.setVerticalAlignment(JLabel.CENTER);
                 misil2.setIcon(disparo);
                 //misil2.setOpaque(true);
                 //misil2.setBackground(Color.WHITE);
                 misil2.setBounds(Mx,My,40,40);
                
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(MiMisil.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        misil2.setVisible(false);
    }
   public void Eliminiar(){
       misil2.setVisible(false);
   }
    
    public int getMx() {
        return Mx;
    }

    public void setMx(int Mx) {
        this.Mx = Mx;
    }

    public int getMy() {
        return My;
    }

    public void setMy(int My) {
        this.My = My;
    }
     
}


