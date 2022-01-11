
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.PrestamoModel;
import utils.ConnectionDB;

/**
 *
 * @author PC
 */
public class PrestamoDAO {
    private Connection conn = null;
    
    // Obtiene todos los préstamos de libros
    public ArrayList<PrestamoModel> getAllPrestamos() {
        ArrayList<PrestamoModel> prestamos = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT prestamo.id_prestamo, usuario.nombre, libro.titulo, libro.autor, edicion.anio, usuario.fecha\n" +
                         "FROM usuario\n" +
                         "JOIN prestamo ON id_usuario_fk = id_usuario\n" +
                         "JOIN edicion ON id_edicion_fk = edicion.id_edicion\n" +
                         "JOIN libro ON edicion.id_edicion = id_libro\n";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                PrestamoModel prestamo = new PrestamoModel(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getInt(5), result.getString(6));
                prestamos.add( prestamo );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return prestamos;
    }
    
    // Obtiene los préstamos y los filtra por nombre de usuario
    public ArrayList<PrestamoModel> getFilteredPrestamos(String nombreUsuario) {
        ArrayList<PrestamoModel> prestamos = new ArrayList();
        int case_ = -1;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT prestamo.id_prestamo, usuario.nombre, libro.titulo, libro.autor, edicion.anio, usuario.fecha\n" +
                         "FROM usuario\n" +
                         "JOIN prestamo ON id_usuario_fk = id_usuario\n" +
                         "JOIN edicion ON id_edicion_fk = edicion.id_edicion\n" +
                         "JOIN libro ON edicion.id_edicion = id_libro\n" +
                         "WHERE usuario.nombre LIKE ?" +
                         "ORDER BY prestamo.id_prestamo";

            System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println(sql);            
            statement.setString(1, "%"+nombreUsuario+"%");

            System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                PrestamoModel prestamo = new PrestamoModel(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getInt(5), result.getString(6));
                prestamos.add(prestamo );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return prestamos;
    }
    
    // Inserta un nuevo préstamo a la BD
    public void insertPrestamo(PrestamoModel prestamo){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO prestamo(id_edicion_fk, id_usuario_fk) VALUES(?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, prestamo.getId_edicion_fk());
            statement.setInt(2, prestamo.getId_usuario_fk());
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    // Elimina un préstamo de la BD
    public void deletePrestamo(int id) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM prestamo WHERE id_prestamo=?;";
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
