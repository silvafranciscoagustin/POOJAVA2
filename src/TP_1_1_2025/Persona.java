package TP_1_1_2025;

import java.time.LocalDate;

public class Persona {
    private int edad;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(int dni){
        this.dni = dni;
        this.fechaNac = LocalDate.of(2000,01,01);
        this.sexo = "Femenino";
        this.nombre = "N";
        this.apellido = "N";
        this.peso = 1;
        this.altura = 1;
        this.edad = 1;
    }
    public Persona(int dni, String nombre,String apellido){
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre,String apellido,LocalDate fechaNac){
        this(dni, nombre, apellido);
        this.fechaNac = fechaNac;
    }

    public double calcularIMC(){
        peso = getPeso();
        altura = getAltura()/100;
        return peso/(altura*altura);
      //  return getPeso()/((getAltura()/100)*(getAltura()/100));
    }

    public boolean estaEnForma(){
        return (calcularIMC()>18.5&&calcularIMC()<25);
    }

    public boolean esElCumple() {
        LocalDate hoy = LocalDate.now();
        return hoy.getDayOfMonth() == getFechaNac().getDayOfMonth()
                && hoy.getMonth() == getFechaNac().getMonth();
    }

    public int calcularEdad(){
        return LocalDate.now().getYear()-getFechaNac().getYear();
    }
    public boolean esMayor(){
        return calcularEdad() >= 18;
    }

    public boolean puedeVotar(){
       return calcularEdad() >= 16;
    }

    public boolean esCoherente(){
        return calcularEdad()==getEdad();
    }

    public String toString(){
        return "Nombre: "+  getNombre() + "\n" +
                "Fecha nac: "+getFechaNac() + "\n" +
                "Altura: "+getAltura() + "\n" +
                "Sexo: "+getSexo() + "\n" +
                "Dni: "+getDni()+ "\n" +
                "Edad: "+getEdad()+ "\n" +
                "Apellido: "+getApellido()+ "\n" +
                "Peso: "+getPeso()+ "\n";
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
