// 1. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y calcular 
// la suma de todos los elementos del arreglo de enteros.

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

            int numero_n = 0;
            int numero_aleatorio = 0;
            int suma = 0;

            System.out.print("Ingrese un numero entero: ");
            numero_n = teclado.nextInt();
            int arreglo [] = new int [numero_n];

            for(int i = 0; i < arreglo.length; i++ ){

                numero_aleatorio = (int)(Math.random()*10);
                arreglo[i] = numero_aleatorio;

                System.out.print(arreglo[i]);

                if(i != (numero_n-1)){
                    System.out.print(" + ");
                }
                suma += numero_aleatorio;

            }
            System.out.print(" = "+suma);


    
    }
}