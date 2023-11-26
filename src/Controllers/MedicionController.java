package Controllers;

import Medicion.Medicion;

public class MedicionController {

    public MedicionController() {
    }

    public Medicion crearMedicion(Float peso, Float masaMuscular, Float grasaCorporal, Float altura) {
        Medicion medicion = new Medicion();
        medicion.registrarMedicion(peso, masaMuscular, grasaCorporal, altura);

        return medicion;
    }


}


