package Observer;

import java.util.ArrayList;
import java.util.List;

public class Observado {

    private List<ObserverGeneral> observadores = new ArrayList<ObserverGeneral>();
    
    public void attach(ObservadorPremio observador) {
        observadores.add(observador);
    }

    public void detach(ObservadorPremio observador) {
        observadores.remove(observador);
    }

    public void notifyObservers() {
        for (ObserverGeneral observador : observadores) {
            observador.update();
        }
    }
}
