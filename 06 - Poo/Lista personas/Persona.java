public class Persona{
    
    //Atributos -> Caracteristicas

    int cedula;
    String nombre;
    String apellido;
    int edad;
    int altura;
    double peso;



    //Constructores
    public Persona( int dato1, String dato2, String dato3, int dato4, int dato5, double dato6 ){

        cedula = dato1;
        nombre = dato2;
        apellido = dato3;
        edad = dato4;
        altura = dato5;
        peso = dato6;

    }

    //Getters no reciben nada (vacio)
    public int getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public int getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    //Setters debe recibir el nuevo dato a modificar
    //Al cambiar el valor del atributo no se devuelve nada

    public void setCedula(int dato){
        cedula = dato;
    }

    public void setNombre(String dato){
        nombre = dato;
    }

    public void setApellido(String dato){
        apellido = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setAltura(int dato){
        altura = dato;
    }

    public void setPeso(double dato){
        peso = dato;
    }

    public void imprimirEstado(){
        System.out.println("");
        System.out.println("|--------------------------------|");
        System.out.println("|- Cedula: "+cedula);
        System.out.println("|- Nombres: "+nombre);
        System.out.println("|- apellido: "+apellido);
        System.out.println("|- Edad: "+edad);
        System.out.println("|- Altura: "+altura);
        System.out.println("|- Peso: "+peso);
        System.out.println("|--------------------------------|");
    }

    public void actividadFisica(int minutos){
        peso = peso - ((peso * 0.00005) * minutos);
    }

    public void aumentarPeso(int calorias){
        peso = peso + (calorias * 0.00005);
    }

}
