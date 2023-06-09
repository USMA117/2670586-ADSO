// 12. Escribir un programa que calcule el descuento aplicado a una compra ingresando el precio original y el
// porcentaje de descuento, pero solo si el porcentaje de descuento es válido (entre 0 y 100).

import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int precio;
        int descuento;
        int precio_final;
        int porcentaje;

        System.out.println(" ");
        System.out.println("Ingrese el precio y porcentaje de descuento del producto para calcular el precio final ");
        System.out.println(" ");
        System.out.print("Ingrese el precio: ");
        precio = teclado.nextInt();
        System.out.print("Ingrese el porcentaje de descuento desde 0 hasta maximo 100: ");
        descuento = teclado.nextInt();

         porcentaje = ( descuento * precio)/ 100;
          precio_final =  precio - porcentaje;

        if(descuento > 0 && descuento <= 99){
            System.out.println("El precio total es: "+precio_final);
        }
        else if(descuento == 0){
            System.out.println("El producto no tiene ningun descuento.");

        }
        else if(descuento == 100){
            System.out.println("El producto es gratuito.");

        }
        else{
            System.out.println("Debe ingresar un porcentaje de descuento valido.");
        }


    }
}