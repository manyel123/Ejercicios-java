
package calculadora;


public class Calculadora implements Constantes,Operaciones{
    private double a;
    private double b;
    
    public Calculadora(double a, double b){
        this.a = a;
        this.b = b;
        
    }

    public void sumar() {
        System.out.print(a+" + "+b+" = ");
        System.out.println(a+b);
    }

    public void restar() {
        System.out.print(a+" - "+b+" = ");
        System.out.println(a-b);
    }

    public void miltiplicar() {
        System.out.print(a+" x "+b+" = ");
        System.out.println(a*b);
    }

    public void dividir() {
        System.out.print(a+" / "+b+" = ");
        System.out.println(a/b);
    }
    
    public void sumarE() {
        System.out.print(a+" + "+e+" = ");
        System.out.println(a+e);
    }
    
    public void restarE() {
        System.out.print(a+" - "+e+" = ");
        System.out.println(a-e);
    }

    public void miltiplicarPorE() {
        System.out.print(a+" x "+e+" = ");
        System.out.println(a*e);
    }

    public void dividirPorE() {
        System.out.print(a+" / "+e+" = ");
        System.out.println(a/e);
    }
    
    public void sumarPi() {
        System.out.print(a+" + "+pi+" = ");
        System.out.println(a+pi);
    }
    
    public void restarpi() {
        System.out.print(a+" - "+pi+" = ");
        System.out.println(a-pi);
    }

    public void miltiplicarPorPi() {
        System.out.print(a+" x "+pi+" = ");
        System.out.println(a*pi);
    }

    public void dividirPorPi() {
        System.out.print(a+" / "+pi+" = ");
        System.out.println(a/pi);
    }
}
