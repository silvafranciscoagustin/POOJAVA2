package TP_4_5_2025;

import java.time.LocalDate;

public class PCongeladoAire extends ProductoCongelado{
    private double aire,agua,dioxidoCarbono,nitrogeno;

    public PCongeladoAire(LocalDate fechaVenc, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrg, int tempMantenimiento, double aire, double agua, double nitrogeno,String nombre) {
        super(fechaVenc, nroLote, fechaEnvasado, granjaOrigen, codOrg, tempMantenimiento,nombre);
        this.aire = aire;
        this.agua = agua;
        this.nitrogeno = nitrogeno;
    }

    @Override
    public String toString() {
        return "Composicion de aire: "+ getAire() + "\n" +
                "Composicion de agua: " + getAgua() + "\n" +
                "Composicion de dioxido de carbono: " + getDioxidoCarbono() + "\n" +
                "Composicion de nitrogeno: " + getNitrogeno();
    }

    public double getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public void setDioxidoCarbono(double dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public double getAire() {
        return aire;
    }

    public void setAire(double aire) {
        this.aire = aire;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }
}
