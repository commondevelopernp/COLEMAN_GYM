package Medicion;

import java.util.Date;

import Observer.Observado;

public class Medicion extends Observado{

        private static int CANT_MEDICIONES = 0;
        private Date fecha;
        private Float peso;
        private Float masaMuscular;
        private Float grasaCorporal;
        private Float altura;

        public Medicion(){
            this.fecha = new Date();
        }

        public void registrarMedicion(Float peso, Float masaMuscular, Float grasaCorporal, Float altura){

            AdapterBalanza balanza = new BalanzaExterna();

            setGrasaCorporal(balanza.medirGrasaCorporal(grasaCorporal));
            setMasaMuscular(balanza.medirMasaMuscular(masaMuscular));
            setAltura(balanza.medirAltura(altura));
            setPeso(balanza.medirPeso(peso));

            notifyObservers();
        }

        public int getCantidadMediciones(){
            return CANT_MEDICIONES;
        }

        public void setPeso(Float peso) {
            this.peso = peso;
        }

        public Float getPeso() {
            return this.peso;
        }

        public void setMasaMuscular(Float masaMuscular) {
            this.masaMuscular = masaMuscular;
        }

        public Float getMasaMuscular() {
            return this.masaMuscular;
        }

        public void setGrasaCorporal(Float grasaCorporal) {
            this.grasaCorporal = grasaCorporal;
        }

        public Float getGrasaCorporal() {
            return this.grasaCorporal;
        }

        public void setAltura(Float altura) {
            this.altura = altura;
        }

        public Float getAltura() {
            return this.altura;
        }

        public Date getFecha() {
            return this.fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String toString(){
            return "Fecha: " + this.fecha + " Peso: " + this.peso + " Masa Muscular: " + this.masaMuscular + " Grasa Corporal: " + this.grasaCorporal + " Altura: " + this.altura;
        }
}
