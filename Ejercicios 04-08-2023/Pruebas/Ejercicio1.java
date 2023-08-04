// 1. Realizar una aplicación en JAVA que solicite al usuario un numero entero N, cree un arreglo 
// de String de tamaño N, llene el arreglo con datos pedidos al usuario y muestre el arreglo en 
// pantalla.

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado_texto = new Scanner(System.in);
        int numero_n = 0;

        System.out.print("Ingrese numero N: ");
        numero_n = teclado.nextInt();
        String arreglo [] = new String[numero_n];

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese el dato "+(i+1)+" : ");
            arreglo[i] = teclado_texto.nextLine();
            System.out.println("");

        }
        System.out.print("Arreglo => ");
        for(int i = 0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
        
    }
}