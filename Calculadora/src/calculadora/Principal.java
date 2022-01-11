
package calculadora;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a");
        a = sc.nextDouble();
        System.out.println("Ingrese b");
        b = sc.nextDouble();
        Calculadora c = new Calculadora(a,b);
        c.sumar();
        c.restar();;
        c.miltiplicar();
        c.dividir();
        c.sumarE();
        c.restarE();
        c.miltiplicarPorE();
        c.dividirPorE();
        c.sumarPi();
        c.restarpi();
        c.miltiplicarPorPi();
        c.dividirPorPi();
    }
    
}
