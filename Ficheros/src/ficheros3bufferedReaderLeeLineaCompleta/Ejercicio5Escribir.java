/*
5. Escribir en un fichero con BufferedWriter lo que quieras.
 */
package ficheros3bufferedReaderLeeLineaCompleta;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Ejercicio5Escribir {
    
    public static void main(String[] args){
        
        String texto1="Estos no son los androides que solicitó señor";
        String texto2="Estos si son los androides que solicitó señor";
        
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\test\\ejercicio5.txt"))){
            
            bw.write(texto1);
            bw.newLine();
            bw.write(texto2);
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio5Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
