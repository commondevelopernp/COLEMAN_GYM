package Controllers;

import Objetivo.BajarDePesoStrategy;
import Objetivo.MantenerPesoStrategy;
import Objetivo.ObjetivoStrategy;
import Objetivo.TonificarCuerpoStrategy;
import Rutina.Rutina;

public class ObjetivoController {

    public ObjetivoController() {
    }

    public BajarDePesoStrategy crearObjetivoBajarDePeso(Float pesoIdeal) {
        BajarDePesoStrategy objetivo = new BajarDePesoStrategy(pesoIdeal);
        return objetivo;
    }

    public MantenerPesoStrategy crearObjetivoMantener(Float pesoMinimoIdeal, Float pesoMaximoIdeal) {
        MantenerPesoStrategy objetivo = new MantenerPesoStrategy(pesoMinimoIdeal, pesoMaximoIdeal);
        return objetivo;
    }

    public TonificarCuerpoStrategy crearObjetivoTonificar(Float masaMuscularIdeal, Float porcentajeGrasaIdeal) {
        TonificarCuerpoStrategy objetivo = new TonificarCuerpoStrategy(masaMuscularIdeal, porcentajeGrasaIdeal);
        return objetivo;
    }

    public void setRutina (ObjetivoStrategy objetivo, Rutina rutina){
        objetivo.setRutina(rutina);
    }



}
