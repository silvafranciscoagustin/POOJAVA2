package TP_6_5_2025_FARMACIA.condiciones;

import TP_6_5_2025_FARMACIA.Medicamento;

public class CondicionSintoma extends Condicion{
    private String sintoma;

    public CondicionSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public boolean cumple(Medicamento m ){
        return m.tieneSintoma(getSintoma());
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
}
