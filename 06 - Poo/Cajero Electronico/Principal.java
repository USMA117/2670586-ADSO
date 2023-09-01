public class Principal{
    public static void main(String[] args){

        // -> CAJEROS 
        CajeroElectronico cajero_1 = new CajeroElectronico (30000000, 10000000, 100, 50, 20, 70,"Bancolombia","Usma117","123456");
        CajeroElectronico cajero_2 = new CajeroElectronico (150000000, "BBVA", "Francisco234","123457");

        cajero_2.abastecerCajero(1000,1000,500,500);
        cajero_2.abastecerCajero(20000,20000,5000,5000);

        cajero_2.imprimirDetalle();

        // -> TARJETAS DEBITO
        TarjetaDebito tarjeta_1 = new TarjetaDebito ("Jhoan Usma", "123456789", "Davivienda", 5000000, 2500000, "1234", "ACTIVA");
        TarjetaDebito tarjeta_2 = new TarjetaDebito ("Pedro Sanchez", "123243455", "Davivienda", 0, 0, "1235", "BLOQUEADA");
        TarjetaDebito tarjeta_3 = new TarjetaDebito ("Maria Pedraza", "234566666", "BBVA", 15000000, 5000000, "5432", "ACTIVA");
        TarjetaDebito tarjeta_4 = new TarjetaDebito ("Daniela Gomez", "2433204005", "Bancolombia", 1800000, 1000000, "4321", "ACTIVA");
        TarjetaDebito tarjeta_5 = new TarjetaDebito ("Fernando Ramirez", "327478595", "BBVA", 0, 0, "5668", "SUSPENDIDA");

    }
}