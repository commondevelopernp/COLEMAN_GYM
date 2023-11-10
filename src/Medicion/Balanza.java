package Medicion;

import Users.Socio;
public class Balanza {

    private final AdapterBalanza adapterBalanza = new BalanzaExterna();

    public void registrarMedicion(Socio socio, Float peso, Float masaMuscular, Float grasaCorporal, Float altura) {

        if (peso == null || masaMuscular == null || grasaCorporal == null || altura == null) {
            throw new RuntimeException("No se puede registrar una medicion con datos nulos");
        }

        Float pesoRegistrado = adapterBalanza.medirPeso(peso);
        Float masaMuscularRegistrada = adapterBalanza.medirMasaMuscular(masaMuscular);
        Float grasaCorporalRegistrado = adapterBalanza.medirGrasaCorporal(grasaCorporal);
        Float alturaRegistrada = adapterBalanza.medirAltura(altura);

        Medicion medicion = new Medicion(
                pesoRegistrado,
                masaMuscularRegistrada,
                grasaCorporalRegistrado,
                alturaRegistrada
        );

        socio.setMedicion(medicion);
    }


}
