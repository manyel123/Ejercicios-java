/*
Crear una matriz de 3x3 con los numeros del 1 al 9. Mostrar por pantalla.
 */
package matrices1;

/**
 *
 * @author PC
 */
public class Ejercicio1Matriz3x3 {
    
    public static void main(String[] args){
        
        int matriz[][] = new int[3][3];
        
        /* i = filas y j = columnas */
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){/*[0] indica la longitud de las columnas*/
                matriz[i][j]=(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j]+" "); /* No hay salto de linea para que la matriz pueda tener filas */
            }            
            System.out.println("");/* salto de linea al terminar la fila para que la matriz tenga columnas*/
        }
        
    }
    
}
