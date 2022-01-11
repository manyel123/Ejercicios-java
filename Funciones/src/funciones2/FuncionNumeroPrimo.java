/*
Crear una función que nos indique si un número es primo o no.
 */
package funciones2;

/**
 *
 * @author PC
 */
public class FuncionNumeroPrimo {
    
    public static void main(String[] args){
        
        System.out.println(esPrimo(4));
        
    }
    
    public static boolean esPrimo(int numero){
        
        if(numero<=1){
            return false;
        }
        
        for(int i=(int)Math.sqrt(numero);i>1;i--){
            /*Toma la parte entera de la raíz cuadrada del número ingresado lo divide por esa parte entera, y resta uno para el siguiente ciclo*/
            if(numero%i==0){
                return false;
            }   
        }
        
        return true;
        
    }
    
}
