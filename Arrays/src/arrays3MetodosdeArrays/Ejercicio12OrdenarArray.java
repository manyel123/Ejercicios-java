/*
Ordena un array de números con Sort de Arrays.
 */
package arrays3MetodosdeArrays;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ejercicio12OrdenarArray {
    
    public static void main(String[] args){
        
        int numeros[] = {1,5,8,7,3,4};
        
        Arrays.sort(numeros);
        
        for(int i=0; i<numeros.length;i++){
            System.out.print(numeros[i]);
        }
        
    }
    
}
