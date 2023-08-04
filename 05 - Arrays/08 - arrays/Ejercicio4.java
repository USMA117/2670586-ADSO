// 4. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y 
// encontrar el valor mínimo del arreglo de enteros

import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_aleatorio = 0;
        int valor_minimo;

        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();

        int numeros[] = new int [numero_n];
        

        // Llenar arreglo
        for(int i = 0; i < numeros.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            numeros[i] = numero_aleatorio;

            System.out.print("["+numeros[i]+"] ");

        }

        // Encontrar valor minimo
        valor_minimo = numeros [0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < valor_minimo){
                valor_minimo = numeros[i];
            }
        }
        System.out.println("");
        System.out.print("Valor minimo: "+valor_minimo);

    }
}