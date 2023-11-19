package Entrenamiento;

import java.util.List;
import java.util.ArrayList;

import Ejercicio.Ejercicio;

public class Entrenamiento {

    private List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
    private boolean cumplido;
    private int tiempoEntrenamiento = 0;

    public Entrenamiento(List<Ejercicio> ejerciciosList, int duracionMIN, int duracionMAX) {
        
        for (Ejercicio ejercicio : ejerciciosList) {
            if ((tiempoEntrenamiento + ejercicio.getTiempoEstimadoEjercicio() <= duracionMAX )) {
                this.ejercicios.add(ejercicio);
                tiempoEntrenamiento += ejercicio.getTiempoEstimadoEjercicio();
            } 
        }
        this.cumplido = false;
    }

    public void setEjercicios(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }

    public void setTiempoEntrenamiento(int tiempoEntrenamiento) {
        this.tiempoEntrenamiento = tiempoEntrenamiento;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public int getTiempoEntrenamiento() {
        return tiempoEntrenamiento;
    }

    public boolean getCumplido() {
        return cumplido;
    }

    public void setCumplido(boolean cumplido) {
        this.cumplido = cumplido;
    }

}
