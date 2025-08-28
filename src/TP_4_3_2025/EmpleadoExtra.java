package TP_4_3_2025;

public class EmpleadoExtra extends Empleado{
    private final int valorHoraExtra = 100;
    private int cantHorasExtra;

    public EmpleadoExtra (String nombre, double salarioFijo, int cantHorasExtra){
        super(salarioFijo, nombre);
        this.cantHorasExtra = cantHorasExtra;

    }

    public double calcularSueldo(){
        return super.calcularSueldo()+getCantHorasExtra()*getValorHoraExtra();
    }

    public void setCantHorasExtra(int cantHorasExtra){
        this.cantHorasExtra = cantHorasExtra;
    }

    public int getValorHoraExtra() {
        return valorHoraExtra;
    }

    public int getCantHorasExtra() {
        return cantHorasExtra;
    }
}
