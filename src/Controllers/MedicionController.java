package Controllers;

import Medicion.Medicion;
import Users.Socio;

public class MedicionController {

    public MedicionController() {
    }

    public Medicion crearMedicion(Float peso, Float masaMuscular, Float grasaCorporal, Float altura) {
        Medicion medicion = new Medicion();
        return medicion;
    }

    public void registrarMedicion(Socio socio, Medicion medicion, Float peso, Float masaMuscular, Float grasaCorporal, Float altura){
        medicion.registrarMedicion(peso, masaMuscular, grasaCorporal, altura);
        socio.setMedicion(medicion);
    }


}


