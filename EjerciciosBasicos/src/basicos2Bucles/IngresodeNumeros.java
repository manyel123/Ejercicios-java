/*
Crear una aplicacion que nos permite insertar numeros hasta que insertemos un -1. Calcular el numero de numeros introducidos.
 */
package basicos2Bucles;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class IngresodeNumeros {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Ingrese un número, para terminar ingrese -1");                   
        int num;
        int contador = -1;
        
        do{
            num = sc.nextInt();
            contador++;
        }while(num!=-1);
        
        System.out.println("Se ingresaron " + contador + " registros");
    }
}
