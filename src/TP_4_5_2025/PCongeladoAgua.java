package TP_4_5_2025;

import java.time.LocalDate;

public class PCongeladoAgua extends ProductoCongelado{
    private double sal,agua;

    public PCongeladoAgua(LocalDate fechaVenc, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrg, int tempMantenimiento, double sal, double agua,String nombre) {
        super(fechaVenc, nroLote, fechaEnvasado, granjaOrigen, codOrg, tempMantenimiento,nombre);
        this.sal = sal;
        this.agua = agua;
    }

    public double calcularSalinidad(){
        return getSal()/getAgua();
    }

    @Override
    public String toString() {
        return super.toString()+
                "Cantidad de sal en gramos: "+ getSal()+"\n"+
                "Cantidad de agua en litros: "+ getAgua();
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }
}
