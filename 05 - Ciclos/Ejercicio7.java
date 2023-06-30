// Ejercicio 07
// Escriba un programa que pida al usuario un numero entero N impar y luego imprima en pantalla un rombo, donde N es el 
// ancho y la altura del rombo.

import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);


        int altura;


        System.out.print("Ingrese la altura de la piramide con un numero impar: ");
        altura = teclado.nextInt();

     

        for(int i = 1;i <= altura ; i++){
            for(int espacios = 1; espacios <= altura - i; espacios++){
                System.out.print(" ");
            }
            for(int equis = 1; equis <= (2 * i) - 1; equis++ ){
                System.out.print("x");
            }
            System.out.println();
        }

        altura--;

        for(int i = 1;i <= altura ; i++){
            for(int espacios = 1; espacios <= i; espacios++){
                System.out.print(" ");
            }
            for(int equis = 1; equis <= (altura - i)*2 + 1; equis++){
                System.out.print("x");
            }
            System.out.println();
        }
        
    }
}