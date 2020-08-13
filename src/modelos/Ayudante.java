package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {

    public ArrayList<Paralelo> paralelos;

    Ayudante(Estudiante e) {
        paralelos = new ArrayList<>();
    }

}
