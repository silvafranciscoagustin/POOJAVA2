package TP_6_1_2025;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    ArrayList<Alquiler> alquileres;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.alquileres = new ArrayList();
    }

    @Override
    public String toString() {
        return "Cliente: " + getNombre() + " (DNI: " + getDni() + ")";
    }

    public void addAlquiler(Alquiler a){
        if(!alquileres.contains(a)){
            alquileres.add(a);
        }
    }

    public boolean equals(Object o) {
        Cliente cc = (Cliente) o;

        try {

            return this.getDni() == cc.getDni();
        }

        catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<>(alquileres);
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = new ArrayList<>(alquileres);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


}
