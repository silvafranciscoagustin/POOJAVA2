package TP_2_2_2025;

import java.util.ArrayList;

public class Reunion {
    private ArrayList<Usuario> usuarios;
    private String lugar;
    private String tema;
    private double duracion;

    public Reunion(String lugar, String tema, double duracion) {
        this.usuarios = new ArrayList<>();
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
    }

    public ArrayList<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = new ArrayList<>(usuarios);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
