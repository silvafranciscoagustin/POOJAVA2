package TP_6_4_2025_ADICIONAL_LIBRERIA;

import java.security.PublicKey;
import java.util.ArrayList;

public abstract class Cliente {
    private String nombre, apellido,direccion;
    private int dni;
    private ArrayList<String> autoresFavoritos, generosLeGustan;
    private ArrayList<Articulo> compras;

    public Cliente(String nombre, String apellido, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.autoresFavoritos = new ArrayList<>();
        this.generosLeGustan = new ArrayList<>();
    }

    public abstract boolean leGusta(Articulo a);
    public abstract double calcularDto(Articulo a);

    public boolean yaCompro(Articulo a){
        return  !compras.isEmpty() && compras.contains(a);
    }






    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '}';
    }
    public void addAutor(String autor){
        if(!autoresFavoritos.contains(autor)){
            autoresFavoritos.add(autor);
        }
    }

    public void addGenero(String genero){
        if(!generosLeGustan.contains(genero)){
            generosLeGustan.add(genero);
        }
    }



    public boolean equals(Object otro){
        Cliente a = (Cliente) otro;
        try {
            return this.getDni()==a.getDni();
        }catch (Exception exc){
            return false;
        }
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

    public ArrayList<Articulo> getCompras() {
        return new ArrayList<>(compras);
    }

    public void setCompras(ArrayList<Articulo> compras) {
        this.compras = new ArrayList<>(compras);
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<String> getAutoresFavoritos() {
        return new ArrayList<>(autoresFavoritos);
    }

    public void setAutoresFavoritos(ArrayList<String> autores) {
        this.autoresFavoritos = new ArrayList<>(autores);
    }

    public ArrayList<String> getGenerosQueLeGustan() {
        return new ArrayList<>(generosLeGustan);
    }

    public void setGenerosQueLeGustan(ArrayList<String> generos) {
        this.generosLeGustan = new ArrayList<>(generos);
    }
}
