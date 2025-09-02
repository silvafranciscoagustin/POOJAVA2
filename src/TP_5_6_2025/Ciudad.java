package TP_5_6_2025;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList<Contribuyente> contribuyentes;
    private double gastos;
    private int habitantes;

    public Ciudad(String nombre, double gastos, int habitantes) {
        this.nombre = nombre;
        this.gastos = gastos;
        this.habitantes = habitantes;
        this.contribuyentes = new ArrayList<>();
    }

    public void addContribuyente(Contribuyente c){
        if(!contribuyentes.contains(c)){
            contribuyentes.add(c);
        }
    }

    public boolean cumple(){
        return getHabitantes()>=100000;
    }

    public boolean estaEnPerdida(){
        return getMontoRecaudado()<getGastos();
    }


    public ArrayList<Contribuyente> getContribuyentes() {
        return new ArrayList<>(contribuyentes);
    }

    public void setContribuyentes(ArrayList<Contribuyente> contribuyentes) {
        this.contribuyentes = new ArrayList<>(contribuyentes);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoRecaudado() {
        double total = 0;
        for (Contribuyente c: contribuyentes) {
            total+=c.cantidadAbonada();
        }
        return total;
    }


    public boolean equals(Object o){
        Ciudad cc = (Ciudad) o ;
        try{
            return cc.getNombre().equalsIgnoreCase(this.getNombre());
        }catch (Exception exc){
            return false;
        }
    }


    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
}
