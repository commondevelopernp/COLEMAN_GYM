
package Rutina;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Ejercicio.Ejercicio;
import Ejercicio.ExigenciaMuscular;
import Entrenamiento.Entrenamiento;

public class RutinaMantener extends Rutina {

    private final int nivelAerobicoMIN = 2;
    private final int nivelAerobicoMAX = 4;
    private final int tiempoEntrenamientoMIN = 45;
    private final int tiempoEntrenamientoMAX = 80;
    private final ExigenciaMuscular exigenciaMuscularMax = ExigenciaMuscular.MEDIA;
    private final ExigenciaMuscular exigenciaMuscularMin = ExigenciaMuscular.BAJA;

    public RutinaMantener(int diasEntrenamiento, List<Ejercicio> ejercicios ) {
        super();
        setDiasEntrenamiento(diasEntrenamiento);
        setEjerciciosList(ejercicios);
        setEntrenamientos();
    }

    public void setEntrenamientos() {
        Set<String> ejerciciosUsados = new HashSet<>();


        for (int i = 0; i < this.diasEntrenamiento; i++) {
            List<Ejercicio> ejerciciosDelDia = agregarEjerciciosMantener(this.ejerciciosList, ejerciciosUsados);
            Entrenamiento entrenamiento = new Entrenamiento(ejerciciosDelDia, tiempoEntrenamientoMIN,
                    tiempoEntrenamientoMAX);

            this.entrenamientos.add(entrenamiento);

            // Actualizar el conjunto de nombres de ejercicios ya usados
            for (Ejercicio ejercicio : entrenamiento.getEjercicios()) {
                ejerciciosUsados.add(ejercicio.getNombre());
            }
        }


    }

    public List<Ejercicio> agregarEjerciciosMantener(List<Ejercicio> ejerciciosList, Set<String> ejerciciosUsados) {
        List<Ejercicio> ejerciciosMantener = new ArrayList<Ejercicio>();
        for (Ejercicio ejercicio : ejerciciosList) {
            if (!ejerciciosUsados.contains(ejercicio.getNombre()) && ejercicio.getNivelAerobico() >= nivelAerobicoMIN && ejercicio.getNivelAerobico() <= nivelAerobicoMAX
                    && (ejercicio.getExigenciaMuscular() == exigenciaMuscularMax
                            || ejercicio.getExigenciaMuscular() == exigenciaMuscularMin)) {
                ejerciciosMantener.add(ejercicio);
            }
        }
        return ejerciciosMantener;
    }

}