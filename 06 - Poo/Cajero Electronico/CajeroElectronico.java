import java.util.Scanner;
public class CajeroElectronico{

    // Atributos
    int dinero_total;
    int dinero_disponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombre_banco;
    // String [] Lista de trasacciones ( fecha-tipot-numtarj-monto-estado );
    String usuario_admin;
    String clave_admin;

    // Constructores

    public CajeroElectronico(int dinero_total, int dinero_disponible, int cant_10, int cant_20, int cant_50, int cant_100, String nombre_banco, String usuario_admin, String clave_admin){
        this.dinero_total = dinero_total;
        this.dinero_disponible = dinero_disponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombre_banco = nombre_banco;
        this.usuario_admin = usuario_admin;
        this.clave_admin = clave_admin;

    }

    // Getters

    public int getDinero_total(){
        return dinero_total;
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
    public String getUsuario_admin(){
        return usuario_admin;
    }
    public String getClave_admin(){
        return clave_admin;
    }


    // Setters
    public void setDinero_total(int dato){
        dinero_total = dato;
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
    public void setUsuario_admin(String dato){
        usuario_admin = dato;
    }
    public void setClave_admin(String dato){
        clave_admin = dato;
    }



    public void imprimir(){
        System.out.println("Nombre del banco: "+nombre_banco);
    }

    // Métodos:
    
    public void abastecerCajero(int dinero){
        dinero_total += dinero;
        System.out.println("Dinero total: "+dinero_total);

    }

    public void bloquearCajero(boolean confirmarBloquearCajero){

    }

    public void verHistorialCajero(){

    }


    public void consignarDineroaTarjeta(){

    }

    public void retirarDineroTarjeta(){

    }

    public void verHistorialTarjeta(){

    }

    public void consultarSaldoTarjeta(){
    }
    
    public void cambiarClave(){

    }


}