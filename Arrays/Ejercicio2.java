// Ejercicio #2
// Realizar una aplicación en Java que solicite al usuario un numero, cree un arreglo del tamaño del numero indicado, lo llene 
// con números primos en cada posición y después lo muestre en pantalla.

import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n;
        int divisores = 1;
        int j =2;
        

        System.out.print("Ingrese el tamano del arreglo: ");
        numero_n = teclado.nextInt();

        int tamano [] = new int [numero_n];

        for(int i = 1; i <= tamano.length; i++){

                if(j % 2 == 0){
                    // divisores++;
                    // if(divisores == 2){
                        System.out.print(j);
                        j++;

                    // }
                }


            //  if(j % divisores != 0){
            //     System.out.print(j);
            //     j++;
            //     divisores++;

            //     if (divisores == 2){
            //         System.out.print("["+j+"]");
            //         j++;
            //     }
            // }
            // if(divisores % j == 0){
            //     divisores++;
            //     j++;
            //     System.out.print("[]");

            // }
            

            // for(int j = 1; j <= tamano.length; j++){
            //     if(divisores % j == 0){
            //         divisores = divisores + 1;

            //     }
            //     if(divisores == 2){
            //         System.out.print(j);
            //     }

            // }
            // if (divisores == 2){
            //     System.out.print("El numero es primo.");
            // }
            // else {
            //     System.out.print("El numero no es primo.");

            // }

        }

    }
}