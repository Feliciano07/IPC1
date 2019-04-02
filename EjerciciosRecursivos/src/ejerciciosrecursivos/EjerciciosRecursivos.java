
package ejerciciosrecursivos;

public class EjerciciosRecursivos {

    
    public static void main(String[] args) {
        int escaleras=30;
        Bajar(escaleras);
        
        int base=2;
        int potencia=3;
        
        int resultado=Potencia(base,potencia);
        System.out.println(resultado);
        
        
        
    }
    
    //CREAR UN METODO PARA BAJAR ESCALERAS
    
    public static void Bajar(int numero){
        
        if(numero!=0){
            System.out.println("Bajo el escalon "+numero);
            Bajar(numero-1);
        }else{
            System.out.println("Ha llegado al final");
        }
        
    }
    
    
    //Creando un metodo para elevar un numero a la numero^n
    //ingreso el 2 y una potencia de 3
    public static int Potencia(int numero,int potencia){
        int acumulado;
        if(potencia>1){
            acumulado=numero*Potencia(numero,potencia-1);
            
        }else{
            return numero;
        }
        return acumulado;
        
    }
    
    
    
}
