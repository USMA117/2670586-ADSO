// 14. Verificar ordenado de arreglo: Escribe una función que tome un arreglo de números como entrada y 
// devuelva un valor booleano que indique si esta ordenado de forma ascendente.

public class Ejercicio14{
    public static void main(String[] args){
        int [] listaNumeros = {1,2,30,4,5};

        System.out.print("El arreglo esta ordenado de forma ascendente: "+comprobarOrden(listaNumeros));

    }

    public static boolean comprobarOrden(int [] arreglo){
        for(int i = 0; i < arreglo.length-1; i++){
            if(arreglo[i] > arreglo[i+1]){
                return false;
            }
        }
        return true;
    }
}