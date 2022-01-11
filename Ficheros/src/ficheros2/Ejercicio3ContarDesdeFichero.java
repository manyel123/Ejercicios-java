/*
3. Contar el numero de vocales, consonantes y números que hay en un fichero 
pasado por teclado (su ruta).
 */
package ficheros2;

import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Ejercicio3ContarDesdeFichero {
    
    public static void main(String[] args){
        
        String ruta=JOptionPane.showInputDialog(null, "Escriba la ruta del fichero", "Inserción", JOptionPane.INFORMATION_MESSAGE);
        
        int contadorVocales=0;
        int contadorConsonantes=0;
        int contadorNumeros=0;
        
        try(FileReader fr=new FileReader(ruta)){
            
            int caracter;
            
            int vocales[]={65,69,73,79,85,97,101,105,111,117};/*Vocales mayúsculas y minúsculas*/
            boolean esVocal;
            
            while((caracter = fr.read()) != -1){/*-1 es el final del contenido del fichero*/
                
                if(caracter>=48 && caracter<=57){
                    contadorNumeros++;
                }else if((caracter>=65 && caracter<=90)||(caracter>=97 && caracter<=122)){
                    
                    esVocal=false;
                    for(int i=0;i<vocales.length && !esVocal;i++){
                        if(caracter==vocales[i]){
                            esVocal=true;
                        }
                    }
                    if(esVocal){
                        contadorVocales++;
                    }else{
                        contadorConsonantes++;
                    }
                }
                
            }/*Este programa no cuenta los caracteres con tíldes*/
            
        }catch(IOException e){
            System.out.println("Error");
        }
        
        System.out.println("Hay "+contadorVocales+" vocales");
        System.out.println("Hay "+contadorConsonantes+" consonantes");
        System.out.println("Hay "+contadorNumeros+" números");
        
    }
    
}
