package Rutina;

import java.util.List;

import Entrenamiento.Entrenamiento;

public class Rutina {

    private List<Entrenamiento> entrenamientos;
    private Boolean cumplido;

    public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
    }

    public void setCumplido(Boolean cumplido) {
        this.cumplido = cumplido;
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public Boolean getCumplido() {
        return cumplido;
    }
    
}
