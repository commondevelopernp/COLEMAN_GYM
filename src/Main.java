import Medicion.Balanza;
import Users.Socio;

public class Main {
    public static void main(String[] args) {
        Socio socio = new Socio(20, "Masculino", "asd@asd.com", "1234");

        System.out.println(
                socio.loguearse(socio.getEmail(), socio.getPassword())
        );

        Balanza balanza = new Balanza();

        balanza.registrarMedicion(socio, 80.0f, 25.0f, 15.0f, 180f);

        System.out.println(socio.getMedicion());

    }
}