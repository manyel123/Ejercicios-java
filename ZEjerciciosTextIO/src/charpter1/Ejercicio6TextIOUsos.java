/*
This exercise asks you to write a program that tests some of the built-in subroutines for
working with Strings. The program should ask the user to enter their first name and their
last name, separated by a space. Read the user’s response using TextIO.getln(). Break
the input string up into two strings, one containing the first name and one containing the
last name. You can do that by using the indexOf() subroutine to find the position of the
space, and then using substring() to extract each of the two names. Also output the
number of characters in each name, and output the user’s initials. (The initials are the
first letter of the first name together with the first letter of the last name.) A sample run
of the program should look something like this:
Please enter your first name and last name, separated by a space.
? Mary Smith
Your first name is Mary, which has 4 characters
Your last name is Smith, which has 5 characters
Your initials are MS
 */
package charpter1;

/**
 *
 * @author PC
 */
public class Ejercicio6TextIOUsos {
    
    public static void main(String[] args){
        
        String name;
        String n;
        String ln;
        int sep;
        
        TextIO.put("Please enter your first name and last name, separated by a space. ");
        name = TextIO.getln();
        
        sep = name.indexOf(" ");
        n = name.substring(0, sep);
        ln = name.substring(sep+1, name.length());
        
        TextIO.putln("Your first name is " + n + ", which has " + n.length() + " characters");
        TextIO.putln("Your last name is " + ln + ", which has " + ln.length() + " characters");;
        TextIO.putln("Your initials are " + n.charAt(0) + ln.charAt(0));
    }
    
}
