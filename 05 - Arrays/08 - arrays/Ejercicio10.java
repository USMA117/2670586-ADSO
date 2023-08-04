// 10. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y crear un 
// arreglo nuevo con los datos del arreglo original sin repetir.

import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_aleatorio = 0;
        int primer_dato = 0;
        int repetidos = 0;
        int contador = 1;
        int j = 1;


        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();
        int numeros [] = new int [numero_n];

        // Llenar arreglo
        for(int i = 0; i < numeros.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            numeros[i] = numero_aleatorio;

            System.out.print("["+numeros[i]+"] ");
        }
        System.out.println("");

        // Arreglo sin numeros repetidos
        primer_dato = numeros[0];
        System.out.println("Arreglo sin datos repetidos => ");
        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] == numeros[j]){
                numeros[i] = 0;
            }

            // System.out.print("["+numeros[i]+"] ");
            // while(i < j){
            //     if( numeros[i] != numeros[j]){
            //         System.out.print("["+numeros[i]+"] ");
            //         j++;

            //     }

            // }
            // if(numeros[i] != contador){
            //     System.out.println("["+numeros[i]+"] ");
            // }
            // contador++;



        }

    }
}