package Controllers;

import Ejercicio.Ejercicio;
import Gym.Gym;
import Users.Socio;

import java.util.List;

public class GymController {

    public GymController() {
    }

    public Gym crearGym(){
        Gym gym = Gym.getInstance();

        return gym;
    }

    public List<Socio> getAllSocios(){
        Gym gym = Gym.getInstance();
        return gym.getSocios();
    }

    public List<Ejercicio> getAllEjercicios(){
        Gym gym = Gym.getInstance();
        return gym.getEjercicios();
    }


}
