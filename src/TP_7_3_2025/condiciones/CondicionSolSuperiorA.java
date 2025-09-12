package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionSolSuperiorA extends Condicion {
    private int solSuperiorA;

    public CondicionSolSuperiorA(int solSuperiorA) {
        this.solSuperiorA = solSuperiorA;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol()>this.getSolSuperiorA();
    }

    public int getSolSuperiorA() {
        return solSuperiorA;
    }

    public void setSolSuperiorA(int solSuperiorA) {
        this.solSuperiorA = solSuperiorA;
    }
}
