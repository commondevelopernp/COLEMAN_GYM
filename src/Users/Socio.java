package Users;

import Medicion.Medicion;
import java.util.ArrayList;
import java.util.List;

public class Socio extends Usuario {

    //private ObjetivoStrategy objetivoPrincipal;
    //private List<Trofeo> trofeos = new ArrayList<Trofeo>();
    private List<Medicion> mediciones = new ArrayList<Medicion>();

    public Socio (int edad, String sexoBiologico, String email, String password){
        super();
        this.edad = edad;
        this.sexoBiologico = sexoBiologico;
        this.email = email;
        this.password = password;
    }

    public List<Medicion> getMedicion(){
        return this.mediciones;
    }

    public void setMedicion(Medicion medicion){
        this.mediciones.add(medicion);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public String getSexoBiologico() {
        return this.sexoBiologico;
    }

}
