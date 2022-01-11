
package biblioteca;


public class Diccionario extends Libro{
    
    private String tipo;
    private double precio;
    private String editorial;
    
    public Diccionario(String titulo, String fechaPublic, int paginas, int edicion,
            String tipo, double precio, String editorial){
        super(titulo,fechaPublic,paginas,edicion);
        this.tipo = tipo;
        this.precio = precio;
        this.editorial = editorial;
    }
    
    public void mostrar(){
        System.out.println("Título del diccionario: "+getTitulo()+ ", fecha de publicación: "
                +getFechaPublic()+", número de páginas: "+getPaginas()+", edición: "
                +getEdicion()+", tipo de diccionario: "+tipo+", precio: "+precio
                +", editorial: "+editorial);
    }

}
