// Ejercicio #3
// Realizar una aplicación en JAVA, que solicite al usuario ingresar dos números enteros correspondientes a una 
// coordenada de un plano cartesiano (x,y). La aplicación debe determinar por medio de la coordenada en que cuadrante 
// se encuentra.

import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int eje_x;
        int eje_y; 

        System.out.print("Ingrese la coordenada del eje x: ");
        eje_x = teclado.nextInt();
        System.out.print("Ingrese la coordenada del eje y: ");
        eje_y = teclado.nextInt();

        if (eje_x < 0 & eje_y < 0){
            System.out.print("> La coordenada ingresada se encuentra en el tercer cuadrante.");

        }
             else if(eje_x > 0 & eje_y > 0){
             System.out.print("> La coordenada ingresada se encuentra en el primer cuadrante.");
        }
              
            else if(eje_x > 0 & eje_y < 0){
                System.out.print("> La coordenada ingresada se encuentra en el cuarto cuadrante.");

            }

            else if(eje_x == 0 & eje_y == 0){
                System.out.print("Usted aun no se encuentra en ningun cuadrante");

            }
            
            else{
                System.out.print("> La coordenada ingresada se encuentra en segundo cuadrante.");
            }
                
               

    }
}