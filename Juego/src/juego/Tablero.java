/*Tablero del juego de 5x5*/
package juego;
public class Tablero {
public int[][] casilla;
int contador1=21;
int contador2=20;
int contador3=11;
int contador4=10;
int contador5=1;
void matriz(){
    casilla=new int[5][5];
       for(int f=0;f<5;f++){
        if(f==0){
             System.out.print("\n");
            for(int c=0;c<5;c++){
            casilla[f][c]=contador1;
            System.out.print(" |  "+casilla[f][c]+"  | ");
            contador1++;
            
            }
        }else if(f==1){
            System.out.print("\n");
            for(int c=0;c<5;c++){
            casilla[f][c]=contador2;
            System.out.print(" |  "+casilla[f][c]+"  | ");
            contador2--;
        } 
        }else if(f==2){
            System.out.print("\n");
            for(int c=0;c<5;c++){
            casilla[f][c]=contador3;
            System.out.print(" |  "+casilla[f][c]+"  | ");
            contador3++;
                
                }
    }else if(f==3){
            System.out.print("\n");
            for(int c=0;c<5;c++){
            casilla[f][c]=contador4;
            System.out.print(" |  "+casilla[f][c]+"  |  ");
            contador4--;
                
                }
    }else if(f==4){
            System.out.print("\n");
            for(int c=0;c<5;c++){
            casilla[f][c]=contador5;
            System.out.print(" |  "+casilla[f][c]+"  |  ");
            contador5++;
                
                }
    }
        
    }
    }
}

