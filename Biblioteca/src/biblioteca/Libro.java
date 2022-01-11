
package biblioteca;


public class Libro{
    
    private String titulo;
    private String fechaPublic;
    private int paginas;
    private int edicion;

    public Libro(String titulo, String fechaPublic, int paginas, int edicion) {
        this.titulo = titulo;
        this.fechaPublic = fechaPublic;
        this.paginas = paginas;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaPublic() {
        return fechaPublic;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getEdicion() {
        return edicion;
    }
       
}
