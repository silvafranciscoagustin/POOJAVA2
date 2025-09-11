package TP_7_2_2025;

import java.util.ArrayList;

public class Documento {
    private String titulo, contTextual;
    private ArrayList<String> palabrasClaves;
    private ArrayList<Autor> autores;

    public Documento(String titulo, String contTextual, ArrayList<String> palabrasClaves) {
        this.titulo = titulo;
        this.contTextual = contTextual;
        this.palabrasClaves = palabrasClaves;
        this.autores = new ArrayList<>();
    }
    public void addAutor(Autor a){
        if(!autores.contains(a)){
            autores.add(a);
        }
    }

    public void addPalabraClave(String p){
        if(!palabrasClaves.contains(p)){
            palabrasClaves.add(p);
        }
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + getTitulo() + '\'' +
                ", contTextual='" + getContTextual() + '\'' +
                ", palabrasClaves=" + getPalabrasClaves() +
                ", autores=" + getAutores() +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContTextual() {
        return contTextual;
    }

    public void setContTextual(String contTextual) {
        this.contTextual = contTextual;
    }

    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public ArrayList<Autor> getAutores() {
        return new ArrayList<Autor>(autores);
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = new ArrayList<>(autores);
    }
}
