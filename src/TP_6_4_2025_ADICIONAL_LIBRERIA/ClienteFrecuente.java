package TP_6_4_2025_ADICIONAL_LIBRERIA;

public class ClienteFrecuente extends Cliente{
    private static final double DTO_FRECUENTE = 0.15;
    public ClienteFrecuente(String nombre, String apellido, String direccion, int dni) {
        super(nombre, apellido, direccion, dni);
    }

    @Override
    public boolean leGusta(Articulo a) {
        if(this.getAutoresFavoritos().contains(a.getAutor())){
            for (String generoArticulo: a.getGeneros()) {
                if(this.getGenerosQueLeGustan().contains(generoArticulo)){
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public double calcularDto(Articulo a) {
        return a.getPrecio() - (a.getPrecio() * DTO_FRECUENTE);
    }
}
