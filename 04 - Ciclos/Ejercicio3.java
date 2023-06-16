// Ejercicio #3
// Realizar una aplicación que solicite al usuario ingresar un numero denominado altura de pirámide, la aplicación debe 
// mostrar en pantalla una pirámide de caracteres donde la altura es la cantidad de renglones usado para construirla. 

import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int espaciado;
        int altura;
        int simbolo;
        

        System.out.println("Ingresa la altura de la piramide");
        System.out.println("________________________________");
        System.out.print("Ingrese la altura: ");
        altura = teclado.nextInt();

        for(int i; 1 <= altura; i++){
           for( espaciado = 1; espaciado <= altura - i; espaciado=espaciado+1){
            System.out.print(" ");
        }
        for(simbolo = 1; simbolo <= i ; simbolo = simbolo + 1) {
            System.out.print("* ");

        } 
        System.out.print(" ");
        }

        


        
        




    }
}