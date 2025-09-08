package TP_6_3_2025;

import java.util.ArrayList;

public class ColaDeEspera {

    private ArrayList<Elemento> elementos;

    public ColaDeEspera() {
        this.elementos = new ArrayList<>();
    }



    public void agregarElemento(Elemento e){
        int i = 0;
        while(!elementos.contains(e) && i<elementos.size()){
            if(e.esMenor(elementos.get(i))){
               elementos.add(i,e);
            }
            i++;
        }
        if(!elementos.contains(e)){
            elementos.add(e);
        }

    }







    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }
}
