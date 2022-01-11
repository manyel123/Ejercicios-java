
package pack1;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        System.out.println(coseno(Math.PI/6,6));
    }
    public static double coseno(double x, int n){
        double sum = 0;
        for(int i=0;i<=n;i++){
            sum += (Math.pow(-1, i)*Math.pow(x,(2*i)))/(factorial(2*i));
        }
        return sum;
    }
    public static int factorial(int num){
        int fact = 1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}
