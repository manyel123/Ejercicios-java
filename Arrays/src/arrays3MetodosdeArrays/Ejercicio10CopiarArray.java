/*
Crear dos arrays, rellenar uno con números y copiarlo al otro usando CopyOf de Arrays.
 */
package arrays3MetodosdeArrays;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ejercicio10CopiarArray {
    
    public static void main(String[] args){
        
        int num1[] = {1,2,3,4,5};
        int num2[] = Arrays.copyOf(num1, num1.length);
        
        for(int i=0; i<num1.length;i++){
            System.out.print(num1[i]);
        }
        for(int i=0; i<num2.length;i++){
            System.out.print(num2[i]);
        }
        
    }
    
}
