package TP_4_5_2025;

import java.time.LocalDate;

public class ProductoCongelado extends ProductoFresco{
    private int codOrg,tempMantenimiento;

    public ProductoCongelado(LocalDate fechaVenc, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrg, int tempMantenimiento,String nombre) {
        super(fechaVenc, nroLote, fechaEnvasado, granjaOrigen,nombre);
        this.codOrg = codOrg;
        this.tempMantenimiento = tempMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Codigo de Origen: "+ getCodOrg()+"\n"+
                "Temperatura de Mantenimiento: "+ getTempMantenimiento()+"\n";
    }

    public int getCodOrg() {
        return codOrg;
    }

    public void setCodOrg(int codOrg) {
        this.codOrg = codOrg;
    }

    public int getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(int tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }
}
