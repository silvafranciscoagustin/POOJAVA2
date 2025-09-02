package TP_5_5_2025;

import java.util.ArrayList;

public class Cereal {
    private ArrayList<String> mineralesCereal;
    private String tipoDeGrano;

    public Cereal(String tipoDeGrano) {
        this.mineralesCereal = new ArrayList<>();
        this.tipoDeGrano = tipoDeGrano;
    }

    public boolean sePuedeSembrar(Lote l){
        return l.getMineralesLote().containsAll(getMineralesCereal());
    }

    public ArrayList<String> getMineralesCereal() {
        return new ArrayList<>(mineralesCereal);
    }

    public void setMineralesCereal(ArrayList<String> mineralesCereal) {
        this.mineralesCereal = new ArrayList<>(mineralesCereal);
    }

    public String getTipoDeGrano() {
        return tipoDeGrano;
    }

    public void setTipoDeGrano(String tipoDeGrano) {
        this.tipoDeGrano = tipoDeGrano;
    }

    public String toString() {
        return "Cereal{" +
                "tipoDeGrano='" + tipoDeGrano + '\'' +
                ", mineralesCereal=" + mineralesCereal +
                '}';
    }


}
