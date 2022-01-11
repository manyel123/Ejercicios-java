/*
Realizar la suma, resta, multiplicacion, division y resto de dos numeros.
 */
package basicos1;

/**
 *
 * @author PC
 */
public class OperacionesBasicas {
    public static void main(String[] args){
        final int a = 4;
        final int b = 5;
        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        double division = (double)a/b;
        int residuo = a%b;
        System.out.println("la suma de a + b es: " + suma);
        System.out.println("la resta de a - b es: " + resta);
        System.out.println("la multiplicacion de a * b es: " + multiplicacion);
        System.out.println("la division de a / b es: " + division);
        System.out.println("el residuo de la division a / b es: " + residuo);
    }
}
