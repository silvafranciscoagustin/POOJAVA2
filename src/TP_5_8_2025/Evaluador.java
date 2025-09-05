package TP_5_8_2025;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private int dni;
    private ArrayList<String> conocimientosEvaluador;

    public Evaluador(String nombre,int dni) {
        this.nombre = nombre;
        this.dni = dni;
        conocimientosEvaluador = new ArrayList<>();
    }


    public boolean esApto(Trabajo t){
        return getConocimientosEvaluador().containsAll(t.getPalabrasClaveTrabajo());
    }

    @Override
    public boolean equals(Object o){
        Evaluador ee = (Evaluador) o;
        try{
            return this.getDni() == ee.getDni();
        }catch (Exception exc){
            return false;
        }
    }
    @Override
    public String toString() {
        return "Evaluador:\n" +
                "  Nombre: " + getNombre() + "\n" +
                "  DNI: " + getDni() + "\n" +
                "  Conocimientos: " + getConocimientosEvaluador();
    }

    public void addConocmientoEvaluador(String s){
        if(!conocimientosEvaluador.contains(s)){
            conocimientosEvaluador.add(s);
        }

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getConocimientosEvaluador() {
        return new ArrayList<>(conocimientosEvaluador);
    }

    public void setConocimientosEvaluador(ArrayList<String> conocimientosEvaluador) {
        this.conocimientosEvaluador = new ArrayList<>(conocimientosEvaluador);
    }
}
