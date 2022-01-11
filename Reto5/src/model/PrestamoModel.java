
package model;

/**
 *
 * @author PC
 */
public class PrestamoModel {
    
    private int id_prestamo;
    private String nombre;
    private String titulo;
    private String autor;
    private int anio;
    private String fecha;
    private int id_edicion_fk;
    private int id_usuario_fk;

    // Constructor para añadir préstamo
    public PrestamoModel(int id_edicion_fk, int id_usuario_fk) {
        this.id_edicion_fk = id_edicion_fk;
        this.id_usuario_fk = id_usuario_fk;
    }
    
    // Constructor para DAO
    public PrestamoModel(int id_prestamo, int id_edicion_fk, int id_usuario_fk) {
        this.id_prestamo = id_prestamo;
        this.id_edicion_fk = id_edicion_fk;
        this.id_usuario_fk = id_usuario_fk;
    }

    // Constructor para tabla de datos
    public PrestamoModel(int id_prestamo, String nombre, String titulo, String autor, int anio, String fecha) {
        this.id_prestamo = id_prestamo;
        this.nombre      = nombre;
        this.titulo      = titulo;
        this.autor       = autor;
        this.anio        = anio;
        this.fecha       = fecha;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    public int getAnio() {
        return anio;
    }

    public int getId_edicion_fk() {
        return id_edicion_fk;
    }

    public int getId_usuario_fk() {
        return id_usuario_fk;
    }
    
    // Array para mostrar datos en la tabla
    public Object[] toArray(){
        Object[] data = {id_prestamo, nombre, titulo, autor, anio, fecha};
        return data;
    }
    
}
