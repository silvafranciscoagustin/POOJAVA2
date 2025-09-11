package TP_7_1_2025.condiciones;

import TP_7_1_2025.Enfermedad;
import TP_7_1_2025.ProductoQuimico;

public class CondicionEnfermedad extends Condicion {
    private Enfermedad e1;

    public CondicionEnfermedad(Enfermedad e1) {
        this.e1 = e1;
    }

    @Override
    public boolean cumple(ProductoQuimico p) {
        return p.getEstadosPatologicosPQ().containsAll(e1.getEstadosPatologicosEnfermedad());
    }

    public Enfermedad getE1() {
        return e1;
    }

    public void setE1(Enfermedad e1) {
        this.e1 = e1;
    }
}
