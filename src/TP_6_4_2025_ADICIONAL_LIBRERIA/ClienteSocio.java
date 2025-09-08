package TP_6_4_2025_ADICIONAL_LIBRERIA;

public class ClienteSocio extends Cliente{
    private static final double DTO_SOCIO = 0.30;
    public ClienteSocio(String nombre, String apellido, String direccion, int dni) {
        super(nombre, apellido, direccion, dni);
    }

    @Override
    public boolean leGusta(Articulo a) {
        return this.getAutoresFavoritos().contains(a.getAutor());
    }

    @Override
    public double calcularDto(Articulo a) {
        return a.getPrecio() - (a.getPrecio() * DTO_SOCIO);
    }
}
