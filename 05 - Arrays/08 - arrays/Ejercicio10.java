// 10. Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y crear un 
// arreglo nuevo con los datos del arreglo original sin repetir.

import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_aleatorio = 0;
        int numeros_iguales = 0;
        int posicion = 1;


        System.out.print("Ingrese un numero entero: ");
        numero_n = teclado.nextInt();
        int numeros [] = new int [numero_n];

        // Llenar arreglo
        for(int i = 0; i < numeros.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            numeros[i] = numero_aleatorio;

            System.out.print("["+numeros[i]+"] ");
        }
        System.out.println("");

        // Arreglo sin numeros repetidos
        int numeros2 [] = new int [numero_n];
        // posicion = numeros[0];
        System.out.println("Arreglo sin datos repetidos => ");
        for(int i = 0; i < numeros2.length; i++){
            if(numeros[i] != numeros[posicion]){
                System.out.println(numeros[i]);
                posicion++;
            }else{
                if(i < numeros.length){
                   numeros[i] = numeros[posicion+1];
                    System.out.println(numeros[i+1]); 
                }
                
            }
            
            
            // numeros[i] = numeros[i];
            // for(int j = 1; j < numeros2.length; j++){
            //     if(numeros2[i] == numeros2[j]){
            //         System.out.print(numeros2[i]);
            //     }
            // }
            
        }

    }
}