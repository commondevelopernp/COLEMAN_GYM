package Objetivo;

import Medicion.Medicion;

public class MantenerPesoStrategy extends ObjetivoStrategy {

    private Float pesoMinimoIdeal;
    private Float pesoMaximoIdeal;

    public MantenerPesoStrategy(Float pesoMinimoIdeal, Float pesoMaximoIdeal) {
        super();
        this.setNombre("Mantener Peso");
        this.pesoMinimoIdeal = pesoMinimoIdeal;
        this.pesoMaximoIdeal = pesoMaximoIdeal;
        setDURACION_MIN(45);
        setDURACION_MAX(80);
    }

    @Override
    public void verificarObjetivo(Medicion medicion) {
        if (medicion.getPeso() >= this.getPesoMinimoIdeal() && medicion.getPeso() <= this.getPesoMaximoIdeal()) {
            setCumplido(true);
        } else {
            setCumplido(false);
        }
    }

    public void setPesoMinimoIdeal(Float pesoMinimoIdeal) {
        this.pesoMinimoIdeal = pesoMinimoIdeal;
    }

    public Float getPesoMinimoIdeal() {
        return this.pesoMinimoIdeal;
    }

    public void setPesoMaximoIdeal(Float pesoMaximoIdeal) {
        this.pesoMaximoIdeal = pesoMaximoIdeal;
    }

    public Float getPesoMaximoIdeal() {
        return this.pesoMaximoIdeal;
    }
    
}
