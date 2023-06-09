// 11. Escribir un programa que determine si una cadena ingresada por el usuario es un número par o impar.

import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String numero_cadena;
        int numero;
        

        System.out.println(" ");
        System.out.println("Ingrese un numero para determinar si es par o impar ");
        System.out.print(" ");
        System.out.print("Ingrese el numero: ");
        numero_cadena = teclado.nextLine();

        numero = Integer.parseInt(numero_cadena);

        if (numero % 2 == 0){
            System.out.println("El numero "+numero+" es par");
        }
        else{
            System.out.println("El numero "+numero+" es impar");
        }



    }
}