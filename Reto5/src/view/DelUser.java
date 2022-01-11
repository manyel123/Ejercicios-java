/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import access.UsuarioDAO;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */

// Interfaz gráfica para eliminar usuario
public class DelUser extends JFrame implements ActionListener {
    private JLabel                     lblIdUsuario;
    private JTextField                 txtIdUsuario;
    private JButton                    btnDelRegistro;
    
    public DelUser(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Usuarios - Eliminar Usuario");
        setLayout(new GridLayout(0,2));
        
        
        this.lblIdUsuario = new JLabel("ID del usuario a borrar");
        add(this.lblIdUsuario);
        this.txtIdUsuario = new JTextField();
        add(this.txtIdUsuario);

        
        this.btnDelRegistro = new JButton("BORRAR USUARIO DE BD");
        add(this.btnDelRegistro);
        
        this.btnDelRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }

    // Elimina el usuario seleccionado
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnDelRegistro) { 
            int idUsuario      = Integer.parseInt((String)this.txtIdUsuario.getText());
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.deleteUser(idUsuario);
        }
    }
}