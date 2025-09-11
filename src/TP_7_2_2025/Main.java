package TP_7_2_2025;

import TP_7_2_2025.Condiciones.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inicializar el historiador
        Historiador historiador = new Historiador("Ricardo Historiador");

        // --- Crear autores ---
        Autor autor1 = new Autor("Julio Verne", 123456);
        Autor autor2 = new Autor("Isaac Asimov", 789012);
        Autor autor3 = new Autor("Stephen King", 345678);

        // --- Crear documentos ---
        Documento doc1 = new Documento("20000 Leguas de Viaje Submarino", "La novela de ciencia ficcion y aventura en las profundidades del mar.", new ArrayList<>());
        doc1.addAutor(autor1);
        doc1.addPalabraClave("ciencia ficcion");
        doc1.addPalabraClave("aventura");

        Documento doc2 = new Documento("Fundacion", "Un imperio galactico decae y la historia lo predice.", new ArrayList<>());
        doc2.addAutor(autor2);
        doc2.addPalabraClave("ciencia ficcion");
        doc2.addPalabraClave("imperio");

        Documento doc3 = new Documento("El Resplandor", "Una familia en un hotel embrujado. Mucho terror y suspenso.", new ArrayList<>());
        doc3.addAutor(autor3);
        doc3.addPalabraClave("terror");
        doc3.addPalabraClave("psicologico");

        Documento doc4 = new Documento("Viaje al Centro de la Tierra", "Un viaje increible al interior del planeta. Aventura fantastica.", new ArrayList<>());
        doc4.addAutor(autor1);
        doc4.addPalabraClave("aventura");
        doc4.addPalabraClave("fantasia");

        Documento doc5 = new Documento("Documento sin Palabras Claves", "Este documento no tiene palabras claves.", new ArrayList<>());
        doc5.addAutor(autor2);

        // Agregar documentos al historiador
        historiador.addDocumento(doc1);
        historiador.addDocumento(doc2);
        historiador.addDocumento(doc3);
        historiador.addDocumento(doc4);
        historiador.addDocumento(doc5);

        // --- Búsquedas con condiciones ---
        System.out.println("--- BÚSQUEDA DE DOCUMENTOS ---");

        // a) Todos los documentos cuyo título sea exactamente igual a un título dado.
        CondicionTitulo c1 = new CondicionTitulo("Fundacion");
        System.out.println("1. Documentos con título exacto 'Fundacion':");
        System.out.println(historiador.encontrarDocumentos(c1));
        System.out.println("----------------------------------------");

        // b) Todos los documentos cuyo título contenga una palabra o frase dada.
        // Se usa CondicionFrase, que busca una frase en el contenido, pero aquí lo aplicamos al título
        CondicionFrase cTituloFrase = new CondicionFrase("viaje");
        System.out.println("2. Documentos cuyo título contiene 'viaje':");
        System.out.println(historiador.encontrarDocumentos(cTituloFrase));
        System.out.println("----------------------------------------");

        // c) Todos los documentos que contengan una palabra clave dada.
        CondicionPalabra c3 = new CondicionPalabra("ciencia ficcion");
        System.out.println("3. Documentos con palabra clave 'ciencia ficcion':");
        System.out.println(historiador.encontrarDocumentos(c3));
        System.out.println("----------------------------------------");

        // d) Todos los documentos que no contengan ninguna palabra clave.
        CondicionNot c4 = new CondicionNot(new CondicionPalabrasMinimas(1));
        System.out.println("4. Documentos que no contienen ninguna palabra clave:");
        System.out.println(historiador.encontrarDocumentos(c4));
        System.out.println("----------------------------------------");

        // e) Todos los documentos de un autor determinado.
        CondicionAutor c5 = new CondicionAutor(autor1);
        System.out.println("5. Documentos del autor Julio Verne:");
        System.out.println(historiador.encontrarDocumentos(c5));
        System.out.println("----------------------------------------");

        // f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
        CondicionFrase c6 = new CondicionFrase("imperio");
        System.out.println("6. Documentos cuyo contenido tiene 'imperio':");
        System.out.println(historiador.encontrarDocumentos(c6));
        System.out.println("----------------------------------------");

        // g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
        CondicionPalabrasMinimas c7 = new CondicionPalabrasMinimas(20);
        System.out.println("7. Documentos con al menos 20 palabras en el contenido:");
        System.out.println(historiador.encontrarDocumentos(c7));
        System.out.println("----------------------------------------");

        // h) Cualquier combinación lógica de las formas anteriores.
        CondicionAutor autorVerne = new CondicionAutor(autor1);
        CondicionPalabra claveAventura = new CondicionPalabra("aventura");
        CondicionAnd c8 = new CondicionAnd(autorVerne, claveAventura);
        System.out.println("8. Documentos de Julio Verne Y con palabra clave 'aventura':");
        System.out.println(historiador.encontrarDocumentos(c8));
        System.out.println("----------------------------------------");
    }
}