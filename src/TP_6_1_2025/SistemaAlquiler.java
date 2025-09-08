package TP_6_1_2025;

import java.util.ArrayList;

public class SistemaAlquiler {
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;
    private ArrayList<Item> items;


    public SistemaAlquiler() {
        this.clientes = new ArrayList<>();
        this.alquileres = new ArrayList<>();
        this.items = new ArrayList<>(); // <-- ¡Añade esta línea!
    }



    public void addAlquiler(Alquiler a) {
        if (!alquileres.contains(a)) {
            alquileres.add(a);
        }
    }


    public ArrayList<Cliente> getClientes() {
        return new ArrayList <>(clientes);
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = new ArrayList <>(clientes);
    }

    public void addClientes (Cliente c) {
        if(!clientes.contains (c)) {
            clientes.add(c);
        }
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void setItems(ArrayList<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<>(alquileres);
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = new ArrayList<>(alquileres);
    }



    public ArrayList <Cliente> clientesAlquileresVencidos (){
        ArrayList<Cliente> retorno = new ArrayList<>();
        for (Alquiler a: alquileres) {
            if(a.estaVencido()){
                retorno.add(a.getCliente());
            }
        }
        return retorno;
    }


    // Métodos para gestionar los artículos
    public void addItem(Item i) {
        if (!items.contains(i)) {
            items.add(i);
        }
    }
}
