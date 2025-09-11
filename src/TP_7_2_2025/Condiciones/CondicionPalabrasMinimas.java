package TP_7_2_2025.Condiciones;

import TP_7_2_2025.Documento;

public class CondicionPalabrasMinimas extends Condicion{
    public int cantPalabrasMinimas;

    public CondicionPalabrasMinimas(int cantPalabrasMinimas) {
        this.cantPalabrasMinimas = cantPalabrasMinimas;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getPalabrasClaves().size()>=getCantPalabrasMinimas();
    }

    public int getCantPalabrasMinimas() {
        return cantPalabrasMinimas;
    }

    public void setCantPalabrasMinimas(int cantPalabrasMinimas) {
        this.cantPalabrasMinimas = cantPalabrasMinimas;
    }
}
