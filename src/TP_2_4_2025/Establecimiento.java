package TP_2_4_2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Establecimiento {
    private final int CANT_RESERVAS_PARA_SER_SOCIO = 4;
    private final int MESES_SOCIO = 2;
    private String nombre;
    private ArrayList<Turno> turnos;
    private ArrayList<Usuario> usuarios;
    private final double DTO = 0.10;

    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.turnos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> socios(){
        ArrayList<Usuario> copia = new ArrayList<>();
        for (Usuario u: usuarios) {
            if(esSocio(u)){
                copia.add(u);
            }
        }
        return copia;
    }


    public void reservarTurno(Turno turno) {
        double precioFinal = turno.getValor();

        if (esSocio(turno.getUsuario())) {
            precioFinal -= precioFinal * DTO;  // aplica dto si es socio
        }

        System.out.println("✅ Turno reservado en " + nombre +
                " para " + turno.getUsuario().getNombre() +
                " | Cancha: " + turno.getTipoCancha() +
                " | Fecha: " + turno.getFechaReserva() +
                " | Precio: $" + precioFinal);

        turnos.add(turno);

        if (!usuarios.contains(turno.getUsuario())) {
            usuarios.add(turno.getUsuario());
        }
    }



    public boolean esSocio(Usuario usuario) {
        LocalDate limite = LocalDate.now().minusMonths(MESES_SOCIO);
        int contador = 0;

        for (Turno t: turnos) {
            if (t.getUsuario().equals(usuario) && t.getFechaReserva().isAfter(limite)) {
                contador++;
            }
        }

        return contador >= 4;
    }

    public boolean equals(Object o) {
        if (this == o) return true; // mismo objeto en memoria
        if (o == null || getClass() != o.getClass()) return false; // null o clase distinta
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.getNombre()); // compara nombres
    }


        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return new ArrayList<>(turnos);
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = new ArrayList<>(turnos);
    }

    public ArrayList<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = new ArrayList<>(usuarios);
    }

}
