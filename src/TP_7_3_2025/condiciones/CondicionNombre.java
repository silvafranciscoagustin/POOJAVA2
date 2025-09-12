package TP_7_3_2025.condiciones;

import TP_7_3_2025.Planta;

public class CondicionNombre extends Condicion {
    private String palabra;


    public CondicionNombre(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Planta p){
        return p.getNombre().toLowerCase().contains(this.getPalabra().toLowerCase());
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
