// Ejercicio 06
// Realizar una aplicación en JAVA que solicite al usuario dos numeros N y M, los cuales indicaran un rango. La aplicación 
// debe mostrar en pantalla los numeros factoriales calculados desde el numero N hasta el numero M.


import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int numero_m = 0;
        int multiplicar = 1;

        System.out.print("Ingrese numero N: ");
        numero_n = teclado.nextInt();
        System.out.print("Ingrese numero M: ");
        numero_m = teclado.nextInt();

        for(int i = 1; i <= numero_n; i++){

            for(numero_n <= numero_m){

                System.out.print(i);
                multiplicar *= i ;

                if(i != numero_n){
                    System.out.print(" x ");
                }

            }
            

        }
        System.out.print(" = "+multiplicar);
    } 
}