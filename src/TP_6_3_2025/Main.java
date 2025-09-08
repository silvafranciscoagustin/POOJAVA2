package TP_6_3_2025;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las colas de espera
        ColaDeEspera colaCamiones = new ColaDeEspera();
        ColaDeEspera colaBarcos = new ColaDeEspera();

        // 2. Crear una instancia de Puerto con las colas
        Puerto puerto = new Puerto(colaCamiones, colaBarcos);

        // --- Simulación de Camiones ---
        System.out.println("--- Agregando camiones a la cola ---");

        // Creamos algunos camiones con diferentes fechas de carga
        Camion c1 = new Camion("ABC-123", LocalDate.of(2025, 9, 3));
        Camion c2 = new Camion("DEF-456", LocalDate.of(2025, 9, 1));
        Camion c3 = new Camion("GHI-789", LocalDate.of(2025, 9, 5));

        // Agregamos los camiones al puerto (se deberían ordenar por fecha, de más antigua a más reciente)
        puerto.agregarCamion(c1);
        puerto.agregarCamion(c2);
        puerto.agregarCamion(c3);

        // Mostramos el estado de la cola de camiones
        System.out.println("Estado de la cola de camiones (ordenados por fecha de carga):");
        for (Elemento e : colaCamiones.getElementos()) {
            Camion c = (Camion) e;
            System.out.println("Patente: " + c.getPatente() + ", Fecha de carga: " + c.getFechaCarga());
        }
        System.out.println(); // Salto de línea para mejor visualización

        // --- Simulación de Barcos ---
        System.out.println("--- Agregando barcos a la cola ---");

        // Creamos algunos barcos con diferentes capacidades
        Barco b1 = new Barco("BAR-001", 50000.0);
        Barco b2 = new Barco("BAR-002", 100000.0);
        Barco b3 = new Barco("BAR-003", 25000.0);

        // Agregamos los barcos al puerto (se deberían ordenar por capacidad, de mayor a menor)
        puerto.agregarBarco(b1);
        puerto.agregarBarco(b2);
        puerto.agregarBarco(b3);

        // Mostramos el estado de la cola de barcos
        System.out.println("Estado de la cola de barcos (ordenados por capacidad):");
        for (Elemento e : colaBarcos.getElementos()) {
            Barco b = (Barco) e;
            System.out.println("Patente: " + b.getPatente() + ", Capacidad: " + b.getCapacidad() + " toneladas");
        }
    }
}