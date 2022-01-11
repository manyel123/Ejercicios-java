/*
4. Eliminar espacios de un fichero y convertir a mayúscula todo.
 */
package ficheros2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Ejercicio4EliminarEspacios {
    
    public static void main(String[] args){
        
        String ruta=JOptionPane.showInputDialog(null, "Escriba la ruta del fichero", "Inserción", JOptionPane.INFORMATION_MESSAGE);    
        
        try(FileReader fr=new FileReader(ruta);
                FileWriter fw=new FileWriter("C:\\test\\ejercicio4.txt")){
            
            int caracter;
            String resultado="";

            while((caracter = fr.read()) != -1){/*-1 es el final del contenido del fichero*/
                
                if(caracter>=97 && caracter<=122){
                    resultado+=((char)(caracter-32));
                }else if(caracter!=32){
                    resultado+=(char)(caracter);
                }
                
            }
            
            fw.write(resultado);
            
        }catch(IOException e){
            System.out.println("Error");                 
        }        
        
    }
    
}
