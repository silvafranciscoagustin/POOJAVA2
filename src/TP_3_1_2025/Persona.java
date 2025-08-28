package TP_3_1_2025;

public class Persona {
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public boolean equals(Object o) {
        Persona pp=(Persona)o;
        try{
            return pp.getDni() == this.getDni();
        }catch (Exception exc){
            return false;
        }
    }


}
