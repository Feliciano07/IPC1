package tarea1;
import java.util.Scanner;
public class Tarea1 {
    /*problema 2*/
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO");
        long  a=sc.nextInt();
        String cadena;
        cadena=Long.toString(a);/*Para covertir el entero a cadena*/
        System.out.println("NUMERO DE DIGITOS  "+ cadena.length());
        
    }
    
}
