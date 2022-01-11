
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.EdicionModel;
import utils.ConnectionDB;

/**
 *
 * @author PC
 */
public class EdicionDAO {
    private Connection conn = null;
    
    // Obtiene todas las ediciones desde la base de datos
    public ArrayList<EdicionModel> getAllEditions() {
        ArrayList<EdicionModel> editions = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_edicion, anio, idioma, copias FROM edicion;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                EdicionModel edition = new EdicionModel(result.getInt(1), result.getInt(2), result.getString(3), result.getInt(4));
                editions.add(edition);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return editions;
    }
    
    // Filtra las ediciones por año
    public ArrayList<EdicionModel> getFilteredEdiciones(String idioma) {
        ArrayList<EdicionModel> prestamos = new ArrayList();
        int case_ = -1;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_edicion, anio, idioma, copias\n" +
                         "FROM edicion\n" +
                         "WHERE edicion.idioma LIKE ?";

            System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println(sql);            
            statement.setString(1, "%"+idioma+"%");

            System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                EdicionModel libro = new EdicionModel(result.getInt(1), result.getInt(2), result.getString(3), result.getInt(4));
                prestamos.add(libro );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return prestamos;
    }
    
    // Obtiene una edición desde la base de datos
    public EdicionModel getEdition(int id) {
        EdicionModel libro = null;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_edicion, anio, idioma, copias FROM edicion WHERE id_edicion=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                libro = new EdicionModel(id, result.getInt(1), result.getString(2), result.getInt(3));
                break;
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return libro;
    }
    
    // Agrega nueva edición
    public void insertEdition(EdicionModel edition){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO edicion(anio, idioma, copias) VALUES (?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, edition.getAnio());
            statement.setString(2, edition.getIdioma());
            statement.setInt(3, edition.getCopias());
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    // Elimina una edicion por ID
    public void deleteEdition(int id) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM edicion WHERE id_edicion=?;";
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
