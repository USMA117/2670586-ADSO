public class Principal{
    public static void main(String[] args){

        // -> CAJEROS 
        CajeroElectronico cajero_1 = new CajeroElectronico (500000, 300000, 100, 200, 500, 1000,"Bancolombia","Sebastian Usma","123456");
        CajeroElectronico cajero_2 = new CajeroElectronico (600000, 400000, 100, 200, 500, 1000,"BBVA","Francisco Gomez","123457");
        // cajero_1.abastecerCajero();

        // -> TARJETAS DEBITO
        TarjetaDebito tarjeta_1 = new TarjetaDebito ("Jhoan Usma", "123456789", "Davivienda", 5000000, 2500000, "1234", "ACTIVA");
        TarjetaDebito tarjeta_2 = new TarjetaDebito ("Pedro Sanchez", "123243455", "Davivienda", 0, 0, "1235", "BLOQUEADA");
        TarjetaDebito tarjeta_3 = new TarjetaDebito ("Maria Pedraza", "234566666", "BBVA", 15000000, 5000000, "5432", "ACTIVA");
        TarjetaDebito tarjeta_4 = new TarjetaDebito ("Daniela Gomez", "2433204005", "Bancolombia", 1800000, 1000000, "4321", "ACTIVA");
        TarjetaDebito tarjeta_5 = new TarjetaDebito ("Fernando Ramirez", "327478595", "BBVA", 0, 0, "5668", "SUSPENDIDA");
        // tarjeta_5.imprimir();
        // tarjeta_1.disminuirSaldo(100000);
        // tarjeta_1.aumentarSaldo(100000);

        
    }
}