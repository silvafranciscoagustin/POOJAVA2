package TP_4_6_2025;

public class UsuarioFinal extends Persona{
    private String nombreUsuario, password;

    public UsuarioFinal(String nombre, String apellido, int edad, String nombreUsuario, String password) {
        super(nombre, apellido, edad);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Nombre usuario: "+ getNombreUsuario()+ "\n"+
                "Password: "+ getPassword()+ "\n";
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
