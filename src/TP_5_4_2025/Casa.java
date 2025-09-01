package TP_5_4_2025;

import java.util.ArrayList;

public class Casa {
    private final int CANTIDAD_MAXIMA_ALUMNOS;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> alumnosCasa;
     public Casa(int CANTIDAD_MAXIMA_ALUMNOS){
         this.CANTIDAD_MAXIMA_ALUMNOS = CANTIDAD_MAXIMA_ALUMNOS;
         this.cualidades = new ArrayList<>();
         this.alumnosCasa = new ArrayList<>();
     }

     public boolean sePuedeAgregar(Alumno a){
         if(a.getCualidades().containsAll(getCualidades())  && getAlumnosCasa().size()<getCANTIDAD_MAXIMA_ALUMNOS() && !a.isTieneCasa()){
             return true;
         }else{
             return false;
         }
     }

    public void agregarAlumno(Alumno a){
         if(sePuedeAgregar(a)){
             alumnosCasa.add(a);
             a.setTieneCasa(true);
         }
    }

    public void agregarCualidad(String c){
         cualidades.add(c);
    }


    public int getCANTIDAD_MAXIMA_ALUMNOS() {
        return CANTIDAD_MAXIMA_ALUMNOS;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = new ArrayList<>(cualidades);
    }

    public ArrayList<Alumno> getAlumnosCasa() {
        return new ArrayList<>(alumnosCasa);
    }

    public void setAlumnosCasa(ArrayList<Alumno> alumnosCasa) {
        this.alumnosCasa = new ArrayList<>(alumnosCasa);
    }
}
