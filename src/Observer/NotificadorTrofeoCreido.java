package Observer;

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
            "Se otorga a los socios que se pesan mas de 10 veces en un mes" + " " + "Has pesado " + cantidadPesajes
        );

        this.socio.setTrofeos(trofeo);

        this.setCantidadPesajes(cantidadPesajes); // Se resetea la cantidad de pesajes
    }

    public int getCantidadPesajes() {
        return cantidadPesajes;
    }

    public void setCantidadPesajes(int cantidadPesajes) {
        this.cantidadPesajes = cantidadPesajes;
    }

    
}
