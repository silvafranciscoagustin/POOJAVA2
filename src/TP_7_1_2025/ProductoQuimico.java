package TP_7_1_2025;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<String> estadosPatologicosPQ;
    private ArrayList<Cultivo> cultivosDesaconsejados;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicosPQ = new ArrayList<>();
        this.cultivosDesaconsejados = new ArrayList<>();
    }

    public void addCultivoDesaconsejado(Cultivo c){
        if(!cultivosDesaconsejados.contains(c)){
            cultivosDesaconsejados.add(c);
        }
    }

    @Override
    public String toString() {
        return  "Nombre:" + getNombre()+"\n"+
                "Cultivos Desaconsejados: "+ getCultivosDesaconsejados()+"\n"+
                "Estados Patologicos: "+ getEstadosPatologicosPQ()+"\n";
    }

    public void addEstadoPatologico(String e){
        if(!estadosPatologicosPQ.contains(e)){
            estadosPatologicosPQ.add(e);
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstadosPatologicosPQ() {
        return new ArrayList<>(estadosPatologicosPQ);
    }

    public void setEstadosPatologicosPQ(ArrayList<String> estadosPatologicosPQ) {
        this.estadosPatologicosPQ = new ArrayList<>(estadosPatologicosPQ);
    }

    public ArrayList<Cultivo> getCultivosDesaconsejados() {
        return new ArrayList<Cultivo>(cultivosDesaconsejados);
    }

    public void setCultivosDesaconsejados(ArrayList<Cultivo> cultivosDesaconsejados) {
        this.cultivosDesaconsejados = new ArrayList<Cultivo>(cultivosDesaconsejados);
    }
}
