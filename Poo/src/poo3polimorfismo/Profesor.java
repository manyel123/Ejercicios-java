/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3polimorfismo;

/**
 *
 * @author PC
 */
public class Profesor extends Persona{/*la clase profesor hereda atributos de la clase persona*/
    
    private String materia;
    
    public Profesor(){
        
        super();/*Llama a la clase padre "Persona" para poder usar sus métodos*/
        
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(25,50));
        
        materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    @Override
    public void disponibilidad() {
        
        int prob=MetodosSueltos.generaNumeroAleatorio(0, 100);
        
        if(prob<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
        
    }  
    
}
