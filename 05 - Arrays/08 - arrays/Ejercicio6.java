// 6. Solicitar al usuario ingresar un número N y un número M, crear un arreglo de tamaño N, llenarlo con datos 
// aleatorios y contar cuántas veces aparece el número M en el arreglo

import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_m = 0;
        int contador_num_m = 0;
        int numeros_aleatorios = 0;


        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();
        System.out.print("Ingrese un numero M: ");
        numero_m = teclado.nextInt();

        int numeros [] = new int[numero_n];

        for(int i = 0; i < numeros.length; i++){
            numeros_aleatorios = (int)(Math.random()*10+1);
            numeros[i] = numeros_aleatorios;
            System.out.print("["+numeros[i]+"] ");

            if(numeros[i] == numero_m){
                contador_num_m++;
            }


        }
        System.out.println("");

        if(contador_num_m == 0){
            System.out.print("El numero "+numero_m+" no aparece en el sistema.");
        }else{
            if(contador_num_m == 1){
                System.out.print("El numero "+numero_m+" aparece solo una vez en el sistema.");
            }else{
                System.out.print("El numero "+numero_m+" aparece "+contador_num_m+" veces en el sistema");
            }
            
        }
        
    }
}