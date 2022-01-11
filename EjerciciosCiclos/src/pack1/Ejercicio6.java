
package pack1;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        double x = 0;
        double num = 0;
        double n = 0;
        
        System.out.print("Para x^n ingrese x:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.print("Para x^n ingrese n:");
        n = sc.nextDouble();
        num = x;
        if(n == 0){
            num = 1;
        }else if(n < 0){
            n*=-1;
            for(int i=1;i<n;i++){    
                num*=x; 
            }
            num = 1/num;
        }else{
            for(int i=1;i<n;i++){    
                num*=x;
            }
        }       
        System.out.println(x + " ala " + n + " es " + num);     
    }
    
}
