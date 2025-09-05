package TP_5_8_2025;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // --- 1. Inicialización del Sistema ---
        // Ahora el constructor crea las listas correctamente
        Sistema congreso = new Sistema("Congreso de Ciencias");
        System.out.println("--- Inicializando " + congreso.getNombre() + " ---");

        // --- 2. Creación y adición de Evaluadores ---
        Evaluador juan = new Evaluador("Juan", 111);
        juan.addConocmientoEvaluador("algoritmos");
        juan.addConocmientoEvaluador("redes");
        juan.addConocmientoEvaluador("lenguajes");

        Evaluador ana = new Evaluador("Ana", 222);
        ana.addConocmientoEvaluador("agentes");
        ana.addConocmientoEvaluador("visualizacion");

        Evaluador pedro = new Evaluador("Pedro", 333);
        pedro.addConocmientoEvaluador("redes");
        pedro.addConocmientoEvaluador("big data");

        congreso.addEvaluador(juan);
        congreso.addEvaluador(ana);
        congreso.addEvaluador(pedro);

        // Definir temas de expertos en el sistema
        congreso.addTemaExperto("agentes");
        congreso.addTemaExperto("visualizacion");
        congreso.addTemaExperto("big data");

        // --- 3. Creación y adición de Trabajos ---
        Trabajo trabajo1 = new Trabajo("Articulo sobre algoritmos");
        trabajo1.addPalabraClaveTrabajo("algoritmos");
        trabajo1.addPalabraClaveTrabajo("lenguajes");

        Trabajo trabajo2 = new Trabajo("Resumen de visualizacion");
        trabajo2.addPalabraClaveTrabajo("visualizacion");
        trabajo2.addPalabraClaveTrabajo("agentes");

        // Poster con su propia regla de aptitud
        Poster poster1 = new Poster("Poster de redes");
        poster1.addPalabraClaveTrabajo("redes");
        poster1.addPalabraClaveTrabajo("blockchain");

        congreso.addTrabajo(trabajo1);
        congreso.addTrabajo(trabajo2);
        congreso.addTrabajo(poster1);

        // --- 4. Respuestas a las preguntas del problema ---

        // Pregunta 1: Qué evaluador puede asignarse a un determinado trabajo
        System.out.println("\n--- 1) Evaluadores aptos para: " + trabajo1.getNombre() + " ---");
        ArrayList<Evaluador> evaluadoresAptos = congreso.getEvaluadoresAptos(trabajo1);
        for (Evaluador e : evaluadoresAptos) {
            System.out.println(e);
        }

        // Pregunta 2: Qué trabajos pueden asignarse a un evaluador particular
        System.out.println("\n--- 2) Trabajos aptos para: " + pedro.getNombre() + " ---");
        ArrayList<Trabajo> trabajosAptosPedro = congreso.trabajosAsignados(pedro);
        for (Trabajo t : trabajosAptosPedro) {
            System.out.println(t);
        }

        // Pregunta 3: Cuántos trabajos tiene un evaluador determinado
        System.out.println("\n--- 3) Cantidad de trabajos aptos para un evaluador ---");
        System.out.println("El evaluador '" + pedro.getNombre() + "' puede evaluar " + congreso.cantidadDeTrabajos(pedro) + " trabajos.");

        // Pregunta 4: Determinar si un evaluador dado es general o experto
        System.out.println("\n--- 4) Determinar si un evaluador es experto ---");
        System.out.println("El evaluador '" + juan.getNombre() + "' es experto? " + congreso.esExperto(juan));
        System.out.println("El evaluador '" + ana.getNombre() + "' es experto? " + congreso.esExperto(ana));
    }
}