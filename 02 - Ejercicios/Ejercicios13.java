// 13. Convertir segundos a horas, minutos y segundos: Escribe un programa que tome un número de segundos
// como entrada y lo convierta a un formato de horas, minutos y segundos

import java.util.Scanner;
public class Ejercicios13{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        int minutos = 60;
        int horas = 3600;
        int segundos = 1;

        System.out.println("Escribe los segundos que quieres calcular: ");
        segundos = teclado.nextInt();

        horas = (segundos / 3600);
        minutos = ((segundos-horas*3600)/60);
        segundos = segundos-(horas*3600+minutos*60);

        System.out.println("horas: "+horas );
        System.out.println("minutos: " +minutos);
        System.out.println("segundos: "+segundos);
    }
}
