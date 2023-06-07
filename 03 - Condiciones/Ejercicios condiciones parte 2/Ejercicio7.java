// 7. Escribir un programa que determine si un numero entero ingresado por el usuario es palíndromo.

import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("");
        System.out.println("Ingrese un numero maximo de 5 digitos para determinar si es un palindromo ");
        System.out.println("");
        System.out.print("Ingrese el numero aqui: ");
        numero = teclado.nextInt();
        System.out.println("");


            int d1 = (numero/10000)%10;
			int d2 = (numero/1000)%10;
			int d3 = (numero/100)%10;
			int d4 = (numero/10)%10;
			int d5 = numero%10;

            if(d1 == d5 && d2 == d4){
                System.out.println("=> El numero efectivamente es un palindromo.");
            }else{
                System.out.println("=> El numero no es un palindromo.");

            }
        
    }
}