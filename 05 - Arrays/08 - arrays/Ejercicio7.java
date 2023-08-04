// 7. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y crear un 
// nuevo arreglo que contenga los elementos en orden inverso al arreglo original.

import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numeros_aleatorios = 0;

        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();

        int numeros [] = new int[numero_n];

        System.out.print("Arreglo original => ");
        for(int i = 0; i < numeros.length; i++){
            numeros_aleatorios = (int)(Math.random()*10+1);
            numeros[i] = numeros_aleatorios;
            System.out.print("["+numeros[i]+"] ");
        }
        System.out.println("");

        System.out.print("Arreglo inverso => ");
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.print(" ["+numeros[i]+"]");
        }


        
    }
}