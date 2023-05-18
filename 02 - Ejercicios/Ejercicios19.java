// 19. Registro de empleados: Escribe un programa que solicite al usuario ingresar el nombre, la edad y el salario
// de un empleado, y luego muestre esa información en la pantalla.

import java.util.Scanner;
public class Ejercicios19{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String nombre;
        byte edad;
        int salario;

        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la edad del empleado: ");
        edad = teclado.nextByte();
        System.out.println("Ingrese el salario del empleado: ");
        salario = teclado.nextInt();

        System.out.println("Los datos del empleado son: ");
        System.out.println(" ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
    }
    

}