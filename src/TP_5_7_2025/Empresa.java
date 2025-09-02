package TP_5_7_2025;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public double totalGastos(){
        double totalGastos = 0;
        for (Empleado e: empleados) {
            totalGastos+= e.calcularSueldo();
        }
        return totalGastos;
    }


    public void mostrarEmpleados(){
        for (Empleado e:empleados) {
            System.out.println(e);
        }
    }

    public void addEmpleado(Empleado e){
        if(!empleados.contains(e)){
            empleados.add(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = new ArrayList<>(empleados);
    }
}
