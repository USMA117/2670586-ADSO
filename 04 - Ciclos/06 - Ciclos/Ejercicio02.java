// Ejercicio 02
// Realizar una aplicación en JAVA para realizar el calculo de intereses totales cobrados por una entidad financiera, el usuario 
// debe ingresar la cantidad total financiada, cantidad de cuotas pagadas y el valor de cada cuota. Al final la aplicación debe 
// mostrar en pantalla el total del interes pagado en %

import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int total_financiado = 0;
        int cant_cuotas = 0;
        int valor_cuota = 0;
        float intereses_pagados = 0;
        float tasa_interes = 0;
        int suma_cuotas = 0;

        System.out.print("Ingrese la cantidad total financiada: ");
        total_financiado = teclado.nextInt();
        System.out.print("Ingrese la cantidad de cuotas: ");
        cant_cuotas = teclado.nextInt();

        
        

        for(int i = 1; i <= cant_cuotas; i++){

            System.out.print("Ingrese el valor de la cuota "+i+" : ");
            valor_cuota = teclado.nextInt();
            suma_cuotas += valor_cuota;

        }
        intereses_pagados = suma_cuotas - total_financiado;
        tasa_interes = intereses_pagados /(total_financiado * cant_cuotas);
        
        System.out.print("La tasa de interes es: "+(tasa_interes * 100)+" %");

    }
}