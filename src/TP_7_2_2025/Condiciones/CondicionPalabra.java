package TP_7_2_2025.Condiciones;

import TP_7_2_2025.Documento;

public class CondicionPalabra extends Condicion {
    private String palabra;

    public CondicionPalabra(String palabraOFrase) {
        this.palabra = palabraOFrase;
    }
    public boolean cumple(Documento d){
        return d.getPalabrasClaves().contains(this.getPalabra());
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
