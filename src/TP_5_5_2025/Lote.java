package TP_5_5_2025;

import java.util.ArrayList;

public class Lote {
    private double hectareas;
    private ArrayList<String> mineralesLote;

    public Lote(double hectareas) {
        this.hectareas = hectareas;
        this.mineralesLote = new ArrayList<>();
    }

    public boolean sePuedeSembrar(Cereal c){
        return (getMineralesLote().containsAll(c.getMineralesCereal()));
    }

    public double getHectareas() {
        return hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }

    public ArrayList<String> getMineralesLote() {
        return new ArrayList<>(mineralesLote);
    }

    public void setMineralesLote(ArrayList<String> mineralesLote) {
        this.mineralesLote = new ArrayList<>(mineralesLote);
    }

    public String toString() {
        return "Lote{" +
                "hectareas=" + hectareas +
                ", mineralesLote=" + mineralesLote +
                '}';
    }
}
