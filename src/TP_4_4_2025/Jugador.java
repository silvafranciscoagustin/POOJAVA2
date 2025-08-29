package TP_4_4_2025;

import java.time.LocalDate;

public class Jugador extends Persona{
    private String posicion,piernaHabil;
    private int cantGoles;

    public Jugador(boolean viajando, boolean concentrando, boolean enPaisOrigen, String apellido, String nombre, LocalDate fechaNac, int nroPasaporte, String posicion, String piernaHabil, int cantGoles) {
        super(viajando, concentrando, enPaisOrigen, apellido, nombre, fechaNac, nroPasaporte);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.cantGoles = cantGoles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
}
