package TP_4_1_2025;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;
    private Timbre timbre;
    private Luz luz;

    public Alarma(Timbre timbre, Luz luz) {
        this.sensores = new ArrayList<>();
        this.timbre = timbre;
        this.luz = luz;
    }

    public void addSensor(Sensor s){
        sensores.add(s);
    }

    public String comprobar(){
        for (Sensor s: sensores) {
            if(s.isActivo()) {
                return getTimbre().hacerSonar() + s.getNombreZona();
            }
    }
        return "Todo en Orden";
    }



    public ArrayList<Sensor> getSensores() {
        return new ArrayList<>(sensores);
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = new ArrayList<>(sensores);
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public void setTimbre(Timbre timbre) {
        this.timbre = timbre;
    }

    public Luz getLuz() {
        return luz;
    }

    public void setLuz(Luz luz) {
        this.luz = luz;
    }
}

