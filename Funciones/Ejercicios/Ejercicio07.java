// 7. Llenado de un arreglo: Implementa una función que reciba un arreglo de números y devuelva el arreglo 
// lleno con números aleatorios.

public class Ejercicio07 {
    public static void main(String[] args){
        int lista [] = new int[5];
        imprimirArreglo(lista);
        lista = llenarArreglo(lista);
        imprimirArreglo(lista);
    }

    public static int[] llenarArreglo(int [] arreglo){

        for(int i = 0; i < arreglo.length; i++){
            int aleatorio = (int)(Math.random()*100);
            arreglo[i] = aleatorio;
        }
        return arreglo;
    }

    public static void imprimirArreglo( int [] arreglo){
        for(int i = 0; i < arreglo.length; i++ ){
            System.out.print(" ["+arreglo[i]+"]");

        }
        System.out.println("");
    }


}
