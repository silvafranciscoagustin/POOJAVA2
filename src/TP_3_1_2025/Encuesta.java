package TP_3_1_2025;

import java.util.ArrayList;

public class Encuesta {
    private ArrayList<Pregunta> preguntas;
    private Empleado empleado;
    private Persona personaAEncuestar;

    public Encuesta( Empleado empleado, Persona personaAEncuestar) {
        this.preguntas = new ArrayList<>();
        this.empleado = empleado;
        this.personaAEncuestar = personaAEncuestar;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return new ArrayList<>(preguntas);
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = new ArrayList<>(preguntas);
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Persona getPersonaAEncuestar() {
        return personaAEncuestar;
    }

    public void setPersonaAEncuestar(Persona personaAEncuestar) {
        this.personaAEncuestar = personaAEncuestar;
    }
}
