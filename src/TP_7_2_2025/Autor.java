package TP_7_2_2025;

public class Autor {
    private String nombre;
    private int dni;

    public Autor(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }



    public boolean equals(Object o ){
        Autor a = (Autor) o ;
        try {
            return this.getDni()==a.getDni();
        }catch (Exception exc){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + getNombre() + '\'' +
                ", dni=" + getNombre() +
                '}';
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

    public void setDni(int dni) {
        this.dni = dni;
    }
}
