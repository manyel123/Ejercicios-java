/*
Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. 
Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices originales y el resultado.
 */
package matrices1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio3SumaMatrices {
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas para las matrices");
        int filas = sn.nextInt();
        
        System.out.println("Ingrese el numero de columnas para la matrices");
        int columnas = sn.nextInt();
        
        int matriz1[][] = new int[filas][columnas];
        
        int matriz2[][] = new int[filas][columnas];
        
        int suma[][] = new int[filas][columnas];
        
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){/*[0] indica la longitud de las columnas*/
                
                System.out.println("Matriz1. Ingrese un valor para la posicion " + i + "," + j);
                matriz1[i][j]=sn.nextInt();
                
                System.out.println("Matriz2. Ingrese un valor para la posicion " + i + "," + j);
                matriz2[i][j]=sn.nextInt();
                
                suma[i][j]=matriz1[i][j]+matriz2[i][j];
            }            
            
        }
        
        System.out.println("El resultado es: ");
        
        muestraMatriz(matriz1);
        
        System.out.println("+");
        
        muestraMatriz(matriz2); 
        
        System.out.println("=");
        
        muestraMatriz(suma);
    }
    
    public static void muestraMatriz(int[][] matriz){
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){/*[0] indica la longitud de las columnas*/
                
                System.out.print(matriz[i][j]+" ");
                
            }            
            System.out.println("");
        }
        
    }
    
}
