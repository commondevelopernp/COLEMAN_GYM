package Rutina;

import java.util.List;

import Ejercicio.Ejercicio;

public class FactoryRutina {

    public static Rutina crearRutina(String nombre, int diasEntrenamiento, List<Ejercicio> ejercicios) {
        Rutina rutina = null;
        
        switch (nombre) {
            case ("BajarPeso"):
                rutina = new RutinaBajarPeso(diasEntrenamiento, ejercicios);
                break;
            case ("Tonificar"):
                rutina = new RutinaTonificar(diasEntrenamiento, ejercicios);
                break;
            case ("Mantener"):
                rutina = new RutinaMantener(diasEntrenamiento, ejercicios);
        }

        return rutina;

    }

}
