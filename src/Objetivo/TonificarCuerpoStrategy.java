package Objetivo;

import Medicion.Medicion;
import Rutina.Rutina;

public class TonificarCuerpoStrategy extends ObjetivoStrategy {

    private Float masaMuscularIdeal;
    private Float porcentajeGrasaIdeal;
    private Rutina rutina;

    public TonificarCuerpoStrategy() {
        super();
        this.setNombre("Tonificar Cuerpo");
        this.masaMuscularIdeal = 0f;
        this.porcentajeGrasaIdeal = 0f;
        setDURACION_MIN(120);
        setDURACION_MAX(150);

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
