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
public class noPerecedero extends Producto{
    
    
    public noPerecedero(String codigo,String precio,String tipo,String estante){
        super(codigo,precio,tipo,estante);
        
    }
    public void mostrar(){
        System.out.println("        Producto No_Perecedero - Código: " + getCodigo());
        System.out.println("    precio: " + getPrecio() + " pesos");
        System.out.println("    tipo producto: " + getTipo());
        System.out.println("    estante: " + getEstante());       
    }
}