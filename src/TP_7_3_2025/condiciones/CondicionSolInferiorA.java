package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionSolInferiorA extends Condicion{
    private int solInferiorA;

    public CondicionSolInferiorA(int solInferiorA) {
        this.solInferiorA = solInferiorA;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol()<this.getSolInferiorA();
    }

    public int getSolInferiorA() {
        return solInferiorA;
    }

    public void setSolInferiorA(int solInferiorA) {
        this.solInferiorA = solInferiorA;
    }
}
