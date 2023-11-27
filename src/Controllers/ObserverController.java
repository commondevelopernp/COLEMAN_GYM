package Controllers;

import Medicion.Medicion;
import Objetivo.ObjetivoStrategy;
import Observer.NotificadorTrofeoConstancia;
import Observer.NotificadorTrofeoCreido;
import Observer.NotificadorTrofeoDedicacion;
import Rutina.Rutina;
import Users.Socio;

public class ObserverController {

    public ObserverController() {
    }

    public void crearNotificadorTrofeoCreido(Socio socio, Medicion medicion){
        NotificadorTrofeoCreido notificador = new NotificadorTrofeoCreido(socio);
        medicion.attach(notificador);
    }

    public void crearNotificadorTrofeoDedicacion(Socio socio, ObjetivoStrategy objetivo){
        NotificadorTrofeoDedicacion notificador = new NotificadorTrofeoDedicacion(socio);
        objetivo.attach(notificador);
    }

    public void crearNotificadorTrofeoConstancia(Socio socio, Rutina rutina){
        NotificadorTrofeoConstancia notificador = new NotificadorTrofeoConstancia(socio, rutina);
        rutina.attach(notificador);
    }

}
