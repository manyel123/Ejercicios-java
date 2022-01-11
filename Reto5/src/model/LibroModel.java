
package model;

/**
 *
 * @author PC
 */
public class LibroModel {
    private int    id_libro;
    private String titulo;
    private String autor;
    private int    anio;
    private int    copias;
    private int    id_edicion_fk;

    
    // Constructor para añadir nuevo libro
    public LibroModel(String titulo, String autor, int id_edicion_fk) {
        this.titulo = titulo;
        this.autor = autor;
        this.id_edicion_fk = id_edicion_fk;
    }
    
    // Constructor para DAO
    public LibroModel(int id_libro, String titulo, String autor, int anio, int copias) {
        this.id_libro      = id_libro;
        this.titulo        = titulo;
        this.autor         = autor;
        this.anio          = anio;
        this.copias        = copias;
    }

    public int getId_libro() {
        return id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public int getCopias() {
        return copias;
    }

    public int getId_edicion_fk() {
        return id_edicion_fk;
    }
    
    // Array para mostrar datos en la tabla
    public Object[] toArray(){
        Object[] data = {id_libro, titulo, autor, anio, copias};
        return data;
    }
}