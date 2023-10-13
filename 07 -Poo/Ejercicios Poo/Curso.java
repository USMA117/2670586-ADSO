import java.util.Scanner;

public class Curso{
    Scanner teclado = new Scanner(System.in);
    private int codigo = 0;
    private String nombreCurso = "";
    private String area = "";
    private int duracion = 0;
    private String temas [];

    // Constructor
    public Curso(int codigo, String nombreCurso, String area, int duracion){
        this.codigo = codigo;
        this.nombreCurso = nombreCurso;
        this.area = area;
        this.duracion = duracion;
        temas = new String[15];
    }

    // Getters

    public int getCodigo(){
        return codigo;
    }
    public String GetNombreCurso(){
        return nombreCurso;
    }
    public String getArea(){
        return area;
    }
    public int getDuracion(){
        return duracion;
    }

    // Setters

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    public void setArea(String area){
        this.area = area;
    }
    public void setDuracion (int duracion){
        this.duracion = duracion;
    }


    // Metodos

    public void imprimirDetalle(){
        System.out.println("---------------------------");
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombreCurso);
        System.out.println("Area: "+area);
        System.out.println("Duracion: "+duracion+" horas.");
        System.out.println("---------------------------");
    }
    
    public void crearCurso(){
        System.out.print("Ingrese el nombre del curso: ");


    }


    
}