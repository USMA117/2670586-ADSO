// 9. Mínimo de un arreglo: Implementa una función que reciba un arreglo de números y devuelva el valor 
// mínimo.

public class Ejercicio09{
    public static void main(String[] args){
        // int lista [] = new int[5];
        // int [] lista = llenarArreglo(lista);
        int [] lista = {1,2,3,0,4,5};
        Ejercicio08.imprimirArreglo(lista);

        System.out.println("El valor minimo es: "+valorMin(lista));
    }

    public static int [] llenarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (i+1);
        }
        return arreglo;
    }

    public static int valorMin(int [] arreglo){
        int numMenor = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            
            if(numMenor > arreglo[i]){
                numMenor = arreglo[i];
            }

        }
        System.out.println("");
        return numMenor;
        
    } 

}