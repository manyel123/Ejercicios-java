/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import access.EdicionDAO;
import model.EdicionModel;
import view.ControlPanel;

/**
 *
 * @author PC
 */

// Clase para rellenar la tabla con una nueva busqueda de ediciones
public class ClickEvent3 implements ActionListener {

    private ControlPanel controlsPanel;
    
    /**
     * Constructor of the class
     * @param controlsPanel 
     */
    public ClickEvent3(ControlPanel controlsPanel){
        this.controlsPanel = controlsPanel;
    }
    
    // Llena la tabla con los datos de las ediciónes
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.controlsPanel.getBtnBuscarEdicion()) {

            String edicion      = (String)this.controlsPanel.getTxtEdiciones().getText();
            
            EdicionDAO edicionDAO = new EdicionDAO();
            ArrayList<EdicionModel> ediciones = edicionDAO.getFilteredEdiciones(edicion);
            
            this.controlsPanel.setTblResultsEdiciones(ediciones);
        }  
    }
}