
package hilos;

//HEREDANDO
public class Hilos extends Thread {

    @Override
    public void run(){
        System.out.println("Hola ");
    }
    
    public static void main(String[] args) {
        //HERENCIA
       Thread t=new Hilos();
        Thread t1=new Thread(new Hilos2());
       //Iniciar 
       
       t.start();
       
       t1.start();
       //IMPLEMENTS 
      
       
    }
    
}

//IMPLEMENTANDO
class Hilos2 implements Runnable{

    @Override
    public void run() {
         System.out.println("Que tal estas");
    }
    
}
