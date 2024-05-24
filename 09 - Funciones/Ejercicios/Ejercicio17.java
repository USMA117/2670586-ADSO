// 17. Suma de dígitos: Crea una función que tome un número entero como entrada y devuelva la suma de sus 
// dígitos.
import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
        System.out.print("La suma total de los digitos es: "+sumarDigitos());
    }
    public static int sumarDigitos(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero de maximo 6 digitos: ");
        int numero = teclado.nextInt();
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}