
package pack1;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int n = 0;
        double num = 2;
        System.out.println("Ingrese la potencia n para elevar 2");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n == 0){
            num = 1;
        }else if(n < 0){
            n*=-1;
            for(int i=1;i<n;i++){    
                num*=2; 
            }
            num = 1/num;
        }else{
            for(int i=1;i<n;i++){    
                num*=2;
            }
        }       
        System.out.println("2 ala " + n + " es " + num);     
    }
    
}
