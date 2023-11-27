package Observer;

import Rutina.Rutina;
import Trofeos.Trofeo;
import Users.Socio;

public class NotificadorTrofeoConstancia extends ObservadorPremio{

    private Rutina rutina;

    public NotificadorTrofeoConstancia(Socio socio, Rutina rutina) {
        super();
        this.socio = socio;
        this.rutina = rutina;
    }

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
            "Se otorga a los socios que cumplen a la perfeccion la rutina"
        );

        this.socio.setTrofeos(trofeo);
    };
    
}
