/*
Dada una frase(sin espacios) que nos proporciona el usuario. Pasarlo a un array de char.
 */
package arrays2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio7DeStringAChar {
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = sn.next();
        
        char result[]=new char[frase.length()];
        
        for(int i=0;i<frase.length();i++){
            
            result[i]=frase.charAt(i);
            System.out.println(result[i]);
            
        }
        
    }
    
}
