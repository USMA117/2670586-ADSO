// 2. Realizar una aplicación en JAVA que solicite al usuario un numero entero N, cree un arreglo 
// de String de tamaño N, llene el arreglo con datos pedidos al usuario, muestre el arreglo en 
// pantalla.

import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado_texto = new Scanner(System.in);
        Scanner texto2 = new Scanner(System.in);
        
        int numero_n = 0;
        String nombre;
        int comprobar = 0;

        System.out.print("Ingrese numero N: ");
        numero_n = teclado.nextInt();
        String arreglo [] = new String[numero_n];

        //Llenar arreglo
        for(int i= 0; i < arreglo.length; i++ ){
            System.out.print("Ingrese su nombre "+(i+1)+" : ");
            arreglo[i] = teclado_texto.nextLine();
            System.out.println("");
            
        }

        // Mostrar posicion
        System.out.print("Ingrese uno de lo nombres ingresado: ");
        nombre = texto2.nextLine();

        for(int i= 0; i < arreglo.length; i++ ){
            if ( nombre.equals( arreglo[i] ) ){
                System.out.println(nombre+" esta en la posicion: "+(i+1));
                comprobar++;
            }
            if(comprobar == 0 && i == (numero_n-1)){
                System.out.println( "nombre no esta en la lista" );
            }
            
        }

    }
}
