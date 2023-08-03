
// Ejercicio 03
// Realizar una aplicacio en JAVA que solicite al usuario un numero entero N, en pantalla se deben mostrar N numeros primos 
// generados de forma aleatoria, los numeros generados no pueden ser repetidos.


import java.util.Scanner;
public class Ejercicio3{ 
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        boolean primo;
        int contador = 1;
        

        System.out.print("Ingrese un numero del 1 al 6: ");
        numero = teclado.nextInt();

        while( contador <=  numero ){
            int numero_aleatorio =(int) (Math.random() *100);
            primo = true;
        
            if(numero_aleatorio > 1){
                for( int i = 2; i <= Math.sqrt(numero_aleatorio); i++ ){
                    if(numero_aleatorio % i == 0){
                        primo = false;
                        break;
                    } 
                
                }
            
            if(primo){
                        System.out.println("primo "+contador+" Generado: "+numero_aleatorio);
                        contador++;
                }

            }
            teclado.close();
        
        }
    }
}