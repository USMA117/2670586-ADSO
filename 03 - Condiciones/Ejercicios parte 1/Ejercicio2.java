// Ejercicio #2
// Realizar una pequeña aplicación en JAVA, donde se solicite al usuario un numero de 3 dígitos y se indique en pantalla si el 
// número es par o impar. 
// Ingresar número de tres dígitos: 123
// El numero ingresado es: Impar.

import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.print("Ingrese un numero de maximo 3 digitos para comprobar si es par o impar: ");
        numero = teclado.nextInt();

        if( numero % 2 == 0){
            System.out.print("El numero "+numero+" es Par");

        }else{
            System.out.print("El numero "+numero+" es Impar");
        }
    }
}