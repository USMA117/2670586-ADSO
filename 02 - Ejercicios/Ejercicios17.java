// 17. Conversión de moneda: Escribe un programa que solicite al usuario ingresar una cantidad en COP y luego
// la convierta a las siguientes monedas: USD, EUR, JPY y GBP.

import java.util.Scanner;
public class Ejercicios17{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

    int pesos_cop;
    float usd;
    float eur;
    float jpy;
    float gbp;

    System.out.println("El escribe en valor en pesos colombianos que deseas convertir: ");
    pesos_cop = teclado.nextInt();

    usd = pesos_cop * 4.517f;
    eur = pesos_cop * 4.899f;
    jpy = pesos_cop * 32.86f;
    gbp = pesos_cop * 5.640f;

    System.out.println("En dolares es: "+usd);
    System.out.println("En euros es: "+eur);
    System.out.println("En yen japones es: "+jpy);
    System.out.println("En libra esterlina es: "+gbp);


    }
}
