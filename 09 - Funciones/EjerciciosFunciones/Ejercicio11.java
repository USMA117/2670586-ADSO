// 11. Factorial de un número: Crea una función que calcule la factorial de un número entero dado como 
// entrada.
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        factorial();
    }

    public static void factorial(){
        int numero = 0;
        int resultado = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        numero = teclado.nextInt();

        for(int i = 1; i <= numero; i++){
            resultado *= i;
            if(i != numero){
                System.out.print(i+" X ");
            }else{
                System.out.print(i+" = "+resultado);
            }
            
        }

    }
}