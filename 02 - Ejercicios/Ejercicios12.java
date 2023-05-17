// 12. Calcular el área de un rectángulo: Escribe un programa que tome el ancho y la altura de un rectángulo
// como entrada y calcule su área.

import java.util.Scanner;
public class Ejercicios12{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int ancho;
        int altura;
        int area;

        System.out.println("Escribe el ancho del rectangulo que deseas calcular su area: ");
        ancho = teclado.nextInt();
        System.out.println("Escribe la altura del rectangulo que deseas calcular su area: ");
        altura = teclado.nextInt();

        area = ancho * altura;

        System.out.println("El area del rectangulo es: "+area);



    }

}