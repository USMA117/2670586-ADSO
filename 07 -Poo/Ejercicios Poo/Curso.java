import java.util.Scanner;

public class Curso{
    Scanner tecladoTexto = new Scanner(System.in);
    Scanner tecladoNumeros = new Scanner(System.in);
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
    public String getNombreCurso(){
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

        System.out.print(codigo+" - "+nombreCurso+" - "+area+" - "+duracion+" hrs ");
        if(temas[0] != null){
            System.out.print(" - ( ");   
            for (int i = 0; i < temas.length; i++) {
                if(temas[i] != null){
                    if(i  < temas.length){
                        System.out.print(temas[i]+" ");   
                    }
                }
            }
            System.out.println(" )");  
        }
        System.out.println("");
    }
    
    public void editarInformacionCurso(String nombre, String area, int duracion){
        
        this.nombreCurso = nombre;
        this.area = area;
        this.duracion = duracion;

        System.out.println("-------------------------------");
        System.out.println("|   INFORMACION ACTUALIZADA   |");
        System.out.println("-------------------------------");

    }

    public void agregarTema(String tema){
        for (int i = 0; i < temas.length; i++) {
            if(temas[i] == null){
                temas[i] = tema;
                break;
            }else{
                System.out.println("|   NO SE PUEDEN AGREGARTEMAS    |");
            }
        }
        System.out.println("-------------------------------");
        System.out.println("| TEMA AGREGADO EXITOSAMENTE  |");
        System.out.println("-------------------------------");
    }


    
}