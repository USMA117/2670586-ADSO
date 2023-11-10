public class Producto {
    private String id;
    private String nombre;
    private int precio;
    
    public Producto(String id, String nombre, int precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    // Metodos



}
