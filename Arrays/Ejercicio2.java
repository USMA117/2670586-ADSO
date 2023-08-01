// Ejercicio #2
// Realizar una aplicación en Java que solicite al usuario un numero, cree un arreglo del tamaño del numero indicado, lo llene 
// con números primos en cada posición y después lo muestre en pantalla.

import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int contador_primos = 0;
        int primo = 2;

        

        System.out.print("Ingrese el tamano del arreglo: ");
        int numero_n = teclado.nextInt();

        int tamano [] = new int [numero_n];


        while(contador_primos< numero_n){
            int divisores = 0;

            // Verificar si el numero es primo
            for(int i = 1; i <= primo; i++ ){
                if(primo % i == 0){
                    divisores++;
                }

            }

            //si es primo
            //se almacena el numero en el arreglo
            //se aumenta contador primos

            if(divisores == 2){
                tamano[contador_primos] = primo;
                contador_primos++;
            }

            // aumentar primo
            primo++;
        }
        // Imprimir arreglo
        for(int i = 0;i < tamano.length; i++){
            System.out.print("["+tamano[i]+"]");

        }


    }
}