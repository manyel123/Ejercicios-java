/*
Dado un array de números, indicar si es capicua, es decir, si se lee igual tanto por delante como por detras.
 */
package arrays2;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ejercicio8ComparaArrays {
    
    public static void main(String[] args){
        
        int numeros[] = {0,1,0,0};
        
        int resultado [] = new int[numeros.length];
        
        for(int i=numeros.length-1, j=0;i>=0;i--,j++){
            
            resultado[j]=numeros[i];         
            System.out.println(numeros[j]);
        }       
        
        if(Arrays.equals(numeros, resultado)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }         

    }
    
}
