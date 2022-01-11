
package poo4Cine;


public class Ejercicio4 {
    
    public static void main(String[] args){
        
        Pelicula pelicula = new Pelicula("Avengers", 90, 16, "Marvel");
        Cine cine = new Cine(8, 9, 5.5, pelicula);
        
        int numEspectadores = 20;
        
        Espectador e;
        int fila = 0;
        char columna = 0;
        
        for(int i=0; i < numEspectadores && cine.haySitio();i++){
            
            e = new Espectador(Metodos.NOMBRES[Metodos.generaNumeroAleatorio(0, Metodos.NOMBRES.length-1)], 
                    Metodos.generaNumeroAleatorio(10, 30),
                    Metodos.generaNumeroRealAleatorio(1, 10));
            
            System.out.println(e);
            
            do{
                
                fila = Metodos.generaNumeroAleatorio(0, cine.getFilas() - 1);
                columna = (char) Metodos.generaNumeroAleatorio('A', 'A' + cine.getColumnas() - 1);

            } while (cine.haySitioEspecifico(fila, columna));

            if (cine.sePuedeSentar(fila, columna, e)) {
                e.pagar(cine.getPrecio());
                cine.sentar(fila, columna, e);
            }
            
        }
        cine.mostrar();
        System.out.println("Fin"); 
    }
    
}
