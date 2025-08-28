package TP_2_4_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario juan = new Usuario("Juan");
        Usuario ana = new Usuario("Ana");
        Usuario pepe = new Usuario("Pepe");

        // Crear establecimiento
        Establecimiento club = new Establecimiento("Club Deportivo");

        // Crear turnos (simulando fechas recientes y antiguas)
        Turno t1 = new Turno("Fútbol 5", 400, juan, LocalDate.now().minusDays(5));
        Turno t2 = new Turno("Paddle", 100, juan, LocalDate.now().minusDays(10));
        Turno t3 = new Turno("Fútbol 5", 400, juan, LocalDate.now().minusDays(20));
        Turno t4 = new Turno("Paddle", 100, juan, LocalDate.now().minusDays(25)); // Juan ya tiene 4 turnos → socio
        Turno t5 = new Turno("Fútbol 5", 400, ana, LocalDate.now().minusDays(5));
        Turno t6 = new Turno("Paddle", 100, pepe, LocalDate.now().minusMonths(3)); // turno viejo, no cuenta para socio

        // Reservar turnos
        club.reservarTurno(t1);
        club.reservarTurno(t2);
        club.reservarTurno(t3);
        club.reservarTurno(t4);
        club.reservarTurno(t5);
        club.reservarTurno(t6);

        System.out.println("\n===============================");
        System.out.println("Lista de socios del club:");
        System.out.println("===============================");
        for (Usuario u : club.socios()) {
            System.out.println("- " + u.getNombre());
        }
    }
}
