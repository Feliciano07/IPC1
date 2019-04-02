package juego;

public class Tablero1 {
public int[][] casilla;
int contador1=121;
int contador2=110;
int contador3=89;
int contador4=88;
int contador5=67;
int contador6=66;
int contador7=45;
int contador8=44;
int contador9=23;
int contador10=22;
int contador11=1;


void matriz(){
    casilla=new int[11][11];
       for(int f=0;f<11;f++){
        if(f==0){
             System.out.print("\n");
            for(int c=0;c<11;c++){
            casilla[f][c]=contador1;
            System.out.print(" | "+casilla[f][c]+" | ");
            contador1++;
            
            }
        }else if(f==1){
            System.out.print("\n");
            for(int c=0;c<11;c++){
            casilla[f][c]=contador2;
            System.out.print(" | "+casilla[f][c]+" | ");
            contador2--;
        } 
        }else if(f==2){
            System.out.print("\n");
            for(int c=0;c<11;c++){
            casilla[f][c]=contador3;
            System.out.print(" | "+casilla[f][c]+"  | ");
            contador3++;
                
                }
    }else if(f==3){
            System.out.print("\n");
            for(int c=0;c<11;c++){
            casilla[f][c]=contador4;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador4--;
                
                }
    }else if(f==4){
            System.out.print("\n");
            for(int c=0;c<11;c++){
            casilla[f][c]=contador5;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador5++;
                
                }
    }else if(f==5){
        System.out.print("\n");
            for(int c=0;c<11;c++){
            casilla[f][c]=contador6;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador6--;
            }
        
    }else if(f==6){
        System.out.print("\n");
           for(int c=0;c<11;c++){
            casilla[f][c]=contador7;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador7++;
            }
        
    }else if(f==7){
        System.out.print("\n");
           for(int c=0;c<11;c++){
            casilla[f][c]=contador8;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador8--;
            }
        
    }else if(f==8){
        System.out.print("\n");
           for(int c=0;c<11;c++){
            casilla[f][c]=contador9;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador9++;
            }
        
    }else if(f==9){
        System.out.print("\n");
           for(int c=0;c<11;c++){
            casilla[f][c]=contador10;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador10--;
            }
        
    }else if(f==10){
        System.out.print("\n");
           for(int c=0;c<11;c++){
            casilla[f][c]=contador11;
            System.out.print(" | "+casilla[f][c]+" |  ");
            contador11++;
            }
        
    }
    }
    }
}
