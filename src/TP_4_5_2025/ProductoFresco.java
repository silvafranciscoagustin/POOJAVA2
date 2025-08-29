package TP_4_5_2025;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public ProductoFresco(LocalDate fechaVenc, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,String nombre) {
        super(fechaVenc, nroLote,nombre);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Fecha Envasado: "+ getFechaEnvasado() +"\n"+
                "Granja Origen: "+ getGranjaOrigen()+"\n";
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }
}
