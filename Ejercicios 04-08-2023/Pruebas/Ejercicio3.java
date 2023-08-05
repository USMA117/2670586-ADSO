
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[]  args){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado_texto = new Scanner(System.in);
        Scanner teclado_editar = new Scanner(System.in);
        Scanner teclado_eliminar = new Scanner(System.in);

        int opcion = 0;
        int memoria =10;
        int contador_datos = 0;
        String nombre_editar;
        String nuevo_nombre;
        String nombre;
        String nombre_eliminar;
        int comprobar =0;


        String arreglo[] = new String[memoria];
        

        do{
            
            System.out.println("");
            System.out.println("Memoria disponible: "+memoria+" registros ");
            System.out.println("1: Registrar cliente");
            System.out.println("2: Ver lista de clientes. ");
            System.out.println("3: Editar cliente.");
            System.out.println("4: Eliminar cliente.");
            System.out.println("5: Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            opcion = teclado.nextInt();

            //Ingresar usuario
            if(opcion==1){ 

                    if(contador_datos < memoria){
                        comprobar =1;
                        
                        while(comprobar == 1){
                            System.out.print("Ingrese su nombre completo: ");
                            nombre = teclado_texto.nextLine();
                            for(int i = 0;i<arreglo.length;i++){
                                if ( nombre.equals( arreglo[i] ) ){
                                    System.out.println(nombre+" esta repetido.");
                                    comprobar++;
                                }
                            }
                            if(contador_datos<= memoria && comprobar == 1){
                                arreglo[contador_datos] = nombre;
                                contador_datos++;
                                memoria--;
                                comprobar++;
                            }
                            
                            
                            
                         }
                        
                        
                    }else{  
                        System.out.print("Memoria vacia.");
                    }
                    

            }

            //mostrar datos
            if(opcion == 2){
                for(int i=0; i < contador_datos;i++){
                    System.out.println("["+arreglo[i]+"] ");
                }
            }
            //Editar usuario
            if(opcion==3){
                
                System.out.print("Ingrese el nombre que dese editar: ");
                nombre_editar = teclado_editar.nextLine();

                for(int i = 0; i < arreglo.length;i++){
                    if (nombre_editar.equals(arreglo[i] ) ){
                        System.out.print("Ingrese el nuevo nombre: ");
                        nuevo_nombre = teclado_editar.nextLine();
                        arreglo[i] = nuevo_nombre;
                        comprobar++;

                         for(int j = 0;j < arreglo.length; j++){
                            if ( nuevo_nombre.equals( arreglo[j] ) ){
                                System.out.println(nuevo_nombre+" esta repetido.");
                            }
                        }
                    }
                    
                    if(comprobar == 0 && i == (arreglo.length)){
                        System.out.println( "nombre no esta en la lista" );
                    }
                }
            }
            // Eliminar nombre
            if(opcion==4){

                System.out.print( "Ingrese el dato que desea borrar: " );
                nombre_eliminar = teclado_eliminar.nextLine();

                int posicion_eliminar = 0;
                for(int i = 0;i < contador_datos; i++){
                    if (nombre_eliminar.equals( arreglo[i] ) ){
                        posicion_eliminar = i;
                        for(int j = posicion_eliminar;j < contador_datos; j++){
                            if(j < contador_datos){
                                arreglo[j] = arreglo[i+j];
                            }

                        }
                        
                        
                        memoria++;
                        contador_datos--;

                    }
                }

            }

        } while( opcion != 5);

        
        
        

    }
}