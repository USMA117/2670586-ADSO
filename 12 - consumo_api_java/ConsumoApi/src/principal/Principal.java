
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;


public class Principal {

    public static void main(String[] args) {
        
        Menu menuInicial = new Menu();
        /*
        // Instancia para realizar consumos
        ConsumoAPI consumo = new ConsumoAPI();
        
        // Endpoint Obtener
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        System.out.println("Respuesta: "+respuesta01);
        
        // Endpoint Insertar
        Map<String,String> datosInsertar = new HashMap<>();
        
        datosInsertar.put("cedula", "1010109");
        datosInsertar.put("nombres", "Sebas");
        datosInsertar.put("apellidos", "Usma Sanchez");
        datosInsertar.put("telefono", "3560200239");
        datosInsertar.put("direccion", "calle 20");
        datosInsertar.put("email", "usma@gmail.com");
        
        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php",datosInsertar);
        System.out.println("Respuesta insertar: "+respuesta02);
        
        
        // Endpoint Actualizar
        Map<String,String> datosActualizar = new HashMap<>();
        
        datosActualizar.put("cedula", "1010109");
        datosActualizar.put("nombres", "Sebas actualizado");
        datosActualizar.put("apellidos", "Usma");
        datosActualizar.put("telefono", "3560200239");
        datosActualizar.put("direccion", "calle 20");
        datosActualizar.put("email", "usmaActualizado@gmail.com");
        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
        System.out.println("Respuesta actualizar: "+respuesta03);
        
        // Endpoint Eliminar
        /*Map<String,String> cedulaEliminar = new HashMap<>();
        
        cedulaEliminar.put("cedula", "1010109");
        String respuestaEliminar = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", cedulaEliminar);
        System.out.println("Respuesta Eliminar: "+respuestaEliminar);
        
        
        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        for(int i =0; i<registros.size();i++){
            JsonObject temp = registros.get(i).getAsJsonObject();
            String nombre = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();
            System.out.println(nombre+" "+apellidos);
        }*/
    }
    
}
