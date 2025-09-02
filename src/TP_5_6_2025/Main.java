package TP_5_6_2025;

public class Main {
    public static void main(String[] args) {

        // --- Creando Contribuyentes ---
        System.out.println("--- Creando Contribuyentes ---");
        Contribuyente simple1 = new Contribuyente("Juan Perez", 1001, 1000);
        Contribuyente simple2 = new Contribuyente("Maria Lopez", 1002, 1200);

        ContribuyenteComerciante comerciante1 = new ContribuyenteComerciante("Carlos Gomez", 2001, 1000, 50000);
        ContribuyenteComerciante comerciante2 = new ContribuyenteComerciante("Ana Rodriguez", 2002, 1000, 10000);

        ContribuyenteProgramador programador1 = new ContribuyenteProgramador("Pedro Martinez", 3001, 1000, 80000);
        ContribuyenteProgramador programador2 = new ContribuyenteProgramador("Laura Diaz", 3002, 1000, 20000);

        System.out.println("Monto abonado por Carlos (Comerciante): $" + comerciante1.cantidadAbonada());
        System.out.println("Monto abonado por Pedro (Programador): $" + programador1.cantidadAbonada());

        // --- Creando Ciudades y agregando Contribuyentes ---
        System.out.println("\n--- Creando Ciudades y agregando Contribuyentes ---");
        Ciudad ciudadA = new Ciudad("Ciudad A", 200000, 150000);
        ciudadA.addContribuyente(simple1);
        ciudadA.addContribuyente(comerciante1);
        ciudadA.addContribuyente(programador1);
        ciudadA.addContribuyente(simple2);

        // El método addContribuyente ya maneja duplicados
        Contribuyente simple1Duplicado = new Contribuyente("Juan Perez", 1001, 1500);
        ciudadA.addContribuyente(simple1Duplicado);
        System.out.println("Se intentó agregar un contribuyente duplicado (código 1001).");
        System.out.println("Número de contribuyentes en Ciudad A: " + ciudadA.getContribuyentes().size());

        Ciudad ciudadB = new Ciudad("Ciudad B", 1000000, 80000);
        ciudadB.addContribuyente(comerciante2);
        ciudadB.addContribuyente(programador2);

        Ciudad ciudadC = new Ciudad("Ciudad C", 500000, 120000);
        ciudadC.addContribuyente(comerciante1);
        ciudadC.addContribuyente(programador1);

        // --- Creando Provincias y agregando Ciudades ---
        // Ahora usamos los métodos `add` para un código más limpio y seguro
        System.out.println("\n--- Creando Provincias y agregando Ciudades ---");
        Provincia provincia1 = new Provincia("Provincia 1");
        provincia1.addCiudad(ciudadA);
        provincia1.addCiudad(ciudadB);

        Provincia provincia2 = new Provincia("Provincia 2");
        provincia2.addCiudad(ciudadC);

        // --- Probando lógica de Déficit ---
        System.out.println("\n--- Probando lógica de Déficit ---");
        System.out.println("Ciudad A está en pérdida? " + ciudadA.estaEnPerdida());
        System.out.println("Ciudad B está en pérdida? " + ciudadB.estaEnPerdida());
        System.out.println("Provincia 1 está en déficit? " + provincia1.deficit());

        // --- Creando un País y agregando Provincias ---
        // Asumiendo que has creado el método addProvincia en tu clase Pais
        System.out.println("\n--- Creando un País y agregando Provincias ---");
        Pais pais1 = new Pais("Mi País");
        pais1.addProvincia(provincia1);
        pais1.addProvincia(provincia2);

        System.out.println("Número de provincias en déficit en Mi País: " + pais1.getProvinciasDeficit().size());

        System.out.println("\n--- Fin de la prueba ---");
    }
}