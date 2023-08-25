public class Principal{
    public static void main(String[] args) {
        
        // Creacion de objeto en este caso "usuario".
        Persona persona_01 = new Persona( 1060587950, "Sebastian", "Usma", 20, 173, 55.8 ); //creacion de la instancia!
        Persona persona_02 = new Persona( 1004595949, "Pedro", "Gonzalez",17, 156, 70.4); 

        // persona_01.imprimirEstado();
        // persona_02.imprimirEstado();
        
        persona_01.actividadFisica(80);
        persona_02.actividadFisica(30);
        
        persona_01.imprimirEstado();
        persona_02.imprimirEstado();

        // Persona listaPersonas[] = new Persona[1];
        // listaPersonas[0] = new Persona ( 1060587950, "Sebastian", "Usma", 20, 173, 55.8 );

        // System.out.print(listaPersonas[0]);

        

    }
}