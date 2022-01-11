/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import access.LibroDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.LibroModel;
import view.ControlPanel;

/**
 *
 * @author PC
 */

// Clase para rellenar la tabla con una nueva busqueda de libros
public class ClickEvent1 implements ActionListener {

    private ControlPanel controlsPanel;
    
    /**
     * Constructor of the class
     * @param controlsPanel 
     */
    public ClickEvent1(ControlPanel controlsPanel){
        this.controlsPanel = controlsPanel;
    }
    
    // Llena la tabla con los datos de los libros
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.controlsPanel.getBtnBuscarLibro()) {

            String libroTitulo      = (String)this.controlsPanel.getTxtLibros().getText();
            
            LibroDAO libroDAO = new LibroDAO();
            ArrayList<LibroModel> libros = libroDAO.getFilteredLibros(libroTitulo);
            
            this.controlsPanel.setTblResultsLibros(libros);
        }    
    }
}
