// 16. Contar dígitos: Escribe una función que tome un número entero como entrada y devuelva la cantidad de 
// dígitos que tiene.
import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args) {
        contarDigitos();
    }

    public static void contarDigitos() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int contadorDigitos = 0;

        System.out.print("Ingrese un numero entero: ");
        num = teclado.nextInt();

        while (num > 0) {
            num /= 10;
            contadorDigitos++;
        }
        if(contadorDigitos == 1){
            System.out.print("El numero tiene "+contadorDigitos+" digito.");
        }else{
            System.out.print("El numero tiene "+contadorDigitos+" digitos.");
        }
        

    }
}
