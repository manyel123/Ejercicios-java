/*
Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
Por ejemplo: si introduzco un 97, me muestre una a.
 */
package basicos1;

import java.util.Scanner;
/**
 *
 * @author PC
 */
public class TablaAscii {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una número");
        int num = sc.nextInt();
        
        char caracter = (char)num; /*Muestra el caracter que esta en esa posición de la tabla ascii*/
        
        System.out.println("El numero " + num + " corresponde al caracter '" + caracter + "'");
        
    }
}
