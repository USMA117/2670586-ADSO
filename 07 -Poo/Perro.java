public class Perro {

    // Atributos 
    private String nombre = "";
    private String propietario = "";
    private int edad = 0;
    private String raza = "";
    private double peso = 0;
    private int energia = 0;

    // Constructores -> Es usado para crear objetos de esa classe(Instanciacion)
    public Perro(String dato1, String dato2, int dato3, String dato4, double dato5, int dato6) {
        nombre = dato1;
        propietario = dato2;
        edad = dato3;
        raza = dato4;
        peso = dato5;
        energia = dato6;
    }

    public void imprimirDetalle(){
        System.out.println("+--------------------------------+");
        System.out.println("| nombre: "+nombre);
        System.out.println("| propietario: "+propietario);
        System.out.println("| edad: "+edad+" meses ("+((double) edad/12)+")");
        System.out.println("| raza: "+raza);
        System.out.println("| peso: "+peso+" kg");
        System.out.println("| energia: "+energia);
        System.out.println("+--------------------------------+");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public int getEnergia() {
        return energia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    
    
    


    
    // Metodos  
    // - imprimirDetalle(...)
    // - caminar(...)
    // - ladrar(...)
    // - morder(...)
    // - dormir(...)



    // - comer(...)
    public void comer(int gramos){

        // peso
        peso += ((double)gramos/1000);

        // Energia
        energia += gramos/100;
    }


    // - hacerPopis(...)
    // - jugar(...)






}
