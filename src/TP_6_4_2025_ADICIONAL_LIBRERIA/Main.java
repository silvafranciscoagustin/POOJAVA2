package TP_6_4_2025_ADICIONAL_LIBRERIA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inicializar la librería y sus listas
        Libreria libreria = new Libreria();
        libreria.setClientes(new ArrayList<>());
        libreria.setArticulos(new ArrayList<>());

        // --- Crear y agregar 5 artículos, agregando géneros correctamente ---
        Articulo libroFantasia = new Articulo("El Señor de los Anillos", "J.R.R. Tolkien", "Un libro de fantasia.", 1200, 25000);
        libroFantasia.addGenero("Fantasia");
        libroFantasia.addGenero("Aventura");
        libreria.addArticulo(libroFantasia);

        Articulo libroCiencia = new Articulo("Cosmos", "Carl Sagan", "Un libro de ciencia.", 450, 18000);
        libroCiencia.addGenero("Ciencia");
        libroCiencia.addGenero("Divulgacion");
        libreria.addArticulo(libroCiencia);

        Articulo revistaDeportiva = new Articulo("Deportes Hoy", "Revista Dep", "Noticias deportivas", 150, 5000);
        revistaDeportiva.addGenero("Deportes");
        libreria.addArticulo(revistaDeportiva);

        Articulo libroPoesia = new Articulo("20 Poemas de Amor", "Pablo Neruda", "Libro de poemas", 100, 12000);
        libroPoesia.addGenero("Poesia");
        libroPoesia.addGenero("Romance");
        libreria.addArticulo(libroPoesia);

        Articulo libroTerror = new Articulo("El Resplandor", "Stephen King", "Novela de terror", 600, 20000);
        libroTerror.addGenero("Terror");
        libreria.addArticulo(libroTerror);


        // --- Crear y agregar 5 clientes con diferentes perfiles ---
        // 1. Cliente Socio (Autor: Tolkien, Sagan)
        ClienteSocio c1 = new ClienteSocio("Carlos", "Gomez", "Calle Falsa 123", 111);
        c1.addAutor("J.R.R. Tolkien");
        c1.addAutor("Carl Sagan");
        libreria.addCliente(c1);

        // 2. Cliente Frecuente (Autor: Tolkien; Géneros: Fantasia, Aventura)
        ClienteFrecuente c2 = new ClienteFrecuente("Ana", "Diaz", "Av. Siempre Viva 742", 222);
        c2.addAutor("J.R.R. Tolkien");
        c2.addGenero("Fantasia");
        c2.addGenero("Aventura");
        libreria.addCliente(c2);

        // 3. Cliente Normal (no tiene filtros de gusto)
        ClienteNormal c3 = new ClienteNormal("Pedro", "Lopez", "Boulevard de los Sueños Rotos", 333);
        libreria.addCliente(c3);

        // 4. Otro Cliente Frecuente (Autor: King; Género: Terror)
        ClienteFrecuente c4 = new ClienteFrecuente("Sofia", "Ramirez", "Calle del Sol 8", 444);
        c4.addAutor("Stephen King");
        c4.addGenero("Terror");
        libreria.addCliente(c4);

        // 5. Otro Cliente Socio (Autor: Neruda)
        ClienteSocio c5 = new ClienteSocio("Luis", "Perez", "Avenida de los Poetas", 555);
        c5.addAutor("Pablo Neruda");
        libreria.addCliente(c5);


        // --- PRUEBA DE LOS SERVICIOS DE LA LIBRERÍA ---
        System.out.println("--- LISTADO COMPLETO DE CLIENTES Y ARTICULOS ---");
        libreria.mostrarClientes();
        libreria.mostrarArticulos();

        System.out.println("--- PRUEBA DE GUSTOS DE CLIENTES ---");
        libreria.clientesQueLeGustaArticulo(libroFantasia);
        System.out.println("----------------------------------------");
        libreria.clientesQueLeGustaArticulo(libroCiencia);
        System.out.println("----------------------------------------");
        libreria.clientesQueLeGustaArticulo(revistaDeportiva);
        System.out.println("----------------------------------------");
        libreria.clientesQueLeGustaArticulo(libroPoesia);
        System.out.println("----------------------------------------");
        libreria.clientesQueLeGustaArticulo(libroTerror);
        System.out.println("----------------------------------------");


        // --- PRUEBA DE PRECIOS CON DESCUENTO ---
        System.out.println("--- PRUEBA DE PRECIOS CON DESCUENTO ---");
        System.out.println("Precios para el libro de Fantasía (Original: $" + libroFantasia.getPrecio() + ")");
        System.out.println("- Cliente Socio (" + c1.getNombre() + "): $" + c1.calcularDto(libroFantasia));
        System.out.println("- Cliente Frecuente (" + c2.getNombre() + "): $" + c2.calcularDto(libroFantasia));
        System.out.println("- Cliente Normal (" + c3.getNombre() + "): $" + c3.calcularDto(libroFantasia));
        System.out.println("----------------------------------------\n");


        // --- PRUEBA DE COMPRAS ---
        System.out.println("--- PRUEBA DE COMPRAS ---");
        // Simular compras para los clientes
        c1.setCompras(new ArrayList<>());
        c2.setCompras(new ArrayList<>());
        c4.setCompras(new ArrayList<>());
        c1.getCompras().add(libroFantasia);
        c2.getCompras().add(revistaDeportiva);
        c4.getCompras().add(libroTerror);

        System.out.println("¿El cliente Carlos ya compró el libro de Fantasía?: " + c1.yaCompro(libroFantasia));
        System.out.println("¿El cliente Carlos ya compró el libro de Ciencia?: " + c1.yaCompro(libroCiencia));
        System.out.println("¿El cliente Ana ya compró la revista deportiva?: " + c2.yaCompro(revistaDeportiva));
        System.out.println("¿El cliente Sofía ya compró el libro de Terror?: " + c4.yaCompro(libroTerror));
        System.out.println("----------------------------------------");
    }
}