/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author PC
 */
public class EstudianteNota {
    private Nota notaInicial;
    private Nota notaFinal;
    private double notaTotal;
    private Estudiante estudiante;
    private Paralelo paralelo;
    
    
    public void calcularNotaTotal(){
        setNotaTotal((getNotaInicial().calcularNota() + getNotaFinal().calcularNota())/2);
    }

    public Nota getNotaInicial() {
        return notaInicial;
    }

    public void setNotaInicial(Nota notaInicial) {
        this.notaInicial = notaInicial;
    }

    public Nota getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Nota notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Paralelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(Paralelo paralelo) {
        this.paralelo = paralelo;
    }
    
    
    
}
