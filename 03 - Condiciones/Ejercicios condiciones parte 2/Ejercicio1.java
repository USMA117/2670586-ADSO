// 1. Escribir un programa que determine si un número ingresado por el usuario es positivo o negativo.

import java.util.Scanner;
public  class Ejercicio1{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero negativo o positivo: ");
        numero = teclado.nextInt();

        if (numero < 0){
            System.out.print("El numero "+numero+ " es negativo.");
        }
        else if(numero > 0){
            System.out.print("El numero "+numero+ " es positivo.");
        }else if(numero == 0){
            System.out.print("El numero "+numero+" se considera un numero neutro");
        }
        else{
            System.out.print("Debe ingresar un numero valido.");
        }


    }
}