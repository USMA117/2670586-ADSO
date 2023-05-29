// 5. Escribir un programa que determine si un año ingresado por el usuario es bisiesto

import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int ano;

        System.out.println(" ");

        System.out.print("Ingrese un ano para saber si es bisiesto o no: ");
        ano = teclado.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ){
            System.out.print("El ano "+ano+ " es un ano bisiesto.");
        }else{
            System.out.println("El ano "+ano+ " no es un ano bisiesto.");
        }
        System.out.println(" ");


        
    }
}