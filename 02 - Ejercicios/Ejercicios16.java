// 16. Cálculo del interés compuesto: Escribe un programa que calcule el monto final obtenido a partir de una
// inversión inicial, una tasa de interés y un número de períodos utilizando la fórmula del interés compuesto.
import java.util.Scanner;
public class Ejercicios16{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int inversion_inicial;
        int tasa_interes;
        double monto_final;
        int periodo_ahorro;
        
        System.out.println("Ingresa el monto que desea depositar: ");
        inversion_inicial = teclado.nextInt();
        System.out.println("Ingresa la tasa de interes: ");
        tasa_interes = teclado.nextInt();
        System.out.println("Ingresa el periodo de ahorro: ");
        periodo_ahorro = teclado.nextInt();


        monto_final = inversion_inicial * Math.pow(1 + tasa_interes,periodo_ahorro);
        System.out.println("El monto final con el interes compuesto seria de: "+monto_final);



    }
}