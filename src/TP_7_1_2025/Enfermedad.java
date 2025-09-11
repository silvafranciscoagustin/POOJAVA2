package TP_7_1_2025;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicosEnfermedad;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicosEnfermedad = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Nombre: "+ getNombre()+"\n"+
                "EstadosPatologicosEnfermedad: "+ getEstadosPatologicosEnfermedad();
    }

    public void addEstadoPatologico(String e){
        if(!estadosPatologicosEnfermedad.contains(e)){
            estadosPatologicosEnfermedad.add(e);
        }
    }

    @Override
    public boolean equals(Object obj) {
        Enfermedad e = (Enfermedad) obj;
        try{
            return this.getNombre().equalsIgnoreCase(e.getNombre());
        }catch (Exception exc){
            return false;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstadosPatologicosEnfermedad() {
        return new ArrayList<>(estadosPatologicosEnfermedad);
    }

    public void setEstadosPatologicosEnfermedad(ArrayList<String> estadosPatologicosEnfermedad) {
        this.estadosPatologicosEnfermedad = new ArrayList<>(estadosPatologicosEnfermedad);
    }
}
