/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

/**
 *
 * @author PC
 */
public class Libro {
    
    /*Atributos del objeto Libro*/
    private int ISBN; /*private permite que no se pueda acceder directamente a la variable*/
    private String titulo;
    private String autor;
    private int numPaginas;
    
    /*Constructores*/
    
    public Libro(int pISBN, String pTitulo, String pAutor, int pNumPaginas){
        
        this.ISBN=pISBN;
        this.titulo=pTitulo;
        this.autor=pAutor;
        this.numPaginas=pNumPaginas;
        
    }
    
    /*Metodos*/

    public int getISBN() {/*Devolver el valor del atributo*/
        return ISBN;
    }

    public void setISBN(int ISBN) {/*Modificar el valor del atributo*/
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    } 
    
    @Override
    public String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+" "
                + "creado por el autor "+autor
                + " tiene "+numPaginas+" páginas";
    }
    
}
