package charpter1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */


public class Ejercicio3ConTextIO {
    
    public static void main(String[] args) {
       
           String usersName;      // The user's name, as entered by the user.
           String upperCaseName;  // The user's name, converted to uppercase letters.
           
           TextIO.put("Please enter your name: ");
           usersName = TextIO.getln();
           
           upperCaseName = usersName.toUpperCase();
           
           TextIO.putln("Hello, " + upperCaseName + ", nice to meet you!");
       
       }
}
