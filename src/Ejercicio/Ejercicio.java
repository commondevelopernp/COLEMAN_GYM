package Ejercicio;

public class Ejercicio {

    private String nombre;
    private Musculo nombreMusculo;
    private Double tiempoEstimadoEjercicio;
    private int series;
    private int repeticiones;
    private Double pesoAsignado;
    private int nivelAerobico;
    
    public void reforzarRutina(){
        setSeries(this.getSeries() + 1);
        setRepeticiones(this.getRepeticiones() + 3);
        setPesoAsignado(this.getPesoAsignado() * 1.2);
        setNivelAerobico(this.getNivelAerobico() + 1);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreMusculo(Musculo nombreMusculo) {
        this.nombreMusculo = nombreMusculo;
    }

    public void setTiempoEstimadoEjercicio(Double tiempoEstimadoEjercicio) {
        this.tiempoEstimadoEjercicio = tiempoEstimadoEjercicio;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void setPesoAsignado(Double pesoAsignado) {
        this.pesoAsignado = pesoAsignado;
    }

    public void setNivelAerobico(int nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public String getNombre() {
        return nombre;
    }

    public Musculo getNombreMusculo() {
        return nombreMusculo;
    }

    public Double getTiempoEstimadoEjercicio() {
        return tiempoEstimadoEjercicio;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public Double getPesoAsignado() {
        return pesoAsignado;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "nombre=" + nombre + ", nombreMusculo=" + nombreMusculo +
                 ", tiempoEstimadoEjercicio=" + tiempoEstimadoEjercicio +
                  ", series=" + series + ", repeticiones=" + repeticiones +
                   ", pesoAsignado=" + pesoAsignado + ", nivelAerobico=" +
                    nivelAerobico + '}';
    }

}
