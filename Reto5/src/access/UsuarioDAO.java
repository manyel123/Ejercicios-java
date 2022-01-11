
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.UsuarioModel;
import utils.ConnectionDB;

/**
 *
 * @author PC
 */
public class UsuarioDAO {
    private Connection conn = null;
    
    // Obtiene todos los usarios desde la base de datos
    public ArrayList<UsuarioModel> getAllUsers() {
        ArrayList<UsuarioModel> users = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_usuario, nombre, fecha FROM usuario;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                UsuarioModel user = new UsuarioModel(result.getInt(1), result.getString(2), result.getString(3));
                users.add(user);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return users;
    }

    public ArrayList<UsuarioModel> getFilteredUsuarios(String nombreUsuario) {
        ArrayList<UsuarioModel> prestamos = new ArrayList();
        int case_ = -1;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_usuario, nombre, fecha\n" +
                         "FROM usuario\n" +
                         "WHERE usuario.nombre LIKE ?";

            System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println(sql);            
            statement.setString(1, "%"+nombreUsuario+"%");

            System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                UsuarioModel usuario = new UsuarioModel(result.getInt(1), result.getString(2), result.getString(3));
                prestamos.add(usuario );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return prestamos;
    }
    

    // Actualiza la fecha de préstamo un usuario
    public void updateFecha(UsuarioModel user) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE usuario SET fecha =? WHERE id_usuario=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getFecha());
            statement.setInt(2, user.getId_usuario());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    // Agrega un nuevo usuario a la BD
    public void insertUser(UsuarioModel user){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO usuario(nombre, fecha) VALUES (?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getNombre());
            statement.setString(2, user.getFecha());
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    // Elimina un usuario en la BD
    public void deleteUser(int id) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM usuario WHERE id_usuario=?;";
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
