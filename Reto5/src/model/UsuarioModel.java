
package model;

/**
 *
 * @author PC
 */
public class UsuarioModel {
    private int id_usuario;
    private String nombre;
    private String fecha; 

    // Constructor para actualización de fecha
    public UsuarioModel(int id_usuario, String fecha) {
        this.id_usuario = id_usuario;
        this.fecha = fecha;
    }
 
    // Constructor para añadir nuevo usuario
    public UsuarioModel(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha  = fecha;
    }
    
    // Contructor para DAO
    public UsuarioModel(int id_usuario, String nombre, String fecha) {
        this.id_usuario = id_usuario;
        this.nombre     = nombre;
        this.fecha      = fecha;
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
    
    // Array para mostrar datos en la tabla
    public Object[] toArray(){
        Object[] data = {id_usuario, nombre, fecha};
        return data;
    }

}