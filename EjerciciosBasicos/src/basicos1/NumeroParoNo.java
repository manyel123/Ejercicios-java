/*
Indicar si un numero pasado por consola es par o no
 */
package basicos1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NumeroParoNo {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        
        if((num%2)!= 0){ /* % se usa para hallar el residuo de la división de num entre 2, si el residuo difiere de 0 num es impar*/
            
            System.out.println(num + " es impar");
        }else{
            System.out.println(num + " es par");
        }
    }
}
