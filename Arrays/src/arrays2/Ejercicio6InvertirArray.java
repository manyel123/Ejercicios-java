/*
Dado un array de números (podemos declarar los valores de forma inmediata), invertir los valores.
El primero en el final, el final en el primero, y asi con todos.
 */
package arrays2;

/**
 *
 * @author PC
 */
public class Ejercicio6InvertirArray {
    
    public static void main(String[] args){
        
        int numeros[] = {0,1,2,3,4,5,6,7,8,9};
        
        int resultado [] = new int[numeros.length];
        
        for(int i=numeros.length-1, j=0;i>=0;i--,j++){
            
            resultado[j]=numeros[i];         

        }       
        
        numeros=resultado;
        
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
    }
    
}
