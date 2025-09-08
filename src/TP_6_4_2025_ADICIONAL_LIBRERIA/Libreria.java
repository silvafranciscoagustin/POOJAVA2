package TP_6_4_2025_ADICIONAL_LIBRERIA;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Articulo>articulos;
    private ArrayList<Cliente> clientes;

    public ArrayList<Cliente> clientesQueLeGustaArticulo(Articulo a){
        ArrayList<Cliente> retorno = new ArrayList<>();
        for (Cliente c:clientes) {
            if(c.leGusta(a)){
                retorno.add(c);
            }
        }
        return retorno;
    }

    public void mostrarClientes() {
        System.out.println("--- Clientes de la librería ---");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        System.out.println("------------------------------\n");
    }

    public void mostrarArticulos() {
        System.out.println("--- Artículos de la librería ---");
        for (Articulo a : articulos) {
            System.out.println(a);
        }
        System.out.println("------------------------------\n");
    }





    public void addArticulo(Articulo a){
        if(!articulos.contains(a)){
            articulos.add(a);
        }
    }

    public void addCliente(Cliente c){
        if(!clientes.contains(c)){
            clientes.add(c);
        }
    }

    public ArrayList<Articulo> getArticulos() {
        return new ArrayList<>(articulos);
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = new ArrayList<>(articulos);
    }

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = new ArrayList<>(clientes);
    }
}
