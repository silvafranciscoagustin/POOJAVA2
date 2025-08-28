package TP_4_1_2025;

public class AlarmaLuminosa extends Alarma{


    public AlarmaLuminosa(Timbre timbre, Luz luz) {
        super(timbre, luz);
    }

    public String comprobar(){
        String resultadoPadre = super.comprobar();
        if (!resultadoPadre.equals("Todo en Orden")) {
            // Si sonó la alarma, también enciendo la luz
            return resultadoPadre + " y " + getLuz().encender();
        }
        return resultadoPadre;
    }

}
