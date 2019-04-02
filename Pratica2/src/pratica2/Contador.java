
package pratica2;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Contador extends Thread {
    public static int segundo=60;
    public JLabel contador;
    
    public Contador(String msg,JLabel contador1){
        super(msg);
        this.contador=contador1;
         
       
    }
    
    @Override
    public void run(){
        for(int i=60;i>=0;i--){
            try {
                
                Contador.segundo=i; 
                contador.setText(Contador.segundo+"");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
       Tiempo();
        
    }
    public void Tiempo(){
        if(Contador.segundo==0){
            Arreglo.jugador[NewJFrame.jugadores]=new Jugador(NewJFrame.nombre,NewJFrame.punteo); 
            NewJFrame.jugadores++;
            NewJFrame.inicio.setEnabled(true);
            for(int j=0;j<NewJFrame.Arcaica.length;j++){
                if(NewJFrame.Arcaica[j]!=null){
                    NewJFrame.Arcaica[j].stop();
                }
            }
            for(int j=0;j<NewJFrame.Cazador.length;j++){
                if(NewJFrame.Cazador[j]!=null){
                    NewJFrame.Cazador[j].stop();
                }
            }
            for(int j=0;j<NewJFrame.Caotica.length;j++){
                if(NewJFrame.Caotica[j]!=null){
                    NewJFrame.Caotica[j].stop();
                }
            }
            for(int j=0;j<NewJFrame.disparo.length;j++){
                if(NewJFrame.disparo[j]!=null){
                    NewJFrame.disparo[j].stop();
                }
            }
            
               for(int j=0;j<NewJFrame.enemigasA.length;j++){
            if(NewJFrame.enemigasA[j]!=null){
            NewJFrame.enemigasA[j].setVisible(false);
            }
        }
        for(int j=0;j<NewJFrame.enemigasC.length;j++){
            if(NewJFrame.enemigasC[j]!=null){
            NewJFrame.enemigasC[j].setVisible(false);
            }
        }
        for(int j=0;j<NewJFrame.enemigasCt.length;j++){
            if(NewJFrame.enemigasCt[j]!=null){
            NewJFrame.enemigasCt[j].setVisible(false);
            }
        }
        for(int j=0;j<NewJFrame.mimisil.length;j++){
            if(NewJFrame.mimisil[j]!=null){
            NewJFrame.mimisil[j].setVisible(false);
            }
        }
        JOptionPane.showMessageDialog(null, "Se Agoto el tiempo su puntos fueron "+NewJFrame.punteo);
            NewJFrame.crono.stop();
            NewJFrame.choque.stop();
            
        }
        
    }
}


class Colision extends Thread{
    
    public boolean hacer=true;
    public static ImageIcon explo;
    
    public static int contador1=0;
    public static int contador2=0;
    
    public Colision(){
        Colision.explo=new ImageIcon("explosion.png");
        
    }
    
    @Override
    public void run(){
        while(hacer==true){
            
            EliminarArcaico();
            EliminarCazador();
            ComprobarChoques1();
            ComprobarChoques2();
            ComprobarChoques3();
            
        }
    }
    
    public void EliminarArcaico(){
        for(int j=0;j<NewJFrame.disparo.length;j++){
                if(NewJFrame.disparo[j]!=null){
                    int posx1=NewJFrame.disparo[j].getMx();
                    int posy1=NewJFrame.disparo[j].getMy();
                    for(int i=0;i<NewJFrame.Arcaica.length;i++){
                        if(NewJFrame.Arcaica[i]!=null){
                        int pos1=NewJFrame.Arcaica[i].Enx;
                        int pos2=NewJFrame.Arcaica[i].Eny;
                        
                        if(Verificar(posx1,posy1,pos1,pos2) ){
                            
                            //Colision.contador1=Colision.contador1+1;
                            //System.out.println(Colision.contador1+"");
                            
                              System.out.println("Chocaron");
                              NewJFrame.mimisil[j].setVisible(false);
                              NewJFrame.mimisil[j]=null;
                              NewJFrame.disparo[j]=null;
                              
                               
                            try {
                                 NewJFrame.explosion.setBounds(posx1,posy1,20,20);
                                 NewJFrame.explosion.setIcon(explo);
                                 NewJFrame.explosion.setVisible(true);
                                Thread.sleep(90);
                                NewJFrame.explosion.setVisible(false);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                            
                             // if(Colision.contador1==1){
                                   
                                          NewJFrame.Arcaica[i]=null;
                                          NewJFrame.enemigasA[i].setVisible(false);
                                          NewJFrame.enemigasA[i]=null;
                                          NewJFrame.punteo+=10;
                                          NewJFrame.score.setText(NewJFrame.punteo+"");
                                        //Colision.contador1=0;
                              //}
                            
                    }
                    }
                 }
            }
        }
    }
    
    public void EliminarCazador(){
        for(int j=0;j<NewJFrame.disparo.length;j++){
                if(NewJFrame.disparo[j]!=null){
                    int posx1=NewJFrame.disparo[j].getMx();
                    int posy1=NewJFrame.disparo[j].getMy();
                    for(int i=0;i<NewJFrame.Cazador.length;i++){
                        if(NewJFrame.Cazador[i]!=null){
                        int pos1=NewJFrame.Cazador[i].Enx;
                        int pos2=NewJFrame.Cazador[i].Eny;
                        if((pos1==posx1 || pos1==posx1-5 || pos1==posx1-10 ||pos1==posx1+5 || pos1==posx1+10)  && (pos2>posy1 && pos2<posy1+40) ){
                            
                           // Colision.contador2=Colision.contador2+1;
                            //System.out.println(Colision.contador2+"");
                            
                            NewJFrame.mimisil[j].setVisible(false);
                            NewJFrame.mimisil[j]=null;
                            NewJFrame.disparo[j]=null;
                            
                            
                            try {
                                
                                NewJFrame.explosion.setBounds(posx1,posy1,20,20);
                               NewJFrame.explosion.setIcon(explo);
                               NewJFrame.explosion.setVisible(true);
                                Thread.sleep(90);
                                NewJFrame.explosion.setVisible(false);
                                
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                           //if(Colision.contador2==1){
                                
                                
                                NewJFrame.score.setText(NewJFrame.punteo+"");
                                System.out.println("Chocaron");
                                NewJFrame.enemigasC[i].setVisible(false);
                                NewJFrame.enemigasC[i]=null;
                                NewJFrame.punteo+=20;
                                //NewJFrame.disparo[j]=null;
                                NewJFrame.Cazador[i]=null;
                                Colision.contador2=0;
                           // }
                        }
                    else{
                       // System.out.println("No chocaron");
                    }
                    }
                }
            }
        }
    }
    
    public void ComprobarChoques1(){
        for(int j=0;j<NewJFrame.Arcaica.length;j++){
            if(NewJFrame.Arcaica[j]!=null){
                int posx=NewJFrame.Arcaica[j].getEnx();
                int posy=NewJFrame.Arcaica[j].getEny();
                int pos1=NewJFrame.avion.getPosx();
                int pos2=NewJFrame.avion.getPosy();
                
                if((posx>pos1 && posx<pos1+40 && posy>pos2 && posy<pos2+40) ||(posx<pos1 && posx+20>pos1 && posy>pos2 && posy<pos2+40)||(posx<pos1 && posx+20>pos1 && (posy+20)==pos2)   ){
                    System.out.println("GameOver");
                    //System.exit(0);
                    Muerto();
                    
                }
                
                
            }
        }
        
    }
    public void ComprobarChoques2(){
        for(int j=0;j<NewJFrame.Cazador.length;j++){
            if(NewJFrame.Cazador[j]!=null){
                int posx=NewJFrame.Cazador[j].getEnx();
                int posy=NewJFrame.Cazador[j].getEny();
                int pos1=NewJFrame.avion.getPosx();
                int pos2=NewJFrame.avion.getPosy();
                
                if((posx>pos1 && posx<pos1+40 && posy>pos2 && posy<pos2+40) ||(posx<pos1 && posx+20>pos1 && posy>pos2 && posy<pos2+40)||(posx<pos1 && posx+20>pos1 && (posy+20)==pos2)  ){
                    System.out.println("GameOver");
                    Muerto();
                }
                
                
            }
        }
        
        
    }
    public void ComprobarChoques3(){
        for(int j=0;j<NewJFrame.Caotica.length;j++){
            if(NewJFrame.Caotica[j]!=null){
                int posx=NewJFrame.Caotica[j].getEnx();
                int posy=NewJFrame.Caotica[j].getEny();
                int pos1=NewJFrame.avion.getPosx();
                int pos2=NewJFrame.avion.getPosy();
                
                if((posx>pos1 && posx<pos1+40 && posy>pos2 && posy<pos2+40) ||(posx<pos1 && posx+20>pos1 && posy>pos2 && posy<pos2+40)||(posx<pos1 && posx+20>pos1 && (posy+20)==pos2)  ){
                    System.out.println("GameOver");
                    Muerto();
                }
                
                
            }
        }
        
        
    }
    public boolean Verificar(int posx1,int posy1,int pos1,int pos2){
        boolean choco=false;
        
        if((pos1==posx1 || pos1==posx1-5 || pos1==posx1-10 ||pos1==posx1+5 || pos1==posx1+10)){
            
            if(pos2>posy1 && pos2<posy1+40){
                choco=true;
            }
            
            
        }
        return choco;
    }
    
    
    
    public void Muerto(){
        
        
        NewJFrame.vivo=false;
        if(NewJFrame.vivo==false){
             
            Arreglo.jugador[NewJFrame.jugadores]=new Jugador(NewJFrame.nombre,NewJFrame.punteo); 
            NewJFrame.jugadores++;
            
            NewJFrame.inicio.setEnabled(true);
            for(int j=0;j<NewJFrame.Arcaica.length;j++){
                if(NewJFrame.Arcaica[j]!=null){
                    NewJFrame.Arcaica[j].stop();
                }
            }
            for(int j=0;j<NewJFrame.Cazador.length;j++){
                if(NewJFrame.Cazador[j]!=null){
                    NewJFrame.Cazador[j].stop();
                }
            }
            for(int j=0;j<NewJFrame.Caotica.length;j++){
                if(NewJFrame.Caotica[j]!=null){
                    NewJFrame.Caotica[j].stop();
                }
            }
            for(int j=0;j<NewJFrame.disparo.length;j++){
                if(NewJFrame.disparo[j]!=null){
                    NewJFrame.disparo[j].stop();
                }
            }
            
            for(int j=0;j<NewJFrame.enemigasA.length;j++){
            if(NewJFrame.enemigasA[j]!=null){
            NewJFrame.enemigasA[j].setVisible(false);
            }
        }
        for(int j=0;j<NewJFrame.enemigasC.length;j++){
            if(NewJFrame.enemigasC[j]!=null){
            NewJFrame.enemigasC[j].setVisible(false);
            }
        }
        for(int j=0;j<NewJFrame.enemigasCt.length;j++){
            if(NewJFrame.enemigasCt[j]!=null){
            NewJFrame.enemigasCt[j].setVisible(false);
            }
        }
        for(int j=0;j<NewJFrame.mimisil.length;j++){
            if(NewJFrame.mimisil[j]!=null){
            NewJFrame.mimisil[j].setVisible(false);
            }
        }
            
            JOptionPane.showMessageDialog(null, "GAME OVER SU PUNTEO FUE DE "+NewJFrame.punteo+"","Perdio",JOptionPane.WARNING_MESSAGE);
            NewJFrame.crono.stop();
            NewJFrame.choque.stop();    
        }
         
        
        
        
    }
}
