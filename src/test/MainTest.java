import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Controllers.*;
import Ejercicio.Ejercicio;
import Gym.Gym;
import Medicion.Medicion;
import Objetivo.BajarDePesoStrategy;
import Objetivo.MantenerPesoStrategy;
import Rutina.Rutina;
import Users.Socio;

class MainTest {
    
    private GymController gymController;
    private SocioController socioController;
    private RutinaController rutinaController;
    private MedicionController medicionController;
    private ObjetivoController objetivoController;
    private ObserverController observerController;
    private EntrenamientoController entrenamientoController;
    private TrofeoController trofeoController;

    private Gym COLEMAN_GYM;
    private Socio socio;

    @BeforeEach
    void setUp() {
        // Inicializo controladores
        gymController = new GymController();
        socioController = new SocioController();
        rutinaController = new RutinaController();
        medicionController = new MedicionController();
        objetivoController = new ObjetivoController();
        observerController = new ObserverController();
        entrenamientoController = new EntrenamientoController();
        trofeoController = new TrofeoController();

        // Creo un gimnasio y un socio
        COLEMAN_GYM = gymController.crearGym();
        socio = socioController.crearSocio(20, "Masculino", "asd@asd.com", "1234");
    }

    @Test
    void testSocioLogin() {
        String loginResult = socioController.loguearse(socio);
        assertEquals("Socio logueado: asd@asd.com", loginResult, "Error en el login del socio");
    }

    @Test
    void testObjetivoMantenerPeso() {
        // Creo y establezco un objetivo de mantenimiento de peso
        MantenerPesoStrategy objetivo = objetivoController.crearObjetivoMantener(80f, 90f);
        socioController.cambiarEstrategia(socio, objetivo);

        assertEquals("MantenerPeso", socio.getObjetivoPrincipal().getNombre(), "El objetivo debería ser Mantener Peso");
    }

    @Test
    void testCrearRutinaYVerificarCumplimiento() {
        // Configuro la rutina para el socio
        MantenerPesoStrategy objetivo = objetivoController.crearObjetivoMantener(80f, 90f);
        Rutina rutina = rutinaController.crearRutina(socio, objetivo.getNombre(), 4, COLEMAN_GYM.getEjercicios());
        objetivoController.setRutina(objetivo, rutina);

        assertFalse(rutina.getCumplido(), "La rutina no debería estar cumplida al inicio");

        // Completo los entrenamientos y verifico cumplimiento
        rutinaController.getEntrenamientos(rutina).forEach(entrenamiento -> entrenamientoController.setCumplido(entrenamiento, true));
        rutinaController.verificarCumplido(rutina);

        assertTrue(rutina.getCumplido(), "La rutina debería estar cumplida después de completar los entrenamientos");
    }

    @Test
    void testTrofeoCreido() {
        Medicion medicion = medicionController.crearMedicion(80f, 20f, 20f, 1.80f);
        observerController.crearNotificadorTrofeoCreido(socio, medicion);

        // Registro mediciones para simular el cumplimiento de trofeos
        medicionController.registrarMedicion(socio, medicion, 75.0f, 22.5f, 19f, 1.80f);
        medicionController.registrarMedicion(socio, medicion, 75.0f, 22.5f, 19f, 1.80f);
        medicionController.registrarMedicion(socio, medicion, 75.0f, 22.5f, 19f, 1.80f);
        medicionController.registrarMedicion(socio, medicion, 75.0f, 22.5f, 19f, 1.80f);

        assertTrue(socioController.getTrofeos(socio).stream().anyMatch(trofeo -> "Trofeo Creído".equals(trofeoController.getNombre(trofeo))),
                   "El socio debería tener el trofeo Creído después de varias mediciones");
    }

    @Test
    void testObjetivoBajarDePeso() {
        // Configuro una estrategia de bajar de peso y verifico
        BajarDePesoStrategy objetivoBajar = objetivoController.crearObjetivoBajarDePeso(69.0f);
        socioController.cambiarEstrategia(socio, objetivoBajar);

        assertEquals("BajarDePeso", socio.getObjetivoPrincipal().getNombre(), "El objetivo debería ser Bajar de Peso");
    }
}
