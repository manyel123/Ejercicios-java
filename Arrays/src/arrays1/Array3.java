/*
Crea un array de una longitud que determine el usuario y que le permita insertar numeros entre 0 y 10
 */
package arrays1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Array3 {
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño del array");
        int longitud = sn.nextInt();
        
        int numeros[] = new int[longitud];
        
        int num;
        
        for(int i=0;i<numeros.length;i++){
            
            do{
                
                System.out.println("Ingrese un número en la posición " + i);
                
                num = sn.nextInt();
                
                if(!(num>=0 && num<=10)){
                    System.out.println("Error solo números del 0 al 10. "
                            + "Ingrese un número en la posición " + i);
                }
                
            }while(!(num>=0 && num<=10));
            
            numeros[i]=num;
            
        }
        
        System.out.println("Estos son los números elegidos por el usuario");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
    }
    
}
