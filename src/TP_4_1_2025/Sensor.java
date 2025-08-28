package TP_4_1_2025;

public class Sensor {
    private String nombreZona;
    private boolean activo;

    public Sensor(String nombreZona, boolean activo) {
        this.nombreZona = nombreZona;
        this.activo = activo;
    }



    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Sensor(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }
}
