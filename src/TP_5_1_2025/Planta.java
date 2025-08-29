package TP_5_1_2025;

import java.time.LocalDate;

public class Planta {
    private static int contador = 1;
    private String nombreCientifico, nombreComun,paisOrigen;
    private int id;
    private LocalDate fechaCompra;

    public Planta(String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.paisOrigen = paisOrigen;
        this.id = contador++;
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombreCientifico='" + getNombreCientifico() + '\'' +
                ", nombreComun='" + getNombreComun() + '\'' +
                ", paisOrigen='" + getPaisOrigen() + '\'' +
                ", id=" + getId() +
                ", fechaCompra=" + getFechaCompra() +
                '}';
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
