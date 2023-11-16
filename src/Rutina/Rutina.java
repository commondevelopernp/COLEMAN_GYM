package Rutina;

import java.util.List;

import Entrenamiento.Entrenamiento;
import Objetivo.ObjetivoStrategy;
import Observer.Observado;
import Users.Socio;

public class Rutina extends Observado{

    private String nombre;
    private List<Entrenamiento> entrenamientos;
    private Boolean cumplido;
    private ObjetivoStrategy objetivo;

    public Rutina(String nombre, List<Entrenamiento> entrenamientos, ObjetivoStrategy objetivo) {
        this.nombre = nombre;
        this.entrenamientos = entrenamientos;
        this.cumplido = false;
        this.objetivo = objetivo;
    }

    public void setEntrenamientos(List<Entrenamiento> entrenamientos, ObjetivoStrategy objetivo) {
        Socio socio = objetivo.getSocio();

        List<String> dias = socio.getDiasEntrenamiento();

        

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
