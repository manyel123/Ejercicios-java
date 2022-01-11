/*
Crea un array de una longitud que determine el usuario y que le permita insertar numeros entre 10 y 20 unicamente.
 */
package arrays9.ejerciciospropuestos;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del array");
        
        int longitud = sn.nextInt();
        
        int numeros[] = new int[longitud];
        
        int num;
        
        for(int i=0; i<numeros.length;i++){
                
            do{
                
                System.out.println("Ingrese un numero entre 10 y 20 en la posición " + i);
                num = sn.nextInt();
            
                if(!(num>=10 && num<=20 )){
                
                    System.out.println("Error solo números entre 10 y 20"
                            + ". Intente nuevamente");
                
                }               
                
            }while(!(num>=10 && num<=20 ));
            
            numeros[i]=num;
            
        }
        
        System.out.println("Los numeros ingresados son: ");
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.println(numeros[i]);
            
        }
        
    }
    
}
