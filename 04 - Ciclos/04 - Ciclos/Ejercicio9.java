// Ejercicio #9
// Realizar una aplicación en JAVA que solicite ingresar al usuario un número entero y muestre en pantalla si el numero es 
// primo o no es primo.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int divisores = 0;

        System.out.println("Ingrese un numero para comprobar si es primo o no es primo: ");
        System.out.print("Ingrese el numero: ");
        numero = teclado.nextInt();

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                divisores = divisores + 1;
            }

        }
        if (divisores == 2){
            System.out.print("El numero es primo.");
        }
        else {
            System.out.print("El numero no es primo.");


        }
    }
}