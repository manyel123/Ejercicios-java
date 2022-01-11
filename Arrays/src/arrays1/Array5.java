/*
Crea un array que contenga las letras del abecedario (en mayusculas) y que nos permita ir 
cogiendo letras de sus posiciones hasta que insertemos un -1 (si no esta en el array se vuelve a pedir).
 */
package arrays1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Array5 {
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese una posición. Para terminar ingrese -1");
        int posicion = sn.nextInt();      
        
        char abecedario[] = new char[91-65];
        
        for(int i=0;i<abecedario.length;i++){
            
            abecedario[i] = (char)(i+65);

        }
        
        while(posicion!=-1){
            
            System.out.println("la letra en la posición " + posicion + " es " + abecedario[posicion]);
            System.out.println("Ingrese una posición. Para terminar ingrese -1");
            posicion = sn.nextInt();
            
        }
          
    }
    
}
