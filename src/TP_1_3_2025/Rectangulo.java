package TP_1_3_2025;
//Implementar la clase Rectángulo.
//Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
//trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
//Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
//los atributos de la clase.
//La funcionalidad que debe proveer un rectángulo es la siguiente
//● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
//Y.
//● Calcular el Área del rectángulo.
//● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
//iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
//del mismo es mayor que la del otro.
//● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
//propiedades para que sea un cuadrado.
//● Determinar el largo del lado superior.
//● Determinar si está acostado o parado (si el alto es más que el ancho).
public class Rectangulo {
    private PuntoGeometrico esquinaSupIzq;
    private PuntoGeometrico esquinaInfDer;
    private double base;
    private double altura;

    //ejemplo rectangulo.
    //
    //(x1,y1) ┌───────────┐
    //        │           │
    //        │           │
    //        └───────────┘ (x2,y2)
    //
    //Restar las X → da el ancho (base).
    //Restar las Y → da la altura.

    public Rectangulo(PuntoGeometrico esquinaSupIzq, PuntoGeometrico esquinaInfDer){
        setEsquinaSupIzq(esquinaSupIzq);
        setEsquinaInfDer(esquinaInfDer);
        this.base = esquinaInfDer.getX()-esquinaSupIzq.getX();
        this.altura = esquinaSupIzq.getY()-esquinaInfDer.getY();
    }


    public void desplazarRectangulo(double puntoX, double puntoY){
        esquinaSupIzq.desplazarPunto(puntoX, puntoY);
        esquinaInfDer.desplazarPunto(puntoX,puntoY);
    }
    public double getArea(){
        return getBase()*getAltura();
    }

    public int comparar(Rectangulo otroRectangulo){
        if (this.getArea()<otroRectangulo.getArea()) return -1;
        if (this.getArea()>otroRectangulo.getArea()) return 1;
        return 0;
    }

    public boolean esCuadrado(){
        return getBase()==getAltura();
    }
    public double getLadoSuperior(){
        return getBase();
    }

    public String orientacion(){
        if(getAltura()>getBase()){
            return "Parado";
        } else if (getBase()>getAltura()) {
            return "Acostado";
        }else {
            return "Es Un Cuadrado";
        }
    }



    public PuntoGeometrico getEsquinaSupIzq() {
        return esquinaSupIzq;
    }

    public void setEsquinaSupIzq(PuntoGeometrico esquinaSupIzq) {
        this.esquinaSupIzq = esquinaSupIzq;
    }

    public PuntoGeometrico getEsquinaInfDer() {
        return esquinaInfDer;
    }

    public void setEsquinaInfDer(PuntoGeometrico esquinaInfDer) {
        this.esquinaInfDer = esquinaInfDer;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
