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
        notaTotal = (notaInicial.calcularNota() + notaFinal.calcularNota())/2;
    }
}
