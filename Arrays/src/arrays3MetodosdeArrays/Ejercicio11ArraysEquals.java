/*
Indica si dos arrays creados por ti son iguales con Equals de Arrays.
 */
package arrays3MetodosdeArrays;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ejercicio11ArraysEquals {
    
    public static void main(String[] args){
        
        int num1[] = {1,2,3,4,5};
        int num2[] = {1,2,3,4,6};

        System.out.println(Arrays.equals(num1, 0, num1.length, num2, 0, num2.length));
        
    }
    
}
