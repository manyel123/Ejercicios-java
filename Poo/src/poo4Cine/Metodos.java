/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4Cine;

/**
 *
 * @author PC
 */
public class Metodos {
    
    public static final String NOMBRES[] = {"Fer", "Andres", "Laura", "Camilo", "Ana", "Jorge"};
    
    public static int generaNumeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1)); 
    }
    
     public static double generaNumeroRealAleatorio(int minimo, int maximo){
        return (double)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1)); 
    }
     
}
