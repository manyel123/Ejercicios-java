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
public class Aula {
    
    private int id;
    private Profesor profesor;/*Este objeto tiene una clase aparte*/
    private Alumno[] alumnos;/*Este objeto tiene una clase aparte*/
    private String materia;
    
    private final int MAX_ALUMNOS=20;
    
    public Aula(){
        
        id=1;
        
        profesor=new Profesor();/*Crea el objeto profesor*/
        
        alumnos=new Alumno[MAX_ALUMNOS];/*Crea el espacio donde estarán los alumnos, el Aula*/
        creaAlumnos();/*Crea los objetos Alumnos en un array*/
        
        materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0, 2)];
        
    }
    
    private void creaAlumnos(){
        
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=new Alumno();
        }
        
    }
    
    private boolean asistenciaAlumnos(){
        
        int cuentaAsistencias=0;
        
        for(int i=0;i<alumnos.length;i++){
            
            if(alumnos[i].isAsistencia()){
                cuentaAsistencias++;
            }
        }
        
        System.out.println("Hay "+cuentaAsistencias+" alumnos");
        
        return cuentaAsistencias>=((int)(MAX_ALUMNOS/2));/*retorna un true o false como si fuese un if()*/
    }
    
    public boolean darClase(){
        
        if(!profesor.isAsistencia()){
            System.out.println("El profesor no está, no se puede dar clase");
            return false;
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma, no se puede dar clase");
            return false;
        }else if(!asistenciaAlumnos()){
            System.out.println("No hay suficientes alumnos, no se puede dar clase");
            return false;
        }
        
        System.out.println("Se puede dar clase");
        return true;
        
    }
    
    public void notas(){
        
        int ninosAprob=0;
        int ninasAprob=0;
        
        for(int i=0;i<alumnos.length;i++){
            
            if(alumnos[i].getNota()>=5){
                if(alumnos[i].getSexo()=='H'){
                    ninosAprob++;
                }else{
                    ninasAprob++;
                }
                
                System.out.println(alumnos[i].toString());
                
            }
            
        }    
        
        System.out.println("Hay "+ninosAprob+" niños y "+ninasAprob+" ninas aprobados");
        
    }
    
}
