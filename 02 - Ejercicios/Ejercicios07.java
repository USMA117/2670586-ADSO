// 7. Cálculo de descuento: Pide al usuario el precio de un producto y un porcentaje de descuento. Calcula el
    // precio final aplicando el descuento. Muestra el precio final por pantalla.

        import  java.util.Scanner;

public class Ejercicios07{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int precio;
        int descuento;
        float Precio_final;

        
        System.out.println("Escriba el precio del producto que desea: ");
        precio = teclado.nextInt();
        System.out.println("Escriba el porcentaje de descuento que tiene el producto: ");
        descuento = teclado.nextInt();

        Precio_final = (descuento * precio) / 100;

        System.out.println("El precio final es: "+Precio_final);

    }
}