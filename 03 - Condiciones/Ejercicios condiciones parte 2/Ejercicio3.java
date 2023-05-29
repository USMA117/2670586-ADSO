// 3. Escribir un programa que determine si un número ingresado por el usuario es par.

import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        int numero;

        System.out.print("Ingrese un numero para comprobar si es par o impar: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0 ){
            System.out.print("El numero "+numero+" es par.");
        }else{
            System.out.print("El numero "+numero+" es impar.");
        }
    }
}