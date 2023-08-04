// 8. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y separar 
// los números pares e impares en dos arreglos diferentes.

import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_aleatorio = 0;
        int numero_pares = 0;
        int numeros_impares = 0;

        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();

        int numeros [] = new int [numero_n];

        // Llenar arreglo 
        System.out.print("Arreglo original => ");
        for(int i = 0; i < numeros.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            numeros[i] = numero_aleatorio;
            System.out.print("["+numeros[i]+"]");
        }
        System.out.println("");

        // Arreglo con numeros pares
        System.out.print("arreglo pares => ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.print("["+numeros[i]+"]");
            }
        }
        System.out.println("");

        // Arreglo con numeros impares
        System.out.print("Arreglo impares => ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 != 0){
                System.out.print("["+numeros[i]+"]");
            }
        }

    }
}