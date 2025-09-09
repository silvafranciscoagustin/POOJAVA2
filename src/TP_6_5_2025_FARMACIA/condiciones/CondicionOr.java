package TP_6_5_2025_FARMACIA.condiciones;

import TP_6_5_2025_FARMACIA.Medicamento;

public class CondicionOr extends Condicion {
    private Condicion c1,c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    public boolean cumple(Medicamento m ){
        return c1.cumple(m ) || c2.cumple(m);
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public Condicion getC2() {
        return c2;
    }

    public void setC2(Condicion c2) {
        this.c2 = c2;
    }
}
