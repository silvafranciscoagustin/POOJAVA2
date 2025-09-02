package TP_5_7_2025;

public class EmpleadoBono extends Empleado{
    private int cantVentas, bonoPorVentas, cantVentasMinBono;

    public EmpleadoBono(String nombre, String apellido, double sueldo, int dni, int cantVentas, int cantVentasMinBono) {
        super(nombre, apellido, sueldo, dni);
        setCantVentas(cantVentas);
        setCantVentasMinBono(cantVentasMinBono);
    }

    @Override
    public double calcularSueldo() {
        if(getCantVentas() >= getCantVentasMinBono()){
            return super.calcularSueldo() + getBonoPorVentas();
        }else {
            return super.calcularSueldo();
        }
    }

    public void agregarVenta(){
        int cantidadTotal = getCantVentas()+1;
        setCantVentas(cantidadTotal);
    }

    public int getCantVentasMinBono() {
        return cantVentasMinBono;
    }

    public void setCantVentasMinBono(int cantVentasMinBono) {
        this.cantVentasMinBono = cantVentasMinBono;
    }

    public int getBonoPorVentas() {
        return bonoPorVentas;
    }

    public void setBonoPorVentas(int bonoPorVentas) {
        this.bonoPorVentas = bonoPorVentas;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
}
