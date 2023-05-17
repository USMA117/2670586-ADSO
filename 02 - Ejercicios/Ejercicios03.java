    // 3. Intercambio de variables: Escribe un programa que solicite al usuario dos numeros enteros, los almacene
    // en variables separadas e intercambie el valor de las dos variables (usando una variable auxiliar).
        
import  java.util.Scanner;

public class Ejercicios03{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num_1;
        int num_2;
        int var_aux;
        
        System.out.println("Ingrese los numeros que desea intercambiar: ");
        
        System.out.println("Ingrese el primer numero: ");
        num_1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num_2 = teclado.nextInt();

        var_aux = num_1;
        num_1 = num_2;
        num_2 = var_aux;

        System.out.println("Valores intercambiados: primer numero = "+ num_1 + " segundo numero = " + num_2 );

    }
}