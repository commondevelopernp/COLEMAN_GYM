package Rutina;

import java.util.List;

import Ejercicio.Ejercicio;
import Entrenamiento.Entrenamiento;
import Observer.Observado;
import Observer.ObserverGeneral;

public class Rutina extends Observado implements ObserverGeneral{

    protected List<Entrenamiento> entrenamientos;
    protected Boolean cumplido;
    protected static int duracion = 4;

    public Rutina(){};

    public Rutina(List<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
        this.cumplido = false;
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

    @Override
    public void update() {
        setEntrenamientos(entrenamientos);
    }


    
}
