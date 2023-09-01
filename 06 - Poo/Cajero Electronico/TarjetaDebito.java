public class TarjetaDebito{
    // Atributos:
    String nombrePropietario;
    String numeroTarjeta;
    String nombreBanco;
    int dineroTarjeta;
    int limiteDineroRetirar;
    // String [] -> Ultimas transacciones ( fecha-tipoTransaccion-monto-estado );
    String clave;
    String estado;

    // Constructores
    public TarjetaDebito (String nombrePropietario, String numeroTarjeta, String nombreBanco, int dineroTarjeta, int limiteDineroRetirar, String clave, String estado ){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.dineroTarjeta = dineroTarjeta;
        this.limiteDineroRetirar = limiteDineroRetirar;
        this.clave = clave;
        this.estado = estado;

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

    public void disminuirSaldo(int cantidad){
        if(cantidad < limiteDineroRetirar){
            dineroTarjeta -= cantidad;
            System.out.print("Saldo: "+dineroTarjeta);
        }else{
            System.out.print("Su limite de dinero para retirar es de: $"+limiteDineroRetirar);
        }
    }

    public void aumentarSaldo(int cantidad){
        dineroTarjeta += cantidad;
        System.out.print("Saldo: "+dineroTarjeta);
    }
}