package TP_5_3_2025;

public class Main {
    public static void main(String[] args) {
        // Creamos una pila de enteros
        Pila<Integer> pilaEnteros = new Pila<>();

        // Push
        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);

        System.out.println("Tamaño de la pila: " + pilaEnteros.getSize());
        System.out.println("Elemento en el tope: " + pilaEnteros.top());

        // Pop
        System.out.println("Elemento sacado con pop: " + pilaEnteros.pop());
        System.out.println("Nuevo tope después de pop: " + pilaEnteros.top());
        System.out.println("Tamaño actual: " + pilaEnteros.getSize());

        // Copy
        System.out.println("Copia de la pila: " + pilaEnteros.copy());

        // Reverse
        System.out.println("Pila en orden inverso: " + pilaEnteros.reverse());

        // Ejemplo con Strings
        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.push("Juan");
        pilaStrings.push("Ana");
        pilaStrings.push("Luis");

        System.out.println("\nPila de Strings original: " + pilaStrings.copy());
        System.out.println("Pila de Strings invertida: " + pilaStrings.reverse());
    }
}
