// 25. Generar un número aleatorio dentro de un rango: Implementa una función que tome dos números 
// enteros como entrada (límite inferior y superior) y devuelva un número aleatorio dentro de ese rango.

import java.util.Scanner;

public class Ejercicio25{
    public static void main(String[] args){
        System.out.print("Numero generado: "+generar_num_aleatorio());
    }
    public static int generar_num_aleatorio(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el limite inferior: ");
        int lim_inferior = teclado.nextInt();
        System.out.print("Ingrese el limite superior: ");
        int lim_superior = teclado.nextInt();

        int num_alaetorio = (int)(Math.random() * lim_superior)+lim_inferior;
        if(num_alaetorio > lim_inferior && num_alaetorio < lim_superior){
            return num_alaetorio;
        }else{
            num_alaetorio = (int)(Math.random() * lim_superior)+lim_inferior;
        }
        return num_alaetorio;
        
    }
}