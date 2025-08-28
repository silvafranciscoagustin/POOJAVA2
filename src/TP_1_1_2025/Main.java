package TP_1_1_2025;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona(123453);
        Persona persona3 = new Persona(12341231);
        Persona persona2 = new Persona(43412,"Carlitos","Perez");
        Persona francamio = new Persona(1123123,"fran", "camio", LocalDate.of(2004,8,20));
        System.out.println(persona2.getNombre());
        persona2.setNombre("Pepe");
        System.out.println(persona2.getNombre());
        persona1.setFechaNac(LocalDate.of(1212,1,1));
        System.out.println(persona1.getFechaNac());
        System.out.println(francamio.getFechaNac());


        francamio.setPeso(84);
        francamio.setAltura(181);
        System.out.println(francamio.getPeso()+ " "+ francamio.getAltura());

        double imcFran = francamio.calcularIMC();
        System.out.println(imcFran);
        System.out.println("Esta en forma: "+francamio.estaEnForma());
        System.out.println(francamio.esElCumple());
        System.out.println(francamio.esMayor());
        System.out.println(francamio.puedeVotar());
        System.out.println(francamio.esCoherente());

        System.out.println(francamio.toString());




    }
}
