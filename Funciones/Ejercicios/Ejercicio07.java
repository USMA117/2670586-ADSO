// 7. Llenado de un arreglo: Implementa una función que reciba un arreglo de números y devuelva el arreglo 
// lleno con números aleatorios.

public class Ejercicio07 {
    public static void main(String[] args){
        int lista [] = new int[5];
        lista = llenarArreglo(arreglo);
        System.out.println("El numero mayor es: "+llenarArreglo(lista));
    }

    public int[] llenarArreglo(int []arreglo){
        int aleatorio = (int)(Math.random()*100);

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = aleatorio;
        }
        return arreglo;
    }
}
