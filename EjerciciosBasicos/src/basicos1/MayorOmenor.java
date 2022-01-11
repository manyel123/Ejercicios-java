/*
Pedir 2 numeros por teclado e indicar si uno es mayor que el otro o si son iguales.
 */
package basicos1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MayorOmenor {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese número a ");
        int a = sc.nextInt();
        
        System.out.println("Ingrese número b ");
        int b = sc.nextInt();
        
        if(a>b){
            System.out.println(a + " es mayor que " + b);
        }else if(a<b){
            System.out.println(a + " es menor que " + b);
        }else{
            System.out.println(a + " es igual que " + b);
        }
    }
}
