// Ejercicio #10
// Realizar una aplicación en JAVA, que solicite al usuario ingresar cinco notas de asignaturas definidas, posteriormente se
// debe mostrar en pantalla:
// - Asignatura con mayor nota.
// - Asignatura con menor nota.
// - Promedio de notas.
// - En el caso de que el promedio de notas de inferior a 3, se debe indicar en pantalla la nota que debió obtener en
// la asignatura con menor nota para alcanzar el promedio de 3.

import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float nota_matematicas;
        float nota_espanol;
        float nota_ingles;
        float nota_ciencias;
        float nota_deportes;
        float promedio;
        float promedio_faltante;

        System.out.print("Ingrese la nota de matematicas: ");
        nota_matematicas = teclado.nextFloat();
        System.out.print("Ingrese la nota de espanol: ");
        nota_espanol = teclado.nextFloat();
        System.out.print("Ingrese la nota de ingles: ");
        nota_ingles = teclado.nextFloat();
        System.out.print("Ingrese la nota de ciencias naturales: ");
        nota_ciencias = teclado.nextFloat();
        System.out.print("Ingrese la nota de deportes: ");
        nota_deportes = teclado.nextFloat();
        System.out.println(" ");


        //Calcula la nota mas alta->

        if (nota_matematicas > nota_espanol && nota_matematicas > nota_ingles && nota_matematicas > nota_ciencias && nota_matematicas > nota_deportes){
            System.out.println("La asignatura con mejor nota es: Matematicas");
        }
        else if (nota_espanol > nota_matematicas && nota_espanol > nota_ingles && nota_espanol > nota_ciencias && nota_espanol > nota_deportes){
            System.out.println("La asignatura con mejor nota es: Espanol");
        }
        else if (nota_ingles > nota_matematicas && nota_ingles > nota_espanol && nota_ingles > nota_ciencias && nota_ingles > nota_deportes){
            System.out.println("La asignatura con mejor nota es: Ingles");
        }
        else if (nota_ciencias > nota_matematicas && nota_ciencias > nota_espanol && nota_ciencias > nota_ingles && nota_ciencias > nota_deportes){
            System.out.println("La asignatura con mejor nota es: Ciencias Naturales");
        }
        else if (nota_deportes > nota_matematicas && nota_deportes > nota_espanol && nota_deportes > nota_ingles && nota_deportes > nota_ciencias){
            System.out.println("La asignatura con mejor nota es: Deportes");

        }
        //Calcula la nota mas baja ->

        if (nota_matematicas < nota_espanol && nota_matematicas < nota_ingles && nota_matematicas < nota_ciencias && nota_matematicas < nota_deportes){
            System.out.println("La asignatura con menor nota es: Matematicas");
        }
        else if (nota_espanol < nota_matematicas && nota_espanol < nota_ingles && nota_espanol < nota_ciencias && nota_espanol < nota_deportes){
            System.out.println("La asignatura con menor nota es: Espanol");
        }
        else if (nota_ingles < nota_matematicas && nota_ingles < nota_espanol && nota_ingles < nota_ciencias && nota_ingles < nota_deportes){
            System.out.println("La asignatura con menor nota es: Ingles");
        }
        else if (nota_ciencias < nota_matematicas && nota_ciencias < nota_espanol && nota_ciencias < nota_ingles && nota_ciencias < nota_deportes){
            System.out.println("La asignatura con menor nota es: Ciencias Naturales");
        }
        else if (nota_deportes < nota_matematicas && nota_deportes < nota_espanol && nota_deportes < nota_ingles && nota_deportes < nota_ciencias){
            System.out.println("La asignatura con menor nota es: Deportes");

        }

        //Promedio ->

        promedio = (nota_matematicas + nota_espanol + nota_ingles + nota_ciencias + nota_deportes)/5;
        System.out.println("Su promedio de notas es de: "+promedio);

        if (promedio <= 3){
            promedio_faltante = (100/promedio)/10;
            System.out.println("Debio obtener una nota: "+promedio_faltante+ " Para aprobar el periodo.");
        }



    }
}