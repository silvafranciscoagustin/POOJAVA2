package TP_7_2_2025.Condiciones;

import TP_7_2_2025.Documento;

public class CondicionTitulo extends Condicion {
    private String titulo;

    public CondicionTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Documento d){
        return this.getTitulo().equalsIgnoreCase(d.getTitulo());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
