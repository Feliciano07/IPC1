package syb;
import java.util.Scanner;
public class Jugador {
    int posicion;
    void tirar(){
    String a;
    Scanner entrada =new Scanner(System.in);
    int da1=(int)(Math.random()*6)+1;
    int gposicion=posicion;
    this.posicion+=da1;
    System.out.println("El numero obtenido es: "+posicion+" Presione n para avanzar");
    a=entrada.next();
    if(this.posicion==25){
        System.out.println("Has ganado");
    }
    }
    
}
