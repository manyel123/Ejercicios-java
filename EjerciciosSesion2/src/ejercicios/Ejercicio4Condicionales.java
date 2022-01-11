
package ejercicios;
import java.util.Scanner;

public class Ejercicio4Condicionales {
    public static void main(String[]args){
        
        int num = 0;
        
        System.out.println("Ingrese un número");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        evaluarNum(num);
        
    }
    
    public static void evaluarNum(int n){
        if(n<0){
            System.out.println("El número " + n + " es negativo");
        }else if(n>0){
            System.out.println("El número " + n + " es positivo");
        }else{
            System.out.println("El número " + n + " es el neutro para la suma");
        }
    }
    
}
