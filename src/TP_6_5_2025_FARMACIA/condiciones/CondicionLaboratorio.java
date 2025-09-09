package TP_6_5_2025_FARMACIA.condiciones;

import TP_6_5_2025_FARMACIA.Medicamento;

public class CondicionLaboratorio extends Condicion{
    private String laboratorio;

    public CondicionLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean cumple(Medicamento m){
        return this.getLaboratorio().equalsIgnoreCase(m.getLaboratorio());
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
}
