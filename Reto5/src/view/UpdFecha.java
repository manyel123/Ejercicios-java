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
import model.UsuarioModel;

/**
 *
 * @author PC
 */
public class UpdFecha extends JFrame implements ActionListener {
    private JLabel                     lblIdUsuario;
    private JTextField                 txtIdUsuario;
    private JLabel                     lblNewFecha;
    private JTextField                 txtNewFecha;
    private JButton                    btnInsertRegistro;
    
    public UpdFecha(){
        initComponents();
    }
    // Interfaz gráfica para actualizar la fecha
    public void initComponents(){
        setTitle("Actualizar Fecha de Préstamo");
        setLayout(new GridLayout(0,2));
        
        
        this.lblIdUsuario = new JLabel("ID Usuario");
        add(this.lblIdUsuario);
        this.txtIdUsuario = new JTextField();
        add(this.txtIdUsuario);
        
        
        this.lblNewFecha = new JLabel("Nueva Fecha de Prestamo");
        add(this.lblNewFecha);
        this.txtNewFecha = new JTextField();
        add(this.txtNewFecha);

        
        this.btnInsertRegistro = new JButton("Actualizar Fecha");
        add(this.btnInsertRegistro);
        
        this.btnInsertRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }
    
    // Actualiza la fecha
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnInsertRegistro) { 
            int idUsuario  = Integer.parseInt((String)this.txtIdUsuario.getText()); 
            String fecha = (String)this.txtNewFecha.getText(); 

   
            UsuarioModel usuario = new UsuarioModel(idUsuario, fecha);
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.updateFecha(usuario);
        }
    }
}