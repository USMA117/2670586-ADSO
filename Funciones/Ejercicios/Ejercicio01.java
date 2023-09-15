// 1. Suma de dos números: Escribe una función que tome dos números como parámetros y devuelva su suma.
public class Ejercicio01{
    public static void main(String[] args){
        System.out.println("El resultado de la suma es: "+sumar(20, 30));
    }

    public static int sumar(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
}