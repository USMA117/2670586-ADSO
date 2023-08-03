// Ejercicio #3
// Realizar una aplicación en Java que solicite al usuario un numero entero, se debe llenar el arreglo con datos solicitados al 
// usuario. Después de que el arreglo se encuentre lleno, se solicita al usuario ingresar un número correspondiente a una 
// posición dentro del arreglo. Se debe imprimir en pantalla el arreglo original y los valores del arreglo en sentido anti horario 
// desde la posición indicada por el usuario.

import java.util.Scanner;
public class Ejercicio3{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);


        // Solicitar un numero entero
        System.out.print("Ingrese un numero: ");
        int numero_n = teclado.nextInt();

        // Crear arreglo
        int arreglo[] = new int[numero_n];

        // llenar arreglo
        for(int i = 0; i < numero_n; i++){
            System.out.print("Ingrese el valor del dato "+(i+1)+" : ");
            arreglo[i] = teclado.nextInt();
        }

        // Imprimir arreglo original 
        System.out.print("Arreglo original: ");
        System.out.print("[ ");

        for(int i = 0; i < numero_n; i++){
            System.out.print(arreglo[i]+", ");

        }
        System.out.print("]");
        


        // Solicitar ingresar una posicion del arreglo
        System.out.println("");
        System.out.print("Ingrese la posicion del arreglo: ");
        int posicion = teclado.nextInt();

        // Imprimir el arreglo en sentido antihorario desde posicion ingresada

        System.out.print("Arreglo en orden descendente: ");
        System.out.print("[ ");

        for(int i = 0; i < numero_n; i++){
            System.out.print(arreglo[i-1]+", ");

        }
        System.out.print("]");


    }
}