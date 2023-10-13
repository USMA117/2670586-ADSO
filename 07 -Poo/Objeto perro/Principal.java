public class Principal{
    public static void main(String[] args){
        Perro perro_01 = new Perro("Pecas","Maria",108,"Boxer",30.5,40);
        // Perro perro_02 = new Perro("Samantha","Lorena",2,"Weimaranear",4.5,90);

        perro_01.setNombre("Toby");
        perro_01.setPropietario("Miguel Alzate");
        

        perro_01.comer(800);
        // perro_01.caminar(30);
        // perro_01.ladrar(9);
        // perro_01.morder(10);
        // perro_01.dormir(60);
        // perro_01.hacerPopis(500);
        // perro_01.jugar(20);
        perro_01.imprimirDetalle();






        // Clases: Se representan como archivos y definen nuevos tipos de datos.
        //         Una clase es una plantilla que se usara para crear objetos/variables.
        
        //      Atributos: Datos propios de la clase definida o una caracteristica.
        //                 Se representa con variables globales.

        //      Metodos: Acciones que puede realizar un objeto
        //               perteneciendo a la clase.
        //               Se representan como funciones.
    }
}