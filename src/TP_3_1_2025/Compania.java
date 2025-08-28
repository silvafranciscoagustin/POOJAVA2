package TP_3_1_2025;

import java.util.ArrayList;

public class Compania {
    private ArrayList<Encuesta> encuestas;
    private ArrayList<Empleado> empleados;
    private String nombre;

    public Compania(String nombre) {
        this.encuestas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void realizarEncuesta(Encuesta ee){
        // Chequear si ya existe una encuesta con la misma persona
        for (Encuesta e : encuestas) {
            if (e.getPersonaAEncuestar().equals(ee.getPersonaAEncuestar())) {
                System.out.println("La persona ya respondió una encuesta!");
                return; // salgo del método, no la agrego
            }
        }

        // Si llegó hasta acá, la persona no había sido encuestada antes
        encuestas.add(ee);
        ee.getEmpleado().incrementarTotalEncuestas();
        System.out.println("✅ Encuesta realizada");

    }

    public ArrayList<Encuesta> getEncuestas() {
        return new ArrayList<>(encuestas);
    }

    public void setEncuestas(ArrayList<Encuesta> encuestas) {
        this.encuestas = new ArrayList<>(encuestas);
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = new ArrayList<>(empleados);
    }
}
