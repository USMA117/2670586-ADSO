public class Principal{
    public static void main(String[] args){
        Jugador jugador_01 = new Jugador("123456", "Messi", 50, "Delantero");
        Jugador jugador_02 = new Jugador("1234567", "James", 30, "Delantero");
        Equipo chichipatos = new Equipo("Chichipatos",1960, 1,0,199);

        chichipatos.agregarJugador(jugador_01);
        chichipatos.agregarJugador(jugador_02);
        chichipatos.imprimirNombresJugadores();
    }
}