package TP_4_4_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creo el contigente
        Contigente seleccion = new Contigente("Seleccion Argentina", new ArrayList<>());

        // Creo algunos jugadores
        Jugador j1 = new Jugador(false, false, true, "Messi", "Lionel",
                LocalDate.of(1987, 6, 24), 12345, "Delantero", "Izquierda", 800);
        Jugador j2 = new Jugador(false, true, true, "Di Maria", "Angel",
                LocalDate.of(1988, 2, 14), 67890, "Extremo", "Izquierda", 150);

        // Creo un entrenador
        Entrenador dt = new Entrenador(false, true, true, "Scaloni", "Lionel",
                LocalDate.of(1978, 5, 16), 11223, 999);

        // Creo un masajista
        Masajista masajista = new Masajista(false, false, true, "Perez", "Carlos",
                LocalDate.of(1975, 3, 10), 44556, "Kinesiologo", 15);

        // Agrego todos al contigente
        seleccion.addPersona(j1);
        seleccion.addPersona(j2);
        seleccion.addPersona(dt);
        seleccion.addPersona(masajista);

        // Consulto estado de todos
        seleccion.consultarTodos();
    }
}
