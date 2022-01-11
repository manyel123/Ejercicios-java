/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3polimorfismo;

/**
 *
 * @author PC
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
        
        Aula aula=new Aula();/*Crea el aula de clase con todos los parámetros especificados*/ 
    
        if(aula.darClase()){ /*Si, se puede dar clase entonces valida las notas*/
            
            aula.notas(); /*Valida niños y niñas aprobados y los imprime*/
            
        }
        
    }
    
}
