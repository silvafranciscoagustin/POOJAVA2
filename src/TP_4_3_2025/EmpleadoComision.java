package TP_4_3_2025;

import java.util.ArrayList;

public class EmpleadoComision extends Empleado{
    private final double porcentajeXVenta = 0.40;
    private ArrayList<Venta> ventas;

    public EmpleadoComision (double salarioFijo,String nombre){
        super(salarioFijo,nombre);
        this.ventas = new ArrayList<>();
    }

    public void addVenta(Venta v){
        ventas.add(v);
    }



    @Override
    public double calcularSueldo() {
        double totalVentas = 0;
        for (Venta v: ventas) {
            totalVentas+=v.getValor();
        }
        return super.calcularSueldo()+(totalVentas*getPorcentajeXVenta());
    }


    public ArrayList<Venta> getVentas() {
        return new ArrayList<>(ventas);
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = new ArrayList<>(ventas);
    }

    public double getPorcentajeXVenta() {
        return porcentajeXVenta;
    }


}
