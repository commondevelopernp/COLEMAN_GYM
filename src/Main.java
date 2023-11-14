import Medicion.Medicion;
import Objetivo.BajarDePesoStrategy;
import Objetivo.ObjetivoStrategy;
import Users.Socio;

public class Main {
    public static void main(String[] args) {
        Socio socio = new Socio(20, "Masculino", "asd@asd.com", "1234");

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

        // Seteo nueva medicion
        Medicion medicion1 = new Medicion();
        medicion1.registrarMedicion(70.0f, 22f, 18f, 1.80f);
        socio.setMedicion(medicion1);
        System.out.println("Segunda medicion: " + socio.getMedicion() + "\n\n");

        // Verifico objetivo
        ObjetivoStrategy objetivoPrincipal = socio.getObjetivoPrincipal();
        objetivoPrincipal.verificarObjetivo(medicion1);
        System.out.println("El objetivo se ha cumplido ?: " + objetivoPrincipal.getCumplido());

    }
}