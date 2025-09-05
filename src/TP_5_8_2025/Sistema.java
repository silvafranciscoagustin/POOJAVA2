package TP_5_8_2025;

import java.util.ArrayList;

public class Sistema {
    private String nombre;
    private ArrayList<String> temasExperto;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;

    public Sistema(String nombre) {
        this.nombre = nombre;
        this.temasExperto = new ArrayList<>();
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }

    public ArrayList<Evaluador> getEvaluadoresAptos(Trabajo trabajo) {
        ArrayList<Evaluador> aptos = new ArrayList<>();
        for (Evaluador e : evaluadores) {
            if (trabajo.esAptoTrabajo(e)) {
                aptos.add(e);
            }
        }
        return aptos;
    }



    public ArrayList<Trabajo> trabajosAsignados(Evaluador e){
        ArrayList<Trabajo> copia = new ArrayList<>();
        for (Trabajo t: trabajos) {
            if (t.esAptoTrabajo(e)) {
                copia.add(t);
            }
        }
        return copia;
    }

    public int cantidadDeTrabajos(Evaluador e){
        return trabajosAsignados(e).size();
        //ArrayList<Trabajo> retorno = trabajosAsignados(e);
        //return retorno.size();
    }

    public boolean esExperto(Evaluador e) {
        // el evaluador es experto si tiene al menos un tema de experto.
        for (String conocimiento : e.getConocimientosEvaluador()) {
            if (getTemasExperto().contains(conocimiento)) {
                return true;
            }
        }
        return false;
    }



    public void addTemaExperto(String t){
        if(!temasExperto.contains(t)){
            temasExperto.add(t);
        }
    }

    public void addEvaluador(Evaluador e){
        if(!evaluadores.contains(e)){
            evaluadores.add(e);
        }
    }

    public void addTrabajo(Trabajo t){
        if(!trabajos.contains(t)){
            trabajos.add(t);
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getTemasExperto() {
        return new ArrayList<>(temasExperto);
    }

    public void setTemasExperto(ArrayList<String> temasExperto) {
        this.temasExperto = new ArrayList<>(temasExperto);
    }

    public ArrayList<Evaluador> getEvaluadores() {
        return new ArrayList<>(evaluadores);
    }

    public void setEvaluadores(ArrayList<Evaluador> evaluadores) {
        this.evaluadores = new ArrayList<>(evaluadores);
    }

    public ArrayList<Trabajo> getTrabajos() {
        return new ArrayList<>(trabajos);
    }

    public void setTrabajos(ArrayList<Trabajo> trabajos) {
        this.trabajos = new ArrayList<>(trabajos);
    }
}
