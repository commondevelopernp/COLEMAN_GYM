package Medicion;

public class BalanzaExterna implements AdapterBalanza {
    @Override
    public Float medirPeso(Float peso) {
        return peso;
    }
    @Override
    public Float medirMasaMuscular(Float masaMuscular) {
        return masaMuscular;
    }
    @Override
    public Float medirGrasaCorporal(Float grasaCorporal) {
        return grasaCorporal;
    }
    @Override
    public Float medirAltura(Float altura) {
        return altura;
    }
}
