package Controllers;
import Gym.Gym;
import Medicion.Medicion;
import Objetivo.ObjetivoStrategy;
import Observer.NotificadorTrofeoDedicacion;
import Trofeos.Trofeo;
import Users.Socio;
import Users.Usuario;

import java.util.List;

public class SocioController {

        public SocioController() {
        }

        public Socio crearSocio(int edad, String sexoBiologico, String email, String password){
            Socio socio = new Socio(edad, sexoBiologico, email, password);

            Gym gym = Gym.getInstance();
            gym.setSocios(socio);

            return socio;
        }

        public String loguearse(Socio socio){
            return socio.loguearse(socio.getEmail(), socio.getPassword());
        }

        public void cambiarEstrategia(Socio socio, ObjetivoStrategy objetivo){
            socio.cambiarEstrategia(objetivo);
            NotificadorTrofeoDedicacion notificador = new NotificadorTrofeoDedicacion(socio);
            objetivo.attach(notificador);
        }

        public void setDiasEntrenamiento(Socio socio, int diasEntrenamiento){
            socio.setDiasEntrenamiento(diasEntrenamiento);
        }

        public void setMedicion(Socio socio, Medicion medicion) {
            socio.setMedicion(medicion);
        }

        public void updateSocio(Socio socio, int edad, String sexoBiologico, String email, String password){
            socio.setEdad(edad);
            socio.setSexoBiologico(sexoBiologico);
            socio.setEmail(email);
            socio.setPassword(password);
        }


        public List<Trofeo> getTrofeos(Socio socio){
            return socio.getTrofeos();
        }



}