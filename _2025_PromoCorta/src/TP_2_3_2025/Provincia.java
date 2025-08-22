package TP_2_3_2025;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public boolean deficit(){
        int cantCiudades = 0;
        for (Ciudad c: ciudades) {
            if (c.estaEnPerdida()){
                cantCiudades++;
            }
        }
        return cantCiudades>(ciudades.size()/2);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return new ArrayList<>(ciudades);
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = new ArrayList<>(ciudades);
    }
}
