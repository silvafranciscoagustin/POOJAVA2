package TP_6_1_2025;

public class Vehiculo extends Item {

    private String marca, patente;
    private int kms;
    private boolean estaAlquilado;

    public Vehiculo(String marca, String patente, int kms) {
        this.marca = marca;
        this.patente = patente;
        this.kms = kms;
    }

    @Override
    public boolean sepuedeAlquilar() {
        return estaAlquilado;
    }

    @Override
    public void alquilar() {
        if(sepuedeAlquilar()) {
            setEstaAlquilado(true);
        }
    }

    public boolean equals(Object o) {
        Vehiculo v = (Vehiculo) o;

        try {
            return this.getPatente().equalsIgnoreCase(v.getPatente());
        }

        catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo: " + getMarca() +
                " (Patente: " + getPatente() +
                ", Kms: " + getKms() +
                ", Alquilado: " + isEstaAlquilado() + ")";
    }


    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }


}
