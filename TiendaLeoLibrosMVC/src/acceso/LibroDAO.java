
package acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.LibroModel;
import utils.ConnectionDB;

public class LibroDAO {
    
    private Connection conn = null;
    
    public ArrayList<LibroModel> obtenerLibros() {
        ArrayList<LibroModel> libros = new ArrayList<LibroModel>();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql   = "SELECT libro.id_libro AS ISBN, libro.titulo AS Título, libro.autor AS Autor, edicion.anio AS Año, edicion.copias AS Copias"
                         + "FROM libro"
                         + "JOIN edicion ON libro.id_edicion_fk = edicion.id_edicion"
                         + "ORDER BY libro.id_libro;";
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                LibroModel libro = new LibroModel(result.getInt(1),result.getString(2),result.getString(3),result.getInt(4),result.getInt(5));
                libros.add(libro);
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return libros;
    }
    
    public LibroModel obtenerLibro(int id_libro){
        return null;
    }

    public void agregarLibro(LibroModel libro){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES (?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setInt(3, libro.getId_edicion_fk());
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0) 
                JOptionPane.showMessageDialog(null, "¡El registro fue agregado exitosamente!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    public void actualizarLibro(LibroModel libro){
        
    }
    
    public void eliminarLibro(int id_libro) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM libro WHERE id_libro=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id_libro);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
}
