/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Alexis
 */
public class Telefono {
    private String number;
    private String operadora;
    private Persona propietario;

    public Telefono(String number) {
        this.number = number;
    }
    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperadora() {
        return operadora;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
    
    public void cambiarOperadora(String operadora){
        this.operadora=operadora;
    }
    
}
