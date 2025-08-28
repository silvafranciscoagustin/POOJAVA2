package TP_2_1_2025;

import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> episodios;
    private String nombre;

    public Temporada(String nombre){
        setNombre(nombre);
        this.episodios = new ArrayList<>();
    }


    public int obtenerEpVistos(){
        int total = 0;
        for (Episodio ep: episodios) {
            if (ep.isEstaVisto()){
                total++;
            }
        }
        return total;
    }
    public double obtenerPromedioCal(){
        double calificacionTotal = 0;
        for (Episodio ep: episodios) {
              calificacionTotal += ep.getCalificacion();
        }
        return calificacionTotal/episodios.size();
    }


    public boolean vioTodos(){
        int estaVisto = 0;
        for (Episodio ep: episodios) {
            if(ep.isEstaVisto())estaVisto++;
        }
        return estaVisto==episodios.size();
    }



    public ArrayList<Episodio> getEpisodios() {
        return new ArrayList<>(episodios);
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = new ArrayList<>(episodios);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
