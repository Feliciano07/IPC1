package syb;
import syb.Jugador;
import java.util.Scanner;
public class SyB {
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("MENUN PRINCIPAL");
        System.out.println("1. Iniciar juego");
        System.out.println("2 Reanudar juego");
        System.out.println("Configuracion");
        System.out.println("Salir");
        System.out.println("Elija su opcion");
        int op=sc.nextInt();
        switch(op){
            case 1:
                Jugador j1=new Jugador();
                Jugador j2=new Jugador();
                boolean fin;
                do{
                    j1.tirar();
                    j2.tirar();
                fin=j1posicion==25|| j2.posicion==25
                    
                }while(fin)
                break;
            case 2: 
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        
   
     }
}
