// 15. Fibonacci: Implementa una función que calcule el enésimo término de la secuencia de Fibonacci.
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        calcularFibonacci();
    }

    public static void calcularFibonacci() {
        Scanner teclado = new Scanner(System.in);
        int numSecuencia = 0;
        int a = 0;
        int b = 1;

        System.out.print("Ingrese hasta donde calcular Fibonacci: ");
        numSecuencia = teclado.nextInt();

        System.out.print("Secuencia de Fibonacci: ");

        for (int i = 0; i < numSecuencia; i++) {
            if (i != (numSecuencia - 1)) {
                System.out.print(a + ", ");
            } else {
                System.out.print(a);
            }

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        teclado.close();
    }
}
