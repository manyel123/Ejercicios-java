
package biblioteca;


public class Novela extends Libro{
    
    private int capitulos;
    private double precio;
    private String genero;
    private String editorial;
    
    public Novela(String titulo, String fechaPublic, int paginas, int edicion, int capitulos,
            double precio, String genero, String editorial){
        super(titulo,fechaPublic,paginas,edicion);
        this.capitulos = capitulos;
        this.precio = precio;
        this.genero = genero;
        this.editorial = editorial;    
        
    }
    public void mostrar(){
        System.out.println("Título de la novela: "+getTitulo()+ ", fecha de publicación: "
                +getFechaPublic()+", número de páginas: "+getPaginas()+", edición: "
                +getEdicion()+", número de capítulos: "+capitulos+", precio: "+precio
                +", genero: "+genero+", editorial: "+editorial);
    }
}
