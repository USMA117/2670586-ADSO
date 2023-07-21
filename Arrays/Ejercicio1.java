// Ejercicio #1
// Realizar una aplicación en Java que solicite al usuario un numero, cree un arreglo del tamaño del numero indicado, lo llene 
// con números impares en cada posición y después lo muestre en pantalla.

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;

        System.out.print("Ingrese el tamano del arreglo: ");
        numero_n = teclado.nextInt();
        int tamano [] = new int [numero_n];

        for(int i = 1; i <= tamano.length; i++){

            // System.out.print(" "+(i+2));
            

            if(i % 2 == 0){
                System.out.print("["+(i+1)+"] ");
            }
            if(i % 2 != 0){
                System.out.print("["+(i)+"] ");
            }

        }

    }
}