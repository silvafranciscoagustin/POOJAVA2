package TP_4_5_2025;

import java.time.LocalDate;

public class PCongeladoNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private int segExposicion;

    public PCongeladoNitrogeno(LocalDate fechaVenc, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrg, int tempMantenimiento, String metodoCongelacion, int segExposicion,String nombre) {
        super(fechaVenc, nroLote, fechaEnvasado, granjaOrigen, codOrg, tempMantenimiento,nombre);
        this.metodoCongelacion = metodoCongelacion;
        this.segExposicion = segExposicion;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Metodo de congelacion: "+ getMetodoCongelacion() +"\n"+
                "Segundos de exposicion al nitrogeno: "+ getSegExposicion();
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getSegExposicion() {
        return segExposicion;
    }

    public void setSegExposicion(int segExposicion) {
        this.segExposicion = segExposicion;
    }
}
