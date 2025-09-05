package TP_5_8_2025;

public class Poster extends Trabajo {
    public Poster(String nombre) {
        super(nombre);
    }

    @Override
    public boolean esAptoTrabajo(Evaluador e) {
        // La lógica correcta: el evaluador solo necesita una coincidencia.
        for (String palabraClave : getPalabrasClaveTrabajo()) {
            if (e.getConocimientosEvaluador().contains(palabraClave)) {
                return true; // Encontró una coincidencia, es apto.
            }
        }
        return false; // No hay ninguna coincidencia.
    }
}
