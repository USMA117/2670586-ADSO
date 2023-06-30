
// Ejercicio 05
// Dado un numero entero N, el programa debe mostrar en pantalla la sucesión de numeros necesarios para producir el 
// factorial y al final el resultado del factorial


import java.util.Scanner;
public class Ejercicio5{ 
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int contador = 0;
        int  multiplicar = 1;

    System.out.print("Ingrese la cantidad de sucesion de numeros: ");
    numero = teclado.nextInt();

        for(int i = 1; i <= numero; i++){
            System.out.print(i);
        multiplicar *= i ;

            if(i != numero){
                System.out.print(" x ");
            }

        }
        System.out.print(" = "+multiplicar);
    }
}