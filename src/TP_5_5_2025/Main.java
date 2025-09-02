package TP_5_5_2025;

public class Main {
    public static void main(String[] args) {
        // Crear cooperativa
        Cooperativa coop = new Cooperativa("Coop Agraria");

        // Agregar minerales primarios
        coop.agregarMineralPrimario("N");
        coop.agregarMineralPrimario("P");

        // Crear lotes y agregar minerales
        Lote lote1 = new Lote(40);
        lote1.getMineralesLote().add("N");
        lote1.getMineralesLote().add("P");
        lote1.getMineralesLote().add("K");
        coop.agregarLoteACooperativa(lote1);

        Lote lote2 = new Lote(60);
        lote2.getMineralesLote().add("N");
        lote2.getMineralesLote().add("K");
        coop.agregarLoteACooperativa(lote2);

        // Crear cereales y agregar minerales
        Cereal maiz = new Cereal("Gruesa");
        maiz.getMineralesCereal().add("N");
        maiz.getMineralesCereal().add("P");
        coop.agregarCerealACooperativa(maiz);

        Cereal trigo = new Cereal("Fina");
        trigo.getMineralesCereal().add("N");
        coop.agregarCerealACooperativa(trigo);

        Pastura alfalfa = new Pastura("Pastura");
        alfalfa.getMineralesCereal().add("N");
        alfalfa.getMineralesCereal().add("K");
        coop.agregarCerealACooperativa(alfalfa);

        // Mostrar resultados
        System.out.println("🌱 Cereales compatibles con Lote1:");
        System.out.println(coop.cerealesCompatiblesConLote(lote1));

        System.out.println("\n🌱 Cereales compatibles con Lote2:");
        System.out.println(coop.cerealesCompatiblesConLote(lote2));

        System.out.println("\n🌾 Lotes compatibles con Maíz:");
        System.out.println(coop.lotesCompatiblesConCereal(maiz));

        System.out.println("\n🌾 Lotes compatibles con Pastura (alfalfa):");
        System.out.println(coop.lotesCompatiblesConCereal(alfalfa));

        System.out.println("\n⭐ Lote1 es especial? " + coop.loteEsEspecial(lote1));
        System.out.println("⭐ Lote2 es especial? " + coop.loteEsEspecial(lote2));
    }
}

