package TP_4_1_2025;

public class Main {
    public static void main(String[] args) {

        // Creo timbre y luz
        Timbre timbre = new Timbre();
        Luz luz = new Luz();

        // Creo la alarma común
        Alarma alarma = new Alarma(timbre, luz);
        alarma.addSensor(new Sensor("Puerta principal", false));
        alarma.addSensor(new Sensor("Ventana del living", true));
        alarma.addSensor(new Sensor("Movimiento en el patio", false));

        System.out.println("Resultado alarma común: " + alarma.comprobar());

        // Creo la alarma luminosa
        AlarmaLuminosa alarmaLuz = new AlarmaLuminosa(timbre, luz);
        alarmaLuz.addSensor(new Sensor("Garage", false));
        alarmaLuz.addSensor(new Sensor("Cocina", false));
        alarmaLuz.addSensor(new Sensor("Habitación", true));

        System.out.println("Resultado alarma luminosa: " + alarmaLuz.comprobar());

        // Caso sin eventos
        AlarmaLuminosa alarmaSinProblemas = new AlarmaLuminosa(timbre, luz);
        alarmaSinProblemas.addSensor(new Sensor("Balcon", false));
        alarmaSinProblemas.addSensor(new Sensor("Deposito", false));

        System.out.println("Resultado alarma sin problemas: " + alarmaSinProblemas.comprobar());
    }
}
