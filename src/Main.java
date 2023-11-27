import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Controllers.*;
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


        // Creo los controladores
        GymController gymController = new GymController();
        SocioController socioController = new SocioController();
        RutinaController rutinaController = new RutinaController();
        MedicionController medicionController = new MedicionController();
        ObjetivoController objetivoController = new ObjetivoController();
        ObserverController observerController = new ObserverController();
        EntrenamientoController entrenamientoController = new EntrenamientoController();
        TrofeoController trofeoController = new TrofeoController();


        // Creo el gym
        Gym COLEMAN_GYM = gymController.crearGym();


        // Creo el socio
        Socio socio = socioController.crearSocio(20, "Masculino", "asd@asd.com", "1234");



        // Logueo al socio
        System.out.println(
                socioController.loguearse(socio) + "\n\n" + "Socio logueado: " + socio.getEmail() + "\n\n"
        );


        // Elijo los dias de entrenamiento
        socioController.setDiasEntrenamiento(socio, 4);




        /*****************************************************  METODOS QUE DEBE MANEJAR EL CONTROLADOR /***************************************************** */
        //***************************************************** /***************************************************** /*****************************************************


        // Seteo estrategia
        MantenerPesoStrategy objetivo = objetivoController.crearObjetivoMantener(80f, 90f);


        // Creo la rutina con el Factoryj
        Rutina rutina = rutinaController.crearRutina(socio, objetivo.getNombre(), socio.getDiasEntrenamiento(), COLEMAN_GYM.getEjercicios());

        // Seteo la rutina para la objetivo
        objetivoController.setRutina(objetivo, rutina);

        
        // Seteo estrategia
        socioController.cambiarEstrategia(socio, objetivo);
        System.out.println("Estrategia elegida: " + socio.getObjetivoPrincipal() + "\n\n");

        // Instancio medicion
        Medicion medicion = medicionController.crearMedicion(80f, 20f, 20f, 1.80f);

        // Instancio el observador medicion
        observerController.crearNotificadorTrofeoCreido(socio, medicion);




        socioController.setMedicion(socio, medicion);
        System.out.println("Primer medicion: " + socio.getMedicion() + "\n\n");
       

        /***************************************************** PRUEBAS *****************************************************/

        // Seteo nueva medicion
        medicionController.registrarMedicion(socio, medicion,70.0f, 22f, 18f, 1.80f);
        System.out.println("Segunda medicion: " + socio.getMedicion() + "\n\n");

        // Verifico objetivo
        objetivoController.verificarObjetivo(objetivo, medicion);
        System.out.println("El objetivo se ha cumplido ?: " + objetivo.getCumplido() + "\n\n");


        // Verificamos que la rutina se haya completado
        System.out.println("La rutina se ha cumplido ?: " + rutina.getCumplido() + "\n\n");
        for (Entrenamiento entrenamiento : rutinaController.getEntrenamientos(rutina)) {
            for (Ejercicio ejercicio : entrenamientoController.getEjercicios(entrenamiento)) {
                System.out.println(ejercicio.getNombre());
            }
            System.out.println("\n\n");

            entrenamientoController.setCumplido(entrenamiento, true);
        }

        if(rutinaController.getCumplido(rutina)){
            System.out.println("Se cumplio la rutina \n\n");
        } else {
            System.out.println("No se cumplio la rutina \n\n");
        }


        // Setear entrenamientos cumplidos para verificar que se obtenga el trofeo de rutina
        for (Entrenamiento entrenamiento : rutinaController.getEntrenamientos(rutina)) {
            entrenamientoController.setCumplido(entrenamiento, true);
        }

        // Verifico si se cumplio la rutina
        rutinaController.verificarCumplido(rutina);
        System.out.print("Verificando rutina........\n\n");

        if(rutinaController.getCumplido(rutina)){
            System.out.println("Se cumplio la rutina \n\n");
        } else {
            System.out.println("No se cumplio la rutina \n\n");
        }



        // Seteo nuevas mediciones para comprobar el trofeo creido
        medicionController.registrarMedicion(socio, medicion,70.0f, 22f, 18f, 1.80f);
        medicionController.registrarMedicion(socio, medicion,75.0f, 22.5f, 19f, 1.80f);
        medicionController.registrarMedicion(socio, medicion,75.0f, 22.5f, 19f, 1.80f);
        medicionController.registrarMedicion(socio, medicion,75.0f, 22.5f, 19f, 1.80f);
        medicionController.registrarMedicion(socio, medicion,75.0f, 22.5f, 19f, 1.80f);

        // Creamos una nueva estrategia
        BajarDePesoStrategy objetivoBajar = objetivoController.crearObjetivoBajarDePeso(69.0f);

        // Seteo la rutina para la objetivo
        objetivoController.setRutina(objetivoBajar, rutina);

        // Cambiamos la estrategia del socio
        socioController.cambiarEstrategia(socio, objetivoBajar);


        // Seteo nueva medicion
        medicionController.registrarMedicion(socio, medicion,75.0f, 22f, 18f, 1.80f);

        // Verifico objetivo
        objetivoController.verificarObjetivo(objetivoBajar, medicion);

        // Seteo nueva medicion
        medicionController.registrarMedicion(socio, medicion,67.0f, 22f, 18f, 1.80f);

        // Verifico objetivo
        objetivoController.verificarObjetivo(objetivoBajar, medicion);

        // Verifico trofeos

        for (Trofeo trofeo : socioController.getTrofeos(socio)) {
            System.out.println(trofeoController.getNombre(trofeo) + "\n" + trofeoController.getDescripcion(trofeo) + "\n\n");
        }




    }
}
