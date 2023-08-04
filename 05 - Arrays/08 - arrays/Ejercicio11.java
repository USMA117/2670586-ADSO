// 11. Solicitar al usuario ingresar un número N y un número M, crear dos arreglos de tamaño N y M respectivamente, 
// llenarlos con datos aleatorios y crear un arreglo que debe contener la información de los dos arreglos originales. 
// La información debe estar ordenada de forma ascendente.

import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_m = 0;
        int numero_mayor = 0;
        int numero_aleatorio = 0;
        int espacio_arreglo3 = 0;
        int j = 0;
        int k = 0;

        System.out.print("Ingrese el numero N: ");
        numero_n = teclado.nextInt();
        System.out.print("Ingrese el numero M: ");
        numero_m = teclado.nextInt();

        int arreglo_n [] = new int [numero_n];
        int arreglo_m [] = new int [numero_m];

        // Llenar arreglo N
        for(int i = 0; i < arreglo_n.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            arreglo_n[i] = numero_aleatorio;
            System.out.print("["+arreglo_n[i]+"] ");
        }
        System.out.println("");

        // Llenar arreglo M
        for(int i = 0; i < arreglo_m.length; i++){
            numero_aleatorio = (int)(Math.random()*10+1);
            arreglo_m[i] = numero_aleatorio;
            System.out.print("["+arreglo_m[i]+"] ");
        }
        System.out.println("");

        // Unir los datos arreglos de los dos arreglos de forma ascendente
        espacio_arreglo3 = arreglo_n.length + arreglo_m.length;
        System.out.println(espacio_arreglo3);

        int arreglo_3 []= new int [espacio_arreglo3]; 

        for(int i = 0; i < arreglo_3.length; i++ ){
            arreglo_3[i] = arreglo_n[j];
            j++;
            System.out.print("["+arreglo_3[i]+"]");

            if(arreglo_3.length+1 >= (arreglo_n.length-1)){
                arreglo_3[i] = arreglo_m[k];
                k++;
                System.out.print("["+arreglo_3[i]+"]");

            }

        }
        System.out.println("");

        // for(int i = arreglo_n.length ; i < arreglo_3.length-1; i++){
        //     arreglo_3[i] = arreglo_m[k];
        //     k++;
        //     System.out.print("["+arreglo_3[i]+"]");
        // }


    }
}