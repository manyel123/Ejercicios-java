/*
Crea una función que nos devuelva el número ASCII de un carácter pasado por parámetro.
 */
package funcioneSeDefinenFueradelasClasesLosMetodosDentroySonPartedelasClases;

/**
 *
 * @author PC
 */
public class FuncionAscii {
    
    public static void main(String[] args){
        
        char letra = 'a';
        
        System.out.println("El caracter " + letra + " tiene el código " + devuelveCodigoASCII(letra));
        
    }
    
    public static int devuelveCodigoASCII(char caracter){
        
        return (int)caracter;
        
    }
    
}
