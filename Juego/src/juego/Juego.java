package juego;
import java.util.Scanner;
public class Juego{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("MENUN PRINCIPAL");
        System.out.println("1. Modos de juego ");
        System.out.println("Elija su opcion");
        int op=sc.nextInt();
        String c;
        
        switch(op){
            case 1:
                
                System.out.println("**MODO DE JUEGO**");
                System.out.println("1. Tablero 5x5 2 jugadores");
                System.out.println("2. Tablero 11x11 4 jugadores");
                int op2=sc.nextInt();
                switch(op2){
                    case 1:
                       Tablero t1=new Tablero();//creacion del tablero
                       
                       System.out.println("\n");
                       System.out.println("Presione (a) para iniciar el juego");
                       sc.next("a");
                       Jugador j1=new Jugador("#");//creacion de los jugadores
                       Jugador j2=new Jugador("@");//segundo jugador
                       boolean fin1;//para terminar el juego
                       
                       t1.matriz();//mando a llenar la matriz
                       do{
                       System.out.print("\n La posicion actual de  #  es: "+j1.pos12);
                        System.out.println("\n La posicion actual de @ es: "+j2.pos12+"\n");
                        
                       if (j1.Dado()==false){
                           if(j2.Dado()==false){
                               
                           }
                       }
                       fin1=j1.pos12>25||j2.pos12>25;
                     
                       }while(fin1==false);
                       if(j1.pos12>j2.pos12){
                           System.out.println("Primer lugar #");
                           System.out.println("Segundo lugar @");
                           
                       }else{
                           System.out.println("Primer lugar @");
                           System.out.println("Segundo lugar #");
                       }
                       break;
                    case 2://opcion 2
                        Tablero1 t2=new Tablero1();//creacion del tablero
                       
                       System.out.println("\n");
                       System.out.println("Presione (a) para iniciar el juego");
                       sc.next("a");
                       Juegador1 j11=new Juegador1("#");//creacion de los jugadores
                       Juegador1 j12=new Juegador1("@");//segundo jugador
                       Juegador1 j13=new Juegador1("%");
                       Juegador1 j14=new Juegador1("&");
                       boolean fin2;//para terminar el juego
                 
                       t2.matriz();//mando a llenar la matriz
                       do{
                       System.out.println("\n La posicion actual de  #  es: "+j11.pos12);
                        System.out.println("\n La posicion actual de @ es: "+j12.pos12);
                        System.out.println("\n La posicion actual de % es: "+j13.pos12);
                        System.out.println("\n La posicion actual de & es: "+j14.pos12);
                        
                       if (j11.Dado()==false){
                           if(j12.Dado()==false){
                               if(j13.Dado()==false){
                                   if(j14.Dado()==false){
                                       }
                               }
                               
                           }
                       }
                       fin2=j11.pos12>121||j12.pos12>121||j13.pos12>121||j14.pos12>121;
                     
                       }while(fin2==false);
                        
                default:
                break;
        }
                
                System.out.println("Presione s para terminar");
                c=sc.next();
                System.exit(0);
                
        }
    }
}