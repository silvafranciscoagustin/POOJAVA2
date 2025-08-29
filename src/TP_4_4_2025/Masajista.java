package TP_4_4_2025;

import java.time.LocalDate;

public class Masajista extends Persona{
    private String titulo;
    private int cantXP;

    public Masajista(boolean viajando, boolean concentrando, boolean enPaisOrigen, String apellido, String nombre, LocalDate fechaNac, int nroPasaporte, String titulo, int cantXP) {
        super(viajando, concentrando, enPaisOrigen, apellido, nombre, fechaNac, nroPasaporte);
        this.titulo = titulo;
        this.cantXP = cantXP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantXP() {
        return cantXP;
    }

    public void setCantXP(int cantXP) {
        this.cantXP = cantXP;
    }
}
