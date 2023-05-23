// 8. Concatenación de cadenas: Escribe un programa que tome dos cadenas de texto como entrada y las
// concatene en una sola cadena.

import java.util.Scanner;
public class Ejercicios08{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String texto1;
        String texto2;
        String texto_final;

        System.out.println("Escriba dos textos que quiera unir");

        System.out.println("Escriba el primer texto: ");
        texto1 = teclado.nextLine();
        System.out.println("Escriba el segundo texto: ");
        texto2 = teclado.nextLine();

        System.out.println("El texto completo es: "+ texto1 + " " + texto2);



    }

}