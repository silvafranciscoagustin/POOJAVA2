package TP_4_6_2025;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos el sistema
        Sistema empresa = new Sistema("Mi Empresa S.A.");

        // Creamos empleados
        Empleado emp1 = new Empleado("Juan", "Perez", 30, 101, 50000);
        Empleado emp2 = new Empleado("Ana", "Gomez", 28, 102, 48000);
        Empleado emp3 = new Empleado("Luis", "Ramirez", 35, 103, 52000);

        // Usuario final
        UsuarioFinal user1 = new UsuarioFinal("Maria", "Lopez", 25, "mlopez", "1234");

        // Usuario jerárquico
        UsuarioJerrarquico jefe = new UsuarioJerrarquico("Carlos", "Sanchez", 40, 201, 80000, new ArrayList<>());

        // Agregamos empleados a cargo al jerárquico
        jefe.addEmpleadoAcargo(emp1);
        jefe.addEmpleadoAcargo(emp2);

        // Agregamos todas las personas al sistema
        empresa.addPersona(emp1);
        empresa.addPersona(emp2);
        empresa.addPersona(emp3);
        empresa.addPersona(user1);
        empresa.addPersona(jefe);

        // Mostramos todo usando los métodos de Sistema y Persona
        System.out.println("=== LISTADO DE PERSONAS EN LA EMPRESA ===");
        System.out.println(empresa.mostrarTodos());
    }
}


