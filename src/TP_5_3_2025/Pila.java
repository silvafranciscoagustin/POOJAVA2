package TP_5_3_2025;

import java.util.ArrayList;

public class Pila<T> {//el tipo de objeto que pasen al instanciar pila define el tipo de arreglo
    private ArrayList<T> pila;

    public Pila(){
        this.pila = new ArrayList<>();
    }

    public void push(T o){
        pila.add(o);
    }

    public T pop(){
        if(pila.isEmpty()){
            return null;
        }else{
            return pila.remove(pila.size()-1);
        }
    }

    public T top(){
        return pila.get(pila.size()-1);
    }

    public int getSize(){
        return pila.size();
    }

    public ArrayList<T> copy(){
        ArrayList<T> arrayCopia = new ArrayList<>();
        for (int i = 0; i < pila.size(); i++) {
            arrayCopia.add(pila.get(i));
        }
        return arrayCopia;
    }

    public ArrayList<T> reverse(){
        ArrayList<T> arrayCopia = new ArrayList<>();
        for (int i = pila.size()-1;i >=0;i--) {
            arrayCopia.add(pila.get(i));
        }
        return arrayCopia;
    }
}