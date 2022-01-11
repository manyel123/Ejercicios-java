
package biblioteca;


public class Principal {
    public static void main(String[] args){
        
        Diccionario diccionario = new Diccionario("Español-Ingles","16 Dic 1999",354,2,"Idiomas",59900,"Norma");
        Novela novela = new Novela("La iliada","15 Oct 2008",589,4,18,79900,"Drama","Panam");
        Articulo articulo = new Articulo("Deformación del espacio tiempo en agujeros negros","18 ene 2019",125,1,"Space&Cience","Astronomía");
        Revista revista = new Revista("Al presidente le quedó grande el país","16 sep 2021",62,356,"El espectador",1000);       
        diccionario.mostrar();
        novela.mostrar();
        articulo.mostrar();
        revista.mostrar();
    }
}
