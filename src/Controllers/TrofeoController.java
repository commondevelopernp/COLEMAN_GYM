package Controllers;

import Trofeos.Trofeo;

public class TrofeoController {

    public TrofeoController() {
    }

    public String getNombre(Trofeo trofeo){
        return trofeo.getNombre();
    }

    public String getDescripcion(Trofeo trofeo){
        return trofeo.getDescripcion();
    }

}
