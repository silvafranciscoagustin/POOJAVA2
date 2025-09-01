package TP_1_2_2025;
//2 Electrodomésticos
//Crear una clase Electrodoméstico con las siguientes características:
//Atributos son nombre, precio base, color, consumo energético y peso.
//Valores por defecto:
//● El color por defecto es gris plata.
//● El consumo energético 10 Kw.
//● Precio base 100 pesos.
//● El peso es 2 kg.
//Implementar todos los constructores.
//La funcionalidad de la clase es la siguiente:
//● Todos los métodos get y set.
//1
//● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
//● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
//● Indicar si un producto es de alta gama, el balance es mayor que 3
public class Electrodomestico {
    private String nombre;
    private double precioBase;
    private String color;
    private double consumoEnergetico;
    private double peso;

    public Electrodomestico(){
        this.nombre = "Generico";
        this.color = "Gris Plata";
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2;
    }



    public Electrodomestico(String nombre){
        this();
        setNombre(nombre);
    }

    public Electrodomestico(String nombre,String color){
        this(nombre);
        setColor(color);
    }

    public Electrodomestico(String nombre,String color,double consumoEnergetico){
        this(nombre,color);
        setConsumoEnergetico(consumoEnergetico);
    }
    public Electrodomestico(String nombre,String color,double consumoEnergetico,double precioBase){
        this(nombre,color,consumoEnergetico);
        setPrecioBase(precioBase);
    }

    public Electrodomestico(String nombre,String color,double consumoEnergetico,double precioBase,double peso){
        this(nombre,color,consumoEnergetico,precioBase);
        setPeso(peso);
    }


    public boolean esBajoConsumo(){
        return getConsumoEnergetico()<45;
    }

    public double getBalance(){
        return getPrecioBase()/getPeso();
    }

    public boolean isHighEnd(){
        return getBalance()>3;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Electrodomestico {" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", consumo=" + consumoEnergetico + " Kw" +
                ", precioBase=$" + precioBase +
                ", peso=" + peso + " kg" +
                ", bajoConsumo=" + esBajoConsumo() +
                ", balance=" + getBalance() +
                ", altaGama=" + isHighEnd() +
                '}';
    }
}
