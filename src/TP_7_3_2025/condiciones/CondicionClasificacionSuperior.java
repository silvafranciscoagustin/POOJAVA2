package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionClasificacionSuperior extends Condicion{
    private String clasificacionSuperior;

    public CondicionClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }
    public boolean cumple(Planta p){
        return p.getClasificacionSuperior().equalsIgnoreCase(this.getClasificacionSuperior());
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }
}
