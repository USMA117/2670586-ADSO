// Ejercicio 02
// Realizar una aplicación en JAVA que muestre en pantalla una fecha de manera aleatoria, es decir que cada vez que se 
// ejecute la aplicación la fecha debe ser diferente. Para la construccion de la fecha se debe usar una variable entera donde 
// los 2 primeros digitos de izquierda a derecha significa el dia del mes, el siguiente grupo de 2 digitos significa el numero del 
// mes y el ultimo grupo de 4 digitos significa el numero del ano

import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int dia = 0;
        int mes = 0;
        int ano = 0;
        int limite = 1;
        int numero_aleatorio = 0;

        for(int i = 1;i <= limite; i++){

            dia = (int)(Math.random()*31+1);
            mes = (int)(Math.random()*12+1);
            ano = (int)(Math.random()*2023+1);


            if(dia > 0){
                if(dia>0 && dia<10){
                    System.out.print("0"+dia+"/");
                }else{
                    System.out.print(dia+"/");
                }
                
            }
            if(mes > 0){
                if(mes>0 && mes<10){
                    System.out.print("0"+mes+"/");
                }else{
                    System.out.print(mes+"/");
                }

            }
            if(ano > 0){
                numero_aleatorio = (int)(Math.random()*2+1);
                if(ano < 1000){
                    System.out.print(numero_aleatorio+ano);
                }else{
                    System.out.print(ano);
                }
            }

        }
    }
}