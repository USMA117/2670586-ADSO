

import java.util.Scanner;
public class Ejercicios18{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int peso;
        float altura;
        double imc;

        System.out.println("Ingrese su peso para calcular su peso corporal: ");
        peso = teclado.nextInt();
        System.out.println("Ingrese tambien su altura: ");
        altura = teclado.nextFloat();

        imc = peso / Math.pow(altura, 2);

        System.out.println("Su indice de masa corporal (IMC) es de : "+imc);


    }
}