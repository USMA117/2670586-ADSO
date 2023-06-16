/*Ejercicio #1
Realizar una aplicación que le permita a un docente de una institución educativa, el promedio de la nota obtenida por un 
estudiante en la materia. La aplicación debe solicitarle al usuario ingresar la cantidad de notas y posteriormente solicitarle 
ingresar cada nota. Al final debe mostrar el promedio obtenido por el estudiante*/


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        int notas;
        float cantidad_notas,promedio,total=0;
        System.out.print(" => Ingrese cantidad de notas: ");
        notas = teclado.nextInt();
        for(int i = 1; i <= notas; i=i+1){
            System.out.print(" => Ingrese nota: "+i+" : ");
            cantidad_notas = teclado.nextFloat();
            
            total = cantidad_notas+total;
            
        }

        promedio = total / notas;
        System.out.print("Promedio de nota obtenida: "+promedio);

    }
}