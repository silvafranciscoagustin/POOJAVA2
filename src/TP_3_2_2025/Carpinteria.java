package TP_3_2_2025;

import java.util.ArrayList;

public class Carpinteria {
    private String nombre;
    private ArrayList<Mueble> muebles;
    private final double GANANCIA = 0.35;

    public double costoProdStock(){
        double total = 0;
        for (Mueble m: muebles) {
            total+= m.getCosto();
        }
        return total;
    }

    public void addMueble(Mueble m) {
        this.muebles.add(m);
    }

    public double precioVentaStock(){
        return costoProdStock() + costoProdStock()*GANANCIA;
    }




    public Carpinteria(String nombre) {
        this.nombre = nombre;
        muebles = new ArrayList<>();
    }


    //stock es el array de muebles
    public ArrayList<Mueble> getMuebles() {
        return new ArrayList<>(muebles);
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = new ArrayList<>(muebles);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
