// 11. Cálculo del perímetro y área de un círculo: Escribe un programa que tome el radio de un círculo como
// entrada y calcule su perímetro (2 * π * radio) y su área (π * radio^2).

import java.util.Scanner;
public class Ejercicios11{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int radio;
        double perimetro;
        double area;

        System.out.println("Ingrese el radio de un circulo para calcular su perimetro y area");
        radio = teclado.nextInt();
        
        perimetro  = (2 * Math.PI * radio);
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El perimetro del circulo es: "+perimetro + " y el area es: "+area);


    }
}