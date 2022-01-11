
package ejercicios;
import java.util.Scanner;

public class Ejercicio3Funciones {
    public static void main(String[]args){
        double prestamo = 0;
        
        System.out.println("Ingrese el monto del préstamo");
        Scanner sc = new Scanner(System.in);
        prestamo = sc.nextDouble();
        
        System.out.println("Al final de 2 meses deberá pagar:");
        System.out.println(calcularTotal(prestamo));
    }
    public static double calcularTotal(double capital){
        capital *= 1.03;
        return capital *= 1.03;
    }
}
