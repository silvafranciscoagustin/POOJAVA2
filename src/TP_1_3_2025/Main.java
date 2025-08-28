package TP_1_3_2025;

public class Main {
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(0, 0);   // esquina superior izquierda
        PuntoGeometrico p2 = new PuntoGeometrico(4, -3);  // esquina inferior derecha

        Rectangulo r1 = new Rectangulo(p1, p2);

        System.out.println("Área: " + r1.getArea());
        System.out.println("¿Es cuadrado? " + r1.esCuadrado());
        System.out.println("Lado superior: " + r1.getLadoSuperior());
        System.out.println("Orientación: " + r1.orientacion());

        r1.desplazarRectangulo(2, 2); // mover 2 en X y 2 en Y
        System.out.println("Nueva esquina sup izq: (" + p1.getX() + "," + p1.getY() + ")");
    }
}
