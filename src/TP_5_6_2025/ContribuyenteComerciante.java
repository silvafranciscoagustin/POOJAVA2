package TP_5_6_2025;

public class ContribuyenteComerciante extends Contribuyente{
    private double montoRecaudado;

    public ContribuyenteComerciante(String nombre, int codTributario, double contrubucionMensual,double montoVentas) {
        super(nombre,codTributario,contrubucionMensual);
        setMontoRecaudado(montoVentas);
    }


    @Override
    public double cantidadAbonada() {
        return super.cantidadAbonada()*ImpuestoContribuyente.IMPUESTO_COMERCIANTE_FIJO+ getMontoRecaudado()*ImpuestoContribuyente.IMPUESTO_COMERCIANTE_VENTAS;
    }


    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(double montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }



}
