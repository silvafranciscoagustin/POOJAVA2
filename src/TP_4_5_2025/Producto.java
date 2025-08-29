package TP_4_5_2025;

import java.time.LocalDate;

public class Producto {
    private String nombreProducto;
    private LocalDate fechaVenc;
    private int nroLote;

    public Producto(LocalDate fechaVenc, int nroLote, String nombreProducto) {
        this.fechaVenc = fechaVenc;
        this.nroLote = nroLote;
        this.nombreProducto = nombreProducto;
    }


    @Override
    public String toString() {
        return "Nombre producto : " +getNombreProducto() + "\n" +
                "Fecha de vencimiento: "+getFechaVenc()+ "\n" +
                "Numero de Lote: " + getNroLote() +"\n";
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }
}
