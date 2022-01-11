/*
Write a program that simulates rolling a pair of dice. You can simulate rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random. 
The number you pick represents the number on the die after it is rolled. As pointed out in Section 5, The expression

                  (int)(Math.random()*6) + 1
does the computation you need to select a random integer between 1 and 6. You can assign this value to a variable to represent 
one of the dice that is being rolled. Do this twice and add the results together to get the total roll. Your program should report 
the number showing on each die as well as the total roll. For example:

                  The first die comes up 3
                  The second die comes up 5
                  Your total roll is 8
(Note: The word "dice" is a plural, as in "two dice." The singuler is "die.")
 */
package charpter1;

/**
 *
 * @author PC
 */
public class Ejercicio2Random {
    
    public static void main(String[] args){
        
        int dice1;
        int dice2;
        int total;
        
        dice1 = (int)(Math.random()*6) + 1;
        dice2 = (int)(Math.random()*6) + 1;
        
        total = dice1 + dice2;
        
        System.out.println("The first die comes up " + dice1);
        System.out.println("The second die comes up " + dice2);
        System.out.println("Your total roll is " + total);
        
    }
    
}
