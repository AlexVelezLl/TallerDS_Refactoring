package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    public String codigo;
    public InformacionAdicionalProfesor info;
    
    public Profesor(String codigo) {
        this.codigo = codigo;
    }
    
    public void anadirParalelos(Paralelo p){
        super.getParalelos().add(p);
    }
    
    
}
