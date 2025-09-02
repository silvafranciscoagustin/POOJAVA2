package TP_5_6_2025;

public class ContribuyenteProgramador extends ContribuyenteComerciante{
    public ContribuyenteProgramador(String nombre, int codTributario,double contribucionMensual,double montoRecaudado){
        super(nombre,codTributario,contribucionMensual,montoRecaudado);

    }




    public double cantidadAbonada() {
        return super.cantidadAbonada()*ImpuestoContribuyente.IMPUESTO_PROGRAMADOR_FIJO + getMontoRecaudado()*ImpuestoContribuyente.IMPUESTO_PROGRAMADOR_SOFTWARE;
    }

}
