package TP_5_2_2025;

public class Main {
    public static void main(String[] args) {
        double cm = 10;
        double pulg = Convertidor.cmAPulgada(cm);
        System.out.println(cm + " cm = " + pulg + " pulgadas");

        double pulg2 = 5;
        double cm2 = Convertidor.pulgadaACm(pulg2);
        System.out.println(pulg2 + " pulgadas = " + cm2 + " cm");

        double kg = 70;
        double lb = Convertidor.kgALb(kg);
        System.out.println(kg + " kg = " + lb + " libras");

        double lb2 = 150;
        double kg2 = Convertidor.lbAKg(lb2);
        System.out.println(lb2 + " libras = " + kg2 + " kg");

        double litros = 10;
        double gal = Convertidor.litrosAGalon(litros);
        System.out.println(litros + " litros = " + gal + " galones");

        double gal2 = 3;
        double litros2 = Convertidor.galonALitros(gal2);
        System.out.println(gal2 + " galones = " + litros2 + " litros");
    }
}
