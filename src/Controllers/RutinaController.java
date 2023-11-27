package Controllers;

import Ejercicio.Ejercicio;
import Entrenamiento.Entrenamiento;
import Observer.NotificadorTrofeoConstancia;
import Rutina.FactoryRutina;
import Rutina.Rutina;
import Users.Socio;

import java.util.List;

public class RutinaController {

    public RutinaController() {
    }

    public Rutina crearRutina(Socio socio, String nombreObjetivo, int diasEntrenamiento, List<Ejercicio> ejercicios){

        Rutina rutina = FactoryRutina.crearRutina(nombreObjetivo, diasEntrenamiento, ejercicios);

        NotificadorTrofeoConstancia notificador = new NotificadorTrofeoConstancia(socio, rutina);
        rutina.attach(notificador);

        return rutina;
    }

    public List<Entrenamiento> getEntrenamientos(Rutina rutina){
        return rutina.getEntrenamientos();
    }

    public boolean getCumplido(Rutina rutina){
        return rutina.getCumplido();
    }

    public void verificarCumplido(Rutina rutina){
        rutina.verificarCumplido();
    }

    public void setCumplido(Rutina rutina, boolean cumplido){
        rutina.setCumplido(cumplido);
    }

}
