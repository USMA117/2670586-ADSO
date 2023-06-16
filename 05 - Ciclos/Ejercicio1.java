// Ejercicio 01
// Realizar una aplicación en JAVA que solicite al usuario un numero N (entero entre 1 y 6). La aplicación debe crear N 
// cantidad de numeros aleatorios (enteros entre 0 y 9) sin repetir y almacenarlos en una variable entera de izquierda a 
// derecha. Por ultimo la aplicación debe mostrar en pantalla la variable creada con los N numeros aleatorios y el resultado 
// de multiplicar esta variable entre 2.

import java.util.Scanner;
public class Ejercicio1{ 
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        


    System.out.print("Ingrese un numero del 1 al 6: ");
    numero = teclado.nextInt();

    for(int i = 1; i <= numero ; i++ ){

        int numero_aleatorio =(int) (Math.random() *10);

         if(i <= numero && 6 >= numero){
            System.out.print(numero_aleatorio); 
        }

    }
    
    }
}