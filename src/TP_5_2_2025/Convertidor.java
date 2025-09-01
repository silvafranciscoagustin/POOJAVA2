package TP_5_2_2025;

public class Convertidor {
    private static final double PULGADA= 2.54,LIBRA = 0.453592,GALON = 3.78541;

    //al poner static en un metodo, el metodo se puede llamar desde la misma clase sin la necesidad de ser instanciado.

    public static double cmAPulgada(double v){
        return v/PULGADA;
    }

    public static double pulgadaACm(double v){
        return PULGADA*v;
    }

    public static double kgALb(double v){
        return v/LIBRA;
    }
    public static double lbAKg(double v){
        return LIBRA*v;
    }

    public static double litrosAGalon(double v){
        return v/GALON;
    }
    public static double galonALitros(double v){
        return GALON*v;
    }






}
