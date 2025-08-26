package TP_3_2_2025;

public class Main {
    public static void main(String[] args) {
        // Crear carpintería
        Carpinteria carp = new Carpinteria("Carpintería Don Pepe");

        // Crear algunos muebles
        Mueble mesa = new Mueble(20.5, 5000, 0, "Roble", "Marrón");
        Mueble silla = new Mueble(5.2, 1200, 0, "Pino", "Blanco");
        Mueble armario = new Mueble(45.0, 10000, 0, "Cedro", "Negro");

        // Agregarlos al stock con addMueble
        carp.addMueble(mesa);
        carp.addMueble(silla);
        carp.addMueble(armario);

        // Mostrar cálculos
        System.out.println("===============================");
        System.out.println("Carpintería: " + carp.getNombre());
        System.out.println("Costo total del stock: $" + carp.costoProdStock());
        System.out.println("Precio de venta del stock: $" + carp.precioVentaStock());
        System.out.println("===============================");

        // Mostrar lista de muebles
        System.out.println("Muebles en stock:");
        for (Mueble m : carp.getMuebles()) {
            System.out.println("- " + m.getTipoMadera() + " | Color: " + m.getColor() + " | Costo: $" + m.getCosto());
        }
    }
}
