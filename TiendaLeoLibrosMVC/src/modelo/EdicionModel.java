
package modelo;

public class EdicionModel {
    private int id_edicion;
    private int anio;
    private String idioma;
    private int copias;

    public EdicionModel(int anio, String idioma, int copias) {
        this.anio = anio;
        this.idioma = idioma;
        this.copias = copias;
    }

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

}
