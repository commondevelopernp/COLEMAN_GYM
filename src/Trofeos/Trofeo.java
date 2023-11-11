package Trofeos;

public abstract class Trofeo {

    private String nombre;
    private String descripcion;

    public abstract void otorgarTrofeo();

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
