
package reto1;
import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        
        int p = 0;
        int h = 0;
        int l = 0;
        
        System.out.println("Ingrese el puntaje de la primera prueba");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        h = (p*2)+4;
        l = (p+h)/5;
        
        if(l>=0 && l<=20){
            System.out.println(p + " " + h + " " + l);
            System.out.println("uno");
        }else if(l>=21 && l<=30){
            System.out.println(p + " " + h + " " + l);
            System.out.println("dos");
        }else if(l>=31 && l<=50){
            System.out.println(p + " " + h + " " + l);
            System.out.println("tres");
        }else{
            System.out.println(p + " " + h + " " + l);
            System.out.println("cuatro");
        }
        
    }
    
}
