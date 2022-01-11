/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author PC
 */
public class Producto {
    private String codigo;
    private String precio;
    private String tipo;
    private String estante;
    
    public Producto(String codigo,String precio,String tipo,String estante){
    this.codigo = codigo;
    this.precio = precio;
    this.tipo = tipo;
    this.estante = estante;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstante() {
        return estante;
    }
    
    public void mostrar(){
        
    }
}
