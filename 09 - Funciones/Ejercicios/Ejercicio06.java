// 6. Máximo de tres números: Crea una función que tome tres números y retorne el valor máximo entre ellos

public class Ejercicio06{
    public static void main(String[] args){
        System.out.println("El numero mayor es: "+numMayor(1,1,1));
    }

    public static int numMayor(int num1, int num2, int num3){

        int mayor = 0; 

        if(num1 > num2 && num1 > num3){
            mayor = num1;
        }else if(num2 > num1 && num2 > num3){
            mayor = num2;
        }else if(num3 > num1 && num3 > num2){
            mayor = num3;
        }else{
            System.out.println("Los numeros son iguales");
        }
        return mayor;
    }
}