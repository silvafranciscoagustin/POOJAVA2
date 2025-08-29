package TP_4_6_2025;

import java.util.ArrayList;

public class Sistema {
    private String nombre;
    private ArrayList<Persona> personas;

    public Sistema(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    public String mostrarTodos() {
        if (personas.isEmpty()) {
            return "No hay personas en el sistema";
        }
        String resultado = "";
        for (Persona p : personas) {
            resultado += p.toString() + "\n----------------\n";
        }
        return resultado;
    }

    public void addPersona(Persona p ){
        personas.add(p);
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getPersonas() {
        return new ArrayList<>(personas);
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = new ArrayList<>(personas);
    }
}
