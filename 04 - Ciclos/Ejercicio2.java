/*Realizar una aplicación que le permita a los estudiantes calcular el promedio ponderado de la nota obtenida en el semestre 
(Tener en cuenta que el promedio ponderado es diferente al promedio de la Actividad 1). La aplicación debe solicitarle al 
estudiante una cantidad de materias, posteriormente debe solicitar la nota de cada materia y la cantidad de créditos de 
la materia. Al final la aplicación debe mostrar el total de créditos vistos en el semestre y el promedio del semestre.*/


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        int Cantidad_Notas;
        double Suma_Creditos=0, SumaNotaPorCredito, total_Notas=0; 

        System.out.print(" => Ingrese cantidad de Materias: ");
        Cantidad_Notas = teclado.nextInt();

        for(int i = 1; i <= Cantidad_Notas; i=i+1){
            System.out.print(" => Ingrese nota: "+i+" : ");
            double IngreNota = teclado.nextDouble();

            System.out.print(" => Creditos Materia : "+i+" : ");
            double Ingreso_Credito = teclado.nextDouble();

            Suma_Creditos = Ingreso_Credito+Suma_Creditos;

            SumaNotaPorCredito = IngreNota*Ingreso_Credito;
            total_Notas = SumaNotaPorCredito + total_Notas;

        }

        double PromedioPonderado = total_Notas / Suma_Creditos;

        System.out.println("Total de creditos: "+Suma_Creditos);

        System.out.println("Promedio del semestre: "+PromedioPonderado);


    }
}
