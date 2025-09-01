package TP_5_4_2025;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    public ArrayList<Alumno> familiares;
    private boolean tieneCasa;


    public Alumno(String nombre, boolean tieneCasa) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.tieneCasa = tieneCasa;
        this.familiares = new ArrayList<>();
    }

    public ArrayList<Alumno> getFamiliares() {
        return new ArrayList<>(familiares);
    }

    public void setFamiliares(ArrayList<Alumno> familiares) {
        this.familiares = new ArrayList<>(familiares);
    }

    public void addCualidad(String cualidad){
        cualidades.add(cualidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = new ArrayList<>(cualidades);
    }

    public boolean isTieneCasa() {
        return tieneCasa;
    }

    public void setTieneCasa(boolean tieneCasa) {
        this.tieneCasa = tieneCasa;
    }
}
