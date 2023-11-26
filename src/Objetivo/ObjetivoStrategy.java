package Objetivo;

import java.util.List;

import Ejercicio.Ejercicio;
import Medicion.Medicion;
import Observer.Observado;
import Rutina.Rutina;

public abstract class ObjetivoStrategy extends Observado{

    private final int MAX_NIVEL_EXIGENCIA = 3;
    private String nombre;
    private int nivelExigencia;
    private int nivelAerobico;
    private int duracionEntrenamiento;
    private Boolean cumplido;
    private Rutina rutina;


    public void setRutina(Rutina rutina){
        this.rutina = rutina;
    } 

    public int getNivelExigencia() {
        return nivelExigencia;
    }

    public int getDiasEntrenamiento(){
        return this.duracionEntrenamiento;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public int getDuracionEntrenamiento() {
        return duracionEntrenamiento;
    }

    public void setNivelExigencia(int nivelExigencia) {
        this.nivelExigencia = nivelExigencia;
    }

    public void setNivelAerobico(int nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public void setDuracionEntrenamiento(int duracionEntrenamiento) {
        this.duracionEntrenamiento = duracionEntrenamiento;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public abstract void verificarObjetivo(Medicion medicion);

    public void setCumplido(Boolean cumplido) {
        this.cumplido = cumplido;
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

    public int getMaxNivelExigencia() {
        return MAX_NIVEL_EXIGENCIA;
    }
}
