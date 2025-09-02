package TP_5_6_2025;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public ArrayList<Provincia> getProvinciasDeficit(){
        ArrayList<Provincia> provDeficit = new ArrayList<>();
        for (Provincia p: provincias) {
            if(p.deficit()){
                provDeficit.add(p);
            }
        }
        return provDeficit;
    }

    public void addProvincia(Provincia p){
        if(!provincias.contains(p)){
            provincias.add(p);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return new ArrayList<>(provincias);
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = new ArrayList<>(provincias);
    }
}
