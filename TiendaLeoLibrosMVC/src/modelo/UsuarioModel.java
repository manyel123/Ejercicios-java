
package modelo;

public class UsuarioModel {
    private int id_usuario;
    private String nombre;
    private String fecha; 

    public UsuarioModel(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public UsuarioModel(int id_usuario, String nombre, String fecha) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Object[] toArray(){
        Object[] data = {id_usuario, nombre, fecha};
        return data;
    }
}