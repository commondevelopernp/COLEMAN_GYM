package Controllers;

import Ejercicio.Ejercicio;
import Entrenamiento.Entrenamiento;

import java.util.List;

public class EntrenamientoController {

    public EntrenamientoController() {
    }

    public List<Ejercicio> getEjercicios(Entrenamiento entrenamiento){
        return entrenamiento.getEjercicios();
    }

    public void setCumplido(Entrenamiento entrenamiento, boolean cumplido){
        entrenamiento.setCumplido(cumplido);
    }

}
