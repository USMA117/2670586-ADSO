// Ejercicio #8
// Realizar una aplicación en JAVA que solicite ingresar al usuario un número máximo de 6 dígitos, posteriormente muestre 
// en pantalla los dígitos separados con saltos de línea (El recorrido debe realizarlo de izquierda a Derecha).


import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero_ingresado;

        System.out.print("--> Ingrese un numero de maximo 6 digitos: ");
        numero_ingresado = teclado.nextInt();
        System.out.println("------------------------------------------");

        while(numero_ingresado > 0 && numero_ingresado <= 999999){

            int d1 = (numero_ingresado/100000)%10;
			int d2 = (numero_ingresado/10000)%10;
			int d3 = (numero_ingresado/1000)%10;
			int d4 = (numero_ingresado/100)%10;
            int d5 = (numero_ingresado/10)%10;
			int d6 = numero_ingresado%10;

            System.out.println("-> El digito 01 es: "+d1);
            System.out.println("-> El digito 02 es: "+d2);
            System.out.println("-> El digito 03 es: "+d3);
            System.out.println("-> El digito 04 es: "+d4);
            System.out.println("-> El digito 05 es: "+d5);
            System.out.println("-> El digito 06 es: "+d6);

            break;
        }


    }
}