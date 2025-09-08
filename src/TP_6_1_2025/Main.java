package TP_6_1_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Initialize the rental system
        SistemaAlquiler sistema = new SistemaAlquiler();
        System.out.println("--- Sistema de Alquiler iniciado ---");

        // Create clients
        Cliente cliente1 = new Cliente("Juan Perez", 11111111);
        Cliente cliente2 = new Cliente("Ana Garcia", 22222222);

        // Add clients to the system
        sistema.addClientes(cliente1);
        sistema.addClientes(cliente2);

        // Create a fake Item to use in the Alquiler (you'll need a mock or a real one)
        // For this test, let's create a simple anonymous inner class
        Item fakeItem = new Item() {
            @Override
            public boolean sepuedeAlquilar() {
                return true;
            }
            @Override
            public void alquilar() {
                System.out.println("Item alquilado!");
            }
        };

        // Create some rentals, with some overdue
        Alquiler alquiler1 = new Alquiler(fakeItem, cliente1, LocalDate.now().plusDays(7));
        Alquiler alquilerVencido1 = new Alquiler(fakeItem, cliente1, LocalDate.now().minusDays(3));
        Alquiler alquiler2 = new Alquiler(fakeItem, cliente2, LocalDate.now().plusDays(10));
        Alquiler alquilerVencido2 = new Alquiler(fakeItem, cliente2, LocalDate.now().minusDays(1));

        // Add the rentals to the system
        sistema.addAlquiler(alquiler1);
        sistema.addAlquiler(alquilerVencido1);
        sistema.addAlquiler(alquiler2);
        sistema.addAlquiler(alquilerVencido2);

        // Check for clients with overdue rentals
        System.out.println("\n--- Clientes con alquileres vencidos ---");
        ArrayList<Cliente> clientesVencidos = sistema.clientesAlquileresVencidos();
        if (clientesVencidos.isEmpty()) {
            System.out.println("No hay clientes con alquileres vencidos.");
        } else {
            for (Cliente c : clientesVencidos) {
                System.out.println(" - " + c.getNombre() + " (DNI: " + c.getDni() + ")");
            }
        }
    }
}