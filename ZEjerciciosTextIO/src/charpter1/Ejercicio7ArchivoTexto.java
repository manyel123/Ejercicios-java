/*
Suppose that a file named “testdata.txt” contains the following information: The first
line of the file is the name of a student. Each of the next three lines contains an integer.
The integers are the student’s scores on three exams. Write a program that will read
the information in the file and display (on standard output) a message that contains the
name of the student and the student’s average grade on the three exams. The average is
obtained by adding up the individual exam grades and then dividing by the number of
exams.
 */
package charpter1;

public class Ejercicio7ArchivoTexto {
    
    public static void main(String[] args){
        
        TextIO.readFile("src/charpter1/testdata.txt");
        String name;
        int a;
        int b;
        int c;    
        int avg;
        name = TextIO.getln();
        TextIO.eoln();
        a = (int)TextIO.getInt();
        TextIO.eoln();
        b = (int)TextIO.getInt();
        TextIO.eoln();
        c = (int)TextIO.getInt();
        avg = (a+b+c)/3;
        System.out.println(name + " tiene un promedio de " + avg + " en sus calificaciones.");
        
    }
    
}
