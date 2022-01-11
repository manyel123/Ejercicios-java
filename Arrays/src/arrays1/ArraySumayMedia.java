/*
Con el array básico creado anteriormente, calcula la suma y la media de todos sus valores. 
 */
package arrays1;

/**
 *
 * @author PC
 */
public class ArraySumayMedia {
    
    public static void main(String[] args){
        
        int numeros[] = new int[100];
        int suma = 0;
        double media = 0;
        
        for(int i=0;i<numeros.length;i++){            
            numeros[i]=i+1;
            suma+=numeros[i];
        }
        
        media = (double)suma/numeros.length;      
        
        System.out.println("la suma del array es: " + suma + " y la media es: " + media);
    }
    
}
