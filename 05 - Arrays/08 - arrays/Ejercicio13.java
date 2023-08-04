// 13. Solicitar al usuario ingresar un número N, crear dos arreglos de N, llenar los dos arreglos con datos aleatorios y 
// crear un tercer arreglo de tamaño N, el cual contendrá la suma de los dos arreglos.

import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_aleatorio = 0;
        int j = 0;
        int k = 0;

        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();

        int arreglo1 [] = new int [numero_n];
        int arreglo2 [] = new int [numero_n];
        int suma [] = new int [numero_n];
        
        // Arreglo 1
        System.out.print("Arreglo 1 => ");
        for(int i = 0; i < arreglo1.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            arreglo1[i] = numero_aleatorio;

            System.out.print("["+arreglo1[i]+"] ");

        }
        System.out.println("");

        // Arreglo 2
        System.out.print("Arreglo 2 => ");
        for(int i = 0; i < arreglo2.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            arreglo2[i] = numero_aleatorio;

            System.out.print("["+arreglo2[i]+"] ");

        }
        System.out.println("");

        // Arreglo 3 - suma de los dos arreglos
        System.out.print("Suma   =>    ");

        for(int i = 0; i < numero_n; i++){
            suma[i] = arreglo1[j] + arreglo2[k];
            System.out.print("["+suma[i]+"] ");
            j++;
            k++;
        }
    
    }
}