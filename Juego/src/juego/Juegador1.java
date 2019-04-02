package juego;
import java.util.Scanner;
public class Juegador1{
     int pos12;
    String nom;
    Juegador1(String nom){
        this.nom=nom;
    }
    boolean Dado(){/*metodo para tirar los dados*/
        Scanner sc= new Scanner(System.in);
        int da1;
        System.out.println(" Es el turno de jugador "+this.nom);
        System.out.println("Presione x para lanzar su dado");
        sc.next("x");
       
        da1=(int)(Math.random()*6)+1;
        if(da1>6){/*como puede caer 7*/
            da1=6;
        }
        System.out.println("El Numero del dado es : "+da1);
        System.out.println("Presione z para avanzar");
        sc.next("z");
        int pos2=this.pos12;//Para mensaje en pantalla
        this.pos12=da1+pos12;
        System.out.println("Jugador" +this.nom+" se movio "+pos2+" a "+pos12);
        this.Movimientos1();
        if(pos12>121){
        System.out.println("Ganas");
        //Mandar a llamar al medtodo de subidas o bajadas
          return true;
        }
        return false;
        
     }
    void Subida1(int d, int e){//para el primer modo de juego
        System.out.println("Jugador "+this.nom+"Has caido en una escalera "+pos12+" subes a: "+e);
        this.pos12=e;
        
    }
    void Bajada1(int d, int e){// para el primer modo de juego
         System.out.println("Jugador "+this.nom+"Has caido en una serpiente "+pos12+" bajas a: "+e);
        this.pos12=e;
    }
    void Movimientos1(){// para hacer los movimientos de subir u bajar 1
        switch(this.pos12){
            case 3:
                Subida1(3,14);
                break;
            case 9:
                Subida1(9,19);
                break;
            case 6:
                Subida1(6,20);
                break;
            case 17:
                Subida1(17,21);
                break;
            case 24:
                Bajada1(24,2);
                break;
            case 16:
                Bajada1(16,5);
                break;
            case 8:
                Bajada1(8,1);
                break;
            case 12:
                Bajada1(12,4);
                break;
            case 60:
                Subida1(60,78);
                break;
            case 40:
                Subida1(40,67);
                break;
            case 88:
                Subida1(88,110);
                break;
            case 85:
                Bajada1(85,64);
                break;
            case 47:
                Bajada1(47,35);
                break;
            case 112:
                Bajada1(112,99);
                break;
            case 98:
                Bajada1(98,32);
                break;
        }
    }
}
