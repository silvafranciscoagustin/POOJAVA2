package TP_1_2_2025;

public class Main {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico("Heladera");
        Electrodomestico e3 = new Electrodomestico("Lavarropas", "Blanco");
        Electrodomestico e4 = new Electrodomestico("Microondas", "Negro", 50);
        Electrodomestico e5 = new Electrodomestico("TV", "Negro", 30, 800);
        Electrodomestico e6 = new Electrodomestico("Aire Acondicionado", "Blanco", 40, 2000, 40);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
    }
}
