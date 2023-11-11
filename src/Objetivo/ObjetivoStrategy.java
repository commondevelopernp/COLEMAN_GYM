package Objetivo;

public abstract class ObjetivoStrategy {

    private int nivelExigencia;
    private int nivelAerobico;
    private String duracionEntrenamiento;
    
    public abstract void update();

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
}
