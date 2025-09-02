package TP_5_5_2025;

import java.util.ArrayList;

public class Cooperativa {
    private String nombre;
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;
    private ArrayList<String> mineralesPrimarios;

    public Cooperativa(String nombre) {
        this.nombre = nombre;
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
        this.mineralesPrimarios = new ArrayList<>();
    }

    public ArrayList<Cereal> cerealesCompatiblesConLote(Lote l) {
        ArrayList<Cereal> retorno = new ArrayList<>();
        for (Cereal c : cereales) {
            if (c.sePuedeSembrar(l)){
                retorno.add(c);
            }
        }
        return retorno;
    }

    public ArrayList<Lote> lotesCompatiblesConCereal(Cereal c){
        ArrayList<Lote> retorno = new ArrayList<>();
        for (Lote l :lotes) {
            if(l.sePuedeSembrar(c)){
                retorno.add(l);
            }
        }
        return retorno;
    }

    public boolean loteEsEspecial(Lote l){
        return l.getMineralesLote().containsAll(getMineralesPrimarios());
    }



    public void agregarLoteACooperativa(Lote lote){
        if(!lotes.contains(lote)){
            lotes.add(lote);
        }
    }

    public void agregarCerealACooperativa(Cereal cereal){
        if(!cereales.contains(cereal)){
            cereales.add(cereal);
        }
    }

    public void agregarMineralPrimario(String mineral){
        if(!mineralesPrimarios.contains(mineral)){
            mineralesPrimarios.add(mineral);
        }
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }

    public ArrayList<Cereal> getCereales() {
        return new ArrayList<>(cereales);
    }

    public void setCereales(ArrayList<Cereal> cereales) {
        this.cereales = new ArrayList<>(cereales);
    }

    public ArrayList<String> getMineralesPrimarios() {
        return new ArrayList<>(mineralesPrimarios);
    }

    public void setMineralesPrimarios(ArrayList<String> mineralesPrimarios) {
        this.mineralesPrimarios = new ArrayList<>(mineralesPrimarios);
    }
}
