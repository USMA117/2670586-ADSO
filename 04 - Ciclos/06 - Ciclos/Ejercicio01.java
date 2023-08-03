import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int sueldo;
        int cant_pagos = 0;
        int opcion;
        int pago1 =0;
        int sueldo_dif =0;


        System.out.println("-----------  FORMAS DE PAGO  -----------");
        System.out.println("     1. Pagos de igual valor");
        System.out.println("     2. Primer pago diferente.");
        System.out.println("     3. Ultimo pago diferente.");
        System.out.println("     4. Primer y Ultimo pago diferente.");
        System.out.print("=> Ingrese forma de Pago: ");
        opcion = teclado.nextInt();

        

       
        

        do{
                System.out.print("=> Ingrese un sueldo Total: ");
                sueldo = teclado.nextInt();
                System.out.print("=> Cantidad de Pagos: ");
                cant_pagos = teclado.nextInt();
                System.out.println("------------- SUS PAGOS SERAN ------------------");

            
            switch(opcion){
                
                case 1:
                    sueldo = sueldo / cant_pagos;

                    for(int j = 1;j<= cant_pagos; j++){
                        System.out.println("Mes "+j+": $ "+sueldo);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la cuota diferente: ");
                    pago1 = teclado.nextInt();
                    
                    sueldo = sueldo - pago1;

                    for(int j = 1; j <= cant_pagos;j++){
                        
                        if (j == 1){
                            System.out.println("Mes "+j+": $ "+pago1);
                            
                        }else{
                            sueldo_dif = sueldo /(cant_pagos-1);
                            System.out.println("Mes "+j+": $ "+sueldo_dif);
                        }
                    }
                    break;
                
                case 3:
                    System.out.print("Ingrese el valor de la ultima cuota: ");
                    pago1 = teclado.nextInt();
                    
                    sueldo = sueldo - pago1;

                    for(int j = 1; j <= cant_pagos;j++){
                        
                        if (j < cant_pagos){

                            sueldo_dif = sueldo /(cant_pagos-1);
                            System.out.println("Mes "+j+": $ "+sueldo_dif);
                            
                        }else{
                            System.out.println("Mes "+j+": $ "+pago1);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el monto de la primera cuota: ");
                    pago1 = teclado.nextInt();

                    for(int j = 1;j <= cant_pagos;j++){

                        sueldo = sueldo - pago1;

                        if(j == 1){
                
                            for(int c = 1; c <= cant_pagos;c++){
                                
                                if(c == 1){
                                    System.out.println("Mes "+c+": $ "+pago1);
                                    
                                }else{
                                    sueldo_dif = sueldo /(cant_pagos-1);
                                    System.out.println("Mes "+c+": $ "+sueldo_dif);
                                }
                            }
                        }

                    }
                    break;

                case 0:
                    System.out.print("Hasta pronto.");
                    break;
        
            }
                System.out.println("-----------  FORMAS DE PAGO  -----------");
                System.out.println("     1. Pagos de igual valor");
                System.out.println("     2. Primer pago diferente.");
                System.out.println("     3. Ultimo pago diferente.");
                System.out.println("     4. Primer y Ultimo pago diferente.");
                System.out.println("     0. Salir                           ");
                System.out.print("=> Ingrese forma de Pago: ");
                opcion = teclado.nextInt();

        } while(opcion != 0);

    }
}