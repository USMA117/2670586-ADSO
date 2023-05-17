// 14. Cálculo del promedio ponderado: Escribe un programa que pida al usuario ingresar 3 notas de materias y
// los creditos para cada materia. Calcule el promedio ponderado de esas notas.

import java.util.Scanner;
public class Ejercicios14{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int credito1;
        int credito2;
        int credito3;
        int suma_creditos;
        float promedio_ponderado;

        System.out.println("Ingrese la primer nota: ");
        nota1 = teclado.nextInt();
        System.out.println("Ingrese el credito de esta nota: ");
        credito1 = teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.println("Ingrese el credito de esta nota: ");
        credito2 = teclado.nextInt();
        System.out.println("Ingrese la tercer nota: ");
        nota3 = teclado.nextInt();
        System.out.println("Ingrese el credito de esta nota: ");
        credito3 = teclado.nextInt();
    

        suma_creditos = credito1 + credito2 + credito3;
        promedio_ponderado = (nota1 * credito1)+(nota2 * credito2)+(nota3*credito3) ;
        System.out.println("El promedio ponderado es: "+promedio_ponderado / suma_creditos);
    }
}