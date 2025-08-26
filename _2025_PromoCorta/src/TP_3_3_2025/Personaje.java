package TP_3_3_2025;

import java.util.ArrayList;

public class Personaje {
    private String nombre;
    private String nombreSuper;
    private ArrayList<Cualidad> cualidades;

    public Personaje(String nombre, String nombreSuper) {
        this.nombre = nombre;
        this.nombreSuper = nombreSuper;
        this.cualidades = new ArrayList<>();
    }

    public void addCualidad(Cualidad c) {
        this.cualidades.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public ArrayList<Cualidad> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public void setCualidades(ArrayList<Cualidad> cualidades) {
        this.cualidades = new ArrayList<>(cualidades);
    }
}
