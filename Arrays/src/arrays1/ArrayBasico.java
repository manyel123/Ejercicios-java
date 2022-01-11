/*
Crea un array que contenga los numeros del 1 al 100. Muestralos por pantalla.
 */
package arrays1;

/**
 *
 * @author PC
 */
public class ArrayBasico {
    
    public static void main(String[] args){
        
        int numeros[] = new int[100];
        
        for(int i=0;i<numeros.length;i++){            
            numeros[i]=i+1;
            System.out.println(numeros[i]);
        }
        
    }
    
}
