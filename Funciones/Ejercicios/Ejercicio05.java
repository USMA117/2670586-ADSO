// 5. Potencia: Escribe una función que tome dos números como entrada y calcule el primero elevado a la 
// potencia del segundo.
public class Ejercicio05 {
    
    public static void main(String[] args){
        
        System.out.println("El resultado de la potencia es: "+potencia(2, 4));
    }

    public static int potencia(int numero, int potencia){

        int resultado = 1;
        for(int i = 1; i<=potencia; i++){
            resultado *= numero;

        }
        return resultado;
    }
}
