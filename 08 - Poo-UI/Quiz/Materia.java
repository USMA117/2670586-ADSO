public class Materia {
    Materia [] listaMaterias = new Materia[50];
    String nombre;
    int creditos;
    double nota;

    public Materia(String nombre,int creditos,double nota) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
    }


    public String getNombre() {
        return nombre;
    }


    public int getCreditos() {
        return creditos;
    }


    public double getNota() {
        return nota;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    public void setNota(double nota) {
        this.nota = nota;
    }


    public void promediar(String materia,int creditos,double nota){
        double  sumaNotas = 0;
        double  sumaCreditos = 0;
        int contador = 1;
        int cantidad = 0;

        while (contador <= cantidad ){
            this.nota = nota;
            this.creditos = creditos;
            
            sumaNotas = sumaNotas + (nota * creditos);
            sumaCreditos = sumaCreditos + creditos;

            contador = contador + 1;
        }
        double promedio = sumaNotas / sumaCreditos;

        for (int i = 0; i < listaMaterias.length; i++) {
            if(listaMaterias[i] == null){
                if(i  < listaMaterias.length){
                    listaMaterias[i] = new Materia(materia,creditos,nota);
                }
            }
        }
    }

    public void imprimirMateria(){
        for (int i = 0; i < listaMaterias.length; i++) {
            if(listaMaterias[i] != null){
                System.out.print("Materia ->"+listaMaterias[i].getNombre()+"Creditos ->"+listaMaterias[i].getCreditos()+"Nota ->"+listaMaterias[i].getNota());
            }
        }
    }
    
}
