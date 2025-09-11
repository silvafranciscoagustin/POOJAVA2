package TP_7_1_2025;

import TP_7_1_2025.condiciones.Condicion;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<ProductoQuimico> productosQuimicos;

    public void addProductoQuimico(ProductoQuimico p){
        if(!productosQuimicos.contains(p)){
            productosQuimicos.add(p);
        }
    }

    public Sistema(ArrayList<ProductoQuimico> productosQuimicos) {
        this.productosQuimicos = new ArrayList<>();
    }

    public ArrayList<ProductoQuimico> productosCumplen(Condicion c){
        ArrayList<ProductoQuimico> retorno = new ArrayList<>();
        for (ProductoQuimico p: productosQuimicos) {
            if(c.cumple(p)){
                retorno.add(p);
            }
        }
        return retorno;
    }

    public ArrayList<ProductoQuimico> getProductosQuimicos() {
        return new ArrayList<>(productosQuimicos);
    }

    public void setProductosQuimicos(ArrayList<ProductoQuimico> productosQuimicos) {
        this.productosQuimicos = new ArrayList<>(productosQuimicos);
    }
}
