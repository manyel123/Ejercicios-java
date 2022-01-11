
package biblioteca;

public class Revista extends Libro{
    
    private String medio;
    private double precio;
            
    public Revista(String titulo, String fechaPublic, int paginas, int edicion,
            String medio, double precio){
        super(titulo,fechaPublic,paginas,edicion);
        this.medio = medio;
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println("Título de la revista: "+getTitulo()+ ", fecha de publicación: "
                +getFechaPublic()+", número de páginas: "+getPaginas()+", edición: "
                +getEdicion()+", medio: "+medio+", precio: "
                +precio);
    }
}
