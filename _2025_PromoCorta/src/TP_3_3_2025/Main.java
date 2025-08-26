package TP_3_3_2025;

public class Main {
    public static void main(String[] args) {
        // Creo el juego
        Juego juego = new Juego("Super Batalla");

        // Creo personajes
        Personaje heroe = new Personaje("Clark Kent", "Superman");
        Personaje villano = new Personaje("Lex Luthor", "Lex");

        // Agrego cualidades usando el nuevo método addCualidad
        heroe.addCualidad(new Cualidad("Fuerza", 900));
        heroe.addCualidad(new Cualidad("Velocidad", 700));
        heroe.addCualidad(new Cualidad("Vision", 500));
        heroe.addCualidad(new Cualidad("Altura", 190));
        heroe.addCualidad(new Cualidad("Peso", 100));
        heroe.addCualidad(new Cualidad("Edad", 35));

        villano.addCualidad(new Cualidad("Fuerza", 850));
        villano.addCualidad(new Cualidad("Velocidad", 720));
        villano.addCualidad(new Cualidad("Vision", 500));
        villano.addCualidad(new Cualidad("Altura", 180));
        villano.addCualidad(new Cualidad("Peso", 90));
        villano.addCualidad(new Cualidad("Edad", 40));

        // Enfrentar
        Personaje ganador = juego.enfrentar(heroe, villano);

        // Mostrar resultado
        if (ganador == null) {
            System.out.println("¡Empate total!");
        } else {
            System.out.println("Ganó: " + ganador.getNombreSuper());
        }
    }
}
