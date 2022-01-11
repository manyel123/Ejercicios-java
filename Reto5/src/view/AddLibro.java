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
import model.LibroModel;

/**
 *
 * @author PC
 */

// Interfaz gráfica para agregar nuevo libro
public class AddLibro extends JFrame implements ActionListener {
    private JLabel                     lblTitulo;
    private JTextField                 txtTitulo;
    private JLabel                     lblAutor;
    private JTextField                 txtAutor;
    private JLabel                     lblIdEdicion;
    private JTextField                 txtIdEdicion;
    private JButton                    btnInsertRegistro;
    
    public AddLibro(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Libros - Agregar Libro");
        setLayout(new GridLayout(0,2));
        
        
        this.lblTitulo = new JLabel("Título");
        add(this.lblTitulo);
        this.txtTitulo = new JTextField();
        add(this.txtTitulo);
        
        
        this.lblAutor = new JLabel("Autor");
        add(this.lblAutor);
        this.txtAutor = new JTextField();
        add(this.txtAutor);

        
        this.lblIdEdicion = new JLabel("ID Edición");
        add(this.lblIdEdicion);
        this.txtIdEdicion = new JTextField();
        add(this.txtIdEdicion);
        
        this.btnInsertRegistro = new JButton("Agregar a BD");
        add(this.btnInsertRegistro);
        
        this.btnInsertRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }

    // Agrega nuevo libro
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnInsertRegistro) { 
            String titulo    = (String)this.txtTitulo.getText(); 
            String autor     = (String)this.txtAutor.getText(); 
            int idEdicion    = Integer.parseInt((String)this.txtIdEdicion.getText());
   
            LibroModel libro = new LibroModel(titulo, autor, idEdicion);
            
            LibroDAO libroDAO = new LibroDAO();
            libroDAO.insertLibro(libro);
        }
    }
}