// Ejercicio #4
// Realizar una pequeña aplicación en JAVA, donde se solicite al usuario tres números enteros y se indique en pantalla cuál 
// de los tres números es mayor y cuál es el menor.
// Ingresar primer número: 2
// Ingresar segundo número: 20
// Ingresar tercer número: 5
// El mayor número es: 20
// El menor número es: 5


import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Ingrese por favor 3 numeros para saber que es numero es mayor y cual es el menor");

        System.out.print("El primer numero es: ");
        num1 = teclado.nextInt();
        System.out.print("El segundo numero es: ");
        num2 = teclado.nextInt();
        System.out.print("El tercer numero es: ");
        num3 = teclado.nextInt();

        System.out.println(" ");

        if (num1 == num2 && num2 == num3){
            System.out.println("Los 3 numeros son iguales");

        }
        else if(num2 < num3 && num1 < num3){
            System.out.println("El numero mayor es: "+num3);
        }
        else if(num3 < num2 && num1 < num2){
            System.out.println("El numero mayor es: "+num2);
        }
        else if(num3 < num1 && num2 < num1){
            System.out.println("El numero mayor es: "+num1);
        }

        if(num2 > num1 && num3 > num1){
            System.out.println("El numero menor es: "+num1);
        }
        else if(num1 > num2 && num3 > num2){
            System.out.println("El numero menor es: "+num2);
        }
        else if(num1 > num3 && num2 > num3){
            System.out.println("El numero menor es: "+num3);

        }
        else{
            System.out.println("Debe ingresar numeros validos");
        }



    }
}