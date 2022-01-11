
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.LibroModel;
import utils.ConnectionDB;

/**
 *
 * @author PC
 */
public class LibroDAO {
    
    private Connection conn = null;
    
    // Obtiene la lista de libros en la BD
    public ArrayList<LibroModel> getAllLibros() {
        ArrayList<LibroModel> libros = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT libro.id_libro, libro.titulo, libro.autor, edicion.anio, edicion.copias\n" +
                         "FROM libro\n" +
                         "JOIN edicion ON libro.id_edicion_fk = edicion.id_edicion\n";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                LibroModel libro = new LibroModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5));
                libros.add(libro);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return libros;
    }
    
    // Filtra los libros de acuerdo a los criterios de la consulta
    public ArrayList<LibroModel> getFilteredLibros(String titulo) {
        ArrayList<LibroModel> prestamos = new ArrayList();
        int case_ = -1;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT libro.id_libro, libro.titulo, libro.autor, edicion.anio, edicion.copias\n" +
                         "FROM libro\n" +
                         "JOIN edicion ON libro.id_edicion_fk = edicion.id_edicion\n"+
                         "WHERE libro.titulo LIKE ?";

            System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println(sql);            
            statement.setString(1, "%"+titulo+"%");

            System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                LibroModel libro = new LibroModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5));
                prestamos.add(libro );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return prestamos;
    }

    // Agrega un libro a la BD
    public void insertLibro(LibroModel libro){
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
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    // Elimina un libro de la BD
    public void deleteLibro(int id) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM libro WHERE id_libro=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
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
