/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Inventario {
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static void main(String[] args){
        Perecedero per;
        noPerecedero noper;
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        String[] split = str.split("&"); 
        while(!"3".equals(split[0])){
            if(split[0].equals("1")){
                if(split[1].equals("Perecedero")){ 
                    per = new Perecedero(split[2],split[3],split[4],split[5],split[6]);
                    productos.add(per);
                }else if(split[1].equals("NoPerecedero")){
                    noper = new noPerecedero(split[2],split[3],split[4],split[5]);
                    productos.add(noper);
                }
                
            }else if(split[0].equals("2")){
                System.out.println("***Inventario de Productos***");
                productos.forEach(producto -> {
                    producto.mostrar();
                });
            }
            str = sc.nextLine();
            split = str.split("&");
        }       
    }
}
