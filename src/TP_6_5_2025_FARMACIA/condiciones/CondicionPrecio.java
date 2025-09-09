package TP_6_5_2025_FARMACIA.condiciones;

import TP_6_5_2025_FARMACIA.Medicamento;
import TP_6_5_2025_FARMACIA.condiciones.Condicion;

public class CondicionPrecio extends Condicion {
    public CondicionPrecio(double precio) {
        setPrecio(precio);
    }

    public boolean cumple(Medicamento m){
        return this.getPrecio()>m.getPrecio();
    }

    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
