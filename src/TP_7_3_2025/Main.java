package TP_7_3_2025;

import TP_7_3_2025.condiciones.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sistema vivero = new Sistema();

        // Crear plantas de ejemplo
        Planta potus = new Planta("Epipremnum aureum", "Epipremnum", "Araceae", "Monocotyledoneae", 4, 3);
        potus.addNombreVulgar("potus");
        potus.addNombreVulgar("pothos");
        potus.addNombreVulgar("potos");

        Planta lenguaSuegra = new Planta("Sansevieria trifasciata", "Sansevieria", "Asparagaceae", "Monocotyledoneae", 8, 1);
        lenguaSuegra.addNombreVulgar("lengua de suegra");

        Planta crassula = new Planta("Crassula ovata", "Crassula", "Crassulaceae", "Monocotyledoneae", 9, 2);
        crassula.addNombreVulgar("árbol de jade");

        Planta plantaSol = new Planta("Helianthus annuus", "Helianthus", "Asteraceae", "Magnoliopsida", 10, 5);

        Planta plantaRiego = new Planta("Nymphaea alba", "Nymphaea", "Nymphaeaceae", "Magnoliopsida", 2, 10);

        Planta lenguaTigre = new Planta("Faucaria Tigrina", "Faucaria", "Aizoaceae", "Magnoliopsida", 7, 2);
        lenguaTigre.addNombreVulgar("lengua de tigre");

        // Agregar plantas al vivero
        vivero.addPlanta(potus);
        vivero.addPlanta(lenguaSuegra);
        vivero.addPlanta(crassula);
        vivero.addPlanta(plantaSol);
        vivero.addPlanta(plantaRiego);
        vivero.addPlanta(lenguaTigre);

        // --- Búsquedas con condiciones ---
        System.out.println("--- BÚSQUEDA DE PLANTAS EN EL VIVERO ---");

        // a) Todas las plantas cuyo nombre científico incluya la palabra “auereum”
        CondicionNombre c1 = new CondicionNombre("aureum");
        System.out.println("a) Plantas con nombre científico que incluye 'aureum':");
        System.out.println(vivero.plantaCumple(c1));
        System.out.println("----------------------------------------");

        // b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
        CondicionNombreVulgar c2 = new CondicionNombreVulgar("lengua de suegra");
        System.out.println("b) Plantas conocidas como 'lengua de suegra':");
        System.out.println(vivero.plantaCumple(c2));
        System.out.println("----------------------------------------");

        // c) Todas las plantas cuya clasificación sea “Crassula”
        CondicionClasificacionSuperior c3 = new CondicionClasificacionSuperior("Crassula");
        System.out.println("c) Plantas con clasificación 'Crassula':");
        System.out.println(vivero.plantaCumple(c3));
        System.out.println("----------------------------------------");

        // d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
        CondicionSolSuperiorA solSuperior = new CondicionSolSuperiorA(5);
        CondicionRiegoInferiorA riegoInferior = new CondicionRiegoInferiorA(3);
        CondicionAnd c4 = new CondicionAnd(solSuperior, riegoInferior);
        System.out.println("d) Plantas con sol > 5 Y riego < 3:");
        System.out.println(vivero.plantaCumple(c4));
        System.out.println("----------------------------------------");

        // e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
        CondicionSolInferiorA solInferior = new CondicionSolInferiorA(4);
        CondicionRiegoSuperiorA riegoSuperior = new CondicionRiegoSuperiorA(4);
        CondicionAnd c5 = new CondicionAnd(solInferior, riegoSuperior);
        System.out.println("e) Plantas con sol < 4 Y riego > 4:");
        System.out.println(vivero.plantaCumple(c5));
        System.out.println("----------------------------------------");

        // f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
        System.out.println("f) Plantas de interior con riego < 3:");
        System.out.println("Esta búsqueda no es posible con la clase 'Planta' proporcionada, ya que no tiene un atributo para la ubicación.");
        System.out.println("----------------------------------------");

        // g) Cualquier combinación lógica de las formas anteriores.
        CondicionNombreVulgar nombreVulgar = new CondicionNombreVulgar("potos");
        CondicionOr c7 = new CondicionOr(nombreVulgar, new CondicionClasificacionSuperior("Crassula"));
        System.out.println("g) Plantas conocidas como 'potos' O con clasificación 'Crassula':");
        System.out.println(vivero.plantaCumple(c7));
        System.out.println("----------------------------------------");

        // Ejemplo adicional: Todas las plantas que no se llaman "Sansevieria trifasciata"
        CondicionNot c8 = new CondicionNot(new CondicionNombre("Sansevieria trifasciata"));
        System.out.println("Ejemplo: Todas las plantas que no se llaman 'Sansevieria trifasciata':");
        System.out.println(vivero.plantaCumple(c8));
        System.out.println("----------------------------------------");
    }
}