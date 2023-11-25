package Ejercicio;

public  class  Ejercicio {

    private String nombre;
    private Musculo nombreMusculo;
    private Double tiempoEstimadoEjercicio;
    private int series;
    private int repeticiones;
    private Double pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular exigenciaMuscular;
    private boolean cumplido;
    
    public Ejercicio(String nombre, Musculo nombreMusculo, Double tiempoEstimadoEjercicio, int series, int repeticiones, Double pesoAsignado, int nivelAerobico, ExigenciaMuscular exigenciaMuscular) {
        this.nombre = nombre;
        this.nombreMusculo = nombreMusculo;
        this.tiempoEstimadoEjercicio = tiempoEstimadoEjercicio;
        this.series = series;
        this.repeticiones = repeticiones;
        this.pesoAsignado = pesoAsignado;
        this.nivelAerobico = nivelAerobico;
        this.exigenciaMuscular = exigenciaMuscular;
    }

    public void setCumplido(boolean cumplido) {
        this.cumplido = cumplido;
    }

    public boolean getCumplido() {
        return cumplido;
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

    public ExigenciaMuscular getExigenciaMuscular() {
        return exigenciaMuscular;
    }

    public void setExigenciaMuscular(ExigenciaMuscular exigenciaMuscular) {
        this.exigenciaMuscular = exigenciaMuscular;
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
