package TP_6_5_2025_FARMACIA;

import TP_6_5_2025_FARMACIA.condiciones.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inicializar la farmacia
        Farmacia farmacia = new Farmacia("Farmacia Central");
        farmacia.setMedicamentos(new ArrayList<>()); // Inicializa la lista de medicamentos

        // --- Crear medicamentos ---
        Medicamento ibuprofeno = new Medicamento("Ibuprofeno", "Bayer", 500.0);
        ibuprofeno.addSintoma("dolor de cabeza");
        ibuprofeno.addSintoma("fiebre");

        Medicamento aspirina = new Medicamento("Aspirina", "Bayer", 650.0);
        aspirina.addSintoma("dolor de cabeza");
        aspirina.addSintoma("dolor muscular");

        Medicamento paracetamol = new Medicamento("Paracetamol", "Genfar", 400.0);
        paracetamol.addSintoma("fiebre");

        Medicamento amoxicilina = new Medicamento("Amoxicilina", "Roche", 1200.0);
        amoxicilina.addSintoma("infeccion");

        Medicamento omeprazol = new Medicamento("Omeprazol", "LaboX", 800.0);
        omeprazol.addSintoma("acidez");

        // Agregar medicamentos a la farmacia
        farmacia.addMedicamento(ibuprofeno);
        farmacia.addMedicamento(aspirina);
        farmacia.addMedicamento(paracetamol);
        farmacia.addMedicamento(amoxicilina);
        farmacia.addMedicamento(omeprazol);

        // --- Búsquedas usando diferentes condiciones ---
        System.out.println("--- PRUEBAS DE BÚSQUEDA EN LA FARMACIA ---");

        // 1. Buscar por nombre
        Condicion c1 = new CondicionNombre("Ibuprofeno");
        System.out.println("Buscando por nombre: 'Ibuprofeno'");
        System.out.println(farmacia.buscar(c1));
        System.out.println("----------------------------------------\n");

        // 2. Buscar por precio menor a $1000
        Condicion c2 = new CondicionPrecio(1000.0);
        System.out.println("Buscando por precio menor a: $1000");
        System.out.println(farmacia.buscar(c2));
        System.out.println("----------------------------------------\n");

        // 3. Buscar por un síntoma
        Condicion c3 = new CondicionSintoma("fiebre");
        System.out.println("Buscando por síntoma: 'fiebre'");
        System.out.println(farmacia.buscar(c3));
        System.out.println("----------------------------------------\n");

        // 4. Buscar con lógica 'AND': por precio menor a $1000 Y por síntoma 'dolor de cabeza'
        Condicion precioMenor1000 = new CondicionPrecio(1000.0);
        Condicion sintomaDolorCabeza = new CondicionSintoma("dolor de cabeza");
        Condicion c4 = new CondicionAnd(precioMenor1000, sintomaDolorCabeza);
        System.out.println("Buscando por: precio < $1000 Y síntoma 'dolor de cabeza'");
        System.out.println(farmacia.buscar(c4));
        System.out.println("----------------------------------------\n");

        // 5. Buscar con lógica 'OR': por laboratorio 'Bayer' O por síntoma 'infeccion'
        Condicion labBayer = new CondicionLaboratorio("Bayer"); // Asumiendo que existe una clase CondicionLaboratorio
        Condicion sintomaInfeccion = new CondicionSintoma("infeccion");
        Condicion c5 = new CondicionOr(labBayer, sintomaInfeccion);
        System.out.println("Buscando por: lab 'Bayer' O síntoma 'infeccion'");
        System.out.println(farmacia.buscar(c5));
        System.out.println("----------------------------------------\n");

        // 6. Buscar con lógica 'NOT': no tiene el síntoma 'acidez'
        Condicion sintomaAcidez = new CondicionSintoma("acidez");
        Condicion c6 = new CondicionNot(sintomaAcidez);
        System.out.println("Buscando por: NO tiene síntoma 'acidez'");
        System.out.println(farmacia.buscar(c6));
        System.out.println("----------------------------------------\n");
    }
}