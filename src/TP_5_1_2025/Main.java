package TP_5_1_2025;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Creamos las plantas
        Planta p1 = new Planta("Rosa rubiginosa", "Rosa silvestre", "Argentina", LocalDate.of(2024, 3, 15));
        Planta p2 = new Planta("Lilium candidum", "Azucena", "Europa", LocalDate.of(2025, 1, 10));
        Planta p3 = new Planta("Helianthus annuus", "Girasol", "USA", LocalDate.of(2025, 2, 5));
        Planta p4 = new Planta("Orchis mascula", "Orquídea", "Europa", LocalDate.of(2025, 5, 20));

        // Creamos el jardín
        Jardin miJardin = new Jardin();

        // Agregamos las plantas al jardín usando el addPlanta(Planta)
        miJardin.addPlanta(p1);
        miJardin.addPlanta(p2);
        miJardin.addPlanta(p3);
        miJardin.addPlanta(p4);

        // Mostramos todas las plantas
        System.out.println("=== PLANTAS DEL JARDÍN ===");
        System.out.println(miJardin.mostrarTodos());
    }
}





