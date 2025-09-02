package TP_5_7_2025;

public class Main {
    public static void main(String[] args) {

        // Crear una Empresa
        Empresa empresa = new Empresa("Mi Gran Empresa S.A.");

        // --- Creando Empleados ---
        System.out.println("--- Creando Empleados ---");
        // Empleado base
        Empleado empleado1 = new Empleado("Juan", "Perez", 50000, 12345678);

        // EmpleadoVendedor
        EmpleadoVendedor vendedor1 = new EmpleadoVendedor("Maria", "Lopez", 60000, 23456789, 100000, 0.05);

        // EmpleadoBono
        // Nota: Asegúrate de que el constructor de EmpleadoBono establezca el valor de 'bonoPorVentas'
        EmpleadoBono bono1 = new EmpleadoBono("Carlos", "Gomez", 45000, 34567890, 15, 10);
        bono1.setBonoPorVentas(5000); // Se asume que el bono es de 5000.

        // --- Agregando Empleados a la Empresa ---
        System.out.println("\n--- Agregando empleados a la empresa ---");
        empresa.addEmpleado(empleado1);
        empresa.addEmpleado(vendedor1);
        empresa.addEmpleado(bono1);

        // Intentar agregar un empleado duplicado (mismo DNI)
        Empleado empleadoDuplicado = new Empleado("Pedro", "Gomez", 70000, 12345678);
        empresa.addEmpleado(empleadoDuplicado);
        System.out.println("Intentando agregar un empleado duplicado (mismo DNI)...");
        System.out.println("Cantidad de empleados en la empresa: " + empresa.getEmpleados().size());

        // --- Mostrar la información de los Empleados ---
        System.out.println("\n--- Información de los Empleados ---");
        empresa.mostrarEmpleados(); // Llama al nuevo método para mostrar la lista

        // --- Calcular los Gastos Totales ---
        System.out.println("\n--- Gastos Totales de la Empresa ---");
        System.out.println("Gasto total en sueldos: $" + empresa.totalGastos());
    }
}
