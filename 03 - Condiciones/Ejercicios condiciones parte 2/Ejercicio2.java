// 2. Escribir un programa que calcule el máximo de 4 números ingresados por el usuario utilizando una estructura
// condicional.

import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;

        System.out.println(" ");
        System.out.println("Ingrese cuatro numeros diferentes para determinar cual es el mayor");
        System.out.println(" ");
        System.out.print("Ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        numero3 = teclado.nextInt();
        System.out.print("Ingrese el cuarto numero: ");
        numero4 = teclado.nextInt();
        System.out.println(" ");

        if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
            System.out.println("El numero mayor es: "+numero1);
        }
        else if(numero2 > numero1 && numero2 > numero3 && numero2 > numero4){
            System.out.println("El numero mayor es: "+numero2);
        }
        else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
            System.out.println("El numero mayor es: "+numero3);
        }
        else if(numero4 > numero1 && numero4 > numero2 && numero4 > numero3){
            System.out.println("El numero mayor es: "+numero4);
        }
        else{
            System.out.println("Debe ingresar numeros diferentes.");
        }
    }
}