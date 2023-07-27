// Ejercicio 09
// Dado un número entero N, se calcula la raíz digital de N sumando los dígitos que lo componen. El proceso se repite sobre 
// el nuevo número hasta que el resultado obtenido tiene un sólo dígito, este último número es la raíz digital del número N.

import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_n = 0;
        int suma = 0;
        int contador = 0;
        int n10 = 1000000;
        int raiz_digital = 0;
        int digitos = 0;
        

        int d1 = (numero_n/100000)% 10;
        int d2 = (numero_n/10000)% 10;
        int d3 = (numero_n/1000)% 10;
        int d4 = (numero_n/100)% 10;
        int d5 = (numero_n/10)% 10;
        int d6 = numero_n % 10;

        System.out.print("Ingrese numero N de maximo 6 digitos: ");
        numero_n = teclado.nextInt();
        System.out.println("Raiz Digital:");

        while(raiz_digital != 1){

            if(digitos <= numero_n){
                digitos = (numero_n / n10) %10;
                n10 = n10 / 10;
                System.out.print(digitos);
                System.out.print(" + ");
                



            }
             

        }
        System.out.println(digitos);



        



        // for(int i = 1; i <= numero_n; i++){
        //     System.out.print(i); 
        //     suma += i;

        //     if(i != numero_n){
        //         System.out.print(" x ");
        //     }
        


        // }
        // System.out.println(" = "+suma);

        // if(numero_n <= 999999){
        //     System.out.println(d1+" + "+d6+" = "+(d1+d2));
        // }else if(numero_n <= 99999){
        //     System.out.println(d1+" + "+d5+" = "+(d1+d2));
        // }






    }
}