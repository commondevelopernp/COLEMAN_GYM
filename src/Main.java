import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Ejercicio.Ejercicio;
import Ejercicio.ExigenciaMuscular;
import Ejercicio.Musculo;
import Entrenamiento.Entrenamiento;
import Gym.Gym;
import Medicion.Medicion;
import Objetivo.BajarDePesoStrategy;
import Objetivo.MantenerPesoStrategy;
import Observer.NotificadorTrofeoConstancia;
import Observer.NotificadorTrofeoCreido;
import Observer.NotificadorTrofeoDedicacion;
import Observer.ObservadorPremio;
import Rutina.FactoryRutina;
import Rutina.Rutina;
import Trofeos.Trofeo;
import Users.Socio;

public class Main {
    public static void main(String[] args) {

        Gym COLEMAN_GYM = Gym.getInstance();
        // Creo el socio
        Socio socio = new Socio(20, "Masculino", "asd@asd.com", "1234");

        socio.setDiasEntrenamiento(4);

        // Logueo al socio
        System.out.println(socio.loguearse(socio.getEmail(), socio.getPassword() + "\n\n"));

        // Seteo estrategia
        Float pesoIdeal = 70.5f;

        /*****************************************************  METODOS QUE DEBE MANEJAR EL CONTROLADOR /***************************************************** */
        //***************************************************** /***************************************************** /*****************************************************
        
        MantenerPesoStrategy objetivo = new MantenerPesoStrategy(70.0f, 80.0f);

        Rutina rutina = FactoryRutina.crearRutina(objetivo.getNombre(), socio.getDiasEntrenamiento(), COLEMAN_GYM.getEjercicios());
        
        System.out.println(rutina.getEntrenamientos());
        objetivo.setRutina(rutina);

        

        socio.cambiarEstrategia(objetivo);
        System.out.println("Estrategia elegida: " + socio.getObjetivoPrincipal() + "\n\n");

        // Instancio los observadores
        ObservadorPremio observerCreido = new NotificadorTrofeoCreido(socio);
        ObservadorPremio observerConstancia = new NotificadorTrofeoConstancia(socio);
        ObservadorPremio observerDedicacion = new NotificadorTrofeoDedicacion(socio);

        // Seteo primer medicion

        Medicion medicion = new Medicion();

        medicion.attach(observerCreido);

        medicion.registrarMedicion(80f, 20f, 20f, 1.80f);
        socio.setMedicion(medicion);
        System.out.println("Primer medicion: " + socio.getMedicion() + "\n\n");
       
        // Seteo observadores al objetivo y a la rutina
        objetivo.attach(observerDedicacion);
        rutina.attach(observerConstancia);
       
        /***************************************************** PRUEBAS *****************************************************/

        // Seteo nueva medicion
        medicion.registrarMedicion(70.0f, 22f, 18f, 1.80f);
        socio.setMedicion(medicion);
        System.out.println("Segunda medicion: " + socio.getMedicion() + "\n\n");

        // Verifico objetivo
        objetivo.verificarObjetivo(medicion);
        System.out.println("El objetivo se ha cumplido ?: " + objetivo.getCumplido() + "\n\n");


        // Verificamos que la rutina se haya completado
        System.out.println("La rutina se ha cumplido ?: " + rutina.getCumplido() + "\n\n");
        for (Entrenamiento entrenamiento : rutina.getEntrenamientos()) {
            for (Ejercicio ejercicio : entrenamiento.getEjercicios()) {
                System.out.println(ejercicio.getNombre());
            }
            System.out.println("\n\n");

            entrenamiento.setCumplido(true);
        }
        rutina.verificarCumplido();
        System.out.println("La rutina se ha cumplido ?: " + rutina.getCumplido() + "\n\n");



        // // Seteo nueva medicion
        // medicion.registrarMedicion(65.0f, 23f, 16f, 1.80f);
        // socio.setMedicion(medicion);
        // System.out.println("Tercer medicion: " + socio.getMedicion() + "\n\n");

        // // Veo si se entrego el trofeo correctamente
        // for (Trofeo trofeo : socio.getTrofeos()) {
        //     System.out.println(trofeo.getNombre() + "\n" + trofeo.getDescripcion() + "\n\n");
        // }

        // // Verifico objetivo
        // System.out.println(rutina.getEntrenamientos());    

        // System.out.println("Rutina sin reforzar \n\n");
        // System.out.println("Reforzando rutina........\n\n");
        // rutina.reforzarRutinaSimple();
        // System.out.println("Rutina reforzada........\n\n");

        // Verifico trofeos

        for (Trofeo trofeo : socio.getTrofeos()) {
            System.out.println(trofeo.getNombre() + "\n" + trofeo.getDescripcion() + "\n\n");
        }

       
    }
}
