import me.andre.examenpoo.objectes.CrearJugadors;
import me.andre.examenpoo.objectes.Jugador;
import me.andre.examenpoo.partida.IniciPartida;

import java.util.ArrayList;

/**
 * @author André Martínez Moreno
 * @version 1.0
 * @curs DAW-1
 */
public class main {
    public static void main(String[] args) {
        final int NUM_JUGADORS = 2;
        ArrayList<Jugador> jugadors = new ArrayList<>();

        // Posarem un try/catch per si hi ha algun error a l'hora de carregar els jugadors.
        try {
            // Cridem al metode generarJugadors per a crear l'arraylist de jugadors.
            CrearJugadors.generarJugadors(NUM_JUGADORS, jugadors);
        } catch (Exception e) {
            System.out.println("Hi ha hagut un error a l'hora de carregar els jugadors!");
        }

        // Iniciarem la partida.
        IniciPartida.iniciarPartida(jugadors);
    }
}
