/*
Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
 */
package basicos2Bucles;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SumaDel1aMayoresde1 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número mayor a 1");
        int num;
        
        do{
            num = sc.nextInt();
            
            if(num<=1){
                System.out.println("Error. Ingrese un valor mayor a 1");
            }
        }while(num<=1);
                
        int suma = 0;
                
        for(int i=1; i<=num; i++){
            suma+=i;
        }
        
        System.out.println("La suma es: " + suma);
            
    }
}
