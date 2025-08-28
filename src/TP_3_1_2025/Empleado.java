package TP_3_1_2025;

public class Empleado extends Persona{
    private  int cantEncuestasRealizadas;

    public Empleado(String nombre, int dni, int cantEncuestasRealizadas) {
        super(nombre, dni);
        this.cantEncuestasRealizadas = cantEncuestasRealizadas;
    }

    public void incrementarTotalEncuestas(){
        cantEncuestasRealizadas++;
    }

    public int getCantEncuestasRealizadas() {
        return cantEncuestasRealizadas;
    }

    public void setCantEncuestasRealizadas(int cantEncuestasRealizadas) {
        this.cantEncuestasRealizadas = cantEncuestasRealizadas;
    }
}
