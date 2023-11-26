package Rutina;

import java.util.ArrayList;
import java.util.List;

import Ejercicio.Ejercicio;
import Ejercicio.ExigenciaMuscular;
import Entrenamiento.Entrenamiento;

public  class RutinaTonificar  extends Rutina{

    private final int nivelAerobicoMax = 4; 
    private final ExigenciaMuscular exigenciaMuscular = ExigenciaMuscular.ALTA;
    private final int tiempoEntrenamientoMIN = 60;
    private final int tiempoEntrenamientoMAX = 90;


    public RutinaTonificar(int diasEntrenamiento, List<Ejercicio> ejercicios) {
        super();
        setDiasEntrenamiento(diasEntrenamiento);
        setEjerciciosList(ejercicios);
        setEntrenamientos();
    }

    public void setEntrenamientos(){

        List<Ejercicio> ejerciciosDelDia = agregarEjerciciosTonificadores(this.ejerciciosList);
        for (int i = 0; i < this.diasEntrenamiento; i++) {
            Entrenamiento entrenamiento = new Entrenamiento(ejerciciosDelDia, tiempoEntrenamientoMIN, tiempoEntrenamientoMAX);

            this.entrenamientos.add(entrenamiento);
        }
    }


    public List<Ejercicio> agregarEjerciciosTonificadores(List<Ejercicio> ejerciciosList){
        List<Ejercicio> ejerciciosTonificadores = new ArrayList<Ejercicio>();
        for (Ejercicio ejercicio : ejerciciosList) {
            if (ejercicio.getExigenciaMuscular() == exigenciaMuscular && ejercicio.getNivelAerobico() <= nivelAerobicoMax) {
                ejerciciosTonificadores.add(ejercicio);
            }
        }
        return ejerciciosTonificadores;
    }

}