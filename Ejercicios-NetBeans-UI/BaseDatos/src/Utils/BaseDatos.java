
package Utils;

import java.sql.*;

public class BaseDatos {
    
    Connection conexion;
    Statement manipularBD;
    
    public BaseDatos(){
        String hostname = "10.199.208.11";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "admin";
        String password = "12345";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename ;
        
        
        
        try {
            conexion = DriverManager.getConnection(url,user,password);
            manipularBD = conexion.createStatement();
            System.out.println("Conexion exitosa");
        } catch (Exception e) {         
            System.out.println("Error en conexion a base de datos");
            System.out.println(e.getMessage());
        }
    }
    
    public void imprimirPersonas(){
        ResultSet registros = null;
	try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularBD.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
	            System.out.println(registros.getRow()+" => "+registros.getString("nombres"));
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}        
        
    }
    
   public Persona[] extraerPersonas(){
       
       try {
           Persona arreglo[] = new Persona[100];
            String consulta = "SELECT * FROM personas";
            ResultSet  registros = manipularBD.executeQuery(consulta) ;
            registros.next();
            if(registros.getRow() == 1){
                int i = 0;
                do{
                    String documento = registros.getString("cedula");
                    String nombres = registros.getString("nombres");
                    String apellidos = registros.getString("apellidos");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("email");
                    
                    arreglo[i] = new Persona(documento,nombres,apellidos,telefono,correo);
                    i++;
                    
                }while(registros.next());
                return arreglo;
            }else{
                return arreglo;
            }
       } catch (Exception e) {
           System.out.println("Error al imprimir el SELECT");
           System.out.println(e.getMessage());
           return null;
       }
      
   }
    
   
   public boolean insertarPersona(String cedula,String nombres,String apellidos,String telefono,String email){
       boolean respuesta= false;
       try {
            String consulta = "INSERT INTO personas(cedula,nombres,apellidos,telefono,email) values('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+email+"')"; 
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
       } catch (Exception e) {
           System.out.println("Error al insertar: "+e.getMessage());
       }
       return respuesta;
       
       
   }
   
   public boolean eliminarPersona(String cedula){
       boolean respuesta = false;
       try {
           String consulta = "DELETE FROM personas WHERE cedula='"+cedula+"'";
           int res_consulta = manipularBD.executeUpdate(consulta);
           if(res_consulta == 1){
               respuesta = true;
           }
           System.out.println("Eliminado exitosamente");
       } catch (Exception e) {
           System.out.println("Error al eliminar Persona: "+e.getMessage());
       }
       return respuesta;
       
       
   }
   /*
   public boolean aztualizarPersona(String cedula){
       boolean respuesta = false;
       try {
           String consulta = "UPDATE personas  WHERE cedula='"+cedula+"'";
           int res_consulta = manipularBD.executeUpdate(consulta);
           if(res_consulta == 1){
               respuesta = true;
           }
           System.out.println("Eliminado exitosamente");
       } catch (Exception e) {
           System.out.println("Error al eliminar Persona: "+e.getMessage());
       }
       return respuesta;
       
       
   }
    */
    
    
}
