package TP_3_2_2025;

public class Mueble {
    private double peso,costo,valorVenta;
    private String tipoMadera,color;

    public Mueble(double peso, double costo, double valorVenta, String tipoMadera, String color) {
        this.peso = peso;
        this.costo = costo;
        this.valorVenta = valorVenta;
        this.tipoMadera = tipoMadera;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
