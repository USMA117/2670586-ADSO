// 9. Solicitar al usuario ingresar un número N y un número M, crear un arreglo de tamaño N, llenarlo con datos 
// aleatorios y buscar dentro del arreglo el número M. La aplicación debe devolver la posición donde se encuentra 
// el número M o devolver -1 en caso de no encontrarlo.

import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_m = 0;
        int contador_num_m = 0;
        int numero_aleatorio = 0;
        int posicion = 0;

        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();
        System.out.print("Ingrese un numero M: ");
        numero_m = teclado.nextInt();
        int numeros [] = new int [numero_n];

        System.out.print("Arreglo original => ");
        for(int i = 0; i < numeros.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            numeros[i] = numero_aleatorio;
            System.out.print("["+numeros[i]+"] ");

        }
        System.out.println("");

        // Posicion del numero M
        System.out.println("Posicion del numero "+numero_m+" : ");
        for(int j = 0; j < numeros.length; j++){
            if(numeros[j] == numero_m){
                posicion = j;
                System.out.println(numero_m+" se encuentra en la posicion: "+(posicion+1));
                contador_num_m++;
            }

            // Si el numero no esta en el arreglo
            if(j == (numeros.length-1)){
                if(contador_num_m == 0){
                    System.out.println("-1");
                }
            }

        }
    }
}