package TP_7_1_2025;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFreq;



    public void addEnfermedad(Enfermedad e){
        if(!enfermedadesFreq.contains(e)){
            enfermedadesFreq.add(e);
        }
    }



    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedadesFreq = new ArrayList<>();
    }

    public boolean equals(Object obj) {
        Cultivo e = (Cultivo) obj;
        try{
            return this.getNombre().equalsIgnoreCase(e.getNombre());
        }catch (Exception exc){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nombre:" + getNombre()+"\n"+
                "Enfermedades Frecuentes: "+ getEnfermedadesFreq()+"\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedadesFreq() {
        return new ArrayList<>(enfermedadesFreq);
    }

    public void setEnfermedadesFreq(ArrayList<Enfermedad> enfermedadesFreq) {
        this.enfermedadesFreq = new ArrayList<>(enfermedadesFreq);
    }
}
