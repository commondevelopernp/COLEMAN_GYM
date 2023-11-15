import Medicion.Medicion;
import Objetivo.BajarDePesoStrategy;
import Objetivo.ObjetivoStrategy;
import Observer.NotificadorTrofeoConstancia;
import Observer.NotificadorTrofeoCreido;
import Observer.NotificadorTrofeoDedicacion;
import Observer.ObservadorPremio;
import Trofeos.Trofeo;
import Users.Socio;

public class Main {
    public static void main(String[] args) {

        // Creo el socio
        Socio socio = new Socio(20, "Masculino", "asd@asd.com", "1234");

        // Logueo al socio
        System.out.println(
            socio.loguearse(socio.getEmail(), socio.getPassword() + "\n\n")
        );

        

        // Seteo primer medicion
        Medicion medicion = new Medicion();
        medicion.registrarMedicion(80f, 20f, 20f, 1.80f);
        socio.setMedicion(medicion);
        System.out.println("Primer medicion: " + socio.getMedicion() + "\n\n");

        // Seteo estrategia
        Float pesoIdeal = 70.5f;
        BajarDePesoStrategy objetivo = new BajarDePesoStrategy(pesoIdeal); 
        socio.setObjetivoPrincipal(objetivo);
        System.out.println("Estrategia elegida: " + socio.getObjetivoPrincipal() + "\n\n");

        // Instancio los observadores
        ObservadorPremio observerCreido = new NotificadorTrofeoCreido();
        ObservadorPremio observerConstancia = new NotificadorTrofeoConstancia();
        ObservadorPremio observerDedicacion = new NotificadorTrofeoDedicacion(socio);
       
        // Seteo observadores
        objetivo.attach(observerDedicacion);


        // Seteo nueva medicion
        Medicion medicion1 = new Medicion();
        medicion1.registrarMedicion(70.0f, 22f, 18f, 1.80f);
        socio.setMedicion(medicion1);
        System.out.println("Segunda medicion: " + socio.getMedicion() + "\n\n");

    
        // Verifico objetivo
        objetivo.verificarObjetivo(medicion1);
        System.out.println("El objetivo se ha cumplido ?: " + objetivo.getCumplido() + "\n\n");

        // Veo si se entrego el trofeo correctamente
        for (Trofeo trofeo : socio.getTrofeos()){
            System.out.println(trofeo.getNombre() + "\n" + trofeo.getDescripcion() + "\n\n");
        }
    }
}

