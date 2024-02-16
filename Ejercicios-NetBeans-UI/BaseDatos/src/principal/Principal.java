
package principal;

import Utils.BaseDatos;
import Utils.Persona;


public class Principal {

    public static void main(String[] args) {
        BaseDatos basedatos = new BaseDatos();
        
        basedatos.insertarPersona("1236", "pepito", "Sanchez", "31932934", "yosoypepito@gmail.com");
        basedatos.eliminarPersona("1236");
        Persona listado[]= basedatos.extraerPersonas();
        for (int i = 0;i<listado.length && listado[i] != null; i++) {
            System.out.println(" -> "+listado[i].getNombres()+" "+listado[i].getApellidos()+" "+listado[i].getCorreo());
        }
        
    }
    
}
