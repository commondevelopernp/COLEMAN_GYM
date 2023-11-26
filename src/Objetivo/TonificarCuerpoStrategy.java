package Objetivo;

import java.util.List;

import Ejercicio.Ejercicio;
import Medicion.Medicion;
import Rutina.Rutina;

public class TonificarCuerpoStrategy extends ObjetivoStrategy {

    private Float masaMuscularIdeal;
    private Float porcentajeGrasaIdeal;

    public TonificarCuerpoStrategy(Float masaMuscularIdeal, Float porcentajeGrasaIdeal) {
        super();
        this.setNombre("Tonificar");
        this.masaMuscularIdeal = masaMuscularIdeal;
        this.porcentajeGrasaIdeal = porcentajeGrasaIdeal;
    }

    @Override
    public void verificarObjetivo(Medicion medicion) {
        if (medicion.getMasaMuscular() >= this.getMasaMuscularIdeal() && medicion.getGrasaCorporal() <= this.getPorcentajeGrasaIdeal()) {
            setCumplido(true);
        } else {
            setCumplido(false);
        }
    }

    public void setMasaMuscularIdeal(Float masaMuscularIdeal) {
        this.masaMuscularIdeal = masaMuscularIdeal;
    }

    public Float getMasaMuscularIdeal() {
        return this.masaMuscularIdeal;
    }

    public void setPorcentajeGrasaIdeal(Float porcentajeGrasaIdeal) {
        this.porcentajeGrasaIdeal = porcentajeGrasaIdeal;
    }

    public Float getPorcentajeGrasaIdeal() {
        return this.porcentajeGrasaIdeal;
    }

    
}
