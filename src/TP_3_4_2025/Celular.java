package TP_3_4_2025;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Celular {
    private String modelo;
    private ArrayList<Contacto> contactos;

    public Celular(String modelo) {
        this.modelo = modelo;
        this.contactos = new ArrayList<>();
    }

    public double obtenerPromedioEdad(){
        int edadTotal = 0;
        for (Contacto c:contactos) {
            edadTotal+= Period.between(c.getFechaNac(),LocalDate.now()).getYears();
        }
        return edadTotal/contactos.size();
    }

    public ArrayList<Contacto> mostrarRepetidos() {
        ArrayList<Contacto> contactosRepetidos = new ArrayList<>();
        for (Contacto c1 : contactos) {
            for (Contacto c2 : contactos) {
                if (c1 != c2 && c1.getNombre().equalsIgnoreCase(c2.getNombre()) &&
                        c1.getApellido().equalsIgnoreCase(c2.getApellido())
                        && c1.getNroTel() == c2.getNroTel()) {
                    if (!contactosRepetidos.contains(c1)) {
                        contactosRepetidos.add(c1);
                    }
                }
            }
        }
        return contactosRepetidos;
    }


    public ArrayList<Contacto> mostrarContactos(){
        return new ArrayList<>(contactos);
    }













    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Contacto> getContactos() {
        return new ArrayList<>(contactos);
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = new ArrayList<>(contactos);
    }
    public void agregarContacto(Contacto c){
        contactos.add(c);
    }
}
