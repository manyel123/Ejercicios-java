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

/**
 *
 * @author PC
 */

// Interfaz gráfica para eliminar préstamo
public class DelPrestamo extends JFrame implements ActionListener {
    private JLabel                     lblIdPrestamo;
    private JTextField                 txtIdPrestamo;
    private JButton                    btnDelRegistro;
    
    public DelPrestamo(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Préstamos - Eliminar Préstamo");
        setLayout(new GridLayout(0,2));
        
        
        this.lblIdPrestamo = new JLabel("ID de préstamo a borrar");
        add(this.lblIdPrestamo);
        this.txtIdPrestamo = new JTextField();
        add(this.txtIdPrestamo);

        
        this.btnDelRegistro = new JButton("BORRAR PRESTAMO DE BD");
        add(this.btnDelRegistro);
        
        this.btnDelRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }

    // Elimina el préstamo seleccionado
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnDelRegistro) { 
            int idPrestamo      = Integer.parseInt((String)this.txtIdPrestamo.getText());
            
            PrestamoDAO prestamoDAO = new PrestamoDAO();
            prestamoDAO.deletePrestamo(idPrestamo);
        }
    }
}