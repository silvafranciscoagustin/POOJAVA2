package TP_6_5_2025_FARMACIA.condiciones;

import TP_6_5_2025_FARMACIA.Medicamento;

public class CondicionNombre extends Condicion{
    private String nombre;

    public CondicionNombre(String nombre) {
        setNombre(nombre);
    }

    @Override
    public boolean cumple(Medicamento m) {
        return this.getNombre().equalsIgnoreCase(m.getNombre());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
