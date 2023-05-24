// 15. Conversión de unidades de longitud: Escribe un programa que convierta una longitud en metros a otras
// unidades: centímetros, pulgadas y pies

import java.util.Scanner;
public class Ejercicios15{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int metros;
        float centimetros;
        float pulgadas;
        float pies;

        System.out.println("Ingresa las medidas en metros: ");
        metros = teclado.nextInt();

         pulgadas = 39.37f;
         centimetros = 100f;
         pies = 3.28f;

         centimetros = metros * centimetros; 
         pulgadas = metros * pulgadas; 
         pies = metros * pies; 

         System.out.println("centimetros: "+centimetros);
         System.out.println("pulgadas: "+pulgadas);
         System.out.println("pies: "+pies);

<<<<<<< HEAD


=======
>>>>>>> 58eea6e1d52329b63a599c94e065132f5f73ae67
    }
}