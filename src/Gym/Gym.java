package Gym;

import Ejercicio.Ejercicio;
import Ejercicio.Musculo;
import Ejercicio.ExigenciaMuscular;
import Users.Socio;

import java.util.ArrayList;
import java.util.List;


public class Gym {
    private static Gym instance = null;

    private List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
    private List<Socio> socios = new ArrayList<>();

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        return instance;
    }

    private Gym() {
        // Crear ejercicios
        Ejercicio sentadillas = new Ejercicio("Sentadillas", Musculo.PIERNAS, 30.0, 4, 12, 3.0, 6, ExigenciaMuscular.ALTA);
        Ejercicio pressBanco = new Ejercicio("Press de Banca", Musculo.PECHO, 20.0, 3, 10, 70.0, 3, ExigenciaMuscular.MEDIA);
        Ejercicio dominadas = new Ejercicio("Dominadas", Musculo.ESPALDA, 20.0, 4, 8, 5.0, 5, ExigenciaMuscular.ALTA);
        Ejercicio curlBiceps = new Ejercicio("Curl de Bíceps", Musculo.BRAZOS, 20.0, 3, 15, 15.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio extensionTriceps = new Ejercicio("Extensión de Tríceps", Musculo.BRAZOS, 15.0, 4, 12, 10.0, 2, ExigenciaMuscular.MEDIA);
        Ejercicio elevacionLateral = new Ejercicio("Elevación Lateral", Musculo.HOMBROS, 25.0, 3, 15, 5.0, 4, ExigenciaMuscular.MEDIA);
        Ejercicio remoConBarra = new Ejercicio("Remo con Barra", Musculo.ESPALDA, 15.0, 4, 10, 50.0, 4, ExigenciaMuscular.ALTA);
        Ejercicio prensaPiernas = new Ejercicio("Prensa de Piernas", Musculo.PIERNAS, 30.0, 4, 10, 100.0, 5, ExigenciaMuscular.ALTA);
        Ejercicio fondosPecho = new Ejercicio("Fondos para Pecho", Musculo.PECHO, 25.0, 3, 10, 0.0, 4, ExigenciaMuscular.MEDIA);
        Ejercicio cinta = new Ejercicio("Cinta", Musculo.PIERNAS, 45.0, 1, 30, 1.0, 1, ExigenciaMuscular.BAJA);
        Ejercicio bicicleta = new Ejercicio("Bicicleta", Musculo.PIERNAS, 30.0, 1, 30, 4.0, 1, ExigenciaMuscular.BAJA);
        Ejercicio eliptico = new Ejercicio("Eliptico", Musculo.PIERNAS, 30.0, 1, 30, 4.0, 1, ExigenciaMuscular.BAJA);
        Ejercicio antebrazo = new Ejercicio("Antebrazo", Musculo.BRAZOS, 20.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio tricepPolea = new Ejercicio("Tríceps en Polea", Musculo.BRAZOS, 20.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio tricepConMancuerna = new Ejercicio("Tríceps con Mancuerna", Musculo.BRAZOS, 20.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio pechoConMancuerna = new Ejercicio("Pecho con Mancuerna", Musculo.PECHO, 20.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio pechoConBarra = new Ejercicio("Pecho con Barra", Musculo.PECHO, 20.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio pressBancaInclinado = new Ejercicio("Press de Banca Inclinado", Musculo.PECHO, 20.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio espinales = new Ejercicio("Espinales", Musculo.ESPALDA, 30.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio remoConMancuerna = new Ejercicio("Remo con Mancuerna", Musculo.ESPALDA, 30.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio remoInvertido = new Ejercicio("Remo Invertido", Musculo.ESPALDA, 30.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio pressMilitar = new Ejercicio("Press Militar", Musculo.HOMBROS, 25.0, 3, 12, 20.0, 3, ExigenciaMuscular.MEDIA);
        Ejercicio elevacionFrontal = new Ejercicio("Elevación Frontal", Musculo.HOMBROS, 15.0, 3, 15, 10.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio elevacionPosterior = new Ejercicio("Elevación Posterior", Musculo.HOMBROS, 15.0, 3, 15, 10.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio squadFrontal = new Ejercicio("Squad Frontal", Musculo.PIERNAS, 30.0, 3, 15, 4.0, 2, ExigenciaMuscular.MEDIA);
        Ejercicio squadTrasero = new Ejercicio("Squad Trasero", Musculo.PIERNAS, 30.0, 3, 15, 4.0, 2, ExigenciaMuscular.MEDIA);
        Ejercicio squadSumo = new Ejercicio("Squad Sumo", Musculo.PIERNAS, 30.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio squadPistola = new Ejercicio("Squad Pistola", Musculo.PIERNAS, 15.0, 3, 15, 4.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio squadBulgara = new Ejercicio("Squad Bulgara", Musculo.PIERNAS, 15.0, 3, 15, 4.0, 2, ExigenciaMuscular.MEDIA);
        Ejercicio squadConSalto = new Ejercicio("Squad con Salto", Musculo.PIERNAS, 15.0, 3, 15, 4.0, 5, ExigenciaMuscular.BAJA);
        Ejercicio fondoTriceps = new Ejercicio("Fondo Triceps", Musculo.BRAZOS, 20.0, 3, 15, 4.0, 3, ExigenciaMuscular.MEDIA);
        Ejercicio lunges = new Ejercicio("Lunges", Musculo.PIERNAS, 25.0, 4, 12, 0.0, 4, ExigenciaMuscular.MEDIA);
        Ejercicio jumpingJacks = new Ejercicio("Jumping Jacks", Musculo.PIERNAS, 15.0, 1, 30, 0.0, 6, ExigenciaMuscular.BAJA);
        Ejercicio pushUps = new Ejercicio("Push Ups", Musculo.PECHO, 20.0, 3, 10, 0.0, 5, ExigenciaMuscular.MEDIA);
        Ejercicio burpees = new Ejercicio("Burpees", Musculo.PIERNAS, 30.0, 3, 10, 0.0, 8, ExigenciaMuscular.ALTA);
        Ejercicio boxJumps = new Ejercicio("Box Jumps", Musculo.PIERNAS, 20.0, 4, 10, 0.0, 7, ExigenciaMuscular.ALTA);
        Ejercicio deadlift = new Ejercicio("Deadlift", Musculo.ESPALDA, 45.0, 4, 8, 60.0, 4, ExigenciaMuscular.ALTA);
        Ejercicio kettlebellSwing = new Ejercicio("Kettlebell Swing", Musculo.PIERNAS, 20.0, 3, 15, 16.0, 6, ExigenciaMuscular.MEDIA);
        Ejercicio stepUps = new Ejercicio("Step Ups", Musculo.PIERNAS, 25.0, 4, 12, 0.0, 5, ExigenciaMuscular.MEDIA);
        Ejercicio gobletSquat = new Ejercicio("Goblet Squat", Musculo.PIERNAS, 30.0, 4, 10, 12.0, 5, ExigenciaMuscular.MEDIA);
        Ejercicio dumbbellRow = new Ejercicio("Dumbbell Row", Musculo.ESPALDA, 20.0, 4, 10, 10.0, 4, ExigenciaMuscular.MEDIA);
        Ejercicio overheadPress = new Ejercicio("Overhead Press", Musculo.HOMBROS, 20.0, 3, 12, 10.0, 4, ExigenciaMuscular.MEDIA);
        Ejercicio benchPress = new Ejercicio("Bench Press", Musculo.PECHO, 30.0, 4, 8, 50.0, 4, ExigenciaMuscular.ALTA);
        Ejercicio latPulldown = new Ejercicio("Lat Pulldown", Musculo.ESPALDA, 25.0, 3, 12, 40.0, 4, ExigenciaMuscular.MEDIA);
        Ejercicio seatedRow = new Ejercicio("Seated Row", Musculo.ESPALDA, 20.0, 4, 10, 35.0, 4, ExigenciaMuscular.MEDIA);
        Ejercicio legPress = new Ejercicio("Leg Press", Musculo.PIERNAS, 30.0, 4, 10, 100.0, 5, ExigenciaMuscular.ALTA);
        Ejercicio calfRaises = new Ejercicio("Calf Raises", Musculo.PIERNAS, 20.0, 3, 15, 20.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio skullCrushers = new Ejercicio("Skull Crushers", Musculo.BRAZOS, 20.0, 3, 12, 10.0, 3, ExigenciaMuscular.MEDIA);
        Ejercicio barbellCurl = new Ejercicio("Barbell Curl", Musculo.BRAZOS, 20.0, 3, 10, 15.0, 3, ExigenciaMuscular.MEDIA);
        Ejercicio hammerCurl = new Ejercicio("Hammer Curl", Musculo.BRAZOS, 15.0, 3, 12, 10.0, 2, ExigenciaMuscular.BAJA);
        Ejercicio dips = new Ejercicio("Dips", Musculo.BRAZOS, 20.0, 4, 10, 0.0, 5, ExigenciaMuscular.MEDIA);
        Ejercicio pullUps = new Ejercicio("Pull Ups", Musculo.ESPALDA, 25.0, 3, 8, 0.0, 6, ExigenciaMuscular.ALTA);
        Ejercicio farmerWalk = new Ejercicio("Farmer Walk", Musculo.BRAZOS, 60.0, 2, 1, 20.0, 7, ExigenciaMuscular.ALTA);
        Ejercicio battleRopes = new Ejercicio("Battle Ropes", Musculo.BRAZOS, 30.0, 2, 20, 0.0, 7, ExigenciaMuscular.MEDIA);
        Ejercicio wallBall = new Ejercicio("Wall Ball", Musculo.PIERNAS, 20.0, 3, 15, 6.0, 6, ExigenciaMuscular.MEDIA);

        List <Ejercicio> ejerciciosList = new ArrayList<Ejercicio>();
        ejerciciosList.add(pressBanco);
        ejerciciosList.add(dominadas);
        ejerciciosList.add(curlBiceps);
        ejerciciosList.add(extensionTriceps);
        ejerciciosList.add(elevacionLateral);
        ejerciciosList.add(remoConBarra);
        ejerciciosList.add(prensaPiernas);
        ejerciciosList.add(fondosPecho);
        ejerciciosList.add(cinta);
        ejerciciosList.add(bicicleta);
        ejerciciosList.add(eliptico);
        ejerciciosList.add(antebrazo);
        ejerciciosList.add(tricepPolea);
        ejerciciosList.add(tricepConMancuerna);
        ejerciciosList.add(pechoConMancuerna);
        ejerciciosList.add(pechoConBarra);
        ejerciciosList.add(pressBancaInclinado);
        ejerciciosList.add(espinales);
        ejerciciosList.add(remoConMancuerna);
        ejerciciosList.add(remoInvertido);
        ejerciciosList.add(pressMilitar);
        ejerciciosList.add(elevacionFrontal);
        ejerciciosList.add(elevacionPosterior);
        ejerciciosList.add(squadFrontal);
        ejerciciosList.add(squadTrasero);
        ejerciciosList.add(squadSumo);
        ejerciciosList.add(squadPistola);
        ejerciciosList.add(squadBulgara);
        ejerciciosList.add(squadConSalto);
        ejerciciosList.add(fondoTriceps);
        ejerciciosList.add(lunges);
        ejerciciosList.add(jumpingJacks);
        ejerciciosList.add(pushUps);
        ejerciciosList.add(burpees);
        ejerciciosList.add(boxJumps);
        ejerciciosList.add(deadlift);
        ejerciciosList.add(kettlebellSwing);
        ejerciciosList.add(stepUps);
        ejerciciosList.add(gobletSquat);
        ejerciciosList.add(dumbbellRow);
        ejerciciosList.add(overheadPress);
        ejerciciosList.add(benchPress);
        ejerciciosList.add(latPulldown);
        ejerciciosList.add(seatedRow);
        ejerciciosList.add(legPress);
        ejerciciosList.add(calfRaises);
        ejerciciosList.add(skullCrushers);
        ejerciciosList.add(barbellCurl);
        ejerciciosList.add(hammerCurl);
        ejerciciosList.add(dips);
        ejerciciosList.add(pullUps);
        ejerciciosList.add(farmerWalk);
        ejerciciosList.add(battleRopes);
        ejerciciosList.add(sentadillas);
        ejerciciosList.add(wallBall);

        setEjercicios(ejerciciosList);
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setSocios(Socio socio) {
        this.socios.add(socio);
    }

    public List<Socio> getSocios() {
        return this.socios;
    }

    public void setEjercicios(List<Ejercicio> ejerciciosList) {
        this.ejercicios = ejerciciosList;
    }

}
