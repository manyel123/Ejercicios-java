
package poo4Cine;


public class Cine {
    
    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;

    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {
        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenaAsientos();/*Crea la sala de cine*/
    }    

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    private void rellenaAsientos(){
        
        int fila = asientos.length; 
        for(int i=0; i < asientos.length;i++){
            for(int j=0; j <asientos[0].length;j++){
                asientos[i][j] = new Asiento((char)('A'+j),fila);
            }
            fila--;
        }
        
    }
    
    public boolean haySitio(){/*Verifica si hay algún asiento disponible en la sala*/
        
        boolean haySitio = false;
        for(int i=0;i < asientos.length && !haySitio;i++){
            for(int j=0;j < asientos[0].length && !haySitio;j++){
                
                if(!asientos[i][j].ocupado()){
                    haySitio = true;
                }
                
            }
            
        }
        
        return haySitio;
    }
    
    public boolean haySitioEspecifico(int fila, char columna){/*Verifica si un asiento en especifico está ocupado*/
        return getAsiento(fila,columna).ocupado();
    }
    
    public Asiento getAsiento(int fila, char columna){
        return asientos[asientos.length-fila][columna-'A'];
    }
    
    public boolean tieneDinero(Espectador e){
        return e.getDinero() > precio;
    }
    
    public boolean sePuedeSentar(int fila, char columna, Espectador e){
        return tieneDinero(e) && pelicula.tieneEdad(e);
    }
    
    public void sentar(int fila, char columna, Espectador e){
        getAsiento(fila,columna).setEspectador(e);
    }
    
    public int getFilas(){
        return asientos.length;
    }
    
    public int getColumnas(){
        return asientos[0].length;
    }
    
    public void mostrar(){
        for(int i=0;i<asientos.length;i++){
            for(int j=0;j<asientos[0].length;j++){
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
