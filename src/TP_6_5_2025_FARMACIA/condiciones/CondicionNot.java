package TP_6_5_2025_FARMACIA.condiciones;

import TP_6_5_2025_FARMACIA.Medicamento;

public class CondicionNot extends Condicion{
    public Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    public boolean cumple(Medicamento m){
        return !c1.cumple(m);
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }
}
