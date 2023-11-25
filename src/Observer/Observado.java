package Observer;

import java.util.ArrayList;
import java.util.List;

public class Observado {

    private List<ObservadorPremio> observadores = new ArrayList<ObservadorPremio>();
    
    public void attach(ObservadorPremio observador) {
        observadores.add(observador);
    }

    public void detach(ObservadorPremio observador) {
        observadores.remove(observador);
    }

    public void notifyObservers() {
        for (ObservadorPremio observador : observadores) {
            observador.update();
        }
    }
}
