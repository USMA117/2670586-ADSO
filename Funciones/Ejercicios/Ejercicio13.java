// 13. Ordenar un arreglo: Escribe una función que tome un arreglo de números como entrada y lo ordene en 
// orden ascendente

public class Ejercicio13{
    public static void main(String[] args){
        int [] listaNumeros = {1,2,30,4,5};
        imprimirArreglo(listaNumeros);
        listaNumeros = arregloEnOrden(listaNumeros);
        imprimirArreglo(listaNumeros);

    }

    public static void imprimirArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
    }

    public static int[] arregloEnOrden(int [] arreglo){
        for(int i = 0;i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length-1; j++){

                if(arreglo[j] > arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }   
        }
        
        System.out.println("");
        return arreglo;
    }
}