   // 4. Intercambio de variables: Escribe un programa que solicite al usuario dos numeros enteros, los almacene
    // en variables separadas e intercambie el valor de las dos variables (Sin usar una variable auxiliar).
         
         import  java.util.Scanner;

public class Ejercicios04{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero_1;
        int numero_2;

        System.out.println("Ingrese el primer numero: ");
        numero_1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numero_2 = teclado.nextInt();

        numero_1 = numero_1 + numero_2;
        numero_2 = numero_1 - numero_2;
        numero_1 = numero_1 - numero_2;

        System.out.println("Valores intercambiados: primer numero = "+ numero_1 + " segundo numero = " + numero_2 );
    }
}