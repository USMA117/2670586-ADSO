// 24. Contar los números pares e impares en un arreglo: Crea una función que tome un arreglo de números 
// como entrada y devuelva la cantidad de números pares e impares en el arreglo

public class Ejercicio24{
    public static void main(String[] args){

        int [] listaNumeros = {1,2,3,4,5,6,7,8,9,10,11};
        int pares = contarPares(listaNumeros);
        int impares = listaNumeros.length - pares;

        System.out.println("-----------------------------");
        System.out.println("Cantidad de pares: "+pares);
        System.out.println("Cantidad de impares: "+impares);
        System.out.println("-----------------------------");
    }
    public static int contarPares(int [] arreglo){
        int pares = 0;
        int impares = 0;
        for(int i =0; i < arreglo.length; i++){
            if(arreglo[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        return pares;
    }
}