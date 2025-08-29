package TP_4_4_2025;

import java.time.LocalDate;

public class Persona {
    private boolean viajando,concentrando,enPaisOrigen;
    private String apellido,nombre;
    private LocalDate fechaNac;
    private int nroPasaporte;

    public Persona(boolean viajando, boolean concentrando, boolean enPaisOrigen, String apellido, String nombre, LocalDate fechaNac, int nroPasaporte) {
        this.viajando = viajando;
        this.concentrando = concentrando;
        this.enPaisOrigen = enPaisOrigen;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.nroPasaporte = nroPasaporte;
    }

    public String estaDisponible(){
        if(isEnPaisOrigen() && !isConcentrando()){
            return "Esta Disponible";
        }else{
            return "No disponible, concentrando";
        }
    }




    public boolean isViajando() {
        return viajando;
    }

    public void setViajando(boolean viajando) {
        this.viajando = viajando;
    }

    public boolean isConcentrando() {
        return concentrando;
    }

    public void setConcentrando(boolean concentrando) {
        this.concentrando = concentrando;
    }

    public boolean isEnPaisOrigen() {
        return enPaisOrigen;
    }

    public void setEnPaisOrigen(boolean enPaisOrigen) {
        this.enPaisOrigen = enPaisOrigen;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(int nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }
}
