/*
6. Leer el anterior fichero con BufferedReader.
 */
package ficheros3bufferedReaderLeeLineaCompleta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Ejercicio6Leer {
    
    public static void main(String[] args){
        
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\test\\ejercicio5.txt"))){
            
            String linea;
            
            while((linea = br.readLine()) != null){
                
                System.out.println(linea);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio6Leer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio6Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
