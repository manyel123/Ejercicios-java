
package biblioteca;

public class Articulo extends Libro{
    
    private String dondeSePublica;
    private String tipoDeInvestigacion;
    
    public Articulo(String titulo, String fechaPublic, int paginas, int edicion, String dondeSePublica,
            String tipoDeInvestigacion){
        super(titulo,fechaPublic,paginas,edicion);
        this.dondeSePublica = dondeSePublica;
        this.tipoDeInvestigacion = tipoDeInvestigacion;
    }
    public void mostrar(){
        System.out.println("Título del artículo: "+getTitulo()+ ", fecha de publicación: "
                +getFechaPublic()+", número de páginas: "+getPaginas()+", edición: "
                +getEdicion()+", donde se publica: "+dondeSePublica+", tipo de investigación: "
                +tipoDeInvestigacion);
    }
}
