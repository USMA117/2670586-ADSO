public class Jugador {

    // Atributos
    String cedula;
    String nombre;
    int edad;
    String posicion;

    // Constructor
    public Jugador(String cedula, String nombre, int edad, String posicion){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Getters
    public String getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getPosicion(){
        return posicion;
    }

    // Setters

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public void imprimirJugador(){
        System.out.println("Jugador "+cedula+ " - "+nombre+" - "+edad+" - "+posicion);
    }


}