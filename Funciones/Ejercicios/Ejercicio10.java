// 10. Promedio de un arreglo: Escribe una función que tome un arreglo de números como entrada y devuelva 
// su promedio
import java.util.Scanner;
public class Ejercicio10{
    public static void main (String[] args){
        
        float listaNumeros[] = new float[5];
        System.out.print("El promedio es : "+funcionPromedio(listaNumeros));
    }

    public static float funcionPromedio(float [] arreglo){
        
        Scanner teclado = new Scanner(System.in);
        float numero = 0;
        float promedio = 0;
        float suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese el numero "+(i+1)+" : ");
            numero = teclado.nextFloat();
            arreglo[i] = numero;

            suma += numero;

        } 
        promedio = suma / arreglo.length;

        return promedio;

    }
}