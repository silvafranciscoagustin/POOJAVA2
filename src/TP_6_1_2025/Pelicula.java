package TP_6_1_2025;

public class Pelicula extends Item{
    private String nombre;
    private String infoFilmografica;
    private int cantCopias;

    @Override
    public String toString() {
        return "Pelicula: " + getNombre() +
                " (Info: " + getInfoFilmografica() +
                ", Copias: " + getCantCopias() + ")";
    }


    @Override
    public boolean sepuedeAlquilar() {
        return getCantCopias()>0;
    }

    @Override
    public void alquilar() {
        if(sepuedeAlquilar()){
            setCantCopias(getCantCopias()-1);
        }
    }


    public boolean equals (Object o) {
        Pelicula p = (Pelicula)o;
        try {
            return this.getNombre().equalsIgnoreCase(p.getNombre());
        }

        catch(Exception e) {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula(String infoFilmografica, int cantCopias) {
        this.infoFilmografica = infoFilmografica;
        this.cantCopias = cantCopias;
    }

    public String getInfoFilmografica() {
        return infoFilmografica;
    }

    public void setInfoFilmografica(String infoFilmografica) {
        this.infoFilmografica = infoFilmografica;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
}
