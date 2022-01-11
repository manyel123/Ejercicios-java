/*
Write a program that helps the user count his change. The program should ask how many
quarters the user has, then how many dimes, then how many nickels, then how many
pennies. Then the program should tell the user how much money he has, expressed in
dollars.
 */
package charpter1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio4 {
    
    public static void main(String[] args){
        
        int q;
        int d;
        int n;
        int p;
        double dollar;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many quarters do you have?");
        q = sc.nextInt();
        System.out.println("How many dimes do you have?");
        d = sc.nextInt();
        System.out.println("How many nickels do you have?");
        n = sc.nextInt();
        System.out.println("How many pennies do you have?");
        p = sc.nextInt();
        
        dollar = (q*25) + (d*10) + (n*5) + p;
        dollar = dollar / 100;
        
        System.out.println("You have:" + dollar + "dollars");
    }
    
}
