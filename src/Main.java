import java.util.ArrayList;
import java.util.List;

import Ejercicio.Ejercicio;
import Ejercicio.ExigenciaMuscular;
import Ejercicio.Musculo;
import Entrenamiento.Entrenamiento;
import Medicion.Medicion;
import Objetivo.BajarDePesoStrategy;
import Observer.NotificadorTrofeoConstancia;
import Observer.NotificadorTrofeoCreido;
import Observer.NotificadorTrofeoDedicacion;
import Observer.ObservadorPremio;
import Rutina.Rutina;
import Trofeos.Trofeo;
import Users.Socio;

public class Main {
    public static void main(String[] args) {

        // Creo el socio
        Socio socio = new Socio(20, "Masculino", "asd@asd.com", "1234");

        // Logueo al socio
        System.out.println(
                socio.loguearse(socio.getEmail(), socio.getPassword() + "\n\n"));

        // Crear ejercicios
        Ejercicio sentadillas = new Ejercicio("Sentadillas", Musculo.PIERNAS, 30.0, 4, 12, 3.0, 6,
                ExigenciaMuscular.ALTA);
        Ejercicio pressBanco = new Ejercicio("Press de Banca", Musculo.PECHO, 20.0, 3, 10, 70.0, 3,
                ExigenciaMuscular.MEDIA);
        Ejercicio dominadas = new Ejercicio("Dominadas", Musculo.ESPALDA, 20.0, 4, 8, 5.0, 5, ExigenciaMuscular.ALTA);
        Ejercicio curlBiceps = new Ejercicio("Curl de Bíceps", Musculo.BRAZOS, 20.0, 3, 15, 15.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio extensionTriceps = new Ejercicio("Extensión de Tríceps", Musculo.BRAZOS, 15.0, 4, 12, 10.0, 2,
                ExigenciaMuscular.MEDIA);
        Ejercicio elevacionLateral = new Ejercicio("Elevación Lateral", Musculo.HOMBROS, 25.0, 3, 15, 5.0, 4,
                ExigenciaMuscular.MEDIA);
        Ejercicio remoConBarra = new Ejercicio("Remo con Barra", Musculo.ESPALDA, 15.0, 4, 10, 50.0, 4,
                ExigenciaMuscular.ALTA);
        Ejercicio prensaPiernas = new Ejercicio("Prensa de Piernas", Musculo.PIERNAS, 30.0, 4, 10, 100.0, 5,
                ExigenciaMuscular.ALTA);
        Ejercicio fondosPecho = new Ejercicio("Fondos para Pecho", Musculo.PECHO, 25.0, 3, 10, 0.0, 4,
                ExigenciaMuscular.MEDIA);
        Ejercicio cinta = new Ejercicio("Cinta", Musculo.PIERNAS, 45.0, 1, 30, 1.0, 1, ExigenciaMuscular.BAJA);
        Ejercicio bicicleta = new Ejercicio("Bicicleta", Musculo.PIERNAS, 30.0, 1, 30, 4.0, 1,
                ExigenciaMuscular.BAJA);
        Ejercicio eliptico = new Ejercicio("Eliptico", Musculo.PIERNAS, 30.0, 1, 30, 4.0, 1, ExigenciaMuscular.BAJA);
        Ejercicio antebrazo = new Ejercicio("Antebrazo", Musculo.BRAZOS, 20.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio tricepPolea = new Ejercicio("Tríceps en Polea", Musculo.BRAZOS, 20.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio tricepConMancuerna = new Ejercicio("Tríceps con Mancuerna", Musculo.BRAZOS, 20.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio pechoConMancuerna = new Ejercicio("Pecho con Mancuerna", Musculo.PECHO, 20.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio pechoConBarra = new Ejercicio("Pecho con Barra", Musculo.PECHO, 20.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio pressBancaInclinado = new Ejercicio("Press de Banca Inclinado", Musculo.PECHO, 20.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        // Crear ejercicios de Espalda
        Ejercicio espinales = new Ejercicio("Espinales", Musculo.ESPALDA, 30.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio remoConMancuerna = new Ejercicio("Remo con Mancuerna", Musculo.ESPALDA, 30.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        Ejercicio remoInvertido = new Ejercicio("Remo Invertido", Musculo.ESPALDA, 30.0, 3, 15, 4.0, 2,
                ExigenciaMuscular.BAJA);
        // Crear ejercicios de Hombros
        Ejercicio pressMilitar = new Ejercicio("Press Militar", Musculo.HOMBROS, 25.0, 3, 12, 20.0, 3, ExigenciaMuscular.MEDIA);
        Ejercicio elevacionFrontal = new Ejercicio("Elevación Frontal", Musculo.HOMBROS, 15.0, 3, 15, 10.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio elevacionPosterior = new Ejercicio("Elevación Posterior", Musculo.HOMBROS, 15.0, 3, 15, 10.0, 2, ExigenciaMuscular.BAJA);

        // Seteo primer medicion
        Medicion medicion = new Medicion();

        // Instancio el observador del trofeo creido
        ObservadorPremio observerCreido = new NotificadorTrofeoCreido(socio);

        medicion.attach(observerCreido);

        medicion.registrarMedicion(80f, 20f, 20f, 1.80f);
        socio.setMedicion(medicion);
        System.out.println("Primer medicion: " + socio.getMedicion() + "\n\n");

        // Seteo estrategia
        Float pesoIdeal = 70.5f;
        BajarDePesoStrategy objetivo = new BajarDePesoStrategy(pesoIdeal);

        // Creo una lista de ejercicios para el entrenamiento
        List<Ejercicio> ejercicioBrazo = new ArrayList<Ejercicio>();
        ejercicioBrazo.add(curlBiceps);
        ejercicioBrazo.add(extensionTriceps);
        ejercicioBrazo.add(antebrazo);
        ejercicioBrazo.add(tricepPolea);
        ejercicioBrazo.add(tricepConMancuerna);

        List<Ejercicio> ejercicioPierna = new ArrayList<Ejercicio>();
        ejercicioPierna.add(sentadillas);
        ejercicioPierna.add(prensaPiernas);
        ejercicioPierna.add(cinta);
        ejercicioPierna.add(bicicleta);
        ejercicioPierna.add(eliptico);

        List<Ejercicio> ejercicioPecho = new ArrayList<Ejercicio>();
        ejercicioPecho.add(pressBanco);
        ejercicioPecho.add(fondosPecho);
        ejercicioPecho.add(pechoConMancuerna);
        ejercicioPecho.add(pechoConBarra);
        ejercicioPecho.add(pressBancaInclinado);

        List <Ejercicio> ejercicioEspalda = new ArrayList<Ejercicio>();
        ejercicioEspalda.add(dominadas);
        ejercicioEspalda.add(remoConBarra);
        ejercicioEspalda.add(espinales);
        ejercicioEspalda.add(remoConMancuerna);
        ejercicioEspalda.add(remoInvertido);
       
        List <Ejercicio> ejercicioHombro = new ArrayList<Ejercicio>();
        ejercicioHombro.add(elevacionLateral);
        ejercicioHombro.add(pressMilitar);
        ejercicioHombro.add(elevacionFrontal);
        ejercicioHombro.add(elevacionPosterior);

        // Entrenamiento
        int duracionMAX = objetivo.getDURACION_MAX();
        int duracionMIN = objetivo.getDURACION_MIN();
        Entrenamiento entrenamientoLunes = new Entrenamiento(ejercicioBrazo, duracionMIN, duracionMAX);
        Entrenamiento entrenamientoMartes = new Entrenamiento(ejercicioPierna, duracionMIN, duracionMAX);
        Entrenamiento entrenamientoMiercoles = new Entrenamiento(ejercicioEspalda, duracionMIN, duracionMAX);
        Entrenamiento entrenamientoJueves = new Entrenamiento(ejercicioEspalda, duracionMIN, duracionMAX);
        Entrenamiento entrenamientoViernes = new Entrenamiento(ejercicioPecho, duracionMIN, duracionMAX);

       
        // Creo la rutina
         List <Entrenamiento> entrenamientos = new ArrayList<Entrenamiento>();
                entrenamientos.add(entrenamientoLunes);
                entrenamientos.add(entrenamientoMartes);
                entrenamientos.add(entrenamientoMiercoles);
                entrenamientos.add(entrenamientoJueves);
                entrenamientos.add(entrenamientoViernes);

        Rutina rutina = new Rutina(entrenamientos);     

        // Seteo la rutina al objetivo
        objetivo.setRutina(rutina);


        // Rutina rutina = new Rutina();
        // rutina.setEntrenamientos(null);
        // objetivo.setRutina(null);

        socio.cambiarEstrategia(objetivo);
        // System.out.println("Estrategia elegida: " + socio.getObjetivoPrincipal() + "\n\n");

        // Instancio los observadores
        ObservadorPremio observerConstancia = new NotificadorTrofeoConstancia(socio);
        ObservadorPremio observerDedicacion = new NotificadorTrofeoDedicacion(socio);

        // Seteo observadores al objetivo y a la rutina
        objetivo.attach(observerDedicacion);
        rutina.attach(observerConstancia);

        // Seteo nueva medicion
        medicion.registrarMedicion(70.0f, 22f, 18f, 1.80f);
        socio.setMedicion(medicion);
        System.out.println("Segunda medicion: " + socio.getMedicion() + "\n\n");

        // Verifico objetivo
        objetivo.verificarObjetivo(medicion);
        System.out.println("El objetivo se ha cumplido ?: " + objetivo.getCumplido() + "\n\n");

        // Verifico rutina
        entrenamientoLunes.setCumplido(true);
        entrenamientoMartes.setCumplido(true);
        entrenamientoMiercoles.setCumplido(true);
        entrenamientoJueves.setCumplido(true);

        // Verificamos que la rutina se haya completado
        rutina.verificarCumplido();
        System.out.println("La rutina se ha cumplido ?: " + rutina.getCumplido() + "\n\n");

        entrenamientoViernes.setCumplido(true);

        // Verificamos que la rutina se haya completado
        rutina.verificarCumplido();
        System.out.println("La rutina se ha cumplido ?: " + rutina.getCumplido() + "\n\n");


        // Seteo nueva medicion
        medicion.registrarMedicion(65.0f, 23f, 16f, 1.80f);
        socio.setMedicion(medicion);
        System.out.println("Tercer medicion: " + socio.getMedicion() + "\n\n");

        // Veo si se entrego el trofeo correctamente
        for (Trofeo trofeo : socio.getTrofeos()) {
            System.out.println(trofeo.getNombre() + "\n" + trofeo.getDescripcion() + "\n\n");
        }

        System.out.println("Rutina sin reforzar \n\n");
        System.out.println("Reforzando rutina........\n\n");
        rutina.reforzarRutinaSimple();
        System.out.println("Rutina reforzada........\n\n");
       
    }
}
