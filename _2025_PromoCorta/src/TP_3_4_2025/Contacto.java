package TP_3_4_2025;

import TP_3_1_2025.Persona;

import java.time.LocalDate;

public class Contacto {
    private String nombre, apellido, direccion, mail;
    private LocalDate fechaNac;
    private int dni, nroTel;

    public Contacto(String nombre, String apellido, String direccion, String mail, LocalDate fechaNac, int dni,int nroTel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.nroTel = nroTel;
    }


    public boolean equals(Object o){
        Contacto cc = (Contacto)o;
        try{
            return cc.getNombre().equalsIgnoreCase(this.getNombre())&&
                    cc.getApellido().equalsIgnoreCase(this.getApellido())&&
                    cc.getNroTel()==this.getNroTel();
        }
        catch (Exception exc){
            return false;
        }
    }




    public int getNroTel() {
        return nroTel;
    }

    public void setNroTel(int nroTel) {
        this.nroTel = nroTel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getDni() {
        return dni;
    }
}
