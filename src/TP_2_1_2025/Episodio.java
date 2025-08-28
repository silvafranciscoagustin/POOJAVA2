package TP_2_1_2025;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean estaVisto;
    private int calificacion;

    public Episodio(String titulo, String descripcion, boolean estaVisto, int calificacion){
        setTitulo(titulo);
        setDescripcion(descripcion);
        setEstaVisto(estaVisto);
        setCalificacion(calificacion);
    }


    //redundante...
    public void calificar(int calificacion){
        setCalificacion(calificacion);
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

    public boolean isEstaVisto() {
        return estaVisto;
    }

    public void setEstaVisto(boolean estaVisto) {
        this.estaVisto = estaVisto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
