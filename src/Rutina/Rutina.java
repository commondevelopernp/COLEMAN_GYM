package Rutina;

import java.util.ArrayList;
import java.util.List;
import Ejercicio.Ejercicio;
import Entrenamiento.Entrenamiento;
import Observer.Observado;


public abstract class  Rutina extends Observado{

    protected List<Entrenamiento> entrenamientos = new ArrayList<>();
    protected Boolean cumplido = false;
    protected static int duracion = 4;
    protected int diasEntrenamiento;
    protected List<Ejercicio> ejerciciosList;


    public abstract void setEntrenamientos();
    
    public void setEjerciciosList(List<Ejercicio> ejerciciosList) {
        this.ejerciciosList = ejerciciosList;
    }

    public List<Ejercicio> getEjerciciosList() {
        return ejerciciosList;
    }

    public int getDiasEntrenamiento() {
        return diasEntrenamiento;
    }

    public void setDiasEntrenamiento(int diasEntrenamiento) {
        this.diasEntrenamiento = diasEntrenamiento;
    }

    public void reforzarRutinaSimple(){
        for (Entrenamiento entrenamiento : this.entrenamientos) {
            for(Ejercicio ejercicio : entrenamiento.getEjercicios()){
                ejercicio.setRepeticiones(ejercicio.getRepeticiones() + 1);
                ejercicio.setPesoAsignado(ejercicio.getPesoAsignado() * 1.2);
                ejercicio.setSeries(ejercicio.getSeries() + 1);
            }
        }
    };

    public void reforzarRutinaIntenso(){
        for (Entrenamiento entrenamiento : this.entrenamientos) {
            for(Ejercicio ejercicio : entrenamiento.getEjercicios()){
                ejercicio.setRepeticiones(ejercicio.getRepeticiones() + 3);
                ejercicio.setPesoAsignado(ejercicio.getPesoAsignado() * 1.4);
                ejercicio.setSeries(ejercicio.getSeries() + 3);
            }
        }
    };

   
    public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
    }

    public void verificarCumplido() {
        int countEntrenamientos = entrenamientos.size();
        for (Entrenamiento entrenamiento : entrenamientos) {
            if (entrenamiento.getCumplido()) {
                countEntrenamientos--;
            }
        }
        if (countEntrenamientos == 0) {
            this.setCumplido(true);
        }
        notifyObservers();
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

    public int getDuracion() {
        return duracion;
    }    
}
