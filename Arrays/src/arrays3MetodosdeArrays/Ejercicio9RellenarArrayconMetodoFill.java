/*
Rellenar un array de numeros (int) usando el metodo fill de Arrays.

 */
package arrays3MetodosdeArrays;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ejercicio9RellenarArrayconMetodoFill {
    
    public static void main(String[] args){
        
        int numeros[] = new int [10];
        
        Arrays.fill(numeros, 20);/*llena todas las posiciones del array "numeros" con -1*/
        
        Arrays.fill(numeros, 3, 5, -1); /* No incluye la posicion final al rellenar este rango*/
        
        for(int i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
    }
    
}
