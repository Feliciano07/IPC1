
package pratica2;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Enemigo extends Thread {
    
    public ImageIcon naves;
    public JLabel enemigo;
    public JLabel enemigo1;
    public JLabel enemigo2;
    
    public static int tipo=0;
    
    String mensaje;
    public int Enx;
    public int Eny;
    
    String direccion[]={"arcaico.png","caotica.png","cazador.png"};
    int Posicionx[]={50,90,130,170,210,290,330,370,410,450};
    //,210,290,330,370,410,450
    
    public Enemigo(String msg,JLabel enemigo){
        super(msg);
        this.enemigo=enemigo;
        
        this.Eny=70;
    }

    public int getEnx() {
        return Enx;
    }

    public void setEnx(int Enx) {
        this.Enx = Enx;
    }

    public int getEny() {
        return Eny;
    }

    public void setEny(int Eny) {
        this.Eny = Eny;
    }
    
    
    @Override
    public void run(){
       
        /*try {
                
                Thread.sleep(2000);
              } catch (InterruptedException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        
        //while(NewJFrame.vivo==true){
            
          
        //int tipo=(int)(Math.random()*3);
        
        if(Enemigo.tipo==0){
            try {
                Thread.sleep(1000);
                //contenido.add(enemigas);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //int posiX =(int)(Math.random()*450)+1;
            int posiX =(int)(Math.random()*10);
            int posicion=Posicionx[posiX];
            for(int i=70;i<650;i++){
                int posy=i;
                try {
                    
                    
                    Arcaico(posicion,posy);
                    //Destruccion(posicion,posy);
                    
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
                }
               

           }   
        }
        if(Enemigo.tipo==1){
            try {
                Thread.sleep(2000);
                //contenido.add(enemigas);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
             //int posiX =(int)(Math.random()*450)+1;
             int posiX =(int)(Math.random()*10);
              int posicion=Posicionx[posiX];
                for(int i=70;i<650;i++){
                 try {
                     int posy=i;
                     
                     Cazador(posicion,posy);
                     //Destruccion(posicion,posy);
                     Thread.sleep(10);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
                 }
                

            }
        }
        if(Enemigo.tipo==2){
            try {
                Thread.sleep(2500);
                //contenido.add(enemigas);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
             //int posiX =(int)(Math.random()*450)+1;
             int posiX =(int)(Math.random()*10);
              int posicion=Posicionx[posiX];
            for(int i=70;i<650;i++){
                 try {
                     int posy=i;
                     
                     Caotica(posicion,posy);
                     //Destruccion(posicion,posy);
                     
                     Thread.sleep(10);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
                 }
            
            
        }
        }
        //} 
    }
    public void EliminarNaves(){
        enemigo.setVisible(false);
    }
    public void Arcaico(int x,int y){
        this.Enx=x;
        this.Eny=y;
        naves=new ImageIcon(direccion[0]);
        enemigo.setIcon(naves);
        //enemigo.setOpaque(true);
        //enemigo.setBackground(Color.WHITE);
        enemigo.setBounds(Enx,Eny,40,40);
        //enemigo.setVisible(true);
    }
    public void Cazador(int x,int y){
        this.Enx=x;
        this.Eny=y;
        naves=new ImageIcon(direccion[2]);
        enemigo.setIcon(naves);
        //enemigo.setOpaque(true);
        //enemigo.setBackground(Color.WHITE);
        enemigo.setBounds(Enx,Eny,40,40);
        //enemigo.setVisible(true);
    }
    public void Caotica(int x,int y){
        this.Enx=x;
        this.Eny=y;
         naves=new ImageIcon(direccion[1]);
        enemigo.setIcon(naves);
        //enemigo.setOpaque(true);
        //enemigo.setBackground(Color.WHITE);
        enemigo.setBounds(Enx,Eny,40,40);
        //enemigo.setVisible(true);
    }
    
    
   /* public void Destruccion(int posx, int posy){
        int pos1=posx;
        int pos2=posy;
        for(int j=0;j<NewJFrame.disparo.length;j++){
            if(NewJFrame.disparo[j]!=null){
                int posx1=NewJFrame.disparo[j].getMx();
                int posy1=NewJFrame.disparo[j].getMy();
                if((pos1==posx1 || pos1==posx1-5 || pos1==posx1-10 ||pos1==posx1+5 || pos1==posx1+10)  && pos2>posy1 && pos2<posy1+40 ){
                    System.out.println("Chocaron");
                    NewJFrame.disparo[j].Eliminiar();
                    enemigo.setVisible(false);
                    NewJFrame.disparo[j]=null;
                    
                    
                }
                else{
                   // System.out.println("No chocaron");
                }
                 
                
            }
        }
        
    }*/
   
}
