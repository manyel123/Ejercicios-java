
package poo4Cine;


public class Asiento {
    
    private char columna;
    private int fila;
    private Espectador espectador;

    public Asiento(char columna, int fila) {
        this.columna = columna;
        this.fila = fila;
        this.espectador = null;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    
    public int edadEspectador(){
        return espectador.getEdad();
    }
    
    public boolean ocupado(){
        return espectador != null;/*Retorna si el asiento está ocupado o no*/
    }

    @Override
    public String toString() {
        return "Asiento{" + "columna:" + columna + ", fila:" + fila + ", espectador:" + espectador + '}';
    }
             
}
