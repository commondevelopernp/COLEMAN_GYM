package Observer;

import Medicion.Medicion;
import Trofeos.Trofeo;
import Users.Socio;

public class NotificadorTrofeoCreido extends ObservadorPremio{

    private final int MAX_PESAJES = 3;
    private int cantidadPesajes;

    public NotificadorTrofeoCreido(Socio socio) {
        super();
        this.socio = socio;
        this.cantidadPesajes = 0;
    }

    @Override
    public void update() {
        this.cantidadPesajes++;
        System.out.println("Cantidad de pesajes: " + this.cantidadPesajes);
        if (this.cantidadPesajes >= MAX_PESAJES) {
            this.addAListaSocio();
        }

    }

    @Override
    public void addAListaSocio() {

        Trofeo trofeo = new Trofeo(
            "Creido",
            "Se otorga a los socios que se pesan mas de 3 veces en un mes"
        );

        // Si ya le entregue el trofeo creido no se lo entrego nuevamente.
        for (Trofeo trofeoSocio : this.socio.getTrofeos()) {
            if (trofeoSocio.getNombre().equals(trofeo.getNombre())) {
                return;
            }
        }

        if (this.socio.getMedicion().size() >= 3) {
            boolean sameMonth = false;
            int mediciones = socio.getMedicion().size();
            for (int i = 0; i < mediciones - 1; i++) {
                if (socio.getMedicion().get(i).getFecha().getMonth() == socio.getMedicion().get(i + 1).getFecha()
                        .getMonth()) {
                    sameMonth = true;
                } else {
                    sameMonth = false;
                    break;
                }
            }
            if (sameMonth) {
                this.socio.setTrofeos(trofeo);
            }
        }
    }
}
