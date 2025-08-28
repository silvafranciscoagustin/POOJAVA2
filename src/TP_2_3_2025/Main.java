package TP_2_3_2025;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear país
        Pais argentina = new Pais("Argentina");

        // ===== PROVINCIA BUENOS AIRES =====
        Provincia bsas = new Provincia("Buenos Aires");
        ArrayList<Ciudad> ciudadesBsAs = new ArrayList<>();
        ciudadesBsAs.add(new Ciudad("La Plata", 5_000_000, 6_000_000, 1500000));   // pérdida
        ciudadesBsAs.add(new Ciudad("Mar del Plata", 3_000_000, 2_000_000, 800000)); // superávit
        ciudadesBsAs.add(new Ciudad("Tandil", 1_000_000, 1_500_000, 120000));       // pérdida
        bsas.setCiudades(ciudadesBsAs);

        // ===== PROVINCIA CÓRDOBA =====
        Provincia cordoba = new Provincia("Córdoba");
        ArrayList<Ciudad> ciudadesCordoba = new ArrayList<>();
        ciudadesCordoba.add(new Ciudad("Córdoba Capital", 7_000_000, 6_500_000, 1400000)); // superávit
        ciudadesCordoba.add(new Ciudad("Villa Carlos Paz", 2_000_000, 2_500_000, 50000));  // pérdida
        cordoba.setCiudades(ciudadesCordoba);

        // ===== PROVINCIA SANTA FE =====
        Provincia santaFe = new Provincia("Santa Fe");
        ArrayList<Ciudad> ciudadesSantaFe = new ArrayList<>();
        ciudadesSantaFe.add(new Ciudad("Rosario", 6_000_000, 6_800_000, 1200000));   // pérdida
        ciudadesSantaFe.add(new Ciudad("Santa Fe Capital", 2_500_000, 2_000_000, 400000)); // superávit
        ciudadesSantaFe.add(new Ciudad("Rafaela", 1_200_000, 1_300_000, 150000));    // pérdida
        santaFe.setCiudades(ciudadesSantaFe);

        // ===== PROVINCIA MENDOZA =====
        Provincia mendoza = new Provincia("Mendoza");
        ArrayList<Ciudad> ciudadesMendoza = new ArrayList<>();
        ciudadesMendoza.add(new Ciudad("Mendoza Capital", 4_500_000, 4_000_000, 900000)); // superávit
        ciudadesMendoza.add(new Ciudad("San Rafael", 1_200_000, 1_400_000, 180000));     // pérdida
        mendoza.setCiudades(ciudadesMendoza);

        // ===== PROVINCIA SALTA =====
        Provincia salta = new Provincia("Salta");
        ArrayList<Ciudad> ciudadesSalta = new ArrayList<>();
        ciudadesSalta.add(new Ciudad("Salta Capital", 3_000_000, 2_800_000, 700000)); // superávit
        ciudadesSalta.add(new Ciudad("Tartagal", 800_000, 1_200_000, 150000));       // pérdida
        ciudadesSalta.add(new Ciudad("Orán", 600_000, 900_000, 100000));             // pérdida
        salta.setCiudades(ciudadesSalta);

        // Agregar provincias al país
        ArrayList<Provincia> provinciasArg = new ArrayList<>();
        provinciasArg.add(bsas);
        provinciasArg.add(cordoba);
        provinciasArg.add(santaFe);
        provinciasArg.add(mendoza);
        provinciasArg.add(salta);
        argentina.setProvincias(provinciasArg);

        // Mostrar provincias en déficit
        System.out.println("=====================================");
        System.out.println("Provincias en déficit del país " + argentina.getNombre() + ":");
        System.out.println("=====================================");
        for (Provincia p : argentina.getProvinciasDeficit()) {
            System.out.println("- " + p.getNombre());
        }
    }
}
