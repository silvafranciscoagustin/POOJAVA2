package TP_5_4_2025;

import java.util.ArrayList;

public class CasaEnemistada extends Casa{
    private Casa casaEnemiga;
    public CasaEnemistada(int CANTIDAD_MAXIMA_ALUMNOS,Casa casaEnemiga) {
        super(CANTIDAD_MAXIMA_ALUMNOS);
        setCasaEnemiga(casaEnemiga);
    }


    public boolean sePuedeAgregarACasaEnemiga(Alumno a){
        return getCasaEnemiga().sePuedeAgregar(a);
    }

    @Override
    public void agregarAlumno(Alumno a) {
        if(sePuedeAgregar(a) && !sePuedeAgregarACasaEnemiga(a)){
            getAlumnosCasa().add(a);
            a.setTieneCasa(true);
        }
    }

    public Casa getCasaEnemiga() {
        return casaEnemiga;
    }

    public void setCasaEnemiga(Casa casaEnemiga) {
        this.casaEnemiga = casaEnemiga;
    }
}
