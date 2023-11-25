package Rutina;

import Rutina.RutinaBajarPeso;
import Rutina.RutinaMantener;
import Rutina.RutinaTonificar;



public class FactoryRutina {

    public static Rutina crearRutina(String nombre, int diasEntrenamiento) {
        Rutina rutina = null;

        switch (nombre) {
            case ("BajarPeso"):
                rutina = new RutinaBajarPeso();
                break;
            case ("Tonificar"):
                rutina = new RutinaTonificar();
                break;
            case("Mantener"):
                rutina = new RutinaMantener();
        }

    }

}
