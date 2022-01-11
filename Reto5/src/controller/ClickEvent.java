/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import access.PrestamoDAO;
import model.PrestamoModel;
import view.AddUser;
import view.AddEdicion;
import view.AddLibro;
import view.AddPrestamo;
import view.ControlPanel;
import view.DelPrestamo;
import view.DelUser;
import view.DelEdicion;
import view.DelLibro;
import view.UpdFecha;

/**
 *
 * @author PC
 */

public class ClickEvent implements ActionListener {

    private ControlPanel controlsPanel;
    
    /**
     * Constructor of the class
     * @param controlsPanel 
     */
    public ClickEvent(ControlPanel controlsPanel){
        this.controlsPanel = controlsPanel;
    }
    
    // Llena la tabla con los datos de los préstamos
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.controlsPanel.getBtnBuscarPrestamo()) {

            String usuarioNombre      = (String)this.controlsPanel.getTxtPrestamos().getText();
            
            PrestamoDAO prestamoDAO = new PrestamoDAO();
            ArrayList<PrestamoModel> prestamos = prestamoDAO.getFilteredPrestamos(usuarioNombre);
            
            this.controlsPanel.setTblResultsPrestamos(prestamos);
            
        }
        // Evento para el botón añadir usuario
        else if(actionEvent.getSource() == this.controlsPanel.getBtnAddUser()) {
            AddUser addUserView = new AddUser();
            addUserView.setVisible(true);
        }
        // Evento para el botón añadir edición
        else if(actionEvent.getSource() == this.controlsPanel.getBtnAddEdicion()) {
            AddEdicion addEdicionView = new AddEdicion();
            addEdicionView.setVisible(true);
        }
        // Evento para el botón añadir libro
        else if(actionEvent.getSource() == this.controlsPanel.getBtnAddLibro()) {
            AddLibro addLibroView = new AddLibro();
            addLibroView.setVisible(true);
        }
        // Evento para el botón añadir préstamo
        else if(actionEvent.getSource() == this.controlsPanel.getBtnAddPrestamo()) {
            AddPrestamo addPrestamoView = new AddPrestamo();
            addPrestamoView.setVisible(true);
        }
        // Evento para el botón eliminar préstamo
        else if(actionEvent.getSource() == this.controlsPanel.getBtnDelPrestamo()) {
            DelPrestamo delPrestamoView = new DelPrestamo();
            delPrestamoView.setVisible(true);
        }
        // Evento para el botón eliminar usuario
        else if(actionEvent.getSource() == this.controlsPanel.getBtnDelUser()) {
            DelUser delUserView = new DelUser();
            delUserView.setVisible(true);
        }
        // Evento para el botón eliminar edición
        else if(actionEvent.getSource() == this.controlsPanel.getBtnDelEdicion()) {
            DelEdicion delEdicionView = new DelEdicion();
            delEdicionView.setVisible(true);
        }
        // Evento para el botón eliminar libro
        else if(actionEvent.getSource() == this.controlsPanel.getBtnDelLibro()) {
            DelLibro delLibroView = new DelLibro();
            delLibroView.setVisible(true);
        }
        // Evento para el botón actualizar fecha
        else if(actionEvent.getSource() == this.controlsPanel.getBtnUpdFecha()) {
            UpdFecha updFechaView = new UpdFecha();
            updFechaView.setVisible(true);
        }
    }
}