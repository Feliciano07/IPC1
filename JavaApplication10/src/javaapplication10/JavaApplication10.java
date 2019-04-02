package javaapplication10;
public class JavaApplication10 {
    public static void main(String[] args) {
         int contador=0;
          int casilla[][];
          casilla=new int[5][5];
          for(int f=0;f<5;f++){
              System.out.print("\n");
              for(int c=0;c<5;c++){
                 casilla[f][c]=contador+1;
                  System.out.print(" |"+casilla[f][c]+"| ");
                  contador++;
        }
    }
      
        
    }
    
}
