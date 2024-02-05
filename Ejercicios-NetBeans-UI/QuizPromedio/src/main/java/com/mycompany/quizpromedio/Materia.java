
package com.mycompany.quizpromedio;


public class Materia {
    Materia materias[];
    String nombre;
    double creditos;
    double nota;
    
    /*CONSTRUCTOR */
    public Materia(String nombre,double creditos,double nota){
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
        materias = new Materia[50];
        
    }
    
    /*GETTERS*/
    public String getNombre() {
        return nombre;
    }

    public double getCreditos() {
        return creditos;
    }

    public double getNota() {
        return nota;
    }
    
    /*SETTERS*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
}
    
