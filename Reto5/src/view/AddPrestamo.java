/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import access.PrestamoDAO;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.PrestamoModel;

/**
 *
 * @author PC
 */

// Interfaz gráfica para agregar nuevo préstamo
public class AddPrestamo extends JFrame implements ActionListener {
    private JLabel                     lblIdLibro;
    private JTextField                 txtIdLibro;
    private JLabel                     lblIdUsuario;
    private JTextField                 txtIdUsuario;
    private JButton                    btnInsertRegistro;
    
    public AddPrestamo(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Préstamos - Agregar Préstamo");
        setLayout(new GridLayout(0,2));
        
        
        this.lblIdLibro = new JLabel("ID Libro");
        add(this.lblIdLibro);
        this.txtIdLibro = new JTextField();
        add(this.txtIdLibro);
        
        
        this.lblIdUsuario = new JLabel("ID Usuario");
        add(this.lblIdUsuario);
        this.txtIdUsuario = new JTextField();
        add(this.txtIdUsuario);

        
        this.btnInsertRegistro = new JButton("Agregar a BD");
        add(this.btnInsertRegistro);
        
        this.btnInsertRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }

    // Agrega nuevo préstamo
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnInsertRegistro) { 
            int idEdicion      = Integer.parseInt((String)this.txtIdLibro.getText());
            int IdUsuario      = Integer.parseInt((String)this.txtIdUsuario.getText());
   
            PrestamoModel prestamo = new PrestamoModel(idEdicion, IdUsuario);
            
            PrestamoDAO prestamoDAO = new PrestamoDAO();
            prestamoDAO.insertPrestamo(prestamo);
        }
    }
}