// 2. Resta de dos números: Crea una función que acepte dos números y retorne su resta.

public class Ejercicio02{
    public static void main(String[] args){
        System.out.println("El resultado de la suma es: "+restar(20, 30));
    }

    public static int restar(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
}