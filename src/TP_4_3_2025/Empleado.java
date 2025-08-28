package TP_4_3_2025;

public class Empleado {
    private double salarioFijo;
    private String nombre;

    public Empleado(double salarioFijo, String nombre) {
        this.salarioFijo = salarioFijo;
        this.nombre = nombre;
    }

    public double calcularSueldo(){
        return getSalarioFijo();
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
