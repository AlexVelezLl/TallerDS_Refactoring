package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {

    public ArrayList<Paralelo> paralelos;

    Ayudante(Estudiante e) {
        paralelos = new ArrayList<>();
    }
    //Método para imprimir los paralelos que tiene asignados como ayudante

    public void MostrarParalelos() {
        for (Paralelo par : paralelos) {
            //Muestra la info general de cada paralelo
        }
    }
}
