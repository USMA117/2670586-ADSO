// Ejercicio #3
// Realizar una aplicación que solicite al usuario ingresar un numero denominado altura de pirámide, la aplicación debe 
// mostrar en pantalla una pirámide de caracteres donde la altura es la cantidad de renglones usado para construirla.


import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);


        int altura;

        System.out.print("Ingrese la altura de la piramide: ");
        altura = teclado.nextInt();

        for(int i = 1;i <= altura ; i++){
            for(int espacios = 1; espacios <= altura - i; espacios++){
                System.out.print(" ");
            }
            for(int equis = 1; equis <= (i * 2) - 1; equis++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}