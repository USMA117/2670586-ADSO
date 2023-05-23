// Realizar una aplicación en JAVA, que pida al usuario ingresar un número (Máximo 10 dígitos e inferior a los dos mil
// millones); Después se debe mostrar en pantalla el numero con formato de moneda.

import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;
        long limite;
        float division;

        System.out.print("Ingrese un numero de Máximo 10 dígitos e inferior a los dos mil millones para convertir a formato moneda");
        numero = teclado.nextInt();

        if (numero > limite){
            System.out.print("debe ingresar un numero de maximo 10 digitos e inferior a los dos mil millones");
        }
        





    }
}