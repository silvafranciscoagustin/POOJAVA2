package TP_5_6_2025;

public class Contribuyente {
    private String nombre;
    private int codTributario;
    private double contribucionMensual;

    public Contribuyente(String nombre, int codTributario,double contribucionMensual) {
        setNombre(nombre);
        this.codTributario = codTributario;
        setContribucionMensual(contribucionMensual);
    }

    public double cantidadAbonada(){
        return getContribucionMensual();
    }

    public boolean equals(Object o){
        Contribuyente cc = (Contribuyente) o ;
        try{
            return cc.getCodTributario() ==  this.getCodTributario();
        }catch (Exception exc){
            return false;
        }
    }


    public double getContribucionMensual() {
        return contribucionMensual;
    }

    public void setContribucionMensual(double contribucionMensual) {
        this.contribucionMensual = contribucionMensual;
    }

    @Override
    public String toString() {
        return "Nombre: "+ getNombre()+"\n"+
                "Codigo Tributario: "+ getCodTributario()+"\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodTributario() {
        return codTributario;
    }

}
