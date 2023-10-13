import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaTexto= new Scanner(System.in);
        // Perro perro_01 = new Perro("Pecas","Maria",108,"Boxer",30.5,40);
        // Perro perro_02 = new Perro("Samantha","Lorena",2,"Weimaranear",4.5,90);


        // Arreglo de perros
        Perro listadoPerros[] = new Perro[20];
        listadoPerros[0] = new Perro("Pecas","Maria",108,"Boxer",30.5,40);
        listadoPerros[1] = new Perro("Samantha","Lorena",2,"Weimaranear",4.5,90);
        


        // // Ciclo imprimiendo arreglo[i]
        // for(int i = 0; i < listadoPerros.length; i++){
        //     if(listadoPerros[i] != null){
        //         listadoPerros[i].imprimirDetalle();
        //         // System.out.println("Perro "+(i+1)+"-> "+listadoPerros[i].getNombre()+" - "+listadoPerros[i].getEdad());
        //     }
        // }

        // Perro mas pesado
        Perro mas_pesado= listadoPerros[0];
        for(int i = 0; i < listadoPerros.length; i++){
            if(listadoPerros[i] != null){
                if(listadoPerros[i].getPeso() >= mas_pesado.getPeso() ){
                    mas_pesado = listadoPerros[i];
                }

            }
        }
        
        if(listadoPerros[0] != null){
            mas_pesado.imprimirDetalle();
        }else{
            System.out.print("No contiene Perros");
        }
        

    }

}
