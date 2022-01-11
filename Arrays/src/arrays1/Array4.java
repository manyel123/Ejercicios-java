/*
Crea un array insertando numeros aleatorios entre 0 y 10. Muestralos por pantalla.
 */
package arrays1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Array4 {
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del array");
        int longitud = sn.nextInt();
        
        int numerosAleatorios[] = new int[longitud];
        
        for(int i=0;i<numerosAleatorios.length;i++){
            
            numerosAleatorios[i]=generaNumAleatorio(0,10);
            
        }
        
        System.out.println("los numeros del array son:");
        
        for(int i=0;i<numerosAleatorios.length;i++){
            
            System.out.println(numerosAleatorios[i]);
            
        }
        
    }
    
        public static int generaNumAleatorio(int minimo, int maximo){
        
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        
    }
    
}
