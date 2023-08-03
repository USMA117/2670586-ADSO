// Ejercicio #6
// Realizar una aplicación que solicite al usuario ingresar un número n y muestre en pantalla el n-esimo término de la sucesión 
// Fibonacci.


import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int numero_actual = 0;
        int numero_posterior = 1; 
        int fibonacci = 0;
        int n_esimo = 0;

        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();

        for(int i = 1; i <= numero; i++){
            

            fibonacci = numero_actual + numero_posterior;
            numero_actual = numero_posterior;
            numero_posterior = fibonacci;
            n_esimo = fibonacci - numero_actual;

        }
        System.out.println("El termino "+numero+" de la sucesion fibonacci es: "+n_esimo); 
    }
}