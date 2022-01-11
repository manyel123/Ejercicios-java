
package acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.UsuarioModel;
import utils.ConnectionDB;

public class UsuarioDAO {
    private Connection conn = null;
    
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

    public ArrayList<UsuarioModel> getUsersByDate(String fecha) {
        ArrayList<UsuarioModel> users = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_usuario, nombre, fecha FROM usuario WHERE fecha='?';";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, fecha);
            ResultSet result = statement.executeQuery();
            
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

    public UsuarioModel getUser(int id) {
        UsuarioModel user = null;
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_usuario, nombre, fecha FROM usuario WHERE id_usuario=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                user = new UsuarioModel(id, result.getString(1), result.getString(2));
                break;
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return user;
    }
    
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
    
    public void insertUser(UsuarioModel user){
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "INSERT INTO usuario((nombre, autor, fecha) VALUES (?, ?);";
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
