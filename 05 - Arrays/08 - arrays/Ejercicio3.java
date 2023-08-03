// 3. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y 
// encontrar el valor máximo del arreglo de enteros.

import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_aleatorio = 0;
        int numero_mayor = 0;

        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();

        int numeros [] = new int [numero_n];
        numero_mayor = numeros[0];

        for(int i = 0; i < numeros.length; i++){

            numero_aleatorio = (int)(Math.random()*100+1);
            numeros[i] = numero_aleatorio;

            System.out.print("["+numeros[i]+"] ");     
                
            if(numeros[i] >= numero_mayor){
                numero_mayor = numeros[i];
            }
            
        }
        System.out.println("");
        System.out.println("Numero maximo => "+numero_mayor);

    }
}