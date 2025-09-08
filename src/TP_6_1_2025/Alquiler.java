package TP_6_1_2025;

import java.time.LocalDate;

public class Alquiler {
    private Item item;
    private Cliente cliente;
    private LocalDate fechaLimite;

    public Alquiler(Item item, Cliente cliente, LocalDate fechaLimite) {
        if(item.sepuedeAlquilar()){
            this.item = item;
            this.cliente = cliente;
            this.fechaLimite = fechaLimite;
            item.alquilar();
            cliente.addAlquiler(this);
        }
    }

    public boolean estaVencido(){
            return LocalDate.now().isAfter(getFechaLimite());
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
}
