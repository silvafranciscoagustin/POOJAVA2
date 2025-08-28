package TP_4_3_2025;

public class Main {
    public static void main(String[] args) {
        // Empleado base
        Empleado e1 = new Empleado(50000,"Juan");
        System.out.println(e1.getNombre() + " gana: $" + e1.calcularSueldo());

        // Empleado con horas extras
        EmpleadoExtra e2 = new EmpleadoExtra("Ana", 50000, 10);
        System.out.println(e2.getNombre() + " gana: $" + e2.calcularSueldo());

        // Empleado por comisión
        EmpleadoComision e3 = new EmpleadoComision(40000, "Luis");

        // Agregamos ventas una por una
        e3.addVenta(new Venta(10000)); // venta de $10,000
        e3.addVenta(new Venta(5000));  // venta de $5,000
        e3.addVenta(new Venta(20000)); // venta de $20,000

        System.out.println(e3.getNombre() + " gana: $" + e3.calcularSueldo());
    }
}
