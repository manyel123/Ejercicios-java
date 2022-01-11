
package view;


import access.UsuarioDAO;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.UsuarioModel;

/**
 *
 * @author PC
 */

// Interfaz gráfica para agregar nuevo usuario
public class AddUser extends JFrame implements ActionListener {
    private JLabel                     lblNombre;
    private JTextField                 txtNombre;
    private JLabel                     lblFecha;
    private JTextField                 txtFecha;
    private JButton                    btnInsertRegistro;
    
    public AddUser(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Usuarios - Agregar Usuario");
        setLayout(new GridLayout(0,2));
        
        
        this.lblNombre = new JLabel("Nombre del Usuario");
        add(this.lblNombre);
        this.txtNombre = new JTextField();
        add(this.txtNombre);
        
        
        this.lblFecha = new JLabel("Fecha del Prestamo");
        add(this.lblFecha);
        this.txtFecha = new JTextField();
        add(this.txtFecha);

        
        this.btnInsertRegistro = new JButton("Agregar a BD");
        add(this.btnInsertRegistro);
        
        this.btnInsertRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }

    // Agrega nuevo usuario
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnInsertRegistro) { 
            String name  = (String)this.txtNombre.getText(); 
            String fecha = (String)this.txtFecha.getText(); 
   
            UsuarioModel usuario = new UsuarioModel(name, fecha);
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.insertUser(usuario);
        }
    }
}
