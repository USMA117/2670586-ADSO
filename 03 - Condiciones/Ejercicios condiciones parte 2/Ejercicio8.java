// 8. Escribir un programa que calcule el área de un triángulo ingresando su base y altura, pero solo si ambos valores
// son positivos.

import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int base;
        int altura;
        int area;

        System.out.println(" ");
        System.out.println("Ingrese la base y altura del triangulo al cual desea calcular su area:");
        System.out.print("Cual es la base del traingulo: ");
        base = teclado.nextInt();
        System.out.print("Cual es la altura del triangulo: ");
        altura = teclado.nextInt();

        area = (base * altura)/ 2 ;

        if (base > 0 && altura > 0){
            System.out.println("El area del triangulo es: "+area);
        }else{
            System.out.println("Debe ingresar solo numeros positivos");
        }


        
    }
}