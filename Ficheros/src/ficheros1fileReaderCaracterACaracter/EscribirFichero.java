/*
1. Escribir en un fichero "Hola mundo".
2. Leer el anterior fichero, mostrando su contenido por pantalla.
 */
package ficheros1fileReaderCaracterACaracter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class EscribirFichero {

    public static void main(String[] args) {
        
        try (FileWriter fw=new FileWriter("C:\\test\\fichero1.txt", true)){
            /*FileWriter fw2=new FileWriter("C:\\test\\fichero2.txt", true);*/
            /*true es para que añada contenido al fichero*/
            /*Sin true, reemplaza todo el contenido del fichero*/
            
            fw.write("Hola mundo1"+'\n');/*\n escribe en el renglón siguiente del fichero*/
            
            /*Try cierra el fichero automáticamente cuando está dentro del()*/
            /*fw2.close();*/
            
        } catch (IOException ex) {
            Logger.getLogger(EscribirFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
