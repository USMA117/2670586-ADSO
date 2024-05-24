// 19. Calcular el área de un círculo: Crea una función que tome el radio de un círculo como entrada y devuelva 
// su área.
import java.util.Scanner;
public class Ejercicio19{
    public static void main(String [] args){
        System.out.print("El area del circulo es: "+calcularArea());
    }
    public static double calcularArea(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        double radio = teclado.nextInt();
        double area = Math.PI*(radio*radio);
        return area;
    } 
}
