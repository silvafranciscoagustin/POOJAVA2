package TP_2_1_2025;

import java.util.ArrayList;

public class Serie {
    private ArrayList<Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String genero;
    private String creador;


    public Serie(String titulo, String descripcion, String genero, String creador) {
        this.temporadas = new ArrayList<>();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.creador = creador;
    }


    // los metodos de serie son iguales a temporada, es repetir codigo, por eso no lo hicimos xd

    public ArrayList<Temporada> getTemporadas() {
        return new ArrayList<>(temporadas);
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = new ArrayList<>(temporadas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
