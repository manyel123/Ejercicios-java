/*
 Write a program that asks the user's name, and then greets the user by name. Before outputting the user's name, 
 convert it to upper case letters. For example, if the user's name is Fred, then the program should respond "Hello, FRED, nice to meet you!".
 */
package charpter1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio3UpperCase {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your name");
        String name = sc.nextLine();
        
        String result = name.toUpperCase();
        
        System.out.println("Hello " + result + ", nice to meet you!");
        
    }
    
}
