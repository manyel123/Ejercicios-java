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
public class Alumno extends Persona{/*La clase alumno hereda atributos de la clase persona*/
    
    private int nota;
    
    public Alumno(){
        
        super();/*Llama a la clase padre "Persona" para poder usar sus métodos*/
        
        nota=MetodosSueltos.generaNumeroAleatorio(0,10);
        
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(12,15));
        
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public void disponibilidad() {
        
        int prob=MetodosSueltos.generaNumeroAleatorio(0, 100);
        
        if(prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
        
    }
    
    public String toString(){
        
        return "Nombre: "+super.getNombre()+", sexo: "+super.getSexo()+", nota: "+nota;
        
    }
    
}
