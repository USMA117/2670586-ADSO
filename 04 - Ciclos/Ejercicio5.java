// Ejercicio #5
// Realizar una aplicación que solicite al usuario ingresar un número y muestre en pantalla la sucesión Fibonacci desde el 
// primer digito hasta el digito del número ingresado.

import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int numero_actual = 0;
        int numero_posterior = 1; 
        int fibonacci = 0;

        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();
        System.out.print("la sucesion fibonacci es: ");

        for(int i = 1; i <= numero; i++){
            
            System.out.print(numero_actual+",");

            fibonacci = numero_actual + numero_posterior;
            numero_actual = numero_posterior;
            numero_posterior = fibonacci;

        }
       
    }
}