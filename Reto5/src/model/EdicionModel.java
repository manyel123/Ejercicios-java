
package model;

/**
 *
 * @author PC
 */
public class EdicionModel {
    private int id_edicion;
    private int anio;
    private String idioma;
    private int copias;
    
    
    // Constructor para añadir nueva edición
    public EdicionModel(int anio, String idioma, int copias) {
        this.anio = anio;
        this.idioma = idioma;
        this.copias = copias;
    }

    // Constructor para DAO
    public EdicionModel(int id_edicion, int anio, String idioma, int copias) {
        this.id_edicion = id_edicion;
        this.anio = anio;
        this.idioma = idioma;
        this.copias = copias;
    }

    public int getId_edicion() {
        return id_edicion;
    }

    public int getAnio() {
        return anio;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getCopias() {
        return copias;
    }
    
    // Array para mostrar datos en la tabla
    public Object[] toArray(){
        Object[] data = {id_edicion, anio, idioma, copias};
        return data;
    }
}
