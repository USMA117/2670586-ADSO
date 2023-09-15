
public class Ejemplo01{

    public static void main(String[] args){

        // Arreglo de tipo Int
        int listado []= new int[10];
        imprimirArreglo(listado);
        listado = llenarArreglo( listado);
        imprimirArreglo(listado);


        // Arreglo de tipo String
        String listadoPersonas[] = new String[5];
        // listadoPersonas = restablecerArreglo(listado);
        imprimirArregloTexto(listadoPersonas);

        /*
        System.out.println("----PROBANDO FUNCIONES----");
        System.out.println("Resultado Suma: "+sumar(5,3));
        System.out.println("Resultado Suma: "+sumar(3,2));
        System.out.println("Resultado Suma: "+sumar(-3,20));
        System.out.println("Resultado Suma: "+sumar(100,-50));
        // System.out.println("Resultado Division: "+dividir(5,3));
        System.out.println("--------------------------");

        System.out.println("----PROBANDO FUNCIONES----");
        System.out.println("Resultado Dividir: "+dividir(5,3));
        System.out.println("Resultado Dividir: "+dividir(3,2));
        System.out.println("Resultado Dividir: "+dividir(-3,20));
        System.out.println("Resultado Dividir: "+dividir(100,-50));
        // System.out.println("Resultado Division: "+dividir(5,3));
        System.out.println("--------------------------");

        saludar();

        saludarEnBucle(2);

        imprimirTabla(5,10);

        int juanito = sumar(4, 4);
        System.out.println("Juanito: "+juanito);

        if(sumar(-5,12) >= 0){
            System.out.println("El resultado es positivo");
        }else{
            System.out.println("El resultado es negativo");
        } */
        
    }

    public static int sumar(int a, int b){
        int resultado = (a + b);
        return resultado;
        
    }

    public static float dividir(float a, float b){
        float resultado = (a / b);
        return resultado;
        
    }

    public static void saludar(){
        System.out.println("+------------------------+");
        System.out.println("+       HOLA MUNDO       +");
        System.out.println("+------------------------+");
    }

    public static void saludarEnBucle(int cantidad){
        for(int i = 0; i < cantidad;i++){
            System.out.println("+------------------------+");
            System.out.println("       HOLA MUNDO "+(i+1)+"      ");
            System.out.println("+------------------------+");
        }
        
    }

    public static void imprimirTabla(int tabla, int multiplo){
        for(int i= 0; i <= multiplo; i++){
            int resultado = tabla * i;
            System.out.println(tabla+"x"+i+"="+resultado);
        }
    }

    public static void imprimirArreglo( int [] arreglo ){
        for(int i = 0; i< arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("");
    } 

    public static int[] llenarArreglo(int [] arreglo){
        for(int i = 0; i< arreglo.length; i++){

            int aleatorio = (int)(Math.random()*100);
            arreglo[i] = aleatorio;
        }
        return arreglo;
    }

    public static String[] restablecerArreglo(String [] arreglo){
        for(int i = 0; i< arreglo.length; i++){
            arreglo[i] = "Ninguno.";
        }
        return arreglo;
    }

    public static void imprimirArregloTexto( String [] arreglo ){
        for(int i = 0; i< arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("");
    } 
}