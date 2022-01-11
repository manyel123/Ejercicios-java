/*
Mostrar numeros del 1 al 100 que sean divisibles entre 2 y 3 (ambos)
 */
package basicos2Bucles;

/**
 *
 * @author PC
 */
public class DivisiblesEntre2y3 {
    
    public static void main(String[] args){
        
        for(int i = 1; i<=100; i++){

            if(i%2==0 && i%3==0){
                System.out.println(i);
            }
        }               
    }
}
