package TP_5_7_2025;

public class EmpleadoVendedor extends Empleado{
    private  double porcentajeVenta;

    private double montoVentas;

    public EmpleadoVendedor(String nombre, String apellido, double sueldo, int dni, double montoVentas,double porcentajeVenta) {
        super(nombre, apellido, sueldo, dni);
        setMontoVentas(montoVentas);
        setPorcentajeVenta(porcentajeVenta);
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + getMontoVentas()*getPorcentajeVenta();
    }

    public double getPorcentajeVenta() {
        return porcentajeVenta;
    }

    public void setPorcentajeVenta(double porcentajeVenta) {
        this.porcentajeVenta = porcentajeVenta;
    }

    public double getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(double montoVentas) {
        this.montoVentas = montoVentas;
    }
}
