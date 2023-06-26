// Ejercicio #4
// Realizar una aplicación que muestre en pantalla un menú con tres opciones


import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num_opcion;

        System.out.println("|----------Bienvenido----------|");
        System.out.println("|  1. Docente                  |");
        System.out.println("|  2. Estudiante               |");
        System.out.println("|  3. Salir                    |");
        System.out.println("|------------------------------|");
        System.out.print("Ingrese una opcion: ");
        num_opcion = teclado.nextInt();

        System.out.println("");
        

        while(num_opcion != 3){
            
            if(num_opcion == 1){
            
                int notas;
                float cantidad_notas,promedio,total=0;

                System.out.print(" => Ingrese cantidad de notas: ");
                notas = teclado.nextInt();

                for(int i = 1; i <= notas; i=i+1){
                    System.out.print(" => Ingrese nota: "+i+" : ");
                    cantidad_notas = teclado.nextFloat();
                    total = cantidad_notas+total;
            
        }

        promedio = total / notas;
        System.out.println("Promedio de nota obtenida: "+promedio);
            

        } else if(num_opcion == 2){
            int Cantidad_Notas;
            double Suma_Creditos=0, SumaNotaPorCredito, total_Notas=0; 

            System.out.print(" => Ingrese cantidad de Materias: ");
            Cantidad_Notas = teclado.nextInt();

            for(int i = 1; i <= Cantidad_Notas; i=i+1){
                System.out.print(" => Ingrese nota "+i+" : ");
                double IngreNota = teclado.nextDouble();

                System.out.print(" => Creditos Materia "+i+" : ");
                double Ingreso_Credito = teclado.nextDouble();

                Suma_Creditos = Ingreso_Credito+Suma_Creditos;

                SumaNotaPorCredito = IngreNota*Ingreso_Credito;
                total_Notas = SumaNotaPorCredito + total_Notas;

            }

            double PromedioPonderado = total_Notas / Suma_Creditos;

            System.out.println("Total de creditos: "+Suma_Creditos);

            System.out.println("Promedio del semestre: "+PromedioPonderado);

           }else{
            System.out.println("!! Debe ingresar un numero valido.");
           }

            System.out.println("");
            System.out.println("|----------Bienvenido----------|");
            System.out.println("|  1. Docente                  |");
            System.out.println("|  2. Estudiante               |");
            System.out.println("|  3. Salir                    |");
            System.out.println("|------------------------------|");
            System.out.print("Ingrese una opcion: ");
            num_opcion = teclado.nextInt();

            System.out.println("");

        }

    }
}