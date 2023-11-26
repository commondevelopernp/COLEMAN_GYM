package Controllers;
import Medicion.Medicion;
import Objetivo.ObjetivoStrategy;
import Users.Socio;
import Users.Usuario;

public class SocioController {

        public SocioController() {
        }

        public Socio crearSocio(int edad, String sexoBiologico, String email, String password){
            Socio socio = new Socio(edad, sexoBiologico, email, password);

            return socio;
        }

        public String loguearse(Socio socio){
            return socio.loguearse(socio.getEmail(), socio.getPassword());
        }

        public void cambiarEstrategia(Socio socio, ObjetivoStrategy objetivo){
            socio.cambiarEstrategia(objetivo);
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



}