// Ejercicio #4
// Realizar una aplicación en Java que solicite al usuario un numero entero, cree un arreglo de la longitud del numero 
// ingresado. El arreglo se debe llenar con datos ingresados por el usuario, se imprime el arreglo original y posteriormente 
// se debe imprimir el arreglo los números ordenados de forma descendente.

import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int tam_arreglo = 0;
        int datos = 0;

        System.out.print("Ingrese la cantidad de datos que desea guardar: ");
        tam_arreglo = teclado.nextInt();
        int arreglo [] = new int[tam_arreglo];

        for(int i = 0; i < tam_arreglo ;i++){
            System.out.print("Ingrese el dato "+(i+1)+" : ");
            arreglo[i] = teclado.nextInt();

        }
        System.out.print("Arreglo original: ");
        for(int i = 0; i < tam_arreglo; i++){
            System.out.print("["+arreglo[i]+"] ");
        }
        System.out.println("");
        
        for(int i = 0; i < tam_arreglo;i++){
            for(int j = 0; j< tam_arreglo;j++){
                if(arreglo[j] < arreglo[j+1]){
                    int aux;
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        for(int i = 0; i < tam_arreglo; i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }
}