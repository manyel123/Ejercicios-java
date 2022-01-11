/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:
 -obtenerRaices(): imprime las 2 posibles soluciones
 -obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
 -getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, b2-4ac
 -tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
 -tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
 -calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
Formula ecuación 2º grado:  (-b±√(b^2-4ac))/2a
Solo varia el signo delante de -b
 */
package poo2metodosPrivados;

/**
 *
 * @author PC
 */
public class Raices {
    
    private double a;
    private double b;
    private double c;
    
    public Raices(double a, double b, double c){
        
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    private void obtenerRaices(){
        
        double x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        
        System.out.println("Solución X1");
        System.out.println(x1);
        System.out.println("Solución X2");
        System.out.println(x2);
        
    }
    
    private void obtenerRaiz(){
        
        double x=(-b)/(2*a);
        
        System.out.println("Unica solución");
        System.out.println(x);
        
    }
    
    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c); /*b^2-4ac*/
    }
    
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
    public void calcular(){
        
        if(tieneRaices()){
            this.obtenerRaices();
        }else if(tieneRaiz()){
            this.obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones");
        }
        
    }
    
}
