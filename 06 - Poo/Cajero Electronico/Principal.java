public class Principal{
    public static void main(String[] args){

        // -> CAJEROS 
        CajeroElectronico cajero_1 = new CajeroElectronico (30000000, 10000000, 100, 50, 20, 70,"Bancolombia","Usma117","123456");
        CajeroElectronico cajero_2 = new CajeroElectronico (150000000, "BBVA", "Francisco234","123457");

        cajero_2.abastecerCajero(1000,1000,500,500);
        cajero_2.abastecerCajero(20000,20000,5000,5000);
        // cajero_2.verHistorialCajero("Francisco234", "123457");
        cajero_2.imprimirDetalle();
        

        
        // cajero_2.cambiarClave("usmaSANCHEZ");
        // cajero_2.consultarSaldoTarjeta("123456789");
        // cajero_2.imprimirDetalle();

        // -> TARJETAS DEBITO
        TarjetaDebito tarjeta_1 = new TarjetaDebito ("Jhoan Usma", "0001 0001 0001 0001", "Davivienda", 5000000, 2500000, "1234");
        TarjetaDebito tarjeta_2 = new TarjetaDebito ("Pedro Sanchez", "123243455", "Davivienda", 0, 0, "1235");
        TarjetaDebito tarjeta_3 = new TarjetaDebito ("Maria Pedraza", "234566666", "BBVA", 15000000, 5000000, "5432");
        TarjetaDebito tarjeta_4 = new TarjetaDebito ("Daniela Gomez", "2433204005", "Bancolombia", 1800000, 1000000, "4321");
        TarjetaDebito tarjeta_5 = new TarjetaDebito ("Fernando Ramirez", "327478595", "BBVA", 0, 0, "5668");


        // cajero_2.consignarDineroTarjeta(tarjeta_1, "1234", 0, 0, 0, 10);
        // cajero_2.retirarDineroTarjeta(tarjeta_1, "1234", 0, 0, 0, 10);

        cajero_2.imprimirDetalle();

        cajero_2.VerHistorialTarjeta(tarjeta_1, "1234");

        cajero_2.consultarSaldoTarjeta(tarjeta_1, "1234");

        cajero_2.cambiarClave(tarjeta_1, "1234","4321","ACTIVO");
        // tarjeta_1.consultarSaldoTarjeta("Jhoan Usma", "123456789", "1234", "ACTIVA");
        // tarjeta_1.validarClave("1234");
        // tarjeta_1.aumentarSaldo();
        // tarjeta_1.disminuirSaldo();
        // tarjeta_1.verHistorial("1234");
        // tarjeta_1.verHistorial("1234");
        // tarjeta_1.verHistorial("1234");
        // tarjeta_1.verHistorial("1232");
        // tarjeta_1.verHistorial("1232");
    }
}