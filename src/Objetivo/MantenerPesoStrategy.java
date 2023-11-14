package Objetivo;

import Medicion.Medicion;

public class MantenerPesoStrategy extends ObjetivoStrategy {

    private Float pesoMinimoIdeal;
    private Float pesoMaximoIdeal;

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
