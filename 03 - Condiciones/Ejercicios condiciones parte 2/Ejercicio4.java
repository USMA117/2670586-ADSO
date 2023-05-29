// 4. Escribir un programa que calcule el promedio de tres notas ingresadas por el usuario y muestre un mensaje
// de aprobado si el promedio es mayor o igual a 7, y un mensaje de reprobado en caso contrario.

import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float promedio;


        System.out.println("");

        System.out.println("Ingrese 3 notas para calcular su promedio");
        System.out.print("Pimera nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("Tercera nota: ");
        nota3 = teclado.nextFloat();

        //promedio

        promedio = (nota1 + nota2 + nota3)/3;

        if (promedio >= 7){
            System.out.println("Su promedio es de "+promedio+" por lo tanto usted ha Aprobado");

        }else{
            System.out.println("Su promedio es de "+promedio+" por lo tanto usted ha Reprobado");
        }

        



    }
}