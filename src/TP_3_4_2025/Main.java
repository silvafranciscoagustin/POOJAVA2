package TP_3_4_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear el celular
        Celular miCelular = new Celular("Samsung Galaxy S25");

        // Crear contactos
        Contacto c1 = new Contacto("Juan", "Perez", "Calle Falsa 123", "juan@mail.com",
                LocalDate.of(1990, 5, 12), 12345678, 1111);
        Contacto c2 = new Contacto("Ana", "Gomez", "Av Siempre Viva 456", "ana@mail.com",
                LocalDate.of(1985, 8, 20), 87654321, 2222);
        Contacto c3 = new Contacto("Juan", "Perez", "Calle Falsa 123", "juan@mail.com",
                LocalDate.of(1990, 5, 12), 12345678, 1111); // repetido
        Contacto c4 = new Contacto("Luis", "Martinez", "Calle Real 789", "luis@mail.com",
                LocalDate.of(2000, 3, 15), 11223344, 3333);
        Contacto c5 = new Contacto("Ana", "Gomez", "Av Siempre Viva 456", "ana@mail.com",
                LocalDate.of(1985, 8, 20), 87654321, 2222); // repetido

        // Agregar contactos al celular
        miCelular.agregarContacto(c1);
        miCelular.agregarContacto(c2);
        miCelular.agregarContacto(c3);
        miCelular.agregarContacto(c4);
        miCelular.agregarContacto(c5);

        // Mostrar promedio de edad
        double promedioEdad = miCelular.obtenerPromedioEdad();
        System.out.println("Promedio de edad de contactos: " + promedioEdad);

        // Mostrar contactos repetidos
        ArrayList<Contacto> repetidos = miCelular.mostrarRepetidos();
        System.out.println("\nContactos repetidos:");
        for (Contacto c : repetidos) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - Tel: " + c.getNroTel());
        }

       ArrayList<Contacto> contactos = miCelular.mostrarContactos();
        System.out.println( "LISTADO COMPLETO DE CONTACTOS: ");
        for (Contacto c : contactos) {
                    System.out.println(c.getNombre() + " " + c.getApellido() + " - Tel: " + c.getNroTel());
        }






    }
}