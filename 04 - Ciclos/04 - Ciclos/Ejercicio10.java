// Ejercicio #10
// Realizar una aplicación en JAVA, que solicite al usuario ingresar un numero entero denominado N, la aplicación debe 
// calcular los NxN primeros números primos e imprimirlos en pantalla en una cuadricula de N filas con N columnas

import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int contador_primos = 2;
        int limite = 100;

        System.out.println("|---------------------------------------|");
        System.out.print("       --> Ingresar numero: ");
        numero_n = teclado.nextInt();
        System.out.println("     --> Los numeros primos encontrados son: "); 

        for(int i=1; i<=numero_n * numero_n; i++){

            System.out.print("["+contador_primos+"]");

            contador_primos += 2;
            if(i == numero_n || i % numero_n == 0){
                System.out.println("");

            }

        }


        System.out.println("");
        System.out.print("|---------------------------------------|");

    }
}