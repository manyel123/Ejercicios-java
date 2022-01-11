
package ejercicios;

public class Ejercicio5Condicionales {
    public static void main(String[]args){
           
    estaEnCirculo(2.5,-0.4);
        
    }
    
    public static void estaEnCirculo(double x, double y){
        double h = 2;
        double k = 1;
        double r = 2;
        if ((Math.pow((x-h),2)+(Math.pow((y-k),2))) < r*r){
            System.out.println("El punto x,y está dentro del circulo");
        }else{
            System.out.println("El punto x,y NO está dentro del circulo");   
        }
        
    }
    
}
