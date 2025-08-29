package TP_4_4_2025;

import java.time.LocalDate;

public class Entrenador extends Persona{
    private int idFed;

    public Entrenador(boolean viajando, boolean concentrando, boolean enPaisOrigen, String apellido, String nombre, LocalDate fechaNac, int nroPasaporte, int idFed) {
        super(viajando, concentrando, enPaisOrigen, apellido, nombre, fechaNac, nroPasaporte);
        this.idFed = idFed;
    }

    public int getIdFed() {
        return idFed;
    }

    public void setIdFed(int idFed) {
        this.idFed = idFed;
    }
}
