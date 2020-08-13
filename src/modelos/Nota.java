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
public class Nota {
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;

    public double getNexamen() {
        return nexamen;
    }

    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }

    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }
    
    
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double calcularNota(){
        double notaTeorico=(getNexamen()+getNdeberes()+getNlecciones())*0.80;
        double notaPractico=(getNtalleres())*0.20;
        return notaTeorico+notaPractico;
    }
}
