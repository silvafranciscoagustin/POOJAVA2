package TP_2_2_2025;

public class Usuario {
    private String nombre;
    private String tel;
    private String mail;

    public Usuario(String nombre, String tel, String mail) {
        this.nombre = nombre;
        this.tel = tel;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
