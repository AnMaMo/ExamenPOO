package me.andre.examenpoo.objectes;

import java.util.ArrayList;

public class CrearJugadors {
    /**
     * Metode per a generar el numero d'objecte Jugador desitjats.
     * @param n
     * @param jugadors
     */
    public static void generarJugadors(int n, ArrayList<Jugador> jugadors) {
        for (int i = 0; i < n; i++) {
            Jugador jugador = new Jugador("jugador" + (i+1));
            jugadors.add(jugador);
        }
    }
}
