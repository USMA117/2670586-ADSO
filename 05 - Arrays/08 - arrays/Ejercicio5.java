// 5. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios flotantes y 
// calcular el promedio de todos los elementos.

import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        float numeros_aleatorios = 0;
        float suma = 0;
        float promedio = 0;

        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();

        float numeros [] = new float[numero_n];

        for(int i = 0; i < numeros.length; i++){
            numeros_aleatorios = (float)(Math.random()*10+1);
            numeros[i] = numeros_aleatorios;
            System.out.print("["+numeros[i]+"] ");

            suma += numeros[i];
        }
        promedio = suma / numeros.length;
        System.out.println(" ");
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);
        
    }
}