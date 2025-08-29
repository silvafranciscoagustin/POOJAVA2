package TP_5_1_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Lista que representa el jardín
        ArrayList<Planta> plantas = new ArrayList<>();

        // Agregamos plantas al jardín
        plantas.add(new Planta("Rosa rubiginosa", "Rosa silvestre", "Argentina", LocalDate.of(2024, 3, 15)));
        plantas.add(new Planta("Lilium candidum", "Azucena", "Europa", LocalDate.of(2025, 1, 10)));
        plantas.add(new Planta("Helianthus annuus", "Girasol", "USA", LocalDate.of(2025, 2, 5)));
        plantas.add(new Planta("Orchis mascula", "Orquídea", "Europa", LocalDate.of(2025, 5, 20)));

        // Mostramos todas las plantas
        System.out.println("=== PLANTAS DEL JARDÍN ===");
        for (Planta p : plantas) {
            System.out.println(p); // llama automáticamente a toString()
            System.out.println("------------------------");
        }
    }
}

