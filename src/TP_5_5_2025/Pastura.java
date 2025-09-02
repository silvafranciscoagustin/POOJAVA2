package TP_5_5_2025;

public class Pastura extends Cereal{
    private static final double MIN_HECTAREAS = 50;
    public Pastura(String tipoDeGrano) {
        super(tipoDeGrano);
    }

    public boolean sePuedeSembrar(Lote l){
        if(l.getHectareas()>=MIN_HECTAREAS){
            return super.sePuedeSembrar(l);
        }else{
            return false;
        }
    }


}
