// 20. Calcular el área de un triángulo: Implementa una función que tome la base y la altura de un triángulo 
// como entrada y devuelva su área.

import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
        System.out.println("------------------------------------------");
        System.out.println("El area del rectangulo es: "+calcularArea());
        System.out.println("------------------------------------------");
    }

    public static int calcularArea(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        int base = teclado.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        int altura = teclado.nextInt();

        int area = base * altura;

        return area;
    }
}