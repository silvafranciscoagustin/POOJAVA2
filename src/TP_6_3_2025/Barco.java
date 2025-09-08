package TP_6_3_2025;

public class Barco extends Elemento{
    private String patente;
    private double capacidad;

    public Barco(String patente, double capacidad) {
        this.patente = patente;
        this.capacidad = capacidad;
    }

    public boolean esMenor(Elemento bb){
        return this.getCapacidad()< ((Barco)bb).getCapacidad();
    }


    public boolean equals(Object o) {
        Barco b = (Barco) o;
        try {
            return b.getPatente().equals(this.getPatente());
        }catch (Exception exc){
            return false;
        }
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
