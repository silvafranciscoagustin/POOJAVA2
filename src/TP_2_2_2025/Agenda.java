package TP_2_2_2025;

import java.util.ArrayList;

public class Agenda {
    private String nombreAgenda;
    private ArrayList<Reunion> reuniones;


    public Agenda(String nombreAgenda) {
        this.reuniones = new ArrayList<>();
        this.nombreAgenda = nombreAgenda;
    }

    public String getNombreAgenda() {
        return nombreAgenda;
    }

    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public ArrayList<Reunion> getReuniones() {
        return new ArrayList<>(reuniones);
    }

    public void setReuniones(ArrayList<Reunion> reuniones) {
        this.reuniones = new ArrayList<>(reuniones);
    }
}
