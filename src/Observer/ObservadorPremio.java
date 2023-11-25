package Observer;

import Users.Socio;

public abstract class ObservadorPremio implements ObserverGeneral {

    protected Socio socio;

    public abstract void update();
    public abstract void addAListaSocio();    
    

}
