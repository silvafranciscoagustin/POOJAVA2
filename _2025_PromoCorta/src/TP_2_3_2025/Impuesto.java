package TP_2_3_2025;

public class Impuesto {
    private String tipo;
    private double valor;

    public Impuesto(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
