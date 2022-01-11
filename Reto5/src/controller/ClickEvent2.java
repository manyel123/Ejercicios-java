/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import access.UsuarioDAO;
import model.UsuarioModel;
import view.ControlPanel;

/**
 *
 * @author PC
 */

// Clase para rellenar la tabla con una nueva busqueda de usuarios
public class ClickEvent2 implements ActionListener {

    private ControlPanel controlsPanel;
    
    /**
     * Constructor of the class
     * @param controlsPanel 
     */
    public ClickEvent2(ControlPanel controlsPanel){
        this.controlsPanel = controlsPanel;
    }
    
    // Llena la tabla con los datos del usuario
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.controlsPanel.getBtnBuscarUsuario()) {

            String usuarioNombre      = (String)this.controlsPanel.getTxtUsuarios().getText();
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            ArrayList<UsuarioModel> usuarios = usuarioDAO.getFilteredUsuarios(usuarioNombre);
            
            this.controlsPanel.setTblResultsUsuarios(usuarios);
        }  
    }
}