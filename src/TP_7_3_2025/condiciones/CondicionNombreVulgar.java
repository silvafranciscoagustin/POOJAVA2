package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionNombreVulgar extends Condicion{
    private String palabra;

    public CondicionNombreVulgar(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getNombresVulgares().contains(this.getPalabra().toLowerCase());
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
