// 2. Conversión de temperatura: Escribe un programa que convierta una temperatura en grados Celsius a
    // grados Fahrenheit. La fórmula de conversión es: F = (C * 9/5) + 32.

import  java.util.Scanner;

public class Ejercicios02{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int celsius;
        int resultado_farenheit;


        System.out.println("Escribe los grados celsius que quieras convertir a Farenheit: ");
        celsius = teclado.nextInt();
     
        resultado_farenheit = (celsius * 9/5) + 32;
        System.out.println("En grados farenheit seria: "+resultado_farenheit);
    }
}