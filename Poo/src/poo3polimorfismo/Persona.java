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
public abstract class Persona {/*La clase es abstract porque no vamos a crear un objeto Persona*/
                               /*Si bien es cierto que usamos sus atributos, no creamos el objeto persona*/
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;
            
    /*Estas variables se usan para darles nombres a los niños del salón de clase*/
    private final String[] NOMBRES_NINOS={"Pepe", "Fernando", "Alberto", "Nacho", "Roberto"};
    private final String[] NOMBRES_NINAS={"Ana", "Luisa", "Helena", "Maria", "Andrea"}; 
    /*Van en mayúscula para indicar que se están usando como constante*/
    
    public Persona(){
        
        int determinar_sexo=MetodosSueltos.generaNumeroAleatorio(0,1);
        
        if(determinar_sexo==0){
            nombre = NOMBRES_NINOS[MetodosSueltos.generaNumeroAleatorio(0,NOMBRES_NINOS.length-1)];
            sexo='H';
        }else{
            nombre = NOMBRES_NINAS[MetodosSueltos.generaNumeroAleatorio(0,NOMBRES_NINAS.length-1)];
            sexo='M';
        }
        
        disponibilidad();/*Valida la disponibilidad de cada persona*/
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    public abstract void disponibilidad();
    
}


