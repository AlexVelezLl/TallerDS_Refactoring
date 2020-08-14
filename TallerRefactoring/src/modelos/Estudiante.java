package modelos;

public class Estudiante extends Persona{
    //Informacion del estudiante
    private String matricula;
    private String facultad;
    
    //Getter y setter de Matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
   
    
}
        
