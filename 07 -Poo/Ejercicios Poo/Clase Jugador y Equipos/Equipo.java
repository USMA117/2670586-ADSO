import java.util.Scanner;
public class Equipo {
    // Atributos
    String nombre_equipo;
    int Anio_fundacion;
    int cantidad_partidos_ganados;
    int cantidad_partidos_empatados;
    int cantidad_partidos_perdidos;
    Jugador listadoJugadores[];

    public Equipo(String nombre_equipo, int anio_fundacion, int cantidad_partidos_ganados,
            int cantidad_partidos_empatados, int cantidad_partidos_perdidos) {
        this.nombre_equipo = nombre_equipo;
        Anio_fundacion = anio_fundacion;
        this.cantidad_partidos_ganados = cantidad_partidos_ganados;
        this.cantidad_partidos_empatados = cantidad_partidos_empatados;
        this.cantidad_partidos_perdidos = cantidad_partidos_perdidos;
        listadoJugadores = new Jugador[11];
    }

    // Getters

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public int getAnio_fundacion() {
        return Anio_fundacion;
    }

    public int getCantidad_partidos_ganados() {
        return cantidad_partidos_ganados;
    }

    public int getCantidad_partidos_empatados() {
        return cantidad_partidos_empatados;
    }

    public int getCantidad_partidos_perdidos() {
        return cantidad_partidos_perdidos;
    }

    public Jugador[] getListadoJugadores() {
        return listadoJugadores;
    }

    //Setters

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public void setAnio_fundacion(int anio_fundacion) {
        Anio_fundacion = anio_fundacion;
    }

    public void setCantidad_partidos_ganados(int cantidad_partidos_ganados) {
        this.cantidad_partidos_ganados = cantidad_partidos_ganados;
    }

    public void setCantidad_partidos_empatados(int cantidad_partidos_empatados) {
        this.cantidad_partidos_empatados = cantidad_partidos_empatados;
    }

    public void setCantidad_partidos_perdidos(int cantidad_partidos_perdidos) {
        this.cantidad_partidos_perdidos = cantidad_partidos_perdidos;
    }



    // Metodos

    public void imprimirNombresJugadores(){
        System.out.println("Listado de jugadores: ");
        for(int i = 0;i < listadoJugadores.length; i++){
            if (listadoJugadores[i] != null) {
                listadoJugadores[i].imprimirJugador();
            }
            
        }
    }

    public void agregarJugador(Jugador jugador){
        for(int i = 0; i < listadoJugadores.length;i++ ){
            if(listadoJugadores[i] == null){
                listadoJugadores[i] = jugador;
                break;
            }
        }
        
    }

    public void eliminarJugador(Jugador jugador){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del jugador -> ");
        

        for(int i = 0; i < listadoJugadores.length;i++ ){
            if(listadoJugadores[i] == null){
                listadoJugadores[i] = jugador;
                break;
            }
        }
        
    }
}

