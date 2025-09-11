package TP_7_1_2025.condiciones;

import TP_7_1_2025.Cultivo;
import TP_7_1_2025.ProductoQuimico;

public class CondicionCultivo extends Condicion{
    private Cultivo c;

    public CondicionCultivo(Cultivo c) {
        this.c = c;
    }
    @Override
    public boolean cumple(ProductoQuimico p ){
        return p.getCultivosDesaconsejados().contains(c);
    }

    public Cultivo getC() {
        return c;
    }

    public void setC(Cultivo c) {
        this.c = c;
    }
}
