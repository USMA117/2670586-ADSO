public class Ejercicio08{
    public static void main(String[] args){
        int lista [] = new int[5];
        llenarArreglo(lista);
        imprimirArreglo(lista);
    }

    public static int[] llenarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (i+1);
        }

        return arreglo;
    }
    public static void imprimirArreglo(int [] arreglo){
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(" ["+arreglo[i]+"]");
        }
    }
}