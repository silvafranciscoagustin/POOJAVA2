package TP_4_5_2025;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Producto fresco
        ProductoFresco fresco = new ProductoFresco(
                LocalDate.of(2025, 10, 1),
                101,
                LocalDate.of(2025, 8, 20),
                "Granja San Pedro",
                "Lechuga"
        );

        // Producto congelado genérico
        ProductoCongelado congelado = new ProductoCongelado(
                LocalDate.of(2026, 1, 15),
                202,
                LocalDate.of(2025, 9, 1),
                "Frigorifico Patagonico",
                3344,
                -18,
                "Pollo"
        );

        // Producto congelado por agua
        PCongeladoAgua congeladoAgua = new PCongeladoAgua(
                LocalDate.of(2026, 5, 30),
                303,
                LocalDate.of(2025, 9, 10),
                "Frigorifico Mar Azul",
                5566,
                -20,
                30,   // gramos de sal
                2,    // litros de agua
                "Pescado"
        );

        // Producto congelado por aire
        PCongeladoAire congeladoAire = new PCongeladoAire(
                LocalDate.of(2026, 8, 15),
                404,
                LocalDate.of(2025, 9, 12),
                "Frigorifico La Pampa",
                7788,
                -25,
                70,   // % aire
                20,   // % agua
                10,   // % nitrogeno
                "Carne vacuna"
        );
        congeladoAire.setDioxidoCarbono(5);

        // Producto congelado por nitrogeno
        PCongeladoNitrogeno congeladoNitrogeno = new PCongeladoNitrogeno(
                LocalDate.of(2027, 1, 10),
                505,
                LocalDate.of(2025, 9, 15),
                "Frigorifico Los Andes",
                9911,
                -30,
                "Inmersion rapida",
                120,   // segundos
                "Frutillas"
        );

        // Mostramos todo
        System.out.println("=== PRODUCTO FRESCO ===");
        System.out.println(fresco);

        System.out.println("=== PRODUCTO CONGELADO ===");
        System.out.println(congelado);

        System.out.println("=== PRODUCTO CONGELADO POR AGUA ===");
        System.out.println(congeladoAgua);
        System.out.println("Salinidad (g/L): " + congeladoAgua.calcularSalinidad());

        System.out.println("=== PRODUCTO CONGELADO POR AIRE ===");
        System.out.println(congeladoAire);

        System.out.println("=== PRODUCTO CONGELADO POR NITROGENO ===");
        System.out.println(congeladoNitrogeno);
    }
}
