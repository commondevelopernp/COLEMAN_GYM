package Objetivo;

import Medicion.Medicion;
import Observer.Observado;
import Rutina.Rutina;
import Users.Socio;

public abstract class ObjetivoStrategy extends Observado{

    private String nombre;
    private int nivelExigencia;
    private int nivelAerobico;
    private String duracionEntrenamiento;
    private Rutina rutina;
    private Boolean cumplido;
    private Socio socio; // No creo necesario este atributo

    public int getNivelExigencia() {
        return nivelExigencia;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public String getDuracionEntrenamiento() {
        return duracionEntrenamiento;
    }

    public void setNivelExigencia(int nivelExigencia) {
        this.nivelExigencia = nivelExigencia;
    }

    public void setNivelAerobico(int nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public void setDuracionEntrenamiento(String duracionEntrenamiento) {
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

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}
