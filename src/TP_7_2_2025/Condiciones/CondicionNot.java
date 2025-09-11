package TP_7_2_2025.Condiciones;

import TP_7_2_2025.Documento;

public class CondicionNot extends Condicion{
    private Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Documento d) {
        return !c1.cumple(d);
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }
}
