package tarea1;
import java.util.Scanner;
public class problema2 {
    /*problema 2*/
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        if(a%2==0)/*operado % sirve para saber el residuo de una division*/
        {
            System.out.println("EL NUMERO ES PAR");
        } else
            if(a%2!=0){
                System.out.println("EL NUMERO ES IMPAR");
            }
    }
    
}
