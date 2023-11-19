package Observer;

import Objetivo.ObjetivoStrategy;
import Trofeos.Trofeo;
import Users.Socio;

public class NotificadorTrofeoDedicacion extends ObservadorPremio{

    private ObjetivoStrategy objetivo;

    public NotificadorTrofeoDedicacion(Socio socio) {
        super();
        this.socio = socio;
        this.objetivo = socio.getObjetivoPrincipal();
    }

    @Override
    public void update(){
        if (objetivo.getCumplido()){
            this.addAListaSocio();
        }
    };

    @Override
    public void addAListaSocio(){

        Trofeo trofeo = new Trofeo(
            "Dedicacion", 
            "Se otorga a los socios que cumplen el objetivo" + " " + "Has cumplido el objetivo: " + objetivo.getNombre()
        );

        this.socio.setTrofeos(trofeo);
    };

    public void setObjetivo(ObjetivoStrategy objetivo) {
        this.objetivo = objetivo;
    }

    public ObjetivoStrategy getObjetivo() {
        return this.objetivo;
    }
    
}
