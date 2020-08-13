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
public class Dirección {
    private String callePrincipal;
    private String calleSecundaria;
    private String referencia;
    private String codigoPostal;

    public Dirección(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public void cambiarUbicacion(Dirección d){
        setCallePrincipal(d.callePrincipal);
        setCodigoPostal(d.codigoPostal);
        setCalleSecundaria(d.calleSecundaria);
        setReferencia(d.referencia);
    }
    
    
}
