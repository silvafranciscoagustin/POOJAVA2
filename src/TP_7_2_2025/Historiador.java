package TP_7_2_2025;

import TP_7_2_2025.Condiciones.*;

import java.util.ArrayList;

public class Historiador {
    private String nombre;
    private ArrayList<Documento> documentos;

    public Historiador(String nombre) {
        this.documentos = new ArrayList<>();
    }


    public ArrayList<Documento> encontrarDocumentos(Condicion c){
        ArrayList<Documento> retorno = new ArrayList<>();
        for (Documento d: documentos) {
            if(c.cumple(d)){
                retorno.add(d);
            }
        }
        return retorno;
    }
    public void addDocumento(Documento d){
        if(!documentos.contains(d)){
            documentos.add(d);
        }
    }

    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<>(documentos);
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = new ArrayList<>(documentos);
    }
}
