package TP_4_6_2025;

public class Empleado extends Persona{
    private int nroLegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, int nroLegajo, double sueldo) {
        super(nombre, apellido, edad);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Nro Legajo: "+ getNroLegajo()+ "\n"+
                "Sueldo: "+getSueldo()+ "\n";
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
