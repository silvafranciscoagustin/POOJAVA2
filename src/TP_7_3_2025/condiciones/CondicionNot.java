package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionNot extends Condicion{
    private Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Planta p) {
        return !c1.cumple(p);
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }
}
