package TP_4_6_2025;

import java.util.ArrayList;

public class UsuarioJerrarquico extends Empleado {
    private ArrayList<Empleado> empleadosAcargo;

    public UsuarioJerrarquico(String nombre, String apellido, int edad, int nroLegajo, double sueldo, ArrayList<Empleado> empleadosAcargo) {
        super(nombre, apellido, edad, nroLegajo, sueldo);
        this.empleadosAcargo = new ArrayList<>();
    }

    public String toString() {
    String resultado = super.toString() + "Listado de empleados a cargo:\n";
    for (Empleado e : empleadosAcargo) {
        resultado += e.toString() + "\n"; // <--- esto agrega cada empleado al string
    }
    return resultado;
}


    public void addEmpleadoAcargo(Empleado a){
        empleadosAcargo.add(a);
    }

    public ArrayList<Empleado> getEmpleadosAcargo() {
        return new ArrayList<>(empleadosAcargo);
    }

    public void setEmpleadosAcargo(ArrayList<Empleado> empleadosAcargo) {
        this.empleadosAcargo = new ArrayList<>(empleadosAcargo);
    }
}
