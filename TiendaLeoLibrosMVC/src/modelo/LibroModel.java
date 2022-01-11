
package modelo;

public class LibroModel {
    private int    id_libro;
    private String titulo;
    private String autor;
    private int    id_edicion_fk;
    
    private int anio;
    private int copias;
    /**
     * Constructor para manejo interno de la tabla
     * @param id_libro
     * @param titulo
     * @param autor
     * @param id_edicion_fk 
     */
    public LibroModel(int id_libro, String titulo, String autor, int id_edicion_fk) {
        this.id_libro       = id_libro;
        this.titulo         = titulo;
        this.autor          = autor;
        this.id_edicion_fk  = id_edicion_fk;
    }
    /**
     * Constructor con fines de proyección desde la base de datos
     * @param id_libro
     * @param titulo
     * @param autor
     * @param anio
     * @param copias 
     */
    public LibroModel(int id_libro, String titulo, String autor, int anio, int copias) {
        this.id_libro    = id_libro;
        this.titulo      = titulo;
        this.autor       = autor;
        this.anio        = anio;
        this.copias      = copias;
    }

    /**
     * @return the id_libro
     */
    public int getId_libro() {
        return id_libro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the id_edicion_fk
     */
    public int getId_edicion_fk() {
        return id_edicion_fk;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @return the copias
     */
    public int getCopias() {
        return copias;
    }
    
}