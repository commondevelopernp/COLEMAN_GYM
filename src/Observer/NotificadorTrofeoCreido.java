package Observer;

import Trofeos.Trofeo;

public class NotificadorTrofeoCreido extends ObservadorPremio{

    private final int MAX_PESAJES = 3;
    private int cantidadPesajes;

    @Override
    public void update() {
        this.cantidadPesajes++;
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
