/*
Crea una función que devuelva la suma de 2 números, pasados por parámetros.
 */
package funcioneSeDefinenFueradelasClasesLosMetodosDentroySonPartedelasClases;

/**
 *
 * @author PC
 */
public class FuncionSuma {
    
    public static void main(String[] args){     
        
        int num1 = 2;
        int num2 = 3;
        
        int resultado = suma(num1, num2);
        
        System.out.println(suma(2,3));
        System.out.println(resultado);
    }
    
    public static int suma(int a, int b){
        
        return a+b;
    }
}
