package TP_5_8_2025;

import java.util.ArrayList;

public class Trabajo {
    private String nombre;
    ArrayList<String> palabrasClaveTrabajo;


    public Trabajo(String nombre) {
        this.nombre = nombre;
        this.palabrasClaveTrabajo = new ArrayList<>();
    }

    public boolean esAptoTrabajo(Evaluador e){
        return e.getConocimientosEvaluador().containsAll(getPalabrasClaveTrabajo());
    }

    @Override
    public String toString() {
        return "Trabajo:\n" +
                "  Nombre: " + getNombre() + "\n" +
                "  Palabras clave: " + getPalabrasClaveTrabajo();
    }


    @Override
    public boolean equals(Object o){
        Trabajo tt = (Trabajo) o;
        try{
            return this.getNombre().equalsIgnoreCase(tt.getNombre());
        }catch (Exception exc){
            return false;
        }
    }

    public void addPalabraClaveTrabajo(String s){
        if(!palabrasClaveTrabajo.contains(s)){
            palabrasClaveTrabajo.add(s);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getPalabrasClaveTrabajo() {
        return new ArrayList<>(palabrasClaveTrabajo);
    }

    public void setPalabrasClaveTrabajo(ArrayList<String> palabrasClaveTrabajo) {
        this.palabrasClaveTrabajo = new ArrayList<>(palabrasClaveTrabajo);
    }
}
