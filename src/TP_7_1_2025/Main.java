package TP_7_1_2025;

import TP_7_1_2025.condiciones.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inicializar el sistema
        Sistema sistema = new Sistema(new ArrayList<>());

        // --- Crear enfermedades ---
        Enfermedad roya = new Enfermedad("Roya");
        roya.addEstadoPatologico("manchas anaranjadas");
        roya.addEstadoPatologico("debilitamiento del tallo");

        Enfermedad mildiu = new Enfermedad("Mildiu");
        mildiu.addEstadoPatologico("manchas aceitosas");
        mildiu.addEstadoPatologico("moho blanco");

        // --- Crear cultivos ---
        Cultivo trigo = new Cultivo("Trigo");
        trigo.addEnfermedad(roya);

        Cultivo uva = new Cultivo("Uva");
        uva.addEnfermedad(mildiu);

        // --- Crear productos químicos ---
        ProductoQuimico fungicida = new ProductoQuimico("Fungicida Fuerte");
        fungicida.addEstadoPatologico("manchas anaranjadas");
        fungicida.addEstadoPatologico("debilitamiento del tallo");
        fungicida.addCultivoDesaconsejado(trigo);

        ProductoQuimico fertilizante = new ProductoQuimico("Fertilizante Organico");
        fertilizante.addEstadoPatologico("deficiencia de nitrogeno");
        fertilizante.addCultivoDesaconsejado(uva);

        ProductoQuimico insecticida = new ProductoQuimico("Insecticida Universal");
        insecticida.addEstadoPatologico("plagas");
        insecticida.addCultivoDesaconsejado(trigo);
        insecticida.addCultivoDesaconsejado(uva);

        // --- Agregar productos químicos al sistema ---
        sistema.addProductoQuimico(fungicida);
        sistema.addProductoQuimico(fertilizante);
        sistema.addProductoQuimico(insecticida);

        // --- Búsquedas con condiciones ---
        System.out.println("--- PRODUCTOS QUÍMICOS QUE CUMPLEN CONDICIONES ---");

        // 1. Condición: trata la enfermedad Roya
        CondicionEnfermedad trataRoya = new CondicionEnfermedad(roya);
        System.out.println("Productos que tratan la enfermedad Roya:");
        System.out.println(sistema.productosCumplen(trataRoya));
        System.out.println("----------------------------------------\n");

        // 2. Condición: desaconsejado para el cultivo de Uva
        CondicionCultivo desaconsejadoParaUva = new CondicionCultivo(uva);
        System.out.println("Productos desaconsejados para el cultivo de Uva:");
        System.out.println(sistema.productosCumplen(desaconsejadoParaUva));
        System.out.println("----------------------------------------\n");

        // 3. Condición AND: trata la enfermedad Roya Y desaconsejado para el cultivo de Trigo
        CondicionCultivo desaconsejadoParaTrigo = new CondicionCultivo(trigo);
        CondicionEnfermedad trataRoyaAnd = new CondicionEnfermedad(roya);
        CondicionAnd andCondicion = new CondicionAnd(trataRoyaAnd, desaconsejadoParaTrigo);
        System.out.println("Productos que tratan la Roya Y están desaconsejados para Trigo:");
        System.out.println(sistema.productosCumplen(andCondicion));
        System.out.println("----------------------------------------\n");
    }
}