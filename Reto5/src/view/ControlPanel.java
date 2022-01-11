/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.ClickEvent;
import controller.ClickEvent1;
import controller.ClickEvent2;
import controller.ClickEvent3;
import controller.InitialData;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.PrestamoModel;
import model.UsuarioModel;
import model.LibroModel;
import model.EdicionModel;


/**
 *
 * @author PC
 */
public class ControlPanel extends JPanel {
 
    private JLabel                       lblName;
    private JTextField                   txtPrestamos;
    private JTextField                   txtLibros;
    private JTextField                   txtUsuarios;
    private JTextField                   txtEdiciones;
    private JButton                      btnBuscarPrestamo;
    private JButton                      btnBuscarLibro;
    private JButton                      btnBuscarUsuario;
    private JButton                      btnBuscarEdicion;
    private JButton                      btnAddUser;
    private JButton                      btnAddLibro;
    private JButton                      btnAddEdicion;
    private JButton                      btnAddPrestamo;
    private JButton                      btnDelUser;
    private JButton                      btnDelLibro;
    private JButton                      btnDelEdicion;
    private JButton                      btnDelPrestamo;
    private JButton                      btnUpdFecha;
    private JTable                       tblResultsPrestamos;
    private JTable                       tblResultsUsuarios;
    private JTable                       tblResultsLibros;
    private JTable                       tblResultsEdiciones;
    
    /**
     * Constructor of the ControlsPanel class.
     * @param resultsPanel
     */
    public ControlPanel(ResultsPanel resultsPanel){
        this.tblResultsPrestamos = resultsPanel.getTblResults();
        this.tblResultsUsuarios  = resultsPanel.getTblResults();
        this.tblResultsLibros    = resultsPanel.getTblResults();
        this.tblResultsEdiciones = resultsPanel.getTblResults();
        initComponents();
    }
    
    
    /**
     * 
     */
    private void initComponents(){
        setLayout(new GridLayout(0,2));
        InitialData initialData = new InitialData();
        // Tablas de resultado de las busquedas
        this.setTblResultsPrestamos(initialData.getPrestamos());
        this.setTblResultsUsuarios(initialData.getUsuarios());
        this.setTblResultsLibros(initialData.getLibros());
        this.setTblResultsEdiciones(initialData.getEdiciones());
    
        // Botones de busqueda
        this.btnBuscarUsuario = new JButton("Busqueda de Usuarios");
        add(this.getBtnBuscarUsuario());
        this.txtUsuarios = new JTextField();
        add(this.getTxtUsuarios());
        ClickEvent2 clickEvent2 = new ClickEvent2(this);
        this.getBtnBuscarUsuario().addActionListener(clickEvent2);
        
        this.btnBuscarLibro = new JButton("Busqueda de Libros");
        add(this.getBtnBuscarLibro());
        this.txtLibros = new JTextField();
        add(this.getTxtLibros());
        ClickEvent1 clickEvent1 = new ClickEvent1(this);
        this.getBtnBuscarLibro().addActionListener(clickEvent1);
        
        this.btnBuscarPrestamo = new JButton("Busqueda de Prestamos");
        add(this.getBtnBuscarPrestamo());
        this.txtPrestamos = new JTextField();
        add(this.getTxtPrestamos());
        ClickEvent clickEvent = new ClickEvent(this);
        this.getBtnBuscarPrestamo().addActionListener(clickEvent);
        
        this.btnBuscarEdicion = new JButton("Busq Ediciones(Idioma)");
        add(this.getBtnBuscarEdicion());
        this.txtEdiciones = new JTextField();
        add(this.getTxtEdiciones());
        ClickEvent3 clickEvent3 = new ClickEvent3(this);
        this.getBtnBuscarEdicion().addActionListener(clickEvent3);
        
        
        // Botones para insertar datos
        this.btnAddUser = new JButton("1.Agregar Usuario");
        add(this.getBtnAddUser());
        this.getBtnAddUser().addActionListener(clickEvent);
                
        this.btnAddPrestamo = new JButton("2.Agregar Préstamo");
        add(this.getBtnAddPrestamo());
        this.getBtnAddPrestamo().addActionListener(clickEvent);        
        
        this.btnAddEdicion = new JButton("1.Agregar Edición");
        add(this.getBtnAddEdicion());
        this.getBtnAddEdicion().addActionListener(clickEvent);
        
        this.btnAddLibro = new JButton("2.Agregar Libro");
        add(this.getBtnAddLibro());
        this.getBtnAddLibro().addActionListener(clickEvent);
                                
        
        // Botones para eliminar datos
        this.btnDelPrestamo = new JButton("1.Elimina Prestamo");
        add(this.getBtnDelPrestamo());
        this.getBtnDelPrestamo().addActionListener(clickEvent);
                
        this.btnDelUser = new JButton("2.Elimina Usuario");
        add(this.getBtnDelUser());
        this.getBtnDelUser().addActionListener(clickEvent);
        
        this.btnDelLibro = new JButton("1.Elimina Libro");
        add(this.getBtnDelLibro());
        this.getBtnDelLibro().addActionListener(clickEvent);
        
        this.btnDelEdicion = new JButton("2.Elimina Edición");
        add(this.getBtnDelEdicion());
        this.getBtnDelEdicion().addActionListener(clickEvent);
              
        
        // Boton para actualizar datos
        this.btnUpdFecha = new JButton("Actualiza Fecha Préstamo");
        add(this.getBtnUpdFecha());
        this.getBtnUpdFecha().addActionListener(clickEvent);
    }


    // Tabla de resultados para prestamos
    public void setTblResultsPrestamos(ArrayList<PrestamoModel> prestamos) {
        String[] headers = {"ID Préstamo", "Usuario", "Libro", "Autor", "Edición", "Fecha"};
        this.getTblResultsPrestamos().removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers); 
        this.getTblResultsPrestamos().setModel(tableModel);
        for(int i=0; i<prestamos.size(); i++){
            tableModel.addRow(prestamos.get(i).toArray() );
        }
    }

    // Tabla de resultados para usuarios
    public void setTblResultsUsuarios(ArrayList<UsuarioModel> usuarios) {
        String[] headers = {"ID Usuario", "Nombre", "Fecha"};
        this.getTblResultsPrestamos().removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers); 
        this.getTblResultsPrestamos().setModel(tableModel);
        for(int i=0; i<usuarios.size(); i++){
            tableModel.addRow(usuarios.get(i).toArray() );
        }
    }
    
    // Tabla de resultados para libros
    public void setTblResultsLibros(ArrayList<LibroModel> libros) {
        String[] headers = {"ISBN", "Título", "Autor", "Edición", "Copias"};
        this.getTblResultsPrestamos().removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers); 
        this.getTblResultsPrestamos().setModel(tableModel);
        for(int i=0; i<libros.size(); i++){
            tableModel.addRow(libros.get(i).toArray() );
        }
    }

    public void setTblResultsEdiciones(ArrayList<EdicionModel> ediciones) {
        String[] headers = {"Id", "Año", "Idioma", "Copias"};
        this.getTblResultsPrestamos().removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers); 
        this.getTblResultsPrestamos().setModel(tableModel);
        for(int i=0; i<ediciones.size(); i++){
            tableModel.addRow(ediciones.get(i).toArray() );
        }
    }
    
    public JTextField getTxtEdiciones() {
        return txtEdiciones;
    }
    
    /**
     * @return the getBtnBuscarEdicion
     */
    public JButton getBtnBuscarEdicion() {
        return btnBuscarEdicion;
    }
    
    /**
     * @return the getBtnUpdFecha
     */
    public JButton getBtnUpdFecha() {
        return btnUpdFecha;
    }
    
    /**
     * @return the lblName
     */
    public JLabel getLblName() {
        return lblName;
    }

    /**
     * @return the txtPrestamos
     */
    public JTextField getTxtPrestamos() {
        return txtPrestamos;
    }

    /**
     * @return the getBtnDelUser
     */
    public JButton getBtnDelUser() {
        return btnDelUser;
    }

    /**
     * @return the getBtnDelLibro
     */
    public JButton getBtnDelLibro() {
        return btnDelLibro;
    }

    /**
     * @return the getBtnDelEdicion
     */
    public JButton getBtnDelEdicion() {
        return btnDelEdicion;
    }

    /**
     * @return the getBtnDelPrestamo
     */
    public JButton getBtnDelPrestamo() {
        return btnDelPrestamo;
    }

    /**
     * @return the txtLibros
     */
    public JTextField getTxtLibros() {
        return txtLibros;
    }

    /**
     * @return the txtUsuarios
     */
    public JTextField getTxtUsuarios() {
        return txtUsuarios;
    }

    /**
     * @return the btnBuscarPrestamo
     */
    public JButton getBtnBuscarPrestamo() {
        return btnBuscarPrestamo;
    }

    /**
     * @return the btnBuscarLibro
     */
    public JButton getBtnBuscarLibro() {
        return btnBuscarLibro;
    }

    /**
     * @return the btnBuscarUsuario
     */
    public JButton getBtnBuscarUsuario() {
        return btnBuscarUsuario;
    }

    /**
     * @return the btnAddUser
     */
    public JButton getBtnAddUser() {
        return btnAddUser;
    }
    
    /**
     * 
     * @return the getBtnAddLibro
     */
    public JButton getBtnAddLibro() {
        return btnAddLibro;
    }
    
    /**
     * 
     * @return the getBtnAddPrestamo
     */
    public JButton getBtnAddPrestamo() {
        return btnAddPrestamo;
    }
    
    /**
     * 
     * @return the getBtnAddEdicion
     */
    public JButton getBtnAddEdicion() {
        return btnAddEdicion;
    }

    /**
     * @return the tblResultsPrestamos
     */
    public JTable getTblResultsPrestamos() {
        return tblResultsPrestamos;
    }

}