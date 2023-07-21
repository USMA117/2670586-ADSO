// Ejercicio 04
// Un palíndromo es un número, palabra, o frase que se lee igual al derecho que al revés. Por ejemplo, los siguientes enteros 
// de cinco dígitos con pal´ındromos: 12321, 55555, 45554 y 11611. Escriba un programa que lea un numero entero (Maximo 
// 6 Digitos) y muestre en pantalla si el numero es palindromo

import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("--> Ingrese un numero de maximo 6 digitos: ");
        numero = teclado.nextInt();
        
    }
        public static boolean esPalindromo(int numero){
            String numeroTexto = String.valueOf(numero);
           

            for (int i = 0, j = numeroTexto.length()-1; 1 <= j; i++, --j){
                if (numeroTexto.charAt(i) != numeroTexto.charAt(j)){
                    return false;

                }

            }
            return true;

        }
            
}
        
