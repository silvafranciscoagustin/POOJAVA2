package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionRiegoSuperiorA extends Condicion{
    private int riegoSuperiorA;

    public CondicionRiegoSuperiorA(int riegoSuperiorA) {
        this.riegoSuperiorA = riegoSuperiorA;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getRiego()>this.getRiegoSuperiorA();
    }

    public int getRiegoSuperiorA() {
        return riegoSuperiorA;
    }

    public void setRiegoSuperiorA(int riegoSuperiorA) {
        this.riegoSuperiorA = riegoSuperiorA;
    }
}
