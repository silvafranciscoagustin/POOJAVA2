package TP_3_3_2025;

import java.util.ArrayList;

public class Juego {
    private String nombre;
    private ArrayList<Personaje> personajes;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList<>();
    }


    public Personaje enfrentar(Personaje p1, Personaje p2){
        int i = 0;
        for (Cualidad c1: p1.getCualidades()) {
            Cualidad c2 = p2.getCualidades().get(i);
            if(c1.getNivel() > c2.getNivel()){
                return p1;
            } else if (c2.getNivel()>c1.getNivel()) {
                return p2;
            }
            i++;
        }
        return null;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Personaje> getPersonajes() {
        return new ArrayList<>(personajes);
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = new ArrayList<>(personajes);
    }
}
