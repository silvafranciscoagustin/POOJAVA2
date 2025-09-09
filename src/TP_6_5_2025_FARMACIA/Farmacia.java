package TP_6_5_2025_FARMACIA;

import TP_6_5_2025_FARMACIA.condiciones.Condicion;

import java.util.ArrayList;

public class Farmacia {
    private String nombre;
    private ArrayList<Medicamento> medicamentos;

    public Farmacia(String nombre) {
        this.nombre = nombre;
        this.medicamentos = new ArrayList<>();
    }

    public ArrayList<Medicamento> buscar(Condicion c){
        ArrayList<Medicamento> retorno = new ArrayList<>();
        for(Medicamento m : medicamentos){
            if(c.cumple(m)){
                retorno.add(m);
            }
        }
        return retorno;
    }



    public void addMedicamento(Medicamento m){
        if(!medicamentos.contains(m)){
            medicamentos.add(m);
        }
    }

    public void removerMedicamento(Medicamento m){
       if (!medicamentos.isEmpty()){
            medicamentos.remove(m);
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return new ArrayList<>(medicamentos);
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = new ArrayList<>(medicamentos);
    }
}
