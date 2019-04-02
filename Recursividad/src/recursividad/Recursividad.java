
package recursividad;

public class Recursividad {

    public static void main(String[] args) {
        
       //NUMEROS 
      int numero= 5;
      int resultado=Suma(numero);
        System.out.println(resultado);
        
        int factorial=Factorial(numero);
        System.out.println(factorial);
        
        int serie=Fibonacci(numero);
        System.out.println(serie);
        
        //ARREGLO
        String [] nombre={"Juanaaa","Pedro","Maria","Marta"};
       
        MostrarRecursivo(nombre,0);
        System.out.println("");
     
        String buscar="Maria";
        BuscaRecursiva(nombre,buscar,0);
        
        
        System.out.println("");
        eliminar(nombre,buscar,0);
        
        System.out.println("");
        //MATRICES
        String [][]nombre1={
            {"Fernando:"," "," "},
                {"Te quiero","Mucho","Sindy <3"}
        
        };
        
        MostrarMatriz(nombre1,0,0);
        
        
    }
    //***RECURSIVIDAD CON MATRICES
    
    public static void MostrarMatriz(String [][] nombre,int fila,int colum){
        
        System.out.print(nombre[fila][colum]+" ");
        if(fila!=nombre.length-1 | colum!=nombre[fila].length-1){
            
            //MostrarMatriz(nombre,fila,colum+1);
            
            if(colum==nombre[fila].length-1){
                fila++;
                colum=0;
                System.out.println("");
            }else{
                colum++;
            }
            MostrarMatriz(nombre,fila,colum);
            
            
        }
        
        
        
    }
    
    
    
    //****RECURSIVIDAD CON ARREGLOS****//
    public static void MostrarRecursivo(String [] nombre,int indice){
        //int numero=0;
        if(indice!=nombre.length){
            System.out.println(nombre[indice]);
            //numero++;
            MostrarRecursivo(nombre,indice+1);
            
        }else{
            
        }
        
        
        
    }
    public static void BuscaRecursiva(String  []nombre,String elemento,int indice){
        if(elemento.equals(nombre[indice])){
            System.out.println(nombre[indice]);
        }else{
            BuscaRecursiva(nombre,elemento,indice+1);
        }
        
        
    }
    public static void eliminar(String []nombre,String elemento,int indice){
        if(elemento.equals(nombre[indice])){
            int aux=indice;
            //nombre[indice]=null;
            
            for(int j=aux;j<nombre.length;j++){
                //nombre[aux]=null;
                nombre[aux+1]=nombre[aux];
                nombre[aux+1]=null;
            
        }
            MostrarRecursivo(nombre,0);
            
            
        }else{
            eliminar(nombre,elemento,indice+1);
        }
        
        
        
    }
    
    //RECURSIVIDIDAD CON OPERACIONES BASICAS
    
    public static int Suma(int numero){
        int res;
        if(numero>1){
            res=numero+Suma(numero-1);
            
        }else{
            return 1;
        }
        
        return res;
    }
    public static int Factorial(int numero){
        int fac;
        if(numero>1){
            fac=numero*Factorial(numero-1);
            
        }else{
            return 1;
        }
        return fac;
    }
    public static int Fibonacci(int numero){
        int serie;
        if(numero>1){
            serie=Fibonacci(numero-1)+Fibonacci(numero-2);
            
        }else{
            return 1;
        }
        return serie;
    }
}
