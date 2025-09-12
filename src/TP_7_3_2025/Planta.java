package TP_7_3_2025;

import java.util.ArrayList;

public class Planta {
    private String nombre,clasificacionSuperior,familia,clase;
    private ArrayList<String> nombresVulgares;
    private int sol,riego;

    public Planta(String nombre, String clasificacionSuperior, String familia, String clase, int sol, int riego) {
        this.nombre = nombre;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.nombresVulgares = new ArrayList<>();
        this.sol = sol;
        this.riego = riego;
    }

    public void addNombreVulgar(String nombre){
        String nombreMinuscula = nombre.toLowerCase();
        if(!nombresVulgares.contains(nombre)){
            nombresVulgares.add(nombre);
        }
    }

    public boolean equals(Object otro ){
        Planta p = (Planta) otro;
        try {
            return this.getNombre().equalsIgnoreCase(p.getNombre());
        }catch (Exception exc){
            return false;
        }
    }

    @Override
    public String toString() {
        return "--------------------Planta: --------------------" + "\n"+
                "Nombre: " + getNombre() + '\n' +
                "ClasificacionSuperior: " + getClasificacionSuperior() + '\n' +
                "Familia: " + getFamilia() + '\n' +
                "Clase: " + getClase() + '\n' +
                "NombresVulgares: " + getNombresVulgares() + '\n' +
                "Sol: " + getSol() + '\n' +
                "Riego: " + getRiego() + '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<>(nombresVulgares);
    }

    public void setNombresVulgares(ArrayList<String> nombresVulgares) {
        this.nombresVulgares = new ArrayList<>(nombresVulgares);
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }
}
