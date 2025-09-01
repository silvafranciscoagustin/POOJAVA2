package TP_5_4_2025;

public class CasaLinaje extends Casa{

    public CasaLinaje(int CANTIDAD_MAXIMA_ALUMNOS) {
        super(CANTIDAD_MAXIMA_ALUMNOS);
    }

    public boolean tieneFamilia(Alumno a){
        for (Alumno familiar: a.getFamiliares()) {
            if(getAlumnosCasa().contains(familiar)){
                return true; //encontre un familiar
            }
        }
        return false; // si nunca corto el for es que no habia nadie.
    }

    @Override
    public void agregarAlumno(Alumno a) {
        if(sePuedeAgregar(a) && tieneFamilia(a)){
            getAlumnosCasa().add(a);
        }
    }
}
