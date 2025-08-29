package TP_4_4_2025;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Contigente {
    private String nombre;
    private ArrayList<Persona> personas;

    public Contigente(String nombre, ArrayList<Persona> personas) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    public void addPersona(Persona p ){
        personas.add(p);
    }
    public void consultarTodos(){
        for (Persona p: personas) {
            System.out.println("Estado: "+ p.getNombre()+ " "+ p.getApellido()+  " --->" +p.estaDisponible());
        }
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
