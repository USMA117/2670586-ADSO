// Ejercicio #7
// Realizar una aplicación en JAVA, que solicite al usuario ingresar tres números enteros y posteriormente muestre en 
// pantalla el MCM de los tres números ingresados.


import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int acumulador;
        int contador = 0;


        System.out.println("");
        System.out.println("Ingrese tres numeros para encontrar su minimo comun multiplo");
        System.out.println("");
        System.out.print("Ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        numero3 = teclado.nextInt();
        System.out.println("");

        acumulador = numero1;

        if(acumulador < numero2){
            acumulador = numero2;
        }
        else if (acumulador < numero3){
            acumulador = numero3;
        }
        contador = acumulador;

        while(contador % numero1 != 0 || contador % numero2 != 0 || contador % numero3 != 0 ){
            contador = contador + 1;
        
        }
        System.out.print("El mcm de "+numero1+", "+numero2+" y "+numero3+" es: "+contador);








    }
}