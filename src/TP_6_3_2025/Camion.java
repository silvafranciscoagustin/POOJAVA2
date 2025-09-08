package TP_6_3_2025;

import java.time.LocalDate;

public class Camion extends Elemento{
    private String patente;
    private LocalDate fechaCarga;

    public Camion(String patente, LocalDate fechaCarga) {
        this.patente = patente;
        this.fechaCarga = fechaCarga;
    }

    @Override
    public boolean esMenor(Elemento cc){
        return this.getFechaCarga().isBefore(((Camion)cc).getFechaCarga());
    }


    @Override
    public boolean equals(Object o) {
        Camion c = (Camion) o;
        try {
            return c.getPatente().equals(this.getPatente());
        }catch (Exception exc){
            return false;
        }
    }




    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }



    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }
}
