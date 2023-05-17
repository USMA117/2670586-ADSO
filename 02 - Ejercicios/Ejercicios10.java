// 10. División y resto: Escribe un programa que tome dos números como entrada y muestre el resultado de la
// división y el resto de la división entre ambos.
import java.util.Scanner;
public class Ejercicios10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        float resul_div;
        int resto;

        System.out.println("Escribe dos numeros para realizar la division: ");
        System.out.println("Escribe el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Escribe el segundo numero");
        num2 = teclado.nextInt();

        resul_div = num1 / num2;
        resto = num1 % num2;

        System.out.println("El resultado de la division es: "+resul_div + " Y el resto de la division es: "+resto);

    }
}