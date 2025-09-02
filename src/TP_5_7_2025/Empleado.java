package TP_5_7_2025;

import java.security.PublicKey;

public class Empleado {
    private String nombre, apellido;
    private double sueldo;
    private int dni;

    public Empleado(String nombre, String apellido, double sueldo, int dni) {
        setNombre(nombre);
        setApellido(apellido);
        setSueldo(sueldo);
        this.dni = dni;
    }


    public double calcularSueldo(){
        return getSueldo();
    }


    public boolean equals(Object o ){
        Empleado ee = (Empleado) o;
        try{
           return ee.getDni() == this.getDni();
        }catch (Exception exc){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +"\n"+
               "Apellido: " + getApellido() +"\n"+
                "Dni: " + getDni() +"\n"+
                "Sueldo: "+ calcularSueldo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getDni() {
        return dni;
    }
}
