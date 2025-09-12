package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionRiegoInferiorA extends Condicion {
    private int riegoInferiorA;

    public CondicionRiegoInferiorA(int riegoInferiorA) {
        this.riegoInferiorA = riegoInferiorA;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getRiego()<this.getRiegoInferiorA();
    }

    public int getRiegoInferiorA() {
        return riegoInferiorA;
    }

    public void setRiegoInferiorA(int riegoInferiorA) {
        this.riegoInferiorA = riegoInferiorA;
    }
}
