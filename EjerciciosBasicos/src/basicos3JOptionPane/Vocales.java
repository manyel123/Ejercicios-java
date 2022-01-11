/*
11. Contar cuantas vocales tiene una frase dada por el usuario.
 */
package basicos3JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Vocales {
    
    public static void main(String[] args){
        
        String texto=JOptionPane.showInputDialog(null, "Escribe una frase", "Inserción", JOptionPane.INFORMATION_MESSAGE);
        texto = texto.toLowerCase();/*convierte todo el texto en minúsculas*/
        
        char vocales[]={'a','e','i','o','u'};
        
        char caracterActual;
        int contadorVocales=0;
        boolean esVocal;
        
        for(int i=0;i<texto.length();i++){
            
            caracterActual=texto.charAt(i);/*Toma cada caracter de la frase*/
            esVocal = false;
            
            for(int j=0;j<vocales.length && !esVocal;j++){/*!esVocal corta el ciclo al encontrar la vocal*/
                
                if(vocales[j]==caracterActual){/*Valida si el caracter en la posición J es vocal o no*/
                    contadorVocales++;
                    esVocal=true;
                }
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "La frase tiene "+contadorVocales+" vocales", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
