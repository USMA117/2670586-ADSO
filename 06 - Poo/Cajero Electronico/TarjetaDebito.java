import java.util.Date;
public class TarjetaDebito{
    // Atributos:
    private String nombrePropietario;
    private String numeroTarjeta;
    private String nombreBanco;
    private int dineroTarjeta;
    private int limiteDineroRetirar;
    private String ultimasTransacciones [];
    private String clave;
    private String estado;

    // Constructores
    public TarjetaDebito (String nombrePropietario, String numeroTarjeta, String nombreBanco, int dineroTarjeta, int limiteDineroRetirar, String clave){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.dineroTarjeta = dineroTarjeta;
        this.limiteDineroRetirar = limiteDineroRetirar;
        this.clave = clave;
        estado = "ACTIVO";
        ultimasTransacciones = new String[10];

    }

    // Getters
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    public String getNumeroTarjeta(){
        return numeroTarjeta;
    }
    public String getNombrebanco(){
        return nombreBanco;
    }
    public int getDineroTarjeta(){
        return dineroTarjeta;
    }
    public int getLimiteDineroRetirar(){
        return limiteDineroRetirar;
    }
    public String getClave(){
        return clave;
    }
    public String getEstado(){
        return estado;
    }

    // Setters
    public void setNombrePropietario(String dato){
        nombrePropietario = dato;
    }
    public void setNumeroTarjeta(String dato){
        numeroTarjeta = dato;
    }
    public void setNombrebanco(String dato){
        nombreBanco = dato;
    }
    public void setDineroTarjeta(int dato){
        dineroTarjeta = dato;
    }
    public void setLimiteDineroRetirar(int dato){
        limiteDineroRetirar = dato;
    }
    public void setClave(String dato){
        clave = dato;
    }
    public void setEstado(String dato){
        estado = dato;
    }
    public void imprimir(){
        System.out.println("Nombre del banco: "+nombreBanco);
    }

    // -> METODOS

    public void registrarTransaccion(String tipo,int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+" - "+tipo+" - "+monto+" - "+estado;

        int indice = -1;
        for(int i = 0;i < ultimasTransacciones.length;i++){
            if(ultimasTransacciones[i] == null){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            ultimasTransacciones[indice] = texto;
        }else{
            for(int i = 0;i < ultimasTransacciones.length;i++){
                ultimasTransacciones[i] = ultimasTransacciones[i+1];
            }
            ultimasTransacciones[ ultimasTransacciones.length-1] = texto;
        }
    }

    public void verHistorial(String pass){
        registrarTransaccion("HISTORIAL", 0, "ACTIVO");
        if(pass.equals(clave)){
            for(int i = 0; i < ultimasTransacciones.length; i++){
                if(ultimasTransacciones[i] != null){
                    System.out.println(" => "+ultimasTransacciones[i]);
                }
            }
        }else{
            System.out.println(" ===> ACCESO DENEGADO DESDE LA TARJETA <=== ");
        }
    }

    public boolean aumentarSaldo(int monto, String pass){
        if(pass.equals(clave)){
            if(monto > 0){
                dineroTarjeta += monto;
                System.out.println("  ===> TRANSACCION EXITOSA EN TARJETA <===  ");
                registrarTransaccion("AUMENTARSALDO", monto, "OK");
                return true;
            }else{
                System.out.println("  ===> ERROR EN MONTO INGRESADO <===  ");
                registrarTransaccion("AUMENTARSALDO", monto, "ERROR");
                return false;
            }
        }else{
            System.out.println("  ===> ERROR EN PASSWORD - AUMENTO DE SALDO <===  ");
            registrarTransaccion("AUMENTARSALDO", monto, "ERROR");
            return false;
        }
    }

    public boolean disminuirSaldo(int monto, String pass){
        if(pass.equals(clave)){
            if(monto > 0 && monto <= limiteDineroRetirar ){
                if(monto <= dineroTarjeta){
                    dineroTarjeta -= monto;
                    System.out.println("  ===> TRANSACCION EXITOSA EN TARJETA <===  ");
                    registrarTransaccion("DISMINUIRSALDO", monto, "OK");
                    return true;
                }else{
                    System.out.println("  ===> ERROR EN MONTO INGRESADO SUPERA DINERO DISPONIBLE <===  ");
                    registrarTransaccion("DISMINUIRSALDO", monto, "ERROR");
                    return false;
                }
            }else{
                System.out.println("  ===> ERROR EN MONTO INGRESADO <===  ");
                registrarTransaccion("DISMINUIRSALDO", monto, "ERROR");
                return false;
            }
        }else{
            System.out.println("  ===> ERROR EN PASSWORD - DISMINUCION DE SALDO <===  ");
            registrarTransaccion("DISMINUIRSALDO", monto, "ERROR");
            return false;
        }
    }







    // public void disminuirSaldo(int cantidad){
    //     if(cantidad < limiteDineroRetirar){
    //         dineroTarjeta -= cantidad;
    //         System.out.print("Saldo: "+dineroTarjeta);
    //     }else{
    //         System.out.print("Su limite de dinero para retirar es de: $"+limiteDineroRetirar);
    //     }
    // }

    // public void aumentarSaldo(int cantidad){
    //     dineroTarjeta += cantidad;
    //     System.out.print("Saldo: "+dineroTarjeta);
    // }
    public int getSaldo(String pass){
        if(pass.equals(clave)){
            registrarTransaccion("CONSULTASALDO",0,"OK");
            return dineroTarjeta;
        }else{
            registrarTransaccion("CONSULTASALDO",0,"ERROR");
            return -1;
        }
    }

    public void verSaldo(String numeroTarjeta, String clave){
        validarClave(clave);
    }

    public boolean validarClave(String pass){
        if(pass.equals(clave)){
            registrarTransaccion("VALIDARCLAVE", 0, "OK");
            return true;
        }else{
            registrarTransaccion("DISMINUIRSALDO", 0, "ERROR");
            return false;
        }
    }
    public boolean validarEstadoActiva(String estado1){
        if(estado.equals("ACTIVO")){
            return true;
        }else{
            return false;
        }
    }
}