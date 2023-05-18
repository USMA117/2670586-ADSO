// 5. Cálculo del área de un triángulo: Escribe un programa que tome la base y la altura de un triángulo como
    // entrada y calcule su área utilizando la fórmula: área = (base * altura) / 2.
        
        import  java.util.Scanner;

public class Ejercicios05{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float base;
        float altura;
        float area;

        System.out.println("Escribe la base del triangulo: ");
        base = teclado.nextFloat();

        System.out.println("Escribe la altura del triangulo: ");
        altura = teclado.nextFloat();

        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: "+area);
    }
}