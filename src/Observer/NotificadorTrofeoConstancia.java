package Observer;

import Rutina.Rutina;
import Trofeos.Trofeo;

public class NotificadorTrofeoConstancia extends ObservadorPremio{

    private Rutina rutina;

    @Override
    public void update(){

        if (rutina.getCumplido()){
            this.addAListaSocio();
        }

    };

    @Override
    public void addAListaSocio(){

        Trofeo trofeo = new Trofeo(
            "Constancia", 
            "Se otorga a los socios que cumplen a la perfeccion la rutina" + " " + "Rutina: " + rutina.getNombre()
        );

        this.socio.setTrofeos(trofeo);
    };
    
}
