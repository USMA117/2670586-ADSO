// 9. Escribir un programa que calcule el salario semanal de un empleado ingresando las horas trabajadas y la tarifa
// por hora. Si el empleado trabajó más de 40 horas, se le pagará un 50% extra por las horas extras.

import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int horas_trabajo;
        int tarifa_hora;
        int salario_semanal;
        int horas_extra;
        int pago_extra;
        int pago_total;


    
        System.out.println(" ");
        System.out.println("Ingrese las horas trabajadas y la tarifa por hora para calcular su salario semanal.");
        System.out.print("Ingrese las horas trabajadas en la semana: ");
        horas_trabajo = teclado.nextInt();
        System.out.print("Ingrese la tarifa pagada por cada hora de trabajo: ");
        tarifa_hora = teclado.nextInt();

        salario_semanal = tarifa_hora * horas_trabajo; 
        horas_extra = horas_trabajo - 40;
        pago_extra = ((tarifa_hora * 50) * horas_extra)/ 100;
        pago_total = pago_extra + salario_semanal;

        if (horas_trabajo > 40){
            System.out.println("Su salario semanal con horas extra es "+pago_total);
        }else{
            System.out.println("Su salario semanal es "+salario_semanal);
        }






    }
}