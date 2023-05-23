// Ejercicio #1
// Realizar una pequeña aplicación en JAVA, donde salude al usuario y pregunte su edad. 
// - Si el usuario es menor de edad, se debe mostrar en pantalla que recibe un auxilio de $ 800.000
// - Si el usuario es mayor de edad, se debe mostrar en pantalla que paga un impuesto de $ 200.000

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int edad;

        System.out.print("Buenos dias, por favor ingresa tu edad: ");
        edad = teclado.nextInt();

        if (edad < 0){
            System.out.print("Debe ingresar una edad valida");
        }
         else if (edad > 100){
            System.out.print("Debe ingresar una edad valida");
        }
        else if(edad > 18){
            System.out.print("El usuario es mayor de edad y paga un impuesto de $ 200.000");
        }
        else if(edad < 18){
            System.out.print("Como el usuario es menor de edad es beneficiario de un auxilio de $800.000");
        }
        else{
            System.out.print("Debe ingresar un numero valido");

        }

    }
}