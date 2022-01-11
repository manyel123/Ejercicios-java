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
public class Perecedero extends Producto{
    private String temp;
    
    public Perecedero(String codigo,String precio,String tipo,String temp,String estante){
        super(codigo,precio,tipo,estante);
        this.temp = temp;
    }
    public void mostrar(){
        System.out.println("        Producto Perecedero - Código: " + getCodigo());
        System.out.println("    precio: " + getPrecio() + " pesos");
        System.out.println("    tipo producto: " + getTipo());
        System.out.println("    temperatura: " + temp + " °C");
        System.out.println("    estante: " + getEstante());       
    }
}
