/*
Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10.
 */
package matrices1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio2Matroz5FilasNColumnas {
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese el número de columnas para la matriz");
        int columnas = sn.nextInt();
        
        int matriz[][] = new int [5][columnas];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){/*[0] indica la longitud de las columnas*/
                matriz[i][j]=generaNumAleatorio(0,10);
                
                System.out.print(matriz[i][j]+" "); /* No hay salto de linea para que la matriz pueda tener filas */
            }            
            System.out.println("");/* salto de linea al terminar la fila para que la matriz tenga columnas*/
        }
        
    }
    
    public static int generaNumAleatorio(int minimo, int maximo){
        
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        
    }
    
}
