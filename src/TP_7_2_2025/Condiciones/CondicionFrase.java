package TP_7_2_2025.Condiciones;

import TP_7_2_2025.Documento;

public class CondicionFrase extends Condicion {
    private String frase;

    public CondicionFrase(String frase) {
        this.frase = frase;
    }

    public boolean cumple(Documento d){
        return d.getContTextual().contains(this.getFrase());
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
