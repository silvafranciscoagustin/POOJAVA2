package TP_6_3_2025;

import java.util.ArrayList;

public class Puerto {
    private  ColaDeEspera camiones;
    private  ColaDeEspera barcos;

    public Puerto(ColaDeEspera camiones, ColaDeEspera barcos) {
        this.camiones = camiones;
        this.barcos = barcos;
    }

    public void agregarCamion(Camion c){
        if(!camiones.getElementos().contains(c)){
            camiones.agregarElemento(c);
        }
    }

    public void agregarBarco(Barco b){
        if(!barcos.getElementos().contains(b)){
            barcos.agregarElemento(b);
        }
    }

    public void setCamiones(ColaDeEspera camiones) {
        this.camiones = camiones;
    }

    public ColaDeEspera getBarcos() {
        return barcos;
    }

    public void setBarcos(ColaDeEspera barcos) {
        this.barcos = barcos;
    }
}
