
package Utils;

import java.sql.*;

public class BaseDatos {
        
    Connection conexion;
    Statement manipularBD;
    
    public BaseDatos(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "root";
        String password = "";
        
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
	            System.out.println(registros.getRow()+" => "+registros.getString("cedula")+registros.getString("nombres"));
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
                    String direccion = registros.getString("direccion");
                    String correo = registros.getString("email");
                    
                    arreglo[i] = new Persona(documento,nombres,apellidos,telefono,direccion,correo);
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
    
   
   public boolean insertarPersona(String cedula,String nombres,String apellidos,String telefono,String direccion,String email){
       boolean respuesta= false;
       try {
            String consulta = "INSERT INTO personas(cedula,nombres,apellidos,telefono,direccion,email) values('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"')"; 
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
   
   public boolean buscarPersona(String cedula){
       boolean resultado = false;
       try {
           String consulta = "SELECT * FROM personas WHERE cedula = '" + cedula + "'";

            ResultSet registro = manipularBD.executeQuery(consulta);
  
            if (registro.next()) {
                resultado = true;
                System.out.println("La persona con cédula " + cedula + " existe en la tabla personas.");
            } else {
                System.out.println("La persona con cédula " + cedula + " no existe en la tabla personas.");
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar registro: "+e.getMessage());
        }
       return resultado;
       
    }
   
   public boolean actualizarPersona(String cedula,String nombres,String apellidos,String telefono,String direccion,String email){
       boolean respuesta = false;
       try {
           String consulta = "UPDATE personas SET nombres ='"+nombres+"',apellidos = '"+apellidos+"',telefono = '"+telefono+"',direccion = '"+direccion+"',email = '"+email+"'   WHERE cedula='"+cedula+"'";
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
    

    public Connection getConexion() {
        return conexion;
    }

    public Statement getManipularBD() {
        return manipularBD;
        
    }
    
    
}
