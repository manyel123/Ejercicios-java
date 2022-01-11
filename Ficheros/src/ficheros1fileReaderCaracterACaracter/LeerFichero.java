/*

 */
package ficheros1fileReaderCaracterACaracter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class LeerFichero {
    
    public static void main(String[] args){
        
        String contenido="";
        int c;
        
        
        try {
            FileReader fr=new FileReader("C:\\test\\fichero1.txt");
            
            /*c=fr.read();*//*Al terminar de leer el archivo read() arroja -1*/          
            while((c=fr.read())!=-1){/*c=fr.read() se ejecuta en cada ciclo*/
                contenido+=(char)c;
                /*c=fr.read();*//*Si no se poner dentro de while puede ir abajo*/
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("El contenido del fichero es: "+contenido);
        
    }
    
}
