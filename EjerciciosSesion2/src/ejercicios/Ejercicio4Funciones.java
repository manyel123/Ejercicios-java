
package ejercicios;
import java.util.Scanner;

public class Ejercicio4Funciones {
    public static void main(String[]args){
        int contagios = 0;
        int dias = 0;
        int proyeccion = 0;
        
        System.out.println("Ingrese el número de contagios de hoy");
        Scanner sc = new Scanner(System.in);
        contagios = sc.nextInt();
        System.out.println("Ingrese los días para la proyección");
        dias = sc.nextInt();
        System.out.println("Los contagios después de " + dias + " días serán:" + 
                calcularProyeccion(contagios,dias));
        
    }
    public static int calcularProyeccion(int contagios, int dias){
        return dias * contagios * 2;
    }
}
