/*
12. Eliminar los espacios de una frase pasada por consola por el usuario.
 */
package basicos3JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class EliminarEspacios {
    
    public static void main(String[] args){
        
        String texto=JOptionPane.showInputDialog(null, "Escribe una frase", "Inserción", JOptionPane.INFORMATION_MESSAGE);
        
        char caracterActual;
        String texto_sin_espacios="";
        
        for(int i=0;i<texto.length();i++){
            
            caracterActual=texto.charAt(i);/*Toma cada caracter de la frase*/

            if(caracterActual!=' '){   /*Se niega la condición para evitar un else*/            
                texto_sin_espacios+=caracterActual;
            }
            
        }
         
        JOptionPane.showMessageDialog(null, texto_sin_espacios, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
