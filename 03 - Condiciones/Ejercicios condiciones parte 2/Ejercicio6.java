// 6. Escribir un programa que determine si una persona puede votar ingresando su edad.

import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int edad;
        
        System.out.println(" ");
        System.out.print("Ingrese su edad para saber si puede votar: ");
        edad = teclado.nextInt();

        if (edad < 0 || edad > 100){
            System.out.println("Debe ingresar una edad valida.");
        }
        else if(edad < 18){
            System.out.println("Usted es menor de edad y aun no puede votar.");
        }
        else if(edad >= 18){
            System.out.println("Usted ya tiene la edad suficinete para votar.");

        }
    }
}