// Ejercicio #5
// Realizar una pequeña aplicación en JAVA, donde se solicite al usuario tres números enteros y se indique en pantalla si los
// números se ingresaron en orden ascendente.
// Ingresar primer número: 3
// Ingresar segundo número: 7
// Ingresar tercer número: 9
// Los números se ingresaron en Orden Ascendente.


import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Ingrese por favor 3 numeros para saber si estan ordenados de manera ascendente ");

        System.out.print("El primer numero es: ");
        num1 = teclado.nextInt();
        System.out.print("El segundo numero es: ");
        num2 = teclado.nextInt();
        System.out.print("El tercer numero es: ");
        num3 = teclado.nextInt();

        System.out.println(" ");

        if(num1 < num2 && num2 < num3){
            System.out.println("Los numeros se ingresaron en Orden Ascendente.");
      
        }else{
        System.out.print("Los numeros no se ingresaron en Orden Ascendente.");
        }



    }

}