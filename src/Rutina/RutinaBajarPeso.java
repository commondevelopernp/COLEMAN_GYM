package Rutina;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Ejercicio.Ejercicio;
import Entrenamiento.Entrenamiento;

public class RutinaBajarPeso extends Rutina {


    private final int nivelAerobicoMIN = 3;
    private final int tiempoEntrenamientoMIN = 60;
    private final int tiempoEntrenamientoMAX = 90;

    public RutinaBajarPeso(int diasEntrenamiento, List<Ejercicio> ejercicios) {
        super();
        setDiasEntrenamiento(diasEntrenamiento);
        setEjerciciosList(ejercicios);
        setEntrenamientos();
    }

    public void setEntrenamientos() {
        Set<String> ejerciciosUsados = new HashSet<>();


        for (int i = 0; i < this.diasEntrenamiento; i++) {
            List<Ejercicio> ejerciciosDelDia = agregarEjerciciosBajarPeso(this.ejerciciosList, ejerciciosUsados);
            Entrenamiento entrenamiento = new Entrenamiento(ejerciciosDelDia, tiempoEntrenamientoMIN,
                    tiempoEntrenamientoMAX);

            this.entrenamientos.add(entrenamiento);

            // Actualizar el conjunto de nombres de ejercicios ya usados
            for (Ejercicio ejercicio : entrenamiento.getEjercicios()) {
                ejerciciosUsados.add(ejercicio.getNombre());
            }

        }
    }
    public List<Ejercicio> agregarEjerciciosBajarPeso(List<Ejercicio> ejerciciosList, Set<String> ejerciciosUsados) {
        List<Ejercicio> ejerciciosBajarPeso = new ArrayList<Ejercicio>();
        for (Ejercicio ejercicio : ejerciciosList) {

            if (!ejerciciosUsados.contains(ejercicio.getNombre()) && ejercicio.getNivelAerobico() >= nivelAerobicoMIN) {
                ejerciciosBajarPeso.add(ejercicio);
            }
        }
        return ejerciciosBajarPeso;
    }
}
