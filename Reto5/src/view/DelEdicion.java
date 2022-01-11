/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import access.EdicionDAO;
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

// Interfaz gráfica para eliminar edición
public class DelEdicion extends JFrame implements ActionListener {
    private JLabel                     lblIdEdicion;
    private JTextField                 txtIdEdicion;
    private JButton                    btnDelRegistro;
    
    public DelEdicion(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Edición - Eliminar Edición");
        setLayout(new GridLayout(0,2));
        
        
        this.lblIdEdicion = new JLabel("ID de Edición a borrar");
        add(this.lblIdEdicion);
        this.txtIdEdicion = new JTextField();
        add(this.txtIdEdicion);

        
        this.btnDelRegistro = new JButton("BORRAR EDICION DE BD");
        add(this.btnDelRegistro);
        
        this.btnDelRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }
    
    // Elimina la edición seleccionada
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnDelRegistro) { 
            int idEdicion      = Integer.parseInt((String)this.txtIdEdicion.getText());
            
            EdicionDAO edicionDAO = new EdicionDAO();
            edicionDAO.deleteEdition(idEdicion);
        }
    }
}