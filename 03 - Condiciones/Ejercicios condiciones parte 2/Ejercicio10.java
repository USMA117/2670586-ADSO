// 10. Escribir un programa que determine si una persona es mayor de edad ingresando su fecha de nacimiento

import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int dia_nacimiento;
        int mes_nacimiento;
        int ano_nacimiento;
        int dia_actual;
        int mes_actual;
        int ano_actual;
        int edad;

        System.out.println(" ");
        System.out.println("Para calcular su edad por favor ingrese su fecha de nacimiento y la fecha actual ");
        System.out.println(" ");
        System.out.print("Ingrese su dia de nacimiento: ");
        dia_nacimiento = teclado.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        mes_nacimiento = teclado.nextInt();
        System.out.print("Ingrese su ano de nacimiento: ");
        ano_nacimiento = teclado.nextInt();
        System.out.println("_______________________________");

        System.out.print("Ahora ingrese el dia actual: ");
        dia_actual = teclado.nextInt();
        System.out.print("Ingrese el mes actual: ");
        mes_actual = teclado.nextInt();
        System.out.print("Para finalizar ingrese el ano actual: ");
        ano_actual = teclado.nextInt();
        System.out.println("_______________________________");

        edad = ano_actual - ano_nacimiento;

        if(dia_nacimiento == dia_actual && mes_nacimiento == mes_actual){
            System.out.println("Estas cumpliendo "+edad+" anos de edad");
        }
        else if(mes_nacimiento == mes_actual && dia_nacimiento < dia_actual){
            
                edad = edad - 1;
                System.out.println("Usted tiene "+edad+" anos de edad");
            
        }
        else if(mes_nacimiento < mes_actual){
            edad = edad - 1;
                System.out.println("Usted tiene "+edad+" anos de edad");

        }
        else{
                System.out.println("Usted tiene "+edad+" anos de edad");


    }
}
}