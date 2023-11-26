package Objetivo;

import Medicion.Medicion;

public class BajarDePesoStrategy extends ObjetivoStrategy {

    private Float pesoIdeal;

    public BajarDePesoStrategy(Float pesoIdeal) {
        super();
        this.setNombre("BajarPeso");
        this.pesoIdeal = pesoIdeal;
    }

    @Override
    public void verificarObjetivo(Medicion medicion) {
        if (medicion.getPeso() <= this.getPesoIdeal()) {
            setCumplido(true);
            notifyObservers();
        } else {
            setCumplido(false);
        }
    }

    public void setPesoIdeal(Float pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public Float getPesoIdeal() {
        return this.pesoIdeal;
    }
 
    
}