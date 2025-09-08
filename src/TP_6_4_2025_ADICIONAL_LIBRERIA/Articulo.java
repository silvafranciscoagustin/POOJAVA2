package TP_6_4_2025_ADICIONAL_LIBRERIA;

import java.util.ArrayList;

public class Articulo {
    private String nombre, autor,resumen;
    private int cantPag;
    private double precio;
    private ArrayList<String> generos;

    public Articulo(String nombre, String autor, String resumen, int cantPag, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.cantPag = cantPag;
        this.precio = precio;
        this.generos = new ArrayList<>();
    }

    public boolean equals(Object o){
        Articulo a = (Articulo) o;
        try {
            return this.getNombre().equalsIgnoreCase(a.getNombre());
        }catch (Exception exc){
            return false;
        }
    }


    public void addGenero(String g){
        if(!generos.contains(g)){
            generos.add(g);
        }
    }


        @Override
        public String toString() {
            return "Articulo{" +
                    "nombre='" + nombre + '\'' +
                    ", autor='" + autor + '\'' +
                    ", precio=" + precio +
                    ", generos=" + generos +
                    '}';
        }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<>(generos);
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = new ArrayList<>(generos);
    }
}
