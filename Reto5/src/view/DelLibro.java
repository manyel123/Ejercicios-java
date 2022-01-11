/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import access.LibroDAO;
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

// Interfaz gráfica para eliminar libro
public class DelLibro extends JFrame implements ActionListener {
    private JLabel                     lblIdLibro;
    private JTextField                 txtIdLibro;
    private JButton                    btnDelRegistro;
    
    public DelLibro(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Libros - Eliminar Libros");
        setLayout(new GridLayout(0,2));
        
        
        this.lblIdLibro = new JLabel("ID de libro a borrar");
        add(this.lblIdLibro);
        this.txtIdLibro = new JTextField();
        add(this.txtIdLibro);

        
        this.btnDelRegistro = new JButton("BORRAR LIBRO DE BD");
        add(this.btnDelRegistro);
        
        this.btnDelRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }

    // Elimina el libro seleccionado
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnDelRegistro) { 
            int idLibro      = Integer.parseInt((String)this.txtIdLibro.getText());
            
            LibroDAO libroDAO = new LibroDAO();
            libroDAO.deleteLibro(idLibro);
        }
    }
}