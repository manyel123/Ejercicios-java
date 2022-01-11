
package acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.PrestamoModel;
import utils.ConnectionDB;

public class PrestamoDAO {
    private Connection conn = null;
    
    public ArrayList<PrestamoModel> getAllPrestamos() {
        ArrayList<PrestamoModel> prestamos = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT prestamo.id_prestamo, usuario.nombre, libro.titulo, libro.autor, edicion.anio, usuario.fecha\n" +
                         "FROM usuario\n" +
                         "JOIN edicion ON usuario.id_usuario = edicion.id_edicion\n" +
                         "JOIN libro ON libro.id_libro = usuario.id_usuario\n" +
                         "JOIN prestamo ON prestamo.id_prestamo = usuario.id_usuario";
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
