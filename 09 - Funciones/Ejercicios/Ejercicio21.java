// 21. Convertir Celsius a Fahrenheit: Implementa una función que tome una temperatura en grados Celsius 
// como entrada y la devuelva convertida en grados Fahrenheit.

import java.util.Scanner;
public class Ejercicio21{
    public static void main(String [] args){
        System.out.println("------------------------------------------");
        System.out.println("El area del rectangulo es: "+calcularFahrenheit());
        System.out.println("------------------------------------------");;
    }

    public static int calcularFahrenheit(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese grados celsius: ");
        int celsius = teclado.nextInt();

        int fahrenheit =(int) (celsius * 1.8)+ 32;

        return fahrenheit;
    }
}