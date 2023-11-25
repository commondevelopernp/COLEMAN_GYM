package Objetivo;

import Medicion.Medicion;
import Observer.Observado;
import Rutina.Rutina;


public abstract class ObjetivoStrategy extends Observado{

    private final int MAX_NIVEL_EXIGENCIA = 3;
    private String nombre;
    private int nivelExigencia;
    private int nivelAerobico;
    private int duracionEntrenamiento;
    private Rutina rutina;
    private Boolean cumplido;
    private int DURACION_MIN;
    private int DURACION_MAX;

    public ObjetivoStrategy(){
        this.rutina = new Rutina();
    }

    public int getNivelExigencia() {
        return nivelExigencia;
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

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
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

    public void setDURACION_MIN(int DURACION_MIN) {
        this.DURACION_MIN = DURACION_MIN;
    }

    public int getDURACION_MIN() {
        return DURACION_MIN;
    }

    public void setDURACION_MAX(int DURACION_MAX) {
        this.DURACION_MAX = DURACION_MAX;
    }

    public int getDURACION_MAX() {
        return DURACION_MAX;
    }


}
