/*
Crea una función que indique si un número es mayor o menor que cero.
 */
package funcioneSeDefinenFueradelasClasesLosMetodosDentroySonPartedelasClases;

/**
 *
 * @author PC
 */
public class FuncionMayoroMenor {
    
    public static void main(String[] args){
        
        int a = -2;
        
        System.out.println(mayorQueCero(a));
        
    }
    
    public static boolean mayorQueCero(int num){
        
        return num>0;
        
    }
}
