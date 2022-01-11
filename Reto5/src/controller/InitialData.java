/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import access.EdicionDAO;
import java.util.ArrayList;
import access.LibroDAO;
import model.EdicionModel;
import access.PrestamoDAO;
import model.PrestamoModel;
import access.UsuarioDAO;
import model.LibroModel;
import model.UsuarioModel;


/**
 *
 * @author PC
 */
public class InitialData {
    private ArrayList<EdicionModel>     ediciones  = null;
    private ArrayList<PrestamoModel>    prestamos  = null;
    private ArrayList<LibroModel>           libro  = null;
    private ArrayList<UsuarioModel>      usuarios  = null;

    // Trae los datos iniciales para todas las tablas
    public InitialData(){
        EdicionDAO edicionDAO = new EdicionDAO();
        this.ediciones = edicionDAO.getAllEditions();

   
        LibroDAO libroDAO = new LibroDAO();
        this.libro = libroDAO.getAllLibros();

        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        this.usuarios = usuarioDAO.getAllUsers();

        
        PrestamoDAO prestamoDAO = new PrestamoDAO();
        this.prestamos = prestamoDAO.getAllPrestamos();
    }

    public ArrayList<EdicionModel> getEdiciones() {
        return ediciones;
    }

    public ArrayList<PrestamoModel> getPrestamos() {
        return prestamos;
    }

    public ArrayList<LibroModel> getLibros() {
        return libro;
    }

    public ArrayList<UsuarioModel> getUsuarios() {
        return usuarios;
    }
}