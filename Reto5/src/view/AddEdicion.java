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
import model.EdicionModel;

/**
 *
 * @author PC
 */

// Interfaz gráfica para agregar nueva edicón
public class AddEdicion extends JFrame implements ActionListener {
    private JLabel                     lblanio;
    private JTextField                 txtAnio;
    private JLabel                     lblIdioma;
    private JTextField                 txtIdioma;
    private JLabel                     lblCopias;
    private JTextField                 txtCopias;
    private JButton                    btnInsertRegistro;
    
    public AddEdicion(){
        initComponents();
    }
     
    public void initComponents(){
        setTitle("Edición - Agregar Edición");
        setLayout(new GridLayout(0,2));
        
        
        this.lblanio = new JLabel("Año");
        add(this.lblanio);
        this.txtAnio = new JTextField();
        add(this.txtAnio);
        
        
        this.lblIdioma = new JLabel("Idioma");
        add(this.lblIdioma);
        this.txtIdioma = new JTextField();
        add(this.txtIdioma);

        
        this.lblCopias = new JLabel("Copias");
        add(this.lblCopias);
        this.txtCopias = new JTextField();
        add(this.txtCopias);
        
        this.btnInsertRegistro = new JButton("Agregar a BD");
        add(this.btnInsertRegistro);
        
        this.btnInsertRegistro.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
        pack();
        setVisible(true);
    }
    
    // Agrega nueva edición
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.btnInsertRegistro) { 
            int anio      = Integer.parseInt( (String)this.txtAnio.getText());
            String idioma = (String)this.txtIdioma.getText(); 
            int copias    = Integer.parseInt( (String)this.txtCopias.getText());
   
            EdicionModel edicion = new EdicionModel(anio, idioma, copias);
            
            EdicionDAO edicionDAO = new EdicionDAO();
            edicionDAO.insertEdition(edicion);
        }
    }
}
