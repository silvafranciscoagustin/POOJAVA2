package TP_6_5_2025_FARMACIA;

import java.util.ArrayList;

public class Medicamento {
    private String nombre, laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.sintomas = new ArrayList<>();
    }

    public String toString(){
        return "Nombre: " + getNombre()+ "\n"+
                "Laboratorio: "+ getLaboratorio()+ "\n"+
                "Precio: "+ getPrecio()+"\n";
    }

    public void addSintoma(String s){
        if(!sintomas.contains(s)){
            sintomas.add(s);
        }
    }


    public boolean tieneSintoma(String s){
        return getSintomas().contains(s);
    }



    public boolean equals(Object otro){
        Medicamento mm = (Medicamento) otro;
        try{
            return this.getNombre().equalsIgnoreCase(mm.getNombre());
        }catch (Exception exc){
            return false;
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getSintomas() {
        return new ArrayList<>(sintomas);
    }

    public void setSintomas(ArrayList<String> sintomas) {
        this.sintomas = new ArrayList<>(sintomas);
    }
}
