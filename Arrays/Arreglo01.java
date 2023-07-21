
        // Realizar un algoritmo donde se pida al suuario un numero N, se cree un arreglo numerico de tamaño N.
        // El sistema debe llenar de forma automatica el arreglo con numeros pares
        // Al final el sistema muestra el contenido del arreglo.

import java.util.Scanner;
public class Arreglo01{
    public static void main(String[] argss){

        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;

        System.out.print("Ingrese el tamano del arreglo: ");
        numero_n = teclado.nextInt();
        int tamano [] = new int [numero_n];

        for(int i = 1; i <= tamano.length; i++){

            System.out.print("["+(i+1)*2+"] ");

            // int numero_aleatorio = (int)(Math. random()*100+1);

            // if(numero_aleatorio % 2 == 0){
            //     System.out.println(numero_aleatorio);
            // }else if(numero_aleatorio % 2 != 0){
            //     System.out.println(numero_aleatorio*2);
            // }

        }

        // Como lo hizo el profesor

    }
}