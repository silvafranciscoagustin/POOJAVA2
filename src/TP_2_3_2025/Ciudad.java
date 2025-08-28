package TP_2_3_2025;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList<Impuesto> impuestos;
    private double montoRecaudado;
    private double gastos;
    private int habitantes;

    public Ciudad(String nombre, double montoRecaudado, double gastos, int habitantes) {
        this.nombre = nombre;
        this.montoRecaudado = montoRecaudado;
        this.gastos = gastos;
        this.habitantes = habitantes;
        this.impuestos = new ArrayList<>();
    }

    public boolean cumple(){
        return getHabitantes()>=100000;
    }

    public boolean estaEnPerdida(){
        return getMontoRecaudado()<getGastos();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Impuesto> getImpuestos() {
        return new ArrayList<>(impuestos);
    }

    public void setImpuestos(ArrayList<Impuesto> impuestos) {
        this.impuestos = new ArrayList<>(impuestos);
    }

    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(double montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
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
