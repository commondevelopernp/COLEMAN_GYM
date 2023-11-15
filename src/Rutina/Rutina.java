package Rutina;

import java.util.List;

import Entrenamiento.Entrenamiento;
import Observer.Observado;

public class Rutina extends Observado{

    private String nombre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
