/*
Crear una función que nos devuelva el factorial de un número entero.
 */
package funciones2;

/**
 *
 * @author PC
 */
public class FuncionFactorial {
    
    public static void main(String[] args){
        
        System.out.println(calcularFactorial(5));
        
    }
    
    public static int calcularFactorial(int numero){
        
        if(numero<0){
            System.out.println("No se puede calcular el factorial de un numero menor a cero");
            return -1;
        }
        
        if(numero==0 || numero==1){
            return 1;
        }
        
        int resultado = numero;
        
        for(int i=(numero-1);i>1;i--){
            
            resultado *= i;
            
        }
        
        return resultado;
            
    }
    
}
