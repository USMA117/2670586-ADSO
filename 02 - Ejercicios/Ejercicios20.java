// 20. Suma de dígitos: Solicita al usuario un número entero de 5 dígitos como maximo, la aplicación debe sumar
// todos los dígitos. Por ejemplo, si el número es 12345, la suma sería 1 + 2 + 3 + 4 + 5 = 15. Muestra el
// resultado por pantalla

import java.util.Scanner; 
public class Ejercicios20{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num;
        int cantidad_numeros;
        int i;
        String numeros;
        int suma;
        

        System.out.println("Ingrese un numero con 5 digitos: ");
        num = teclado.nextInt();
        
        suma = 0;
        numeros = String.valueOf(num);
        for (i = 0; i < numeros.length(); i++){
            cantidad_numeros = Character.getNumericValue(numeros.charAt(i));
            suma += cantidad_numeros;
        }
        System.out.println("La suma de los numeros es: "+suma);

    }
}