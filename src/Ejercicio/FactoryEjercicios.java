package Ejercicio;

import Ejercicio.Brazos.CurlBicepsMancuerna;
import Ejercicio.Brazos.CurlBicepsBarra;
import Ejercicio.Brazos.Flexiones;
import Ejercicio.Piernas.PesoMuerto;
import Ejercicio.Piernas.Sentadillas;
import Ejercicio.Piernas.Prensa;
import Objetivo.ObjetivoStrategy;

public class FactoryEjercicios {
    
    public static Ejercicio crearEjercicio(ObjetivoStrategy objetivo){
        Ejercicio ejercicio = null;
        switch(objetivo.getNombre()){
            case "Brazos":
                switch(objetivo.getNivelExigencia()){
                    case 1:
                        ejercicio = new CurlBicepsMancuerna();
                        break;
                    case 2:
                        ejercicio = new Flexiones();
                        break;
                    case 3:
                        ejercicio = new CurlBicepsBarra();
                        break;
                }
                break;
            case "Piernas":
                switch(objetivo.getMaxNivelExigencia()){
                    case 1:
                        ejercicio = new Sentadillas();
                        break;
                    case 2:
                        ejercicio = new Prensa();
                        break;
                    case 3:
                        ejercicio = new PesoMuerto();
                        break;
                }
                break;
            case "Pecho":
                break;
            case "Espalda":
                break;
            case "Hombros":
                break;

        }
        return ejercicio;
    }
}
