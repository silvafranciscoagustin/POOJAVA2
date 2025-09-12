package TP_7_3_2025;

import TP_7_3_2025.condiciones.Condicion;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Planta> plantas;

    public Sistema() {
        this.plantas = new ArrayList<>();
    }

    public void addPlanta(Planta p){
        if(!plantas.contains(p)){
            plantas.add(p);
        }
    }

    public ArrayList<Planta> plantaCumple(Condicion c){
        ArrayList<Planta> retorno = new ArrayList<>();
        for (Planta p : plantas) {
            if (c.cumple(p)){
                retorno.add(p);
            }
        }
        return retorno;
    }



    public ArrayList<Planta> getPlantas() {
        return new ArrayList<>(plantas);
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = new ArrayList<>(plantas);
    }
}
