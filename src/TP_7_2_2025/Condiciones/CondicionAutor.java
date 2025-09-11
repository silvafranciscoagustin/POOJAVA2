package TP_7_2_2025.Condiciones;

import TP_7_2_2025.Autor;
import TP_7_2_2025.Documento;

public class CondicionAutor extends Condicion{
    public Autor autor;

    public CondicionAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getAutores().contains(this.getAutor());
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
