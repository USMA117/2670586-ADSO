// Ejercicio #6
// Realizar una aplicación en JAVA, que pida al usuario ingresar un numero de 6 dígitos; después muestre en pantalla un
// menú donde las opciones sea el digito a mostrar.
// Ingresar un número: 912837
// // ------------------------------------------------------------------- //
// Menú:
// 1. Primer Digito. 2. Segundo Digito. 3. Tercer Digito.
// 4. Cuarto Digito. 5. Quinto Digito. 6. Sexto Digito.
// // ------------------------------------------------------------------- //
// Ingrese una opción: 5
// El Quinto Digito es: 1
// Nota: Para obtener el ultimo digito usamos la operación numero%10 (912837%10 -> 7)
// Para obtener los dígitos antes del último usamos la expresión numero/10 (912837/10 -> 91283)

import java.util.Scanner;
public class Ejercicio6{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero_opcion;

        System.out.println(" ");
        System.out.print("Escriba un numero de 6 digitos: ");
        numero1 = teclado.nextInt();

        System.out.println("// --------------------------------------------------------- \\");
        System.out.println("//  Seleccione una opcion del menu:                          \\");
        System.out.println("//  1. Primer digito. 2. Segundo digito. 3. Tercer digito.   \\");
        System.out.println("//  4. cuarto digito. 5. quinto digito. 6. sexto digito.     \\");
        System.out.println("// --------------------------------------------------------- \\");
        System.out.println(" ");

        System.out.print("Ingrese una Opcion: ");
        numero_opcion = teclado.nextInt();

        if (numero_opcion == 1){
            numero1 = numero1/100000;
            System.out.print("El primer digito es: "+numero1);
        }
        else if(numero_opcion == 2){
            numero1 = (numero1 % 100000)/10000;
            System.out.print("El segundo digito es: "+numero1);

        }
        else if(numero_opcion == 3){
            numero1 = (numero1 % 10000)/1000;
            System.out.print("El tercer numero es: "+numero1);

        }
        else if(numero_opcion == 4){
            numero1 = (numero1 % 1000)/100;
            System.out.print("El cuarto numero es: "+numero1);

        }
        else if(numero_opcion == 5){
            numero1 = (numero1 % 100)/10;
            System.out.print("El quinto numero es: "+numero1);

        }
        else if(numero_opcion == 6){
            numero1 = numero1%10;
            System.out.print("El sexto numero es: "+numero1);
        }
        else{
            System.out.print("Debe ingresar un numero y opcion valida");
        }

    
    }
}