package TP_2_4_2025;

import java.time.LocalDate;

public class Turno {
    private String tipoCancha;
    private  double valor;
    private Usuario usuario;
    private LocalDate fechaReserva;

    public Turno(String tipoCancha, double valor, Usuario usuario, LocalDate fechaReserva) {
        this.tipoCancha = tipoCancha;
        this.valor = valor;
        this.usuario = usuario;
        this.fechaReserva = fechaReserva;
    }




    public void reservar(){
        System.out.println("Reservado");
    };

    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
