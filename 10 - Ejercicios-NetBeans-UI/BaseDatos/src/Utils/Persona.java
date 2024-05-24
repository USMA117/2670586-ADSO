package Utils;

        
public class Persona {
        String documento;
        String nombres;
        String apellidos;
        String telefono ;
        String direccion;
        String correo ;
    public int length;
        
    /*
        *CONSTRUCTOR
    */

    public Persona(String documento, String nombres, String apellidos, String telefono,String direccion, String correo) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        
    }
    
    /*
         *GETTERS
    */

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }
    
    /*
        *SETTERS
    */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
        
        
}
