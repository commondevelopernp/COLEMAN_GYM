package Objetivo;

import Medicion.Medicion;

public class BajarDePesoStrategy extends ObjetivoStrategy {

    private Float pesoIdeal;


    public BajarDePesoStrategy(Float pesoIdeal) {
        super();
        this.setNombre("Bajar de Peso");
        this.pesoIdeal = pesoIdeal;
        setDURACION_MIN(60);
        setDURACION_MAX(90);
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