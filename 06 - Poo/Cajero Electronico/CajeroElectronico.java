import java.util.Date;
public class CajeroElectronico{

    // Atributos
    int capacidadTotal;
    int dinero_disponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombre_banco;
    String  listaTransacciones [];
    String usuario_admin;
    String clave_admin;

    // Constructores

    public CajeroElectronico(int capacidadTotal, int dinero_disponible, int cant_10, int cant_20, int cant_50, int cant_100, String nombre_banco, String usuario_admin, String clave_admin){
        this.capacidadTotal = capacidadTotal;
        this.dinero_disponible = dinero_disponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombre_banco = nombre_banco;
        this.listaTransacciones = listaTransacciones;
        this.usuario_admin = usuario_admin;
        this.clave_admin = clave_admin;
        listaTransacciones = new String[100];


    }

    public CajeroElectronico(int capacidadTotal,String nombre_banco, String usuario_admin,String clave_admin){
        this.capacidadTotal = capacidadTotal;
        this.nombre_banco = nombre_banco;
        this.usuario_admin = usuario_admin;
        this.clave_admin = clave_admin;

        this.dinero_disponible = 0;
        this.cant_10 = 0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
        listaTransacciones = new String[100];
    }

    // Getters

    public int getcapacidadTotal(){
        return capacidadTotal;
    }
    public int getDinero_disponible(){
        return dinero_disponible;
    }
    public int getCant_10(){
        return cant_10;
    }
    public int getCant_20(){
        return cant_20;
    }
    public int getCant_50(){
        return cant_50;
    }
    public int getCant_100(){
        return cant_100;
    }
    public String getNombre_banco(){
        return nombre_banco;
    }
    // public String getListaTransacciones(){
    //     return listaTransacciones;
    // }
    public String getUsuario_admin(){
        return usuario_admin;
    }
    public String getClave_admin(){
        return clave_admin;
    }


    // Setters
    public void setcapacidadTotal(int dato){
        capacidadTotal = dato;
    }
    public void setDinero_disponible(int dato){
        dinero_disponible = dato;
    }
    public void setCant_10(int dato){
        cant_10 = dato;
    }
    public void setCant_20(int dato){
        cant_20 = dato;
    }
    public void setCant_50(int dato){
        cant_50 = dato;
    }
    public void setCant_100(int dato){
        cant_100 = dato;
    }
    public void setNombre_banco(String dato){
        nombre_banco = dato;
    }
    // public void setListaTransacciones(String dato){
    //     getlistaTransacciones = dato;
    // }
    public void setUsuario_admin(String dato){
        usuario_admin = dato;
    }
    public void setClave_admin(String dato){
        clave_admin = dato;
    }



    public void imprimirDetalle(){
        System.out.println("---------------------------------------");
        System.out.println(" capacidadTotal: "+capacidadTotal);
        System.out.println(" dinero_disponible: "+dinero_disponible);
        System.out.println(" cant_10: "+cant_10);
        System.out.println(" cant_20: "+cant_20);
        System.out.println(" cant_50: "+cant_50);
        System.out.println(" cant_100: "+cant_100);
        System.out.println(" nombre_banco: "+nombre_banco);
        System.out.println(" usuario_admin: "+usuario_admin);
        System.out.println(" clave_admin: "+clave_admin);
        for(int i = 0;i< listaTransacciones.length;i++){
            if(listaTransacciones[i] != null){
                System.out.println("    => "+listaTransacciones[i]);
            }
        }
        System.out.println("---------------------------------------");
        
    }

    // Métodos:
    
    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
        // Calcular total ingresado
        int total = (cant_10 * 10000) + (cant_20 * 20000) + (cant_50 * 50000) + (cant_100 * 100000);

        // Validar que no exceda el limite
        if(total <= capacidadTotal){
            // Si. Almacenar los datos en los atributos.
            dinero_disponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;

            registrarTransaccion("ABASTECER","0000 0000 0000 0000",total,"OK");
            return true;
        }else{
            // No. Imprimir mensaje y retornar falso
            registrarTransaccion("ABASTECER","0000 0000 0000 0000",total,"ERROR");
            return false;
        }
    }
    public void registrarTransaccion(String tipo,String numeroTarjeta,int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;

        int indice = -1;
        for(int i = 0;i < listaTransacciones.length;i++){
            if(listaTransacciones[i] == null){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            listaTransacciones[indice] = texto;
        }else{
            for(int i = 0;i < listaTransacciones.length;i++){
                listaTransacciones[i] = listaTransacciones[i+1];
            }
            listaTransacciones[ listaTransacciones.length-1] = texto;
        }
    }

    // No hacer 
    public void bloquearCajero(boolean confirmarBloquearCajero){

    }

    public void verHistorialCajero(String user, String pass){
        registrarTransaccion("HISTORIAL","0000 0000 0000 0000",0,"OK");
        if(user.equals(usuario_admin) && pass.equals(clave_admin) ){
            for(int i = 0; i < listaTransacciones.length; i++){
                if(listaTransacciones[i] != null){
                System.out.println("=> "+listaTransacciones[i]);
                }
                
            }
            
        }else{
            System.out.println(" ===> ACCESO DENEGADO <=== ");
            registrarTransaccion("HISTORIAL","0000 0000 0000 0000",0,"ERROR");
        }
        
    }


    public void consignarDineroaTarjeta(){
        
    }

    public void retirarDineroTarjeta(){
        
    }

    public void verHistorialTarjeta(){

    }

    public void consultarSaldoTarjeta(String nombrePropietario, String numeroTarjeta, String clave, String estado){

        // if(nombrePropietario == nombrePropietario && numeroTarjeta == numeroTarjeta && clave == clave && estado == "ACTIVA"){
        //     int saldo = dineroTarjeta;
        //     System.out.print(saldo);
        // }else if(estado != "ACTIVA"){
        //     System.out.print("El estado actual de su tarjeta no le permite realizar esta opcion");
        // }
        
    }
    
    public void cambiarClave(String nuevaClave){
        clave_admin = nuevaClave;
    }

    public void consignarDineroTarjeta(TarjetaDebito tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100){
        int monto = (10000 * cant_10) + (20000 * cant_20) + (50000 * cant_50) + (100000 * cant_100);
            // validar contraseña
        if(tarjeta.validarClave(clave)){
            // validar estado de la tarjeta
            if(tarjeta.validarEstadoActiva("ACTIVO")){
                // el monto ingresado sea mayor a 0
                if(monto > 0){
                    // validar que con el dinero ingresado no supere limite del cajero
                    if(dinero_disponible + monto <= capacidadTotal){
                        // aumentar saldo tarjeta, aumentar saldo cajero y cantidad de billetes
                        tarjeta.aumentarSaldo(monto, clave);
                        dinero_disponible += monto;
                        this.cant_10 += cant_10;
                        this.cant_20 += cant_20;
                        this.cant_50 += cant_50;
                        this.cant_100 += cant_100;
                        
                        //Registrar transaccion
                        System.out.print(" ===> REALIZADO - CONSIGNAR DINERO <=== ");
                        registrarTransaccion("CONSIGNACION",tarjeta.getNumeroTarjeta(),monto,"OK");
                    }else{
                        System.out.print(" ===> ERROR MONTO SUPERIOR - CONSIGNAR DINERO <=== ");
                        registrarTransaccion("CONSIGNACION",tarjeta.getNumeroTarjeta(),monto,"ERROR MONTO SUPERIOR");
                    }
                }else{
                    System.out.print(" ===> ERROR MONTO INFERIOR - CONSIGNAR DINERO <=== ");
                    registrarTransaccion("CONSIGNACION",tarjeta.getNumeroTarjeta(),monto,"ERROR MONTO INFERIOR");
                }
            }else{
                System.out.print(" ===> ERROR ESTADO - CONSIGNAR DINERO <=== ");
                registrarTransaccion("CONSIGNACION",tarjeta.getNumeroTarjeta(),monto,"ERROR ESTADO");
            }
        }else{
            System.out.print(" ===> ERROR PASSWORD - CONSIGNAR DINERO <=== ");
            registrarTransaccion("CONSIGNACION",tarjeta.getNumeroTarjeta(),monto,"ERROR PASSWORD");
        }
        
    }

}