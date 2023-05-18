 // 6. Cálculo del promedio: Escribe un programa que tome una serie de números como entrada y calcule su
    // promedio.

import  java.util.Scanner;

public class Ejercicios06{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

         float n1;
         float n2; 
         float n3;
         float n4;
         float n5;
         float promedio;
         
         System.out.println("Escribe 5 numeros para calcular su promedio");
         System.out.println("Ingresa el primer numero: ");
         n1 = teclado.nextFloat();
         System.out.println("Ingresa el segundo numero: ");
         n2 = teclado.nextFloat();
         System.out.println("Ingresa el tercer numero: ");
         n3 = teclado.nextFloat();
         System.out.println("Ingresa el cuarto numero: ");
         n4 = teclado.nextFloat();
         System.out.println("Ingresa el quinto numero: ");
         n5 = teclado.nextFloat();

         promedio = (n1 + n2 + n3 + n4 + n5) / 5;
         System.out.println("El promedio es: "+promedio);
        
    }
}
